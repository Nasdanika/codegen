/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.impl.CodegenPackageImpl;
import org.nasdanika.codegen.java.Annotation;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.Constructor;
import org.nasdanika.codegen.java.Field;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaNature;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.codegen.java.Operation;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.codegen.java.PackageFragmentRoot;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.codegen.maven.MavenPackage;
import org.nasdanika.codegen.maven.impl.MavenPackageImpl;
import org.nasdanika.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaPackageImpl extends EPackageImpl implements JavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaNatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageFragmentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iJavaProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPackageFragmentRootEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPackageFragmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iCompilationUnitEDataType = null;

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
	 * @see org.nasdanika.codegen.java.JavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaPackageImpl() {
		super(eNS_URI, JavaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaPackage init() {
		if (isInited) return (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Obtain or create and register package
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConfigPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) : CodegenPackage.eINSTANCE);
		MavenPackageImpl theMavenPackage = (MavenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) instanceof MavenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) : MavenPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaPackage.createPackageContents();
		theCodegenPackage.createPackageContents();
		theMavenPackage.createPackageContents();

		// Initialize created meta-data
		theJavaPackage.initializePackageContents();
		theCodegenPackage.initializePackageContents();
		theMavenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, theJavaPackage);
		return theJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaNature() {
		return javaNatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaNature_Packagefragmentroots() {
		return (EReference)javaNatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageFragmentRoot() {
		return packageFragmentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageFragmentRoot_Name() {
		return (EAttribute)packageFragmentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragmentRoot_Packagefragments() {
		return (EReference)packageFragmentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageFragment() {
		return packageFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageFragment_Name() {
		return (EAttribute)packageFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragment_Compilationunits() {
		return (EReference)packageFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Name() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Merge() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Format() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Generators() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Name() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Modifiers() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_CommentGenerators() {
		return (EReference)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Comment() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Annotations() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_BodyGenerators() {
		return (EReference)memberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_TypeParameters() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_SuperTypes() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Parameters() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ThrownExceptions() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnum_SuperInterfaces() {
		return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIJavaProject() {
		return iJavaProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPackageFragmentRoot() {
		return iPackageFragmentRootEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPackageFragment() {
		return iPackageFragmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getICompilationUnit() {
		return iCompilationUnitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactory getJavaFactory() {
		return (JavaFactory)getEFactoryInstance();
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
		javaNatureEClass = createEClass(JAVA_NATURE);
		createEReference(javaNatureEClass, JAVA_NATURE__PACKAGEFRAGMENTROOTS);

		packageFragmentRootEClass = createEClass(PACKAGE_FRAGMENT_ROOT);
		createEAttribute(packageFragmentRootEClass, PACKAGE_FRAGMENT_ROOT__NAME);
		createEReference(packageFragmentRootEClass, PACKAGE_FRAGMENT_ROOT__PACKAGEFRAGMENTS);

		packageFragmentEClass = createEClass(PACKAGE_FRAGMENT);
		createEAttribute(packageFragmentEClass, PACKAGE_FRAGMENT__NAME);
		createEReference(packageFragmentEClass, PACKAGE_FRAGMENT__COMPILATIONUNITS);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__NAME);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__MERGE);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__FORMAT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__GENERATORS);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__NAME);
		createEAttribute(memberEClass, MEMBER__MODIFIERS);
		createEReference(memberEClass, MEMBER__COMMENT_GENERATORS);
		createEAttribute(memberEClass, MEMBER__COMMENT);
		createEAttribute(memberEClass, MEMBER__ANNOTATIONS);
		createEReference(memberEClass, MEMBER__BODY_GENERATORS);
		createEAttribute(memberEClass, MEMBER__TYPE_PARAMETERS);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__SUPER_TYPES);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__TYPE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__PARAMETERS);
		createEAttribute(operationEClass, OPERATION__THROWN_EXCEPTIONS);

		classEClass = createEClass(CLASS);

		interfaceEClass = createEClass(INTERFACE);

		annotationEClass = createEClass(ANNOTATION);

		enumEClass = createEClass(ENUM);
		createEAttribute(enumEClass, ENUM__SUPER_INTERFACES);

		constructorEClass = createEClass(CONSTRUCTOR);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);

		// Create data types
		iJavaProjectEDataType = createEDataType(IJAVA_PROJECT);
		iPackageFragmentRootEDataType = createEDataType(IPACKAGE_FRAGMENT_ROOT);
		iPackageFragmentEDataType = createEDataType(IPACKAGE_FRAGMENT);
		iCompilationUnitEDataType = createEDataType(ICOMPILATION_UNIT);
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

		// Obtain other dependent packages
		CodegenPackage theCodegenPackage = (CodegenPackage)EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaNatureEClass.getESuperTypes().add(theCodegenPackage.getNature());
		EGenericType g1 = createEGenericType(theCodegenPackage.getGenerator());
		EGenericType g2 = createEGenericType(this.getIPackageFragmentRoot());
		g1.getETypeArguments().add(g2);
		packageFragmentRootEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType(this.getIPackageFragment());
		g1.getETypeArguments().add(g2);
		packageFragmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType(this.getICompilationUnit());
		g1.getETypeArguments().add(g2);
		compilationUnitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		memberEClass.getEGenericSuperTypes().add(g1);
		typeEClass.getESuperTypes().add(this.getMember());
		fieldEClass.getESuperTypes().add(this.getMember());
		operationEClass.getESuperTypes().add(this.getMember());
		classEClass.getESuperTypes().add(this.getType());
		interfaceEClass.getESuperTypes().add(this.getType());
		annotationEClass.getESuperTypes().add(this.getType());
		enumEClass.getESuperTypes().add(this.getType());
		constructorEClass.getESuperTypes().add(this.getOperation());
		methodEClass.getESuperTypes().add(this.getOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(javaNatureEClass, JavaNature.class, "JavaNature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaNature_Packagefragmentroots(), this.getPackageFragmentRoot(), null, "packagefragmentroots", null, 0, -1, JavaNature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageFragmentRootEClass, PackageFragmentRoot.class, "PackageFragmentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageFragmentRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageFragmentRoot_Packagefragments(), this.getPackageFragment(), null, "packagefragments", null, 0, -1, PackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageFragmentEClass, PackageFragment.class, "PackageFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageFragment_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageFragment_Compilationunits(), this.getCompilationUnit(), null, "compilationunits", null, 0, -1, PackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationUnit_Merge(), ecorePackage.getEBoolean(), "merge", "true", 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationUnit_Format(), ecorePackage.getEBoolean(), "format", "true", 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEReference(getCompilationUnit_Generators(), g1, null, "generators", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEReference(getMember_CommentGenerators(), g1, null, "commentGenerators", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Annotations(), ecorePackage.getEString(), "annotations", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMember_BodyGenerators(), g1, null, "bodyGenerators", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_TypeParameters(), ecorePackage.getEString(), "typeParameters", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_SuperTypes(), ecorePackage.getEString(), "superTypes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Type(), ecorePackage.getEString(), "type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_ThrownExceptions(), ecorePackage.getEString(), "thrownExceptions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.nasdanika.codegen.java.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, org.nasdanika.codegen.java.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnum_SuperInterfaces(), ecorePackage.getEString(), "superInterfaces", null, 0, -1, org.nasdanika.codegen.java.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iJavaProjectEDataType, IJavaProject.class, "IJavaProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iPackageFragmentRootEDataType, IPackageFragmentRoot.class, "IPackageFragmentRoot", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iPackageFragmentEDataType, IPackageFragment.class, "IPackageFragment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iCompilationUnitEDataType, ICompilationUnit.class, "ICompilationUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (javaNatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "Java nature."
		   });	
		addAnnotation
		  (getJavaNature_Packagefragmentroots(), 
		   source, 
		   new String[] {
			 "documentation", "Package fragments roots (source folders)."
		   });	
		addAnnotation
		  (packageFragmentRootEClass, 
		   source, 
		   new String[] {
			 "documentation", "Package fragment root (source folder)."
		   });	
		addAnnotation
		  (getPackageFragmentRoot_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Folder name within the project. Interpolated and may be a path name, i.e. \r\ncontain file separators, e.g. ``src/java``."
		   });	
		addAnnotation
		  (getPackageFragmentRoot_Packagefragments(), 
		   source, 
		   new String[] {
			 "documentation", "Package fragments (packages)."
		   });	
		addAnnotation
		  (packageFragmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "Package fragment (package)."
		   });	
		addAnnotation
		  (getPackageFragment_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Package name, interpolated."
		   });	
		addAnnotation
		  (getPackageFragment_Compilationunits(), 
		   source, 
		   new String[] {
			 "documentation", "Package compilation units."
		   });	
		addAnnotation
		  (compilationUnitEClass, 
		   source, 
		   new String[] {
			 "documentation", "Compilation unit."
		   });	
		addAnnotation
		  (getCompilationUnit_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Compilation unit name without ``.java`` extension. Interpolated."
		   });	
		addAnnotation
		  (getCompilationUnit_Merge(), 
		   source, 
		   new String[] {
			 "documentation", "If true, new and old compilation unit content gets merged with ``org.eclipse.emf.codegen.merge.java.JMerger``."
		   });	
		addAnnotation
		  (getCompilationUnit_Format(), 
		   source, 
		   new String[] {
			 "documentation", "If true, generated/merged source is automatically formatted."
		   });	
		addAnnotation
		  (getCompilationUnit_Generators(), 
		   source, 
		   new String[] {
			 "documentation", "Generator to produce compilation unit content."
		   });	
		addAnnotation
		  (getMember_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Member name, not applicable to constructors."
		   });	
		addAnnotation
		  (getMember_Modifiers(), 
		   source, 
		   new String[] {
			 "documentation", "Modifiers, e.g. public final. Interpolated."
		   });	
		addAnnotation
		  (getMember_CommentGenerators(), 
		   source, 
		   new String[] {
			 "documentation", "Comment generators in addition to comment attribute content."
		   });	
		addAnnotation
		  (getMember_Comment(), 
		   source, 
		   new String[] {
			 "documentation", "Comment. Interpolated. "
		   });	
		addAnnotation
		  (getMember_Annotations(), 
		   source, 
		   new String[] {
			 "documentation", "Annotations are output between the comment and the member declaration starting with modifiers, if any. Interpolated."
		   });	
		addAnnotation
		  (getMember_BodyGenerators(), 
		   source, 
		   new String[] {
			 "documentation", "Generators which generate member body. For Field field initializer is considered as body.\r\n"
		   });	
		addAnnotation
		  (getMember_TypeParameters(), 
		   source, 
		   new String[] {
			 "documentation", "Type parameters, interpolated."
		   });	
		addAnnotation
		  (getType_SuperTypes(), 
		   source, 
		   new String[] {
			 "documentation", "Supertypes. Elements are interpolated and each element can be a comma-separated list of supertypes.\r\nFor classes the first supertype goes to the extends clause and the rest to the implements clause. For interfaces all supertypes go to the implements clause.\r\nFor enum everything goes to the implements clause. Not applicable to annotations."
		   });	
		addAnnotation
		  (getOperation_Parameters(), 
		   source, 
		   new String[] {
			 "documentation", "Parameters, interpolated."
		   });	
		addAnnotation
		  (getEnum_SuperInterfaces(), 
		   source, 
		   new String[] {
			 "documentation", "Superinterfaces are listed in implements clause. Elements are interpolated and each element can be a comma-separated list of superinterfaces."
		   });
	}

} //JavaPackageImpl
