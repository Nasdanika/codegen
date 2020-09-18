/**
 */
package org.nasdanika.codegen.java.impl;

import static org.nasdanika.codegen.java.JavaPackage.CLASS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.java.Annotation;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.Constructor;
import org.nasdanika.codegen.java.Field;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.codegen.java.JDKLevel;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;
import org.nasdanika.codegen.java.MemberGroup;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.codegen.java.Operation;
import org.nasdanika.codegen.java.SourceFolder;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.party.PartyPackage;

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
	private EClass sourceFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

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
	private EClass memberGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jdkLevelEEnum = null;

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
		Object registeredJavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavaPackageImpl theJavaPackage = registeredJavaPackage instanceof JavaPackageImpl ? (JavaPackageImpl)registeredJavaPackage : new JavaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodegenPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		EngineeringPackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavaPackage.createPackageContents();

		// Initialize created meta-data
		theJavaPackage.initializePackageContents();

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
	@Override
	public EClass getSourceFolder() {
		return sourceFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceFolder_JdkLevel() {
		return (EAttribute)sourceFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompilationUnit_Format() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_Modifiers() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_Comments() {
		return (EReference)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_Comment() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_Annotations() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_Body() {
		return (EReference)memberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_TypeParameters() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_SuperTypes() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Parameters() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Exceptions() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_ReturnType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberGroup() {
		return memberGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJDKLevel() {
		return jdkLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		sourceFolderEClass = createEClass(SOURCE_FOLDER);
		createEAttribute(sourceFolderEClass, SOURCE_FOLDER__JDK_LEVEL);

		packageEClass = createEClass(PACKAGE);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__FORMAT);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__MODIFIERS);
		createEReference(memberEClass, MEMBER__COMMENTS);
		createEAttribute(memberEClass, MEMBER__COMMENT);
		createEAttribute(memberEClass, MEMBER__ANNOTATIONS);
		createEReference(memberEClass, MEMBER__BODY);
		createEAttribute(memberEClass, MEMBER__TYPE_PARAMETERS);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__SUPER_TYPES);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__TYPE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__PARAMETERS);
		createEAttribute(operationEClass, OPERATION__EXCEPTIONS);

		classEClass = createEClass(CLASS);

		interfaceEClass = createEClass(INTERFACE);

		annotationEClass = createEClass(ANNOTATION);

		enumEClass = createEClass(ENUM);

		constructorEClass = createEClass(CONSTRUCTOR);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);

		memberGroupEClass = createEClass(MEMBER_GROUP);

		// Create enums
		jdkLevelEEnum = createEEnum(JDK_LEVEL);
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
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceFolderEClass.getESuperTypes().add(theCodegenPackage.getContainer());
		packageEClass.getESuperTypes().add(theCodegenPackage.getContainer());
		compilationUnitEClass.getESuperTypes().add(theCodegenPackage.getFile());
		memberEClass.getESuperTypes().add(theCodegenPackage.getContentGenerator());
		memberEClass.getESuperTypes().add(theNcorePackage.getNamedElement());
		typeEClass.getESuperTypes().add(this.getMember());
		fieldEClass.getESuperTypes().add(this.getMember());
		operationEClass.getESuperTypes().add(this.getMember());
		classEClass.getESuperTypes().add(this.getType());
		interfaceEClass.getESuperTypes().add(this.getType());
		annotationEClass.getESuperTypes().add(this.getType());
		enumEClass.getESuperTypes().add(this.getType());
		constructorEClass.getESuperTypes().add(this.getOperation());
		methodEClass.getESuperTypes().add(this.getOperation());
		memberGroupEClass.getESuperTypes().add(theCodegenPackage.getContentGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceFolderEClass, SourceFolder.class, "SourceFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFolder_JdkLevel(), this.getJDKLevel(), "jdkLevel", "1.8", 0, 1, SourceFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.codegen.java.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationUnit_Format(), ecorePackage.getEBoolean(), "format", "true", 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Comments(), theCodegenPackage.getContentGenerator(), null, "comments", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Annotations(), ecorePackage.getEString(), "annotations", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Body(), theCodegenPackage.getContentGenerator(), null, "body", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_TypeParameters(), ecorePackage.getEString(), "typeParameters", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_SuperTypes(), ecorePackage.getEString(), "superTypes", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Type(), ecorePackage.getEString(), "type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Exceptions(), ecorePackage.getEString(), "exceptions", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.nasdanika.codegen.java.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, org.nasdanika.codegen.java.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberGroupEClass, MemberGroup.class, "MemberGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(jdkLevelEEnum, JDKLevel.class, "JDKLevel");
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_4);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_5);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_6);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_7);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_8);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_9);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_10);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_11);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_12);
		addEEnumLiteral(jdkLevelEEnum, JDKLevel.JDK_13);

		// Create resource
		createResource(eNS_URI);

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
		  (sourceFolderEClass,
		   source,
		   new String[] {
			   "documentation", "Source folder contains packages."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", "Package is a container which uses a dot as a segment separator. E.g. ``org.nasdanika.codegen`` instead of ``org/nasdanika/codegen`` as in the case of a regular container."
		   });
		addAnnotation
		  (compilationUnitEClass,
		   source,
		   new String[] {
			   "documentation", "Compilation unit is a specialization of TextFile with support of Java merging and formatting. Java merging is used when reconcile action is ``MERGE`` and the merger is not set. ``.java`` extension is optional for compilation units."
		   });
		addAnnotation
		  (getCompilationUnit_Format(),
		   source,
		   new String[] {
			   "documentation", "If true, generated/merged source is automatically formatted."
		   });
		addAnnotation
		  (memberEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for fields, operations, and types."
		   });
		addAnnotation
		  (getMember_Modifiers(),
		   source,
		   new String[] {
			   "documentation", "Modifiers, e.g. public final. Interpolated."
		   });
		addAnnotation
		  (getMember_Comments(),
		   source,
		   new String[] {
			   "documentation", "Comment generators in addition to comment attribute content."
		   });
		addAnnotation
		  (getMember_Comment(),
		   source,
		   new String[] {
			   "documentation", "Comment in markdown. Interpolated and converted to HTML."
		   });
		addAnnotation
		  (getMember_Annotations(),
		   source,
		   new String[] {
			   "documentation", "Annotations are output between the comment and the member declaration starting with modifiers, if any. Interpolated."
		   });
		addAnnotation
		  (getMember_Body(),
		   source,
		   new String[] {
			   "documentation", "Generators which generate member body. For Field field initializer is considered as body.\r\n"
		   });
		addAnnotation
		  (getMember_TypeParameters(),
		   source,
		   new String[] {
			   "documentation", "Type parameters, interpolated. Can be separated with either commas or new lines."
		   });
		addAnnotation
		  (typeEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for clas, interface, annotation, and enumeration."
		   });
		addAnnotation
		  (getType_SuperTypes(),
		   source,
		   new String[] {
			   "documentation", "Supertypes. Interpolated. New line characters are replaced with commas.\nFor classes the first supertype goes to the extends clause and the rest to the implements clause. If the first element in the class supertypes is ``java.lang.Object`` or an empty string then the ``extends`` clause is not generated.\nFor interfaces all supertypes go to the implements clause.\nFor enum everything goes to the implements clause. \nNot applicable to annotations."
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for constructor and method."
		   });
		addAnnotation
		  (getOperation_Parameters(),
		   source,
		   new String[] {
			   "documentation", "Parameter declarations, interpolated. Can be separated by commas or new line characters."
		   });
		addAnnotation
		  (getOperation_Exceptions(),
		   source,
		   new String[] {
			   "documentation", "Exceptions thrown by this operation, interpolated. Can be separated by commas or new line characters."
		   });
		addAnnotation
		  (constructorEClass,
		   source,
		   new String[] {
			   "documentation", "Constructor. Note: Constructor has a required name because it inherits from NamedElement. However, the value of name is not used in generation and can be set any non-blank text."
		   });
	}

} //JavaPackageImpl
