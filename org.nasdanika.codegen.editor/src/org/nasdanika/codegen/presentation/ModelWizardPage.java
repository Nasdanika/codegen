package org.nasdanika.codegen.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.IWizardPage;
import org.nasdanika.codegen.wizard.WizardPage;

/**
 * Wizard page backed by {@link WizardPage}.
 * @author Pavel Vlasov
 *
 */
public class ModelWizardPage extends EObjectWizardPage {

	private WizardPage wizardPage;

	public ModelWizardPage(WizardPage wizardPage) {
		super(wizardPage.getName());
		this.wizardPage = wizardPage;
		setTitle(wizardPage.getTitle());
		setDescription(wizardPage.getDescription());
	}

	@Override
	protected EObject getData() {
		return wizardPage.getContent();
	}
	
	@Override
	public IWizardPage getNextPage() {
		// TODO - take shallShow() into account.
		return super.getNextPage();
	}

}
