/**
 */
package org.nasdanika.codegen.wizard.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.wizard.Wizard;
import org.nasdanika.codegen.wizard.WizardPackage;
import org.nasdanika.codegen.wizard.WizardPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.wizard.impl.WizardImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WizardImpl extends CDOObjectImpl implements Wizard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.WIZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WizardPage> getPages() {
		return (EList<WizardPage>)eGet(WizardPackage.Literals.WIZARD__PAGES, true);
	}

} //WizardImpl
