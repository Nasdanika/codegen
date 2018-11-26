package org.nasdanika.codegen.presentation;


import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * Handles gray state for parents and check state for children.
 * @author Pavel Vlasov
 *
 */
public class CheckStateListener implements ICheckStateListener {
	
	private CheckboxTreeViewer checkboxTreeViewer;

	public CheckStateListener(CheckboxTreeViewer checkboxTreeViewer) {
		this.checkboxTreeViewer = checkboxTreeViewer;
	}
	
	@Override
	public void checkStateChanged(CheckStateChangedEvent event) {
		// Recursively process children
		for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(event.getElement())) {
			checkRecursively(child, event.getChecked());
		}
		
		checkStateChanged(event.getElement(), event.getChecked());		
	}

	/**
	 * Child element reports its check state change to the parent. 
	 * If the parent has handled the state change, this method returns true. 
	 */
	private void checkStateChanged(Object element, boolean baseChecked) {		
		// Reporting to the parent
		Object parent = ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getParent(element);
		if (parent != null) {
			boolean allSameState = true;
			for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(parent)) {
				if (child != element) {
					if (checkboxTreeViewer.getChecked(child) && checkboxTreeViewer.getGrayed(child)) {
						allSameState = false;
						break;
					}
					if (baseChecked != checkboxTreeViewer.getChecked(child)) {
						allSameState = false;
						break;
					}
				}
			}
			if (allSameState) {
				checkboxTreeViewer.setGrayed(parent, false);
				checkboxTreeViewer.setChecked(parent, baseChecked);
			} else {
				checkboxTreeViewer.setGrayChecked(parent, true);				
			}
			checkStateChanged(parent, baseChecked);			
		}
	}
	
	private void checkRecursively(Object element, boolean checked) {
		checkboxTreeViewer.setGrayed(element, false);		
		checkboxTreeViewer.setChecked(element, checked);
		for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(element)) {
			checkRecursively(child, checked);
		}
	}
				
}
