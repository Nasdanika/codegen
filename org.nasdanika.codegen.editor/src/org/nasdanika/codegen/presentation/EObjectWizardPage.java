package org.nasdanika.codegen.presentation;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.nasdanika.presentation.EObjectRenderer;

/**
 * Wizard page which is backed by an instance of EObject and uses either {@link EObjectRenderer} or EMFForms to render page contents.
 * @author 
 *
 */
public abstract class EObjectWizardPage<T extends EObject> extends WizardPage {
	
	private EditingDomain editingDomain;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public EObjectWizardPage(String pageName, EditingDomain editingDomain) {
		super(pageName);
		this.editingDomain = editingDomain;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout());
		FormToolkit toolkit = new FormToolkit(Display.getCurrent());
		
		EObject pageData = getData();		
		EContentAdapter changeListener = new EContentAdapter() {
			
			@Override
			public void notifyChanged(Notification notification) {
				if (!notification.isTouch()) { // Modification events
					super.notifyChanged(notification);
					Diagnostician diagnostician = new Diagnostician(); 
					onDataValidation(diagnostician.validate(pageData));					
				}
			}
			
		};
		pageData.eAdapters().add(changeListener);
		
		container.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				pageData.eAdapters().remove(changeListener);
				toolkit.dispose();
			}
		});
		
		ScrolledForm form = toolkit.createScrolledForm(container);
//		form.setText("Generator Model");
		form.setLayout(new GridLayout());
		form.getBody().setLayout(new GridLayout());
		Composite body = form.getBody();
				
		try {
			for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor("org.nasdanika.presentation.eobject_renderer")) {
				// TODO renderers cache to improve performance?
				if ("eobject_renderer".equals(ce.getName()) 
						&& pageData.eClass().getName().equals(ce.getAttribute("eclass_name"))
						&& pageData.eClass().getEPackage().getNsURI().equals(ce.getAttribute("epackage_ns_uri"))) {
					((EObjectRenderer) ce.createExecutableExtension("renderer_class_name")).render(body, pageData, editingDomain);
					return;
				}
			}					
		
			ECPSWTViewRenderer.INSTANCE.render(body, pageData);
		} catch (Exception e) {
			Label lblNewLabel = new Label(body, SWT.NONE);
			lblNewLabel.setText("Error rendering form: "+e);
			e.printStackTrace();
		}		
		setControl(container);
		
		Diagnostician diagnostician = new Diagnostician(); 
		onDataValidation(diagnostician.validate(pageData));							
	}
	
	/**
	 * Invoked when input changes and the page validates new data.
	 * @param validate
	 */
	protected void onDataValidation(Diagnostic validationResult) {
		setPageComplete(validationResult.getSeverity() != Diagnostic.ERROR);
	}

	protected abstract T getData();

}
