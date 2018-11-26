# Creating a model-driven code generator

The code generator wizard described in this section creates its output by "multiplying" two models:
- Wizard model which contains user input for variation points.
- Code generation model.

Both models are created by analyzing a template file/folder/project/workspace.
  
Steps:

- Create a template 
- Identify variation points, e.g. group and artifact names and version for Maven projects.
- Group variation points into pages.
- Create a model of variation points with the model root extending ``Wizard``, pages extending ``WizardPage``, and page content classes extending ``WizardPageContent``.
- Generate model, edit, and editor code.
- Use the generated editor to create the initial wizard model.
- Using the template, create a generation model which uses data from the wizard model. For example, files from the template project can be copied to the generator project and converted to [FreeMarker](http://freemarker.org/) templates (see an example below).
- Create and register generation wizard as shown in following sub-sections.
- Build, deploy, provide P2 repository URL to your users. 

## Wizard class

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

## Wizard registration

```xml
<wizard
      name="My Application Workspace"
      icon="icons/full/obj16/WizardModelFile.gif"
      category="com.org"
      class="com.org.product.wizard.presentation.MyApplicationWorkspaceWizard"
      id="com.org.product.wizard.presentation.MypplicationWorkspaceWizardID">
</wizard>
```

## pom.xml template example

```xml
<project 
	xmlns="http://maven.apache.org/POM/4.0.0" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
	http://maven.apache.org/xsd/maven-4.0.0.xsd">
	
  <modelVersion>4.0.0</modelVersion>
  <artifactId>${generalInformation.groupID}</artifactId>
  <name>${generalInformation.name} Model</name>
  <packaging>eclipse-plugin</packaging>
  <parent>
  	<groupId>${generalInformation.groupID}</groupId>
  	<artifactId>${generalInformation.groupID}.parent</artifactId>
  	<version>${generalInformation.version}-SNAPSHOT</version>
  	<relativePath>../${generalInformation.groupID}.parent</relativePath>
  </parent>
</project>
```

In the example above ``generalInformation`` in the id of a wizard page, and ``groupID``, ``name``, and ``version`` are names of attributes of the page content.

