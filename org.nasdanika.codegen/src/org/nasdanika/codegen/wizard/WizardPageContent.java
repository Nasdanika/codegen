/**
 */
package org.nasdanika.codegen.wizard;

import java.util.Map;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for wizard page content. Wizard implementations shall provide
 * concrete subclasses of this class. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.codegen.wizard.WizardPackage#getWizardPageContent()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface WizardPageContent extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates the content. This method is used by isPageComplete(), 
	 * which is turn is used by canFlipToNextPage() and canFinish().
	 * isPageComplete() returns true if vaildation yields no error level diagnostics.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true (default) if the page shall be shown. 
	 * Override to conditionally skip pages. For example, if the user doesn't check, say "Connect to database" checkbox, when then there is no point in showing "Database Connection Configuration" page.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean shallShow();

} // WizardPageContent
