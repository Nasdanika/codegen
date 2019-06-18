package org.nasdanika.codegen.presentation;

import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * Customizes workbench content provider to filter some resources and represent Java projects differently.
 * @author Pavel Vlasov
 *
 */
public class TemplateContentProvider extends WorkbenchContentProvider {
	
	@Override
	public Object[] getChildren(Object element) {
		// TODO Auto-generated method stub
		return super.getChildren(element);
	}
	
	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return super.getParent(element);
	}

}
