/**
 */
package org.nasdanika.codegen.wizard.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.wizard.WizardPackage;
import org.nasdanika.codegen.wizard.WizardPage;
import org.nasdanika.codegen.wizard.WizardPageContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WizardPageImpl extends CDOObjectImpl implements WizardPage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.WIZARD_PAGE;
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
	public String getName() {
		return (String)eGet(WizardPackage.Literals.WIZARD_PAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(WizardPackage.Literals.WIZARD_PAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eGet(WizardPackage.Literals.WIZARD_PAGE__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(WizardPackage.Literals.WIZARD_PAGE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(WizardPackage.Literals.WIZARD_PAGE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(WizardPackage.Literals.WIZARD_PAGE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPageContent getContent() {
		return (WizardPageContent)eGet(WizardPackage.Literals.WIZARD_PAGE__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(WizardPageContent newContent) {
		eSet(WizardPackage.Literals.WIZARD_PAGE__CONTENT, newContent);
	}

} //WizardPageImpl
