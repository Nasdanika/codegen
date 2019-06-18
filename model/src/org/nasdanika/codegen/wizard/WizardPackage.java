/**
 */
package org.nasdanika.codegen.wizard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This EPackage contains classes for creating model-driven (code generation) wizards with
 * pages backed by model elements and rendered with EMF Forms or EObjectRenderer instances.
 * <!-- end-model-doc -->
 * @see org.nasdanika.codegen.wizard.WizardFactory
 * @model kind="package"
 * @generated
 */
public interface WizardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.codegen.wizard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.codegen.wizard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardPackage eINSTANCE = org.nasdanika.codegen.wizard.impl.WizardPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.wizard.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.wizard.impl.WizardImpl
	 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGES = 0;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.wizard.impl.WizardPageImpl
	 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizardPage()
	 * @generated
	 */
	int WIZARD_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CONTENT = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.wizard.impl.WizardPageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.wizard.impl.WizardPageContentImpl
	 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizardPageContent()
	 * @generated
	 */
	int WIZARD_PAGE_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONTENT___VALIDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Shall Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONTENT___SHALL_SHOW = 1;

	/**
	 * The number of operations of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONTENT_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see org.nasdanika.codegen.wizard.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.wizard.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.nasdanika.codegen.wizard.Wizard#getPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Pages();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.wizard.WizardPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPage
	 * @generated
	 */
	EClass getWizardPage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.wizard.WizardPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPage#getName()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.wizard.WizardPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPage#getTitle()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.wizard.WizardPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPage#getDescription()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.wizard.WizardPage#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPage#getContent()
	 * @see #getWizardPage()
	 * @generated
	 */
	EReference getWizardPage_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.wizard.WizardPageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see org.nasdanika.codegen.wizard.WizardPageContent
	 * @generated
	 */
	EClass getWizardPageContent();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.wizard.WizardPageContent#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see org.nasdanika.codegen.wizard.WizardPageContent#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizardPageContent__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.wizard.WizardPageContent#shallShow() <em>Shall Show</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shall Show</em>' operation.
	 * @see org.nasdanika.codegen.wizard.WizardPageContent#shallShow()
	 * @generated
	 */
	EOperation getWizardPageContent__ShallShow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardFactory getWizardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.wizard.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.wizard.impl.WizardImpl
		 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGES = eINSTANCE.getWizard_Pages();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.wizard.impl.WizardPageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.wizard.impl.WizardPageImpl
		 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizardPage()
		 * @generated
		 */
		EClass WIZARD_PAGE = eINSTANCE.getWizardPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__NAME = eINSTANCE.getWizardPage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__TITLE = eINSTANCE.getWizardPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__DESCRIPTION = eINSTANCE.getWizardPage_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_PAGE__CONTENT = eINSTANCE.getWizardPage_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.wizard.impl.WizardPageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.wizard.impl.WizardPageContentImpl
		 * @see org.nasdanika.codegen.wizard.impl.WizardPackageImpl#getWizardPageContent()
		 * @generated
		 */
		EClass WIZARD_PAGE_CONTENT = eINSTANCE.getWizardPageContent();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD_PAGE_CONTENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizardPageContent__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Shall Show</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD_PAGE_CONTENT___SHALL_SHOW = eINSTANCE.getWizardPageContent__ShallShow();

	}

} //WizardPackage
