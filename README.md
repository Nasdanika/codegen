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

* Structured type
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
* ``AbstractModelCodegenWizard`` - A sub-class of the above class which loads wizard pages from a model. It uses [EObjectRenderer.Util.render()](http://www.nasdanika.org/products/presentation/apidocs/org.nasdanika.presentation/apidocs/org/nasdanika/presentation/EObjectRenderer.Util.html) to render pages. This allows to create wizards with minimal effort.

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

## Multi-form model editors

Wizard models can be used not only in wizards but also in multi-form editors with a page/form for each wizard page. 

One usage scenario is to capture initial user input with a wizard and output it to a model as part of the generation process. 
Then use this model as a template - open in a multi-form editor, modify as needed, generate code.
   
To create such an editor make
a copy of a generated editor for your wizard model. 
Then delete generated viewers such as selection viewer. 
After that modify ``createPages()`` method to look like:

```java
/**
 * @generated NOT
 */
@Override
public void createPages() {
	// Creates the model from the editor input
	//
	createModel();

	// Only creates the other pages if there is something that can be edited
	//
	if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
		
		URI resourceURI = EditUIUtil.getURI(getEditorInput(), editingDomain.getResourceSet().getURIConverter());
		Resource resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		for (EObject rc: resource.getContents()) {
			if (rc instanceof Wizard) {
				for (WizardPage wp: ((Wizard) rc).getPages()) {
					ViewerPane viewerPane =
						new ViewerPane(getSite().getPage(), PageFormWizardEditor.this) {
							@Override
							public Viewer createViewer(Composite composite) {
								return new WizardPageContentViewer(composite, SWT.NONE, editingDomain, getPageCount());
							}
							@Override
							public void requestActivation() {
								super.requestActivation();
								setCurrentViewerPane(this);
							}
						};
					viewerPane.createControl(getContainer());
					
					viewerPane.getViewer().setInput(editingDomain.getResourceSet());
					viewerPane.getViewer().setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);	
					viewerPane.setTitle(wp.getDescription(), labelProvider.getImage(wp.getContent()));
					int pageIndex = addPage(viewerPane.getControl());
					setPageText(pageIndex, wp.getTitle());
				}
			}
		}

		getSite().getShell().getDisplay().asyncExec
			(new Runnable() {
				 public void run() {
					 setActivePage(0);
				 }
			 });
	}

	// Ensures that this editor will only display the page's tab
	// area if there are more than one page
	//
	getContainer().addControlListener
		(new ControlAdapter() {
			boolean guard = false;
			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		 });

	getSite().getShell().getDisplay().asyncExec
		(new Runnable() {
			 public void run() {
				 updateProblemIndication();
			 }
		 });
}
``` 

Then add a registration of the new editor to ``plugin.xml`` - copy the existing registration of the generated editor and change 
class name, name, id, and, optionally, icon.

### Create generation context menu item

Create a generation action class along the following lines:

```java
public class SampleAction implements IObjectActionDelegate {
	
	@Override
	public void run(IAction action) {
		... Generation logic here ...
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		... Remember selection ...
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// NOP ?		
	}

}
``` 
Use [GenerateAction](https://github.com/Nasdanika/codegen/blob/master/org.nasdanika.codegen.editor/src/org/nasdanika/codegen/presentation/GenerateAction.java) as guidance, but remember that in this case selection is the input model, not the generator model as in GenerateAction.

```xml
<extension point="org.eclipse.ui.popupMenus" id="mine">
    <objectContribution
         id="com.org.product.Sample"
         nameFilter="*.nsdgen"
         objectClass="org.eclipse.core.resources.IFile">
      <action
            label="Generate documentation"
            class="com.org.product.SampleAction"
            menubarPath="additions"
            enablesFor="1"
            id="com.org.product.Sample">
      </action>
   </objectContribution>
</extension>
```

## Creating a model-driven code generator from a template file/folder/project/workspace

The code generator wizard described in this section creates its output by "multiplying" two models:
- Wizard model which contains user input - variation points
- Code generation model.
  
Steps:

- Create a template 
- Identify variation points, e.g. group and artifact names and version for Maven projects.
- Group variation points into pages.
- Create a model of variation points with the model root extending ``Wizard``, pages extending ``WizardPage``, and page content classes extending ``WizardPageContent``.
- Generate model, edit, and editor code.
- Use the generated editor to create the initial wizard model.
- Using the template, create a generation model which uses data from the wizard model.
- Create and register generation wizard as shown in following sub-sections.
- Build, deploy, provide P2 repository URL to your users. 

### Wizard class

```java
public class MyApplicationWorkspaceWizard extends AbstractModelCodegenNewWizard {
	
	@Override
	protected Iterable<URI> getWorkFactoriesModelsLocations() {
		return Collections.singleton(URI.createPlatformPluginURI("com.org.product.wizard.editor/model/MyApplication.nsdgen", false));
	}
	
	protected void initializeAdapterFactory() {
		adapterFactory.addAdapterFactory(new WizardItemProviderAdapterFactory());
	}
	
	@Override
	protected URI getWizardModelLocation() {
		// Use selected .wizard file
		for (Object se: selection.toArray()) {
			if (se instanceof IFile) {
				IFile sf = (IFile) se;
				String sfn = sf.getName();
				if (sfn.endsWith(".wizard")) {
					return URI.createPlatformResourceURI(sf.getFullPath().toString(), true);					
				}
			}
		}
		
		// Use built-in wizard file if none selected.
		return URI.createPlatformPluginURI("com.org.product.wizard.editor/model/MyApplication.wizard", false);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("My Application Workspace Wizard");
	}
	
	@Override
	protected Context createContext() {
		MutableContext ret = super.createContext().createSubContext();
		ret.setClassLoader(getClass().getClassLoader());
		return ret;
	}
	
}
``` 

### Wizard registration

```xml
<wizard
      name="My Application Workspace"
      icon="icons/full/obj16/WizardModelFile.gif"
      category="com.org"
      class="com.org.product.wizard.presentation.MyApplicationWorkspaceWizard"
      id="com.org.product.wizard.presentation.MypplicationWorkspaceWizardID">
</wizard>
```

## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 

