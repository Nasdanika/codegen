package org.nasdanika.codegen.presentation;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.nasdanika.codegen.wizard.Wizard;
import org.nasdanika.codegen.wizard.WizardPage;
import org.nasdanika.presentation.EObjectViewer;

/**
 * Viewer which uses a form to edit model information.
 * @author Pavel Vlasov
 *
 */
public class WizardPageContentViewer extends EObjectViewer {

	private int pageIndex;

	public WizardPageContentViewer(Composite parent, int style, EditingDomain editingDomain, int pageIndex) {
		super(parent, style, editingDomain);
		this.pageIndex = pageIndex;
	}

	@Override
	protected EObject getDataFromInput(Object input) {
		// Resource set
		if (input instanceof ResourceSet) {
			for (Resource r: ((ResourceSet) input).getResources()) {
				for (EObject c: r.getContents()) {
					if (c instanceof Wizard && ((Wizard) c).getPages().size() > pageIndex) {
						return ((Wizard) c).getPages().get(pageIndex).getContent();
					}
				}
			}
		}
		return null;
	}

	@Override
	protected EObject getDataFromSelection(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			Iterator<?> sit = ((StructuredSelection) selection).iterator();
			while (sit.hasNext()) {
				Object se = sit.next();
				// Resource
				if (se instanceof Resource) {
					for (EObject c: ((Resource) se).getContents()) {
						if (c instanceof Wizard && ((Wizard) c).getPages().size() > pageIndex) {
							return ((Wizard) c).getPages().get(pageIndex).getContent();
						}
					}
				} else if (se instanceof EObject) {
					EObject container = ((EObject) se).eContainer();
					if (container instanceof WizardPage) {
						EObject wpc = container.eContainer();
						if (wpc instanceof Wizard && ((Wizard) wpc).getPages().indexOf(container) == pageIndex) {
							return (EObject) se;
						}
					}
				}
			}
		}
		return null;
	}
		
	
}
