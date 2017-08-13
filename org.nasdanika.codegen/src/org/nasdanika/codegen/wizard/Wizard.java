/**
 */
package org.nasdanika.codegen.wizard;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wizard is a list of pages for collecting user input.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.wizard.Wizard#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.wizard.WizardPackage#getWizard()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Wizard extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.wizard.WizardPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.nasdanika.codegen.wizard.WizardPackage#getWizard_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WizardPage> getPages();

} // Wizard
