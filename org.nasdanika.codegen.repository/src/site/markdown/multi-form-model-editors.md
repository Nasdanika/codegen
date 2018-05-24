
# Multi-form model editors

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
