/**
 */
package org.nasdanika.codegen.wizard.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.codegen.CodegenPackage;

import org.nasdanika.codegen.impl.CodegenPackageImpl;

import org.nasdanika.codegen.java.JavaPackage;

import org.nasdanika.codegen.java.impl.JavaPackageImpl;

import org.nasdanika.codegen.maven.MavenPackage;

import org.nasdanika.codegen.maven.impl.MavenPackageImpl;

import org.nasdanika.codegen.wizard.Wizard;
import org.nasdanika.codegen.wizard.WizardFactory;
import org.nasdanika.codegen.wizard.WizardPackage;
import org.nasdanika.codegen.wizard.WizardPage;
import org.nasdanika.codegen.wizard.WizardPageContent;

import org.nasdanika.codegen.wizard.util.WizardValidator;

import org.nasdanika.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardPackageImpl extends EPackageImpl implements WizardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardPageContentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.codegen.wizard.WizardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WizardPackageImpl() {
		super(eNS_URI, WizardFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WizardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WizardPackage init() {
		if (isInited) return (WizardPackage)EPackage.Registry.INSTANCE.getEPackage(WizardPackage.eNS_URI);

		// Obtain or create and register package
		WizardPackageImpl theWizardPackage = (WizardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WizardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WizardPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConfigPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) : CodegenPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		MavenPackageImpl theMavenPackage = (MavenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) instanceof MavenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) : MavenPackage.eINSTANCE);

		// Create package meta-data objects
		theWizardPackage.createPackageContents();
		theCodegenPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theMavenPackage.createPackageContents();

		// Initialize created meta-data
		theWizardPackage.initializePackageContents();
		theCodegenPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theMavenPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWizardPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WizardValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWizardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WizardPackage.eNS_URI, theWizardPackage);
		return theWizardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_Pages() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardPage() {
		return wizardPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizardPage_Name() {
		return (EAttribute)wizardPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizardPage_Title() {
		return (EAttribute)wizardPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizardPage_Description() {
		return (EAttribute)wizardPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardPage_Content() {
		return (EReference)wizardPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardPageContent() {
		return wizardPageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWizardPageContent__Validate__DiagnosticChain_Map() {
		return wizardPageContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWizardPageContent__ShallShow() {
		return wizardPageContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactory getWizardFactory() {
		return (WizardFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wizardEClass = createEClass(WIZARD);
		createEReference(wizardEClass, WIZARD__PAGES);

		wizardPageEClass = createEClass(WIZARD_PAGE);
		createEAttribute(wizardPageEClass, WIZARD_PAGE__NAME);
		createEAttribute(wizardPageEClass, WIZARD_PAGE__TITLE);
		createEAttribute(wizardPageEClass, WIZARD_PAGE__DESCRIPTION);
		createEReference(wizardPageEClass, WIZARD_PAGE__CONTENT);

		wizardPageContentEClass = createEClass(WIZARD_PAGE_CONTENT);
		createEOperation(wizardPageContentEClass, WIZARD_PAGE_CONTENT___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(wizardPageContentEClass, WIZARD_PAGE_CONTENT___SHALL_SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizard_Pages(), this.getWizardPage(), null, "pages", null, 0, -1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wizardPageEClass, WizardPage.class, "WizardPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizardPage_Name(), ecorePackage.getEString(), "name", null, 1, 1, WizardPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWizardPage_Title(), ecorePackage.getEString(), "title", null, 1, 1, WizardPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWizardPage_Description(), ecorePackage.getEString(), "description", null, 0, 1, WizardPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizardPage_Content(), this.getWizardPageContent(), null, "content", null, 1, 1, WizardPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wizardPageContentEClass, WizardPageContent.class, "WizardPageContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getWizardPageContent__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWizardPageContent__ShallShow(), ecorePackage.getEBoolean(), "shallShow", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "This EPackage contains classes for creating model-driven (code generation) wizards with\r\npages backed by model elements and rendered with EMF Forms or EObjectRenderer instances."
		   });	
		addAnnotation
		  (wizardEClass, 
		   source, 
		   new String[] {
			 "documentation", "Wizard is a list of pages for collecting user input."
		   });	
		addAnnotation
		  (wizardPageEClass, 
		   source, 
		   new String[] {
			 "documentation", "Wizard page has name, message and contains wizard page content which is specific for a particular wizard."
		   });	
		addAnnotation
		  (wizardPageContentEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for wizard page content. Wizard implementations shall provide\r\nconcrete subclasses of this class. "
		   });	
		addAnnotation
		  (getWizardPageContent__Validate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "documentation", "Validates the content. This method is used by isPageComplete(), \r\nwhich is turn is used by canFlipToNextPage() and canFinish().\r\nisPageComplete() returns true if vaildation yields no error level diagnostics."
		   });	
		addAnnotation
		  ((getWizardPageContent__Validate__DiagnosticChain_Map()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Diagnostics to add validation messages to."
		   });	
		addAnnotation
		  ((getWizardPageContent__Validate__DiagnosticChain_Map()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Validation context."
		   });	
		addAnnotation
		  (getWizardPageContent__ShallShow(), 
		   source, 
		   new String[] {
			 "documentation", "Returns true (default) if the page shall be shown. \r\nOverride to conditionally skip pages. For example, if the user doesn\'t check, say \"Connect to database\" checkbox, when then there is no point in showing \"Database Connection Configuration\" page."
		   });
	}

} //WizardPackageImpl
