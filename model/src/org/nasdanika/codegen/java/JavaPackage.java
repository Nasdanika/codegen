/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.codegen.CodegenPackage;

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
 * @see org.nasdanika.codegen.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.codegen.java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.codegen.java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = org.nasdanika.codegen.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.JavaNatureImpl <em>Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.JavaNatureImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getJavaNature()
	 * @generated
	 */
	int JAVA_NATURE = 0;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__BASE_URL = CodegenPackage.NATURE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__DESCRIPTION = CodegenPackage.NATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__CLASS_PATH = CodegenPackage.NATURE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__INCLUDES = CodegenPackage.NATURE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__DEFAULT_INCLUDES = CodegenPackage.NATURE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__CONFIGURATION = CodegenPackage.NATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__INCLUDE = CodegenPackage.NATURE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__CONTROLLER = CodegenPackage.NATURE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__NAMED_GENERATORS = CodegenPackage.NATURE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Packagefragmentroots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE__PACKAGEFRAGMENTROOTS = CodegenPackage.NATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE_FEATURE_COUNT = CodegenPackage.NATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE___GET_CONFIG_WORK_SIZE = CodegenPackage.NATURE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE___IS_FILTERABLE = CodegenPackage.NATURE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NATURE_OPERATION_COUNT = CodegenPackage.NATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.PackageFragmentRootImpl <em>Package Fragment Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.PackageFragmentRootImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPackageFragmentRoot()
	 * @generated
	 */
	int PACKAGE_FRAGMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__BASE_URL = CodegenPackage.GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__DESCRIPTION = CodegenPackage.GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__CLASS_PATH = CodegenPackage.GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__INCLUDES = CodegenPackage.GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__DEFAULT_INCLUDES = CodegenPackage.GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__CONFIGURATION = CodegenPackage.GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__INCLUDE = CodegenPackage.GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__CONTROLLER = CodegenPackage.GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__NAMED_GENERATORS = CodegenPackage.GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__NAME = CodegenPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packagefragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__PACKAGEFRAGMENTS = CodegenPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__RESOURCES = CodegenPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Fragment Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT_FEATURE_COUNT = CodegenPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT___GET_CONFIG_WORK_SIZE = CodegenPackage.GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT___IS_FILTERABLE = CodegenPackage.GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Package Fragment Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT_OPERATION_COUNT = CodegenPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.PackageFragmentImpl <em>Package Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.PackageFragmentImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPackageFragment()
	 * @generated
	 */
	int PACKAGE_FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__BASE_URL = CodegenPackage.GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__DESCRIPTION = CodegenPackage.GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__CLASS_PATH = CodegenPackage.GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__INCLUDES = CodegenPackage.GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__DEFAULT_INCLUDES = CodegenPackage.GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__CONFIGURATION = CodegenPackage.GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__INCLUDE = CodegenPackage.GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__CONTROLLER = CodegenPackage.GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__NAMED_GENERATORS = CodegenPackage.GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__NAME = CodegenPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compilationunits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__COMPILATIONUNITS = CodegenPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__RESOURCES = CodegenPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_FEATURE_COUNT = CodegenPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT___GET_CONFIG_WORK_SIZE = CodegenPackage.GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT___IS_FILTERABLE = CodegenPackage.GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Package Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_OPERATION_COUNT = CodegenPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.CompilationUnitImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__BASE_URL = CodegenPackage.GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__DESCRIPTION = CodegenPackage.GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CLASS_PATH = CodegenPackage.GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__INCLUDES = CodegenPackage.GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__DEFAULT_INCLUDES = CodegenPackage.GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CONFIGURATION = CodegenPackage.GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__INCLUDE = CodegenPackage.GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CONTROLLER = CodegenPackage.GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAMED_GENERATORS = CodegenPackage.GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = CodegenPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__MERGE = CodegenPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FORMAT = CodegenPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__GENERATORS = CodegenPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = CodegenPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___GET_CONFIG_WORK_SIZE = CodegenPackage.GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___IS_FILTERABLE = CodegenPackage.GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_OPERATION_COUNT = CodegenPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.MemberImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 4;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__BASE_URL = CodegenPackage.GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTION = CodegenPackage.GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CLASS_PATH = CodegenPackage.GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__INCLUDES = CodegenPackage.GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DEFAULT_INCLUDES = CodegenPackage.GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CONFIGURATION = CodegenPackage.GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__INCLUDE = CodegenPackage.GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CONTROLLER = CodegenPackage.GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAMED_GENERATORS = CodegenPackage.GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = CodegenPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MODIFIERS = CodegenPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENT_GENERATORS = CodegenPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENT = CodegenPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ANNOTATIONS = CodegenPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__BODY_GENERATORS = CodegenPackage.GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE_PARAMETERS = CodegenPackage.GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = CodegenPackage.GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___GET_CONFIG_WORK_SIZE = CodegenPackage.GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___IS_FILTERABLE = CodegenPackage.GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = CodegenPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.TypeImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BASE_URL = MEMBER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLASS_PATH = MEMBER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCLUDES = MEMBER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEFAULT_INCLUDES = MEMBER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONFIGURATION = MEMBER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCLUDE = MEMBER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTROLLER = MEMBER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAMED_GENERATORS = MEMBER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT_GENERATORS = MEMBER__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BODY_GENERATORS = MEMBER__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_PARAMETERS = MEMBER__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPES = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = MEMBER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_CONFIG_WORK_SIZE = MEMBER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_FILTERABLE = MEMBER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP = MEMBER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.FieldImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BASE_URL = MEMBER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CLASS_PATH = MEMBER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCLUDES = MEMBER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT_INCLUDES = MEMBER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONFIGURATION = MEMBER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCLUDE = MEMBER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTROLLER = MEMBER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAMED_GENERATORS = MEMBER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT_GENERATORS = MEMBER__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BODY_GENERATORS = MEMBER__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE_PARAMETERS = MEMBER__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_CONTEXT__CONTEXT_SUBMONITOR = MEMBER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_CONFIG_WORK_SIZE = MEMBER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___IS_FILTERABLE = MEMBER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE__DIAGNOSTICCHAIN_MAP = MEMBER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.OperationImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BASE_URL = MEMBER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS_PATH = MEMBER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCLUDES = MEMBER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEFAULT_INCLUDES = MEMBER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONFIGURATION = MEMBER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCLUDE = MEMBER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTROLLER = MEMBER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAMED_GENERATORS = MEMBER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COMMENT_GENERATORS = MEMBER__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY_GENERATORS = MEMBER__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE_PARAMETERS = MEMBER__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__THROWN_EXCEPTIONS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR = MEMBER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_CONFIG_WORK_SIZE = MEMBER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_FILTERABLE = MEMBER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE__DIAGNOSTICCHAIN_MAP = MEMBER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.ClassImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 8;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BASE_URL = TYPE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_PATH = TYPE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INCLUDES = TYPE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DEFAULT_INCLUDES = TYPE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONFIGURATION = TYPE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INCLUDE = TYPE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTROLLER = TYPE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAMED_GENERATORS = TYPE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT_GENERATORS = TYPE__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BODY_GENERATORS = TYPE__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_TYPES = TYPE__SUPER_TYPES;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_CONTEXT__CONTEXT_SUBMONITOR = TYPE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_CONFIG_WORK_SIZE = TYPE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_FILTERABLE = TYPE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.InterfaceImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BASE_URL = TYPE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CLASS_PATH = TYPE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INCLUDES = TYPE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DEFAULT_INCLUDES = TYPE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONFIGURATION = TYPE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INCLUDE = TYPE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTROLLER = TYPE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAMED_GENERATORS = TYPE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMMENT_GENERATORS = TYPE__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BODY_GENERATORS = TYPE__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUPER_TYPES = TYPE__SUPER_TYPES;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = TYPE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_CONFIG_WORK_SIZE = TYPE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___IS_FILTERABLE = TYPE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___VALIDATE__DIAGNOSTICCHAIN_MAP = TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.AnnotationImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__BASE_URL = TYPE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CLASS_PATH = TYPE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__INCLUDES = TYPE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DEFAULT_INCLUDES = TYPE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONFIGURATION = TYPE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__INCLUDE = TYPE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTROLLER = TYPE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAMED_GENERATORS = TYPE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__COMMENT_GENERATORS = TYPE__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__BODY_GENERATORS = TYPE__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SUPER_TYPES = TYPE__SUPER_TYPES;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR = TYPE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___GET_CONFIG_WORK_SIZE = TYPE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___IS_FILTERABLE = TYPE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___VALIDATE__DIAGNOSTICCHAIN_MAP = TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.EnumImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 11;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BASE_URL = TYPE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CLASS_PATH = TYPE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__INCLUDES = TYPE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DEFAULT_INCLUDES = TYPE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CONFIGURATION = TYPE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__INCLUDE = TYPE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CONTROLLER = TYPE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAMED_GENERATORS = TYPE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT_GENERATORS = TYPE__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BODY_GENERATORS = TYPE__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SUPER_TYPES = TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SUPER_INTERFACES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___CREATE_CONTEXT__CONTEXT_SUBMONITOR = TYPE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___GET_CONFIG_WORK_SIZE = TYPE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___IS_FILTERABLE = TYPE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___VALIDATE__DIAGNOSTICCHAIN_MAP = TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.ConstructorImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 12;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BASE_URL = OPERATION__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CLASS_PATH = OPERATION__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__INCLUDES = OPERATION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DEFAULT_INCLUDES = OPERATION__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONFIGURATION = OPERATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__INCLUDE = OPERATION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONTROLLER = OPERATION__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAMED_GENERATORS = OPERATION__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MODIFIERS = OPERATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__COMMENT_GENERATORS = OPERATION__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__COMMENT = OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY_GENERATORS = OPERATION__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TYPE_PARAMETERS = OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__THROWN_EXCEPTIONS = OPERATION__THROWN_EXCEPTIONS;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = OPERATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___GET_CONFIG_WORK_SIZE = OPERATION___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___IS_FILTERABLE = OPERATION___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___VALIDATE__DIAGNOSTICCHAIN_MAP = OPERATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.MethodImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 13;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BASE_URL = OPERATION__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASS_PATH = OPERATION__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INCLUDES = OPERATION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DEFAULT_INCLUDES = OPERATION__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONFIGURATION = OPERATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INCLUDE = OPERATION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTROLLER = OPERATION__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAMED_GENERATORS = OPERATION__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MODIFIERS = OPERATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Comment Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT_GENERATORS = OPERATION__COMMENT_GENERATORS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY_GENERATORS = OPERATION__BODY_GENERATORS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE_PARAMETERS = OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWN_EXCEPTIONS = OPERATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___CREATE_CONTEXT__CONTEXT_SUBMONITOR = OPERATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___GET_CONFIG_WORK_SIZE = OPERATION___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___IS_FILTERABLE = OPERATION___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___VALIDATE__DIAGNOSTICCHAIN_MAP = OPERATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.PluginNatureImpl <em>Plugin Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.PluginNatureImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPluginNature()
	 * @generated
	 */
	int PLUGIN_NATURE = 14;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__BASE_URL = CodegenPackage.NATURE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__DESCRIPTION = CodegenPackage.NATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__CLASS_PATH = CodegenPackage.NATURE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__INCLUDES = CodegenPackage.NATURE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__DEFAULT_INCLUDES = CodegenPackage.NATURE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__CONFIGURATION = CodegenPackage.NATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__INCLUDE = CodegenPackage.NATURE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__CONTROLLER = CodegenPackage.NATURE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__NAMED_GENERATORS = CodegenPackage.NATURE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Manifest Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__MANIFEST_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Build Properties Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plugin Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__PLUGIN_XML_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fragment Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE__FRAGMENT_XML_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Plugin Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE_FEATURE_COUNT = CodegenPackage.NATURE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE___GET_CONFIG_WORK_SIZE = CodegenPackage.NATURE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE___IS_FILTERABLE = CodegenPackage.NATURE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Plugin Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_NATURE_OPERATION_COUNT = CodegenPackage.NATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.java.impl.FeatureNatureImpl <em>Feature Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.java.impl.FeatureNatureImpl
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getFeatureNature()
	 * @generated
	 */
	int FEATURE_NATURE = 15;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__BASE_URL = CodegenPackage.NATURE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__DESCRIPTION = CodegenPackage.NATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__CLASS_PATH = CodegenPackage.NATURE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__INCLUDES = CodegenPackage.NATURE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__DEFAULT_INCLUDES = CodegenPackage.NATURE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__CONFIGURATION = CodegenPackage.NATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__INCLUDE = CodegenPackage.NATURE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__CONTROLLER = CodegenPackage.NATURE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__NAMED_GENERATORS = CodegenPackage.NATURE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Feature Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__FEATURE_XML_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Build Properties Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR = CodegenPackage.NATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE_FEATURE_COUNT = CodegenPackage.NATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CodegenPackage.NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE___GET_CONFIG_WORK_SIZE = CodegenPackage.NATURE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE___IS_FILTERABLE = CodegenPackage.NATURE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP = CodegenPackage.NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Feature Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NATURE_OPERATION_COUNT = CodegenPackage.NATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>IJava Project</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IJavaProject
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIJavaProject()
	 * @generated
	 */
	int IJAVA_PROJECT = 16;

	/**
	 * The meta object id for the '<em>IPackage Fragment Root</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IPackageFragmentRoot
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIPackageFragmentRoot()
	 * @generated
	 */
	int IPACKAGE_FRAGMENT_ROOT = 17;

	/**
	 * The meta object id for the '<em>IPackage Fragment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IPackageFragment
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIPackageFragment()
	 * @generated
	 */
	int IPACKAGE_FRAGMENT = 18;

	/**
	 * The meta object id for the '<em>ICompilation Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.ICompilationUnit
	 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getICompilationUnit()
	 * @generated
	 */
	int ICOMPILATION_UNIT = 19;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.JavaNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature</em>'.
	 * @see org.nasdanika.codegen.java.JavaNature
	 * @generated
	 */
	EClass getJavaNature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.JavaNature#getPackagefragmentroots <em>Packagefragmentroots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagefragmentroots</em>'.
	 * @see org.nasdanika.codegen.java.JavaNature#getPackagefragmentroots()
	 * @see #getJavaNature()
	 * @generated
	 */
	EReference getJavaNature_Packagefragmentroots();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.PackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Fragment Root</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragmentRoot
	 * @generated
	 */
	EClass getPackageFragmentRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.PackageFragmentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragmentRoot#getName()
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	EAttribute getPackageFragmentRoot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.PackageFragmentRoot#getPackagefragments <em>Packagefragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagefragments</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragmentRoot#getPackagefragments()
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	EReference getPackageFragmentRoot_Packagefragments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.PackageFragmentRoot#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragmentRoot#getResources()
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	EReference getPackageFragmentRoot_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.PackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Fragment</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragment
	 * @generated
	 */
	EClass getPackageFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.PackageFragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragment#getName()
	 * @see #getPackageFragment()
	 * @generated
	 */
	EAttribute getPackageFragment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.PackageFragment#getCompilationunits <em>Compilationunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilationunits</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragment#getCompilationunits()
	 * @see #getPackageFragment()
	 * @generated
	 */
	EReference getPackageFragment_Compilationunits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.PackageFragment#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.codegen.java.PackageFragment#getResources()
	 * @see #getPackageFragment()
	 * @generated
	 */
	EReference getPackageFragment_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.nasdanika.codegen.java.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.CompilationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.java.CompilationUnit#getName()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.CompilationUnit#isMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge</em>'.
	 * @see org.nasdanika.codegen.java.CompilationUnit#isMerge()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Merge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.CompilationUnit#isFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.codegen.java.CompilationUnit#isFormat()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.CompilationUnit#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.java.CompilationUnit#getGenerators()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Generators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.codegen.java.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.Member#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.java.Member#getName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Member#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.codegen.java.Member#getModifiers()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Modifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.Member#getCommentGenerators <em>Comment Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment Generators</em>'.
	 * @see org.nasdanika.codegen.java.Member#getCommentGenerators()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_CommentGenerators();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.Member#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.codegen.java.Member#getComment()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Comment();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Member#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see org.nasdanika.codegen.java.Member#getAnnotations()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.java.Member#getBodyGenerators <em>Body Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Generators</em>'.
	 * @see org.nasdanika.codegen.java.Member#getBodyGenerators()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_BodyGenerators();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Member#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.codegen.java.Member#getTypeParameters()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_TypeParameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.nasdanika.codegen.java.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Type#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Super Types</em>'.
	 * @see org.nasdanika.codegen.java.Type#getSuperTypes()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_SuperTypes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.nasdanika.codegen.java.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.codegen.java.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.nasdanika.codegen.java.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.nasdanika.codegen.java.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Parameters();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Operation#getThrownExceptions <em>Thrown Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Thrown Exceptions</em>'.
	 * @see org.nasdanika.codegen.java.Operation#getThrownExceptions()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ThrownExceptions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.nasdanika.codegen.java.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.nasdanika.codegen.java.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.nasdanika.codegen.java.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.nasdanika.codegen.java.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.java.Enum#getSuperInterfaces <em>Super Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Super Interfaces</em>'.
	 * @see org.nasdanika.codegen.java.Enum#getSuperInterfaces()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_SuperInterfaces();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.nasdanika.codegen.java.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.nasdanika.codegen.java.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.java.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.nasdanika.codegen.java.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.PluginNature <em>Plugin Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Nature</em>'.
	 * @see org.nasdanika.codegen.java.PluginNature
	 * @generated
	 */
	EClass getPluginNature();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.PluginNature#getManifestGenerator <em>Manifest Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifest Generator</em>'.
	 * @see org.nasdanika.codegen.java.PluginNature#getManifestGenerator()
	 * @see #getPluginNature()
	 * @generated
	 */
	EReference getPluginNature_ManifestGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.PluginNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Properties Generator</em>'.
	 * @see org.nasdanika.codegen.java.PluginNature#getBuildPropertiesGenerator()
	 * @see #getPluginNature()
	 * @generated
	 */
	EReference getPluginNature_BuildPropertiesGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.PluginNature#getPluginXmlGenerator <em>Plugin Xml Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Xml Generator</em>'.
	 * @see org.nasdanika.codegen.java.PluginNature#getPluginXmlGenerator()
	 * @see #getPluginNature()
	 * @generated
	 */
	EReference getPluginNature_PluginXmlGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.PluginNature#getFragmentXmlGenerator <em>Fragment Xml Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fragment Xml Generator</em>'.
	 * @see org.nasdanika.codegen.java.PluginNature#getFragmentXmlGenerator()
	 * @see #getPluginNature()
	 * @generated
	 */
	EReference getPluginNature_FragmentXmlGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.java.FeatureNature <em>Feature Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Nature</em>'.
	 * @see org.nasdanika.codegen.java.FeatureNature
	 * @generated
	 */
	EClass getFeatureNature();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.FeatureNature#getFeatureXmlGenerator <em>Feature Xml Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Xml Generator</em>'.
	 * @see org.nasdanika.codegen.java.FeatureNature#getFeatureXmlGenerator()
	 * @see #getFeatureNature()
	 * @generated
	 */
	EReference getFeatureNature_FeatureXmlGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.java.FeatureNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Properties Generator</em>'.
	 * @see org.nasdanika.codegen.java.FeatureNature#getBuildPropertiesGenerator()
	 * @see #getFeatureNature()
	 * @generated
	 */
	EReference getFeatureNature_BuildPropertiesGenerator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IJavaProject <em>IJava Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IJava Project</em>'.
	 * @see org.eclipse.jdt.core.IJavaProject
	 * @model instanceClass="org.eclipse.jdt.core.IJavaProject"
	 * @generated
	 */
	EDataType getIJavaProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IPackageFragmentRoot <em>IPackage Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IPackage Fragment Root</em>'.
	 * @see org.eclipse.jdt.core.IPackageFragmentRoot
	 * @model instanceClass="org.eclipse.jdt.core.IPackageFragmentRoot"
	 * @generated
	 */
	EDataType getIPackageFragmentRoot();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IPackageFragment <em>IPackage Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IPackage Fragment</em>'.
	 * @see org.eclipse.jdt.core.IPackageFragment
	 * @model instanceClass="org.eclipse.jdt.core.IPackageFragment"
	 * @generated
	 */
	EDataType getIPackageFragment();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.ICompilationUnit <em>ICompilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ICompilation Unit</em>'.
	 * @see org.eclipse.jdt.core.ICompilationUnit
	 * @model instanceClass="org.eclipse.jdt.core.ICompilationUnit"
	 * @generated
	 */
	EDataType getICompilationUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.JavaNatureImpl <em>Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.JavaNatureImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getJavaNature()
		 * @generated
		 */
		EClass JAVA_NATURE = eINSTANCE.getJavaNature();

		/**
		 * The meta object literal for the '<em><b>Packagefragmentroots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_NATURE__PACKAGEFRAGMENTROOTS = eINSTANCE.getJavaNature_Packagefragmentroots();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.PackageFragmentRootImpl <em>Package Fragment Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.PackageFragmentRootImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPackageFragmentRoot()
		 * @generated
		 */
		EClass PACKAGE_FRAGMENT_ROOT = eINSTANCE.getPackageFragmentRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_FRAGMENT_ROOT__NAME = eINSTANCE.getPackageFragmentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Packagefragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT_ROOT__PACKAGEFRAGMENTS = eINSTANCE.getPackageFragmentRoot_Packagefragments();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT_ROOT__RESOURCES = eINSTANCE.getPackageFragmentRoot_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.PackageFragmentImpl <em>Package Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.PackageFragmentImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPackageFragment()
		 * @generated
		 */
		EClass PACKAGE_FRAGMENT = eINSTANCE.getPackageFragment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_FRAGMENT__NAME = eINSTANCE.getPackageFragment_Name();

		/**
		 * The meta object literal for the '<em><b>Compilationunits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT__COMPILATIONUNITS = eINSTANCE.getPackageFragment_Compilationunits();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT__RESOURCES = eINSTANCE.getPackageFragment_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.CompilationUnitImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__NAME = eINSTANCE.getCompilationUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__MERGE = eINSTANCE.getCompilationUnit_Merge();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__FORMAT = eINSTANCE.getCompilationUnit_Format();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__GENERATORS = eINSTANCE.getCompilationUnit_Generators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.MemberImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__MODIFIERS = eINSTANCE.getMember_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Comment Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__COMMENT_GENERATORS = eINSTANCE.getMember_CommentGenerators();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__COMMENT = eINSTANCE.getMember_Comment();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ANNOTATIONS = eINSTANCE.getMember_Annotations();

		/**
		 * The meta object literal for the '<em><b>Body Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__BODY_GENERATORS = eINSTANCE.getMember_BodyGenerators();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__TYPE_PARAMETERS = eINSTANCE.getMember_TypeParameters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.TypeImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SUPER_TYPES = eINSTANCE.getType_SuperTypes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.FieldImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.OperationImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Thrown Exceptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__THROWN_EXCEPTIONS = eINSTANCE.getOperation_ThrownExceptions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.ClassImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.InterfaceImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.AnnotationImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.EnumImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Super Interfaces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__SUPER_INTERFACES = eINSTANCE.getEnum_SuperInterfaces();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.ConstructorImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.MethodImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.PluginNatureImpl <em>Plugin Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.PluginNatureImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getPluginNature()
		 * @generated
		 */
		EClass PLUGIN_NATURE = eINSTANCE.getPluginNature();

		/**
		 * The meta object literal for the '<em><b>Manifest Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_NATURE__MANIFEST_GENERATOR = eINSTANCE.getPluginNature_ManifestGenerator();

		/**
		 * The meta object literal for the '<em><b>Build Properties Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR = eINSTANCE.getPluginNature_BuildPropertiesGenerator();

		/**
		 * The meta object literal for the '<em><b>Plugin Xml Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_NATURE__PLUGIN_XML_GENERATOR = eINSTANCE.getPluginNature_PluginXmlGenerator();

		/**
		 * The meta object literal for the '<em><b>Fragment Xml Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_NATURE__FRAGMENT_XML_GENERATOR = eINSTANCE.getPluginNature_FragmentXmlGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.java.impl.FeatureNatureImpl <em>Feature Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.java.impl.FeatureNatureImpl
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getFeatureNature()
		 * @generated
		 */
		EClass FEATURE_NATURE = eINSTANCE.getFeatureNature();

		/**
		 * The meta object literal for the '<em><b>Feature Xml Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_NATURE__FEATURE_XML_GENERATOR = eINSTANCE.getFeatureNature_FeatureXmlGenerator();

		/**
		 * The meta object literal for the '<em><b>Build Properties Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR = eINSTANCE.getFeatureNature_BuildPropertiesGenerator();

		/**
		 * The meta object literal for the '<em>IJava Project</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IJavaProject
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIJavaProject()
		 * @generated
		 */
		EDataType IJAVA_PROJECT = eINSTANCE.getIJavaProject();

		/**
		 * The meta object literal for the '<em>IPackage Fragment Root</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IPackageFragmentRoot
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIPackageFragmentRoot()
		 * @generated
		 */
		EDataType IPACKAGE_FRAGMENT_ROOT = eINSTANCE.getIPackageFragmentRoot();

		/**
		 * The meta object literal for the '<em>IPackage Fragment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IPackageFragment
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getIPackageFragment()
		 * @generated
		 */
		EDataType IPACKAGE_FRAGMENT = eINSTANCE.getIPackageFragment();

		/**
		 * The meta object literal for the '<em>ICompilation Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.ICompilationUnit
		 * @see org.nasdanika.codegen.java.impl.JavaPackageImpl#getICompilationUnit()
		 * @generated
		 */
		EDataType ICOMPILATION_UNIT = eINSTANCE.getICompilationUnit();

	}

} //JavaPackage
