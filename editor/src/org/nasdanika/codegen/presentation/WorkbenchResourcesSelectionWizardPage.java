package org.nasdanika.codegen.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


public class WorkbenchResourcesSelectionWizardPage extends WizardPage {

	private CheckboxTreeViewer checkboxTreeViewer;

	/**
	 * Create the wizard.
	 */
	public WorkbenchResourcesSelectionWizardPage() {
		super("workbenchResourcesSelectionWizardPage");
		setTitle("Workbench Template Resources Selection");
		setDescription("Select template workbench resources to create a generator model");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
//		Composite container = new Composite(parent, SWT.H_SCROLL | SWT.V_SCROLL);		
		FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		toolkit.adapt(scrolledComposite);
		toolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		checkboxTreeViewer = new CheckboxTreeViewer(scrolledComposite);

		WorkbenchContentProvider contentProvider = new TemplateContentProvider();
		checkboxTreeViewer.setContentProvider(contentProvider);
		
		WorkbenchLabelProvider labelProvider = new WorkbenchLabelProvider();
		checkboxTreeViewer.setLabelProvider(labelProvider);
		
		Tree tree = checkboxTreeViewer.getTree();
		toolkit.paintBordersFor(tree);
		scrolledComposite.setContent(tree);
		scrolledComposite.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		checkboxTreeViewer.addCheckStateListener(new CheckStateListener(checkboxTreeViewer));
		
		checkboxTreeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());

		setControl(scrolledComposite);
	}

	/**
	 * @return {@link ITreeContentProvider} representing checked nodes in the tree. 
	 */
	public ITreeContentProvider getCheckedContentProvider() {
		return new ITreeContentProvider() {
			
			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}
			
			@Override
			public Object getParent(Object element) {
				return ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getParent(element);
			}
			
			/**
			 * Returns content provider root object - checkbox tree viewer input.
			 */
			@Override
			public Object[] getElements(Object inputElement) {
				return new Object[] { checkboxTreeViewer.getInput() };
			}
			
			@Override
			public Object[] getChildren(Object parentElement) {
				List<Object> checkedChildren = new ArrayList<>();
				for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(parentElement)) {
					if (checkboxTreeViewer.getChecked(child)) {
						checkedChildren.add(child);
					}
				}
				return checkedChildren.toArray();
			}
		};		
	}

}
