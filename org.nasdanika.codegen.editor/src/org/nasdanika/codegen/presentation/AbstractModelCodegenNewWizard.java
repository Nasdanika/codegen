package org.nasdanika.codegen.presentation;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

public abstract class AbstractModelCodegenNewWizard extends AbstractModelCodegenWizard implements INewWizard {

	protected IWorkbench workbench;
	protected IStructuredSelection selection;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	@Override
	protected Context createContext() {
		MutableContext ret = super.createContext().createSubContext();
		ret.set(IWorkbench.class, workbench);
		ret.set(IStructuredSelection.class, selection);
		return ret;
	}

}
