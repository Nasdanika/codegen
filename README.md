# Nasdanika Code Generation

* [Online documentation](org.nasdanika.codegen.editor/doc/codegen.md).
* JavaDoc
  * [Model](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs)
  * [Edit](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen.edit/apidocs)
  * [Editor](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen.editor/apidocs)  

## P2 Repository

* ``http://www.nasdanika.org/products/codegen/repository``
* [Archived](http://www.nasdanika.org/products/codegen/org.nasdanika.codegen.repository-0.1.0-SNAPSHOT.zip)
 
## Roadmap

* Structured compilation unit
  * Types
  * Methods
  * Fields
* Extension point for registering generation models and a wizard to generate code using registered models packaged in plug-ins.
* Eclipse help with HTML documentation for the code generation model.
* Form editor on the right side of the tree editor with help contents rendered from GenModel documentation annotations - Integrate EMF Forms, customize to display context help for form elements generated from model documentation annotations.
* Console IApplication for headless generation. 

## Code generation wizards

There are two abstract code generation wizards in the editor bundle:

* ``AbstractCodegenWizard`` - This class implements ``performFinish()`` which uses a generator model to perform code generation.
* ``AbstractModelCodegenWizard`` - A sub-class of the above class which loads wizard pages from a model. It uses [EMF Forms](https://www.eclipse.org/ecp/emfforms/) to render pages. This allows to create wizards with minimal effort.

Example of a concrete wizard extending ``AbstractModelCodegenWizard``: 

```java
public class MyWorkspaceWizard extends AbstractModelCodegenWizard implements INewWizard {
	
	private IStructuredSelection selection;

	@Override
	protected Iterable<URI> getWorkFactoriesModelsLocations() {
		return Collections.singleton(URI.createPlatformPluginURI("<wizard bunde>/model/MyGeneratorModel.nsdgen", false));
	}
	
	protected void initializeAdapterFactory() {
		adapterFactory.addAdapterFactory(new WizardItemProviderAdapterFactory()); // Adapter factory for the wizard model.
	}
	
	@Override
	protected URI getWizardModelLocation() {
		// Use selected .wizard file
		if (!selection.isEmpty()) {
			Object fe = selection.getFirstElement();
			if (fe instanceof IFile) {
				IFile sf = (IFile) fe;
				String sfn = sf.getName();
				if (sfn.endsWith(".wizard")) {
					return URI.createPlatformResourceURI(sf.getFullPath().toString(), true);					
				}
			}
		}
		
		// Use built-in wizard file if none selected.
		return URI.createPlatformPluginURI("<wizard bundle>/model/MyWizardModel.wizard", false);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;		
		setWindowTitle("My Code Generation Wizard");
	}
	
}

``` 

## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 

