/**
 */
package org.nasdanika.codegen.wizard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.wizard.WizardPackage
 * @generated
 */
public interface WizardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardFactory eINSTANCE = org.nasdanika.codegen.wizard.impl.WizardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WizardPackage getWizardPackage();

} //WizardFactory
