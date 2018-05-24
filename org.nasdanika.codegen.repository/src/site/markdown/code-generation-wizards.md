# Code generation wizards

There are two abstract code generation wizards in the editor bundle:

* ``AbstractCodegenWizard`` - This class implements ``performFinish()`` which uses a generator model to perform code generation.
* ``AbstractModelCodegenWizard`` - A sub-class of the above class which loads wizard pages from a model. It uses [EObjectRenderer.Util.render()](https://www.nasdanika.org/products/presentation/apidocs/org.nasdanika.presentation/apidocs/org/nasdanika/presentation/EObjectRenderer.Util.html) to render pages. This allows to create wizards with minimal effort.

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
