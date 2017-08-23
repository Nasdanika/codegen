package org.nasdanika.codegen.presentation;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizardPage;
import org.nasdanika.codegen.wizard.WizardPage;
import org.nasdanika.codegen.wizard.WizardPageContent;

/**
 * Wizard page backed by {@link WizardPage}.
 * @author Pavel Vlasov
 *
 */
public class ModelWizardPage extends EObjectWizardPage<WizardPageContent> {

	private WizardPage wizardPage;

	public ModelWizardPage(WizardPage wizardPage, EditingDomain editingDomain) {
		super(wizardPage.getName(), editingDomain);
		this.wizardPage = wizardPage;
		setTitle(wizardPage.getTitle());
		setDescription(wizardPage.getDescription());
	}

	@Override
	protected WizardPageContent getData() {
		return wizardPage.getContent();
	}
	
	@Override
	public IWizardPage getNextPage() {
		IWizardPage ret = super.getNextPage();
		while (ret instanceof ModelWizardPage && !((ModelWizardPage) ret).getData().shallShow()) {
			ret = ret.getNextPage();
		}
		return ret;
	}

}
