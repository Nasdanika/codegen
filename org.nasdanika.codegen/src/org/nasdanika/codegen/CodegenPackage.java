/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.config.ConfigPackage;

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
 * Code generation model.
 * <!-- end-model-doc -->
 * @see org.nasdanika.codegen.CodegenFactory
 * @model kind="package"
 * @generated
 */
public interface CodegenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codegen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.codegen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.codegen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodegenPackage eINSTANCE = org.nasdanika.codegen.impl.CodegenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.config.Provider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.Provider
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.WorkFactory <em>Work Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.WorkFactory
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getWorkFactory()
	 * @generated
	 */
	int WORK_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Work Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Work Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__INCLUDES = ConfigPackage.CONFIGURATION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONFIGURATION = ConfigPackage.CONFIGURATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DEFAULT_INCLUDES = ConfigPackage.CONFIGURATION__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_URL = ConfigPackage.CONFIGURATION__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CLASS_PATH = ConfigPackage.CONFIGURATION__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__INCLUDE = ConfigPackage.CONFIGURATION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DESCRIPTION = ConfigPackage.CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ITERATOR = ConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONFIGURATOR = ConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = ConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = ConfigPackage.CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GET_CONFIG_WORK_SIZE = ConfigPackage.CONFIGURATION___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___IS_FILTERABLE = ConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = ConfigPackage.CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = ConfigPackage.CONFIGURATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SELECTOR = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__INCLUDES = GROUP__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DEFAULT_INCLUDES = GROUP__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__BASE_URL = GROUP__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CLASS_PATH = GROUP__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__INCLUDE = GROUP__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ITERATOR = GROUP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONFIGURATOR = GROUP__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__SELECTOR = GROUP__SELECTOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GROUP___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP___GET_CONFIG_WORK_SIZE = GROUP___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP___IS_FILTERABLE = GROUP___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorImpl <em>Resource Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGenerator()
	 * @generated
	 */
	int RESOURCE_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The number of structural features of the '<em>Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.WorkspaceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 5;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__INCLUDES = GROUP__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__DEFAULT_INCLUDES = GROUP__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__BASE_URL = GROUP__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CLASS_PATH = GROUP__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__INCLUDE = GROUP__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ITERATOR = GROUP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CONFIGURATOR = GROUP__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__SELECTOR = GROUP__SELECTOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GROUP___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE___GET_CONFIG_WORK_SIZE = GROUP___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE___IS_FILTERABLE = GROUP___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE___VALIDATE__DIAGNOSTICCHAIN_MAP = GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INCLUDES = RESOURCE_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEFAULT_INCLUDES = RESOURCE_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BASE_URL = RESOURCE_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CLASS_PATH = RESOURCE_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INCLUDE = RESOURCE_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ITERATOR = RESOURCE_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATOR = RESOURCE_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = RESOURCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RECONCILE_ACTION = RESOURCE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = RESOURCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_CONFIG_WORK_SIZE = RESOURCE_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___IS_FILTERABLE = RESOURCE_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = RESOURCE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FolderImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 6;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__INCLUDES = RESOURCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DEFAULT_INCLUDES = RESOURCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__BASE_URL = RESOURCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CLASS_PATH = RESOURCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__INCLUDE = RESOURCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONFIGURATOR = RESOURCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__RECONCILE_ACTION = RESOURCE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CHILDREN = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___GET_CONFIG_WORK_SIZE = RESOURCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___IS_FILTERABLE = RESOURCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.NatureImpl <em>Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.NatureImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 7;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The number of structural features of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FileImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 8;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__INCLUDES = RESOURCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DEFAULT_INCLUDES = RESOURCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BASE_URL = RESOURCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CLASS_PATH = RESOURCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__INCLUDE = RESOURCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONFIGURATOR = RESOURCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__RECONCILE_ACTION = RESOURCE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MERGER = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GENERATOR = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___GET_CONFIG_WORK_SIZE = RESOURCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___IS_FILTERABLE = RESOURCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ProjectImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 9;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INCLUDES = RESOURCE_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEFAULT_INCLUDES = RESOURCE_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_URL = RESOURCE_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CLASS_PATH = RESOURCE_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INCLUDE = RESOURCE_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ITERATOR = RESOURCE_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONFIGURATOR = RESOURCE_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = RESOURCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Natures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NATURES = RESOURCE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = RESOURCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RECONCILE_ACTION = RESOURCE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = RESOURCE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___GET_CONFIG_WORK_SIZE = RESOURCE_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___IS_FILTERABLE = RESOURCE_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = RESOURCE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.BinaryFileImpl <em>Binary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.BinaryFileImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryFile()
	 * @generated
	 */
	int BINARY_FILE = 11;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__INCLUDES = FILE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONFIGURATION = FILE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__DEFAULT_INCLUDES = FILE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__BASE_URL = FILE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CLASS_PATH = FILE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__INCLUDE = FILE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__ITERATOR = FILE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONFIGURATOR = FILE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__RECONCILE_ACTION = FILE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__MERGER = FILE__MERGER;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__GENERATOR = FILE__GENERATOR;

	/**
	 * The number of structural features of the '<em>Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = FILE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE___GET_CONFIG_WORK_SIZE = FILE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE___IS_FILTERABLE = FILE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE___VALIDATE__DIAGNOSTICCHAIN_MAP = FILE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextFileImpl <em>Text File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextFileImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextFile()
	 * @generated
	 */
	int TEXT_FILE = 12;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__INCLUDES = FILE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONFIGURATION = FILE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__DEFAULT_INCLUDES = FILE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__BASE_URL = FILE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CLASS_PATH = FILE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__INCLUDE = FILE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__ITERATOR = FILE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONFIGURATOR = FILE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__RECONCILE_ACTION = FILE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__MERGER = FILE__MERGER;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__GENERATOR = FILE__GENERATOR;

	/**
	 * The number of structural features of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = FILE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___GET_CONFIG_WORK_SIZE = FILE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___IS_FILTERABLE = FILE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___VALIDATE__DIAGNOSTICCHAIN_MAP = FILE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceReferenceImpl <em>Resource Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceReference()
	 * @generated
	 */
	int RESOURCE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__INCLUDES = RESOURCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__DEFAULT_INCLUDES = RESOURCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__BASE_URL = RESOURCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__CLASS_PATH = RESOURCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__INCLUDE = RESOURCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__CONFIGURATOR = RESOURCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__RECONCILE_ACTION = RESOURCE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__TARGET = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE___GET_CONFIG_WORK_SIZE = RESOURCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE___IS_FILTERABLE = RESOURCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StaticTextImpl <em>Static Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StaticTextImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticText()
	 * @generated
	 */
	int STATIC_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTENT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Static Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentReference()
	 * @generated
	 */
	int CONTENT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__REF = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 16;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__GENERATOR = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaGeneratorImpl <em>Java Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaGenerator()
	 * @generated
	 */
	int JAVA_GENERATOR = 17;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CLASS_NAME = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.InterpolatorImpl <em>Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.InterpolatorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInterpolator()
	 * @generated
	 */
	int INTERPOLATOR = 18;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__INCLUDES = FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__DEFAULT_INCLUDES = FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__BASE_URL = FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CLASS_PATH = FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__INCLUDE = FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ITERATOR = FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONFIGURATOR = FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__GENERATOR = FILTER__GENERATOR;

	/**
	 * The number of structural features of the '<em>Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR___GET_CONFIG_WORK_SIZE = FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR___IS_FILTERABLE = FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JETEmitterImpl <em>JET Emitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JETEmitterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJETEmitter()
	 * @generated
	 */
	int JET_EMITTER = 19;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Template URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER__TEMPLATE_URI = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JET Emitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>JET Emitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JET_EMITTER_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaFilterImpl <em>Java Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaFilter()
	 * @generated
	 */
	int JAVA_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__INCLUDES = FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__DEFAULT_INCLUDES = FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__BASE_URL = FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CLASS_PATH = FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__INCLUDE = FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__ITERATOR = FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONFIGURATOR = FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__GENERATOR = FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CLASS_NAME = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___GET_CONFIG_WORK_SIZE = FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___IS_FILTERABLE = FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaTextFilterImpl <em>Java Text Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaTextFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextFilter()
	 * @generated
	 */
	int JAVA_TEXT_FILTER = 22;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__INCLUDES = JAVA_FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONFIGURATION = JAVA_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__DEFAULT_INCLUDES = JAVA_FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__BASE_URL = JAVA_FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CLASS_PATH = JAVA_FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__INCLUDE = JAVA_FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__DESCRIPTION = JAVA_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__ITERATOR = JAVA_FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONFIGURATOR = JAVA_FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__GENERATOR = JAVA_FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CLASS_NAME = JAVA_FILTER__CLASS_NAME;

	/**
	 * The number of structural features of the '<em>Java Text Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = JAVA_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER___GET_CONFIG_WORK_SIZE = JAVA_FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER___IS_FILTERABLE = JAVA_FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Text Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER_OPERATION_COUNT = JAVA_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaStreamFilterImpl <em>Java Stream Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaStreamFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamFilter()
	 * @generated
	 */
	int JAVA_STREAM_FILTER = 23;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__INCLUDES = JAVA_FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONFIGURATION = JAVA_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__DEFAULT_INCLUDES = JAVA_FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__BASE_URL = JAVA_FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CLASS_PATH = JAVA_FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__INCLUDE = JAVA_FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__DESCRIPTION = JAVA_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__ITERATOR = JAVA_FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONFIGURATOR = JAVA_FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__GENERATOR = JAVA_FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CLASS_NAME = JAVA_FILTER__CLASS_NAME;

	/**
	 * The number of structural features of the '<em>Java Stream Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = JAVA_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER___GET_CONFIG_WORK_SIZE = JAVA_FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER___IS_FILTERABLE = JAVA_FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Stream Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER_OPERATION_COUNT = JAVA_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaTextGeneratorImpl <em>Java Text Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaTextGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextGenerator()
	 * @generated
	 */
	int JAVA_TEXT_GENERATOR = 24;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__INCLUDES = JAVA_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONFIGURATION = JAVA_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__DEFAULT_INCLUDES = JAVA_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__BASE_URL = JAVA_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CLASS_PATH = JAVA_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__INCLUDE = JAVA_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__DESCRIPTION = JAVA_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__ITERATOR = JAVA_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONFIGURATOR = JAVA_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CLASS_NAME = JAVA_GENERATOR__CLASS_NAME;

	/**
	 * The number of structural features of the '<em>Java Text Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR_FEATURE_COUNT = JAVA_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = JAVA_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR___GET_CONFIG_WORK_SIZE = JAVA_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR___IS_FILTERABLE = JAVA_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Text Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR_OPERATION_COUNT = JAVA_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaStreamGeneratorImpl <em>Java Stream Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaStreamGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamGenerator()
	 * @generated
	 */
	int JAVA_STREAM_GENERATOR = 25;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__INCLUDES = JAVA_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONFIGURATION = JAVA_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__DEFAULT_INCLUDES = JAVA_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__BASE_URL = JAVA_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CLASS_PATH = JAVA_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__INCLUDE = JAVA_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__DESCRIPTION = JAVA_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__ITERATOR = JAVA_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONFIGURATOR = JAVA_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CLASS_NAME = JAVA_GENERATOR__CLASS_NAME;

	/**
	 * The number of structural features of the '<em>Java Stream Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR_FEATURE_COUNT = JAVA_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = JAVA_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR___GET_CONFIG_WORK_SIZE = JAVA_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR___IS_FILTERABLE = JAVA_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Stream Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR_OPERATION_COUNT = JAVA_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedGeneratorImpl <em>Scripted Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedGenerator()
	 * @generated
	 */
	int SCRIPTED_GENERATOR = 26;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__INCLUDES = GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__DEFAULT_INCLUDES = GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__BASE_URL = GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__CLASS_PATH = GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__INCLUDE = GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__CONFIGURATOR = GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR__SCRIPT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scripted Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR___GET_CONFIG_WORK_SIZE = GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedTextGeneratorImpl <em>Scripted Text Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedTextGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedTextGenerator()
	 * @generated
	 */
	int SCRIPTED_TEXT_GENERATOR = 27;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__INCLUDES = SCRIPTED_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__CONFIGURATION = SCRIPTED_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__DEFAULT_INCLUDES = SCRIPTED_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__BASE_URL = SCRIPTED_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__CLASS_PATH = SCRIPTED_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__INCLUDE = SCRIPTED_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__DESCRIPTION = SCRIPTED_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__ITERATOR = SCRIPTED_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__CONFIGURATOR = SCRIPTED_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR__SCRIPT = SCRIPTED_GENERATOR__SCRIPT;

	/**
	 * The number of structural features of the '<em>Scripted Text Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR_FEATURE_COUNT = SCRIPTED_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = SCRIPTED_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR___GET_CONFIG_WORK_SIZE = SCRIPTED_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR___IS_FILTERABLE = SCRIPTED_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = SCRIPTED_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Text Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_GENERATOR_OPERATION_COUNT = SCRIPTED_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedStreamGeneratorImpl <em>Scripted Stream Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedStreamGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedStreamGenerator()
	 * @generated
	 */
	int SCRIPTED_STREAM_GENERATOR = 28;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__INCLUDES = SCRIPTED_GENERATOR__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__CONFIGURATION = SCRIPTED_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__DEFAULT_INCLUDES = SCRIPTED_GENERATOR__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__BASE_URL = SCRIPTED_GENERATOR__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__CLASS_PATH = SCRIPTED_GENERATOR__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__INCLUDE = SCRIPTED_GENERATOR__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__DESCRIPTION = SCRIPTED_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__ITERATOR = SCRIPTED_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__CONFIGURATOR = SCRIPTED_GENERATOR__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR__SCRIPT = SCRIPTED_GENERATOR__SCRIPT;

	/**
	 * The number of structural features of the '<em>Scripted Stream Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR_FEATURE_COUNT = SCRIPTED_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR = SCRIPTED_GENERATOR___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR___GET_CONFIG_WORK_SIZE = SCRIPTED_GENERATOR___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR___IS_FILTERABLE = SCRIPTED_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = SCRIPTED_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Stream Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_GENERATOR_OPERATION_COUNT = SCRIPTED_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedFilterImpl <em>Scripted Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedFilter()
	 * @generated
	 */
	int SCRIPTED_FILTER = 29;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__INCLUDES = FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__DEFAULT_INCLUDES = FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__BASE_URL = FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__CLASS_PATH = FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__INCLUDE = FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__ITERATOR = FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__CONFIGURATOR = FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__GENERATOR = FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER__SCRIPT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scripted Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER___GET_CONFIG_WORK_SIZE = FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER___IS_FILTERABLE = FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FILTER_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedTextFilterImpl <em>Scripted Text Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedTextFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedTextFilter()
	 * @generated
	 */
	int SCRIPTED_TEXT_FILTER = 30;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__INCLUDES = SCRIPTED_FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__CONFIGURATION = SCRIPTED_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__DEFAULT_INCLUDES = SCRIPTED_FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__BASE_URL = SCRIPTED_FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__CLASS_PATH = SCRIPTED_FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__INCLUDE = SCRIPTED_FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__DESCRIPTION = SCRIPTED_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__ITERATOR = SCRIPTED_FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__CONFIGURATOR = SCRIPTED_FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__GENERATOR = SCRIPTED_FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER__SCRIPT = SCRIPTED_FILTER__SCRIPT;

	/**
	 * The number of structural features of the '<em>Scripted Text Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER_FEATURE_COUNT = SCRIPTED_FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = SCRIPTED_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER___GET_CONFIG_WORK_SIZE = SCRIPTED_FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER___IS_FILTERABLE = SCRIPTED_FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = SCRIPTED_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Text Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TEXT_FILTER_OPERATION_COUNT = SCRIPTED_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ScriptedStreamFilterImpl <em>Scripted Stream Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ScriptedStreamFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedStreamFilter()
	 * @generated
	 */
	int SCRIPTED_STREAM_FILTER = 31;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__INCLUDES = SCRIPTED_FILTER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__CONFIGURATION = SCRIPTED_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__DEFAULT_INCLUDES = SCRIPTED_FILTER__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__BASE_URL = SCRIPTED_FILTER__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__CLASS_PATH = SCRIPTED_FILTER__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__INCLUDE = SCRIPTED_FILTER__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__DESCRIPTION = SCRIPTED_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__ITERATOR = SCRIPTED_FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__CONFIGURATOR = SCRIPTED_FILTER__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__GENERATOR = SCRIPTED_FILTER__GENERATOR;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER__SCRIPT = SCRIPTED_FILTER__SCRIPT;

	/**
	 * The number of structural features of the '<em>Scripted Stream Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER_FEATURE_COUNT = SCRIPTED_FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR = SCRIPTED_FILTER___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER___GET_CONFIG_WORK_SIZE = SCRIPTED_FILTER___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER___IS_FILTERABLE = SCRIPTED_FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = SCRIPTED_FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scripted Stream Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_STREAM_FILTER_OPERATION_COUNT = SCRIPTED_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextContentReferenceImpl <em>Text Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextContentReference()
	 * @generated
	 */
	int TEXT_CONTENT_REFERENCE = 32;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__INCLUDES = CONTENT_REFERENCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONFIGURATION = CONTENT_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__DEFAULT_INCLUDES = CONTENT_REFERENCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__BASE_URL = CONTENT_REFERENCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CLASS_PATH = CONTENT_REFERENCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__INCLUDE = CONTENT_REFERENCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__DESCRIPTION = CONTENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__ITERATOR = CONTENT_REFERENCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONFIGURATOR = CONTENT_REFERENCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__REF = CONTENT_REFERENCE__REF;

	/**
	 * The number of structural features of the '<em>Text Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE_FEATURE_COUNT = CONTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CONTENT_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE___GET_CONFIG_WORK_SIZE = CONTENT_REFERENCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE___IS_FILTERABLE = CONTENT_REFERENCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE_OPERATION_COUNT = CONTENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StreamContentReferenceImpl <em>Stream Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StreamContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamContentReference()
	 * @generated
	 */
	int STREAM_CONTENT_REFERENCE = 33;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__INCLUDES = CONTENT_REFERENCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONFIGURATION = CONTENT_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__DEFAULT_INCLUDES = CONTENT_REFERENCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__BASE_URL = CONTENT_REFERENCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CLASS_PATH = CONTENT_REFERENCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__INCLUDE = CONTENT_REFERENCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__DESCRIPTION = CONTENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__ITERATOR = CONTENT_REFERENCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONFIGURATOR = CONTENT_REFERENCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__REF = CONTENT_REFERENCE__REF;

	/**
	 * The number of structural features of the '<em>Stream Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE_FEATURE_COUNT = CONTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CONTENT_REFERENCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE___GET_CONFIG_WORK_SIZE = CONTENT_REFERENCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE___IS_FILTERABLE = CONTENT_REFERENCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stream Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE_OPERATION_COUNT = CONTENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ZipArchiveImpl <em>Zip Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ZipArchiveImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getZipArchive()
	 * @generated
	 */
	int ZIP_ARCHIVE = 34;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__INCLUDES = RESOURCE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__DEFAULT_INCLUDES = RESOURCE__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__BASE_URL = RESOURCE__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CLASS_PATH = RESOURCE__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__INCLUDE = RESOURCE__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Configurator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONFIGURATOR = RESOURCE__CONFIGURATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__RECONCILE_ACTION = RESOURCE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__GENERATOR = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__MERGER = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = RESOURCE___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___GET_CONFIG_WORK_SIZE = RESOURCE___GET_CONFIG_WORK_SIZE;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___IS_FILTERABLE = RESOURCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getReconcileAction()
	 * @generated
	 */
	int RECONCILE_ACTION = 35;

	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.Context
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 36;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 37;

	/**
	 * The meta object id for the '<em>Void</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Void
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 38;

	/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 39;

	/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 40;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 41;

	/**
	 * The meta object id for the '<em>IProject Nature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProjectNature
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIProjectNature()
	 * @generated
	 */
	int IPROJECT_NATURE = 42;

	/**
	 * The meta object id for the '<em>IWorkspace Root</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IWorkspaceRoot
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIWorkspaceRoot()
	 * @generated
	 */
	int IWORKSPACE_ROOT = 43;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 44;

	/**
	 * The meta object id for the '<em>IResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IResource
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 45;


	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getList()
	 * @generated
	 */
	int LIST = 46;


	/**
	 * The meta object id for the '<em>Merger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.Merger
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMerger()
	 * @generated
	 */
	int MERGER = 47;


	/**
	 * The meta object id for the '<em>Sub Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.SubMonitor
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getSubMonitor()
	 * @generated
	 */
	int SUB_MONITOR = 48;


	/**
	 * The meta object id for the '<em>IContainer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IContainer
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 49;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.WorkFactory <em>Work Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Factory</em>'.
	 * @see org.nasdanika.codegen.WorkFactory
	 * @model instanceClass="org.nasdanika.codegen.WorkFactory" typeParameters="T"
	 * @generated
	 */
	EClass getWorkFactory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see org.nasdanika.codegen.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator</em>'.
	 * @see org.nasdanika.codegen.Generator#getIterator()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Iterator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getConfigurator <em>Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configurator</em>'.
	 * @see org.nasdanika.codegen.Generator#getConfigurator()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Configurator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.Generator#isFilterable() <em>Is Filterable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filterable</em>' operation.
	 * @see org.nasdanika.codegen.Generator#isFilterable()
	 * @generated
	 */
	EOperation getGenerator__IsFilterable();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.Generator#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see org.nasdanika.codegen.Generator#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGenerator__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.codegen.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Group#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.nasdanika.codegen.Group#getSelector()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Group#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.codegen.Group#getElements()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see org.nasdanika.codegen.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGenerator <em>Resource Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Generator</em>'.
	 * @see org.nasdanika.codegen.ResourceGenerator
	 * @generated
	 */
	EClass getResourceGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.nasdanika.codegen.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.nasdanika.codegen.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Folder#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.codegen.Folder#getChildren()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature</em>'.
	 * @see org.nasdanika.codegen.Nature
	 * @generated
	 */
	EClass getNature();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.nasdanika.codegen.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.File#getMerger()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Merger();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.File#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see org.nasdanika.codegen.File#getGenerator()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Generator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.codegen.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Project#getNatures <em>Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Natures</em>'.
	 * @see org.nasdanika.codegen.Project#getNatures()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Natures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.codegen.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Project#getReconcileAction <em>Reconcile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Action</em>'.
	 * @see org.nasdanika.codegen.Project#getReconcileAction()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ReconcileAction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.codegen.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Resource#getReconcileAction <em>Reconcile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Action</em>'.
	 * @see org.nasdanika.codegen.Resource#getReconcileAction()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ReconcileAction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.BinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary File</em>'.
	 * @see org.nasdanika.codegen.BinaryFile
	 * @generated
	 */
	EClass getBinaryFile();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.TextFile <em>Text File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text File</em>'.
	 * @see org.nasdanika.codegen.TextFile
	 * @generated
	 */
	EClass getTextFile();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reference</em>'.
	 * @see org.nasdanika.codegen.ResourceReference
	 * @generated
	 */
	EClass getResourceReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.codegen.ResourceReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.codegen.ResourceReference#getTarget()
	 * @see #getResourceReference()
	 * @generated
	 */
	EReference getResourceReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StaticText <em>Static Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Text</em>'.
	 * @see org.nasdanika.codegen.StaticText
	 * @generated
	 */
	EClass getStaticText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.StaticText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.codegen.StaticText#getContent()
	 * @see #getStaticText()
	 * @generated
	 */
	EAttribute getStaticText_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Reference</em>'.
	 * @see org.nasdanika.codegen.ContentReference
	 * @generated
	 */
	EClass getContentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ContentReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.codegen.ContentReference#getRef()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_Ref();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.nasdanika.codegen.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.Filter#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see org.nasdanika.codegen.Filter#getGenerator()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Generator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaGenerator <em>Java Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Generator</em>'.
	 * @see org.nasdanika.codegen.JavaGenerator
	 * @generated
	 */
	EClass getJavaGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.JavaGenerator#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.nasdanika.codegen.JavaGenerator#getClassName()
	 * @see #getJavaGenerator()
	 * @generated
	 */
	EAttribute getJavaGenerator_ClassName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Interpolator <em>Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolator</em>'.
	 * @see org.nasdanika.codegen.Interpolator
	 * @generated
	 */
	EClass getInterpolator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JETEmitter <em>JET Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JET Emitter</em>'.
	 * @see org.nasdanika.codegen.JETEmitter
	 * @generated
	 */
	EClass getJETEmitter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.JETEmitter#getTemplateURI <em>Template URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template URI</em>'.
	 * @see org.nasdanika.codegen.JETEmitter#getTemplateURI()
	 * @see #getJETEmitter()
	 * @generated
	 */
	EAttribute getJETEmitter_TemplateURI();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaFilter <em>Java Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Filter</em>'.
	 * @see org.nasdanika.codegen.JavaFilter
	 * @generated
	 */
	EClass getJavaFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.JavaFilter#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.nasdanika.codegen.JavaFilter#getClassName()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_ClassName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.nasdanika.config.Provider
	 * @model instanceClass="org.nasdanika.config.Provider" typeParameters="T"
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaTextFilter <em>Java Text Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Text Filter</em>'.
	 * @see org.nasdanika.codegen.JavaTextFilter
	 * @generated
	 */
	EClass getJavaTextFilter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaStreamFilter <em>Java Stream Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Stream Filter</em>'.
	 * @see org.nasdanika.codegen.JavaStreamFilter
	 * @generated
	 */
	EClass getJavaStreamFilter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaTextGenerator <em>Java Text Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Text Generator</em>'.
	 * @see org.nasdanika.codegen.JavaTextGenerator
	 * @generated
	 */
	EClass getJavaTextGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaStreamGenerator <em>Java Stream Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Stream Generator</em>'.
	 * @see org.nasdanika.codegen.JavaStreamGenerator
	 * @generated
	 */
	EClass getJavaStreamGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedGenerator <em>Scripted Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Generator</em>'.
	 * @see org.nasdanika.codegen.ScriptedGenerator
	 * @generated
	 */
	EClass getScriptedGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ScriptedGenerator#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.nasdanika.codegen.ScriptedGenerator#getScript()
	 * @see #getScriptedGenerator()
	 * @generated
	 */
	EAttribute getScriptedGenerator_Script();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedTextGenerator <em>Scripted Text Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Text Generator</em>'.
	 * @see org.nasdanika.codegen.ScriptedTextGenerator
	 * @generated
	 */
	EClass getScriptedTextGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedStreamGenerator <em>Scripted Stream Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Stream Generator</em>'.
	 * @see org.nasdanika.codegen.ScriptedStreamGenerator
	 * @generated
	 */
	EClass getScriptedStreamGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedFilter <em>Scripted Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Filter</em>'.
	 * @see org.nasdanika.codegen.ScriptedFilter
	 * @generated
	 */
	EClass getScriptedFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ScriptedFilter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.nasdanika.codegen.ScriptedFilter#getScript()
	 * @see #getScriptedFilter()
	 * @generated
	 */
	EAttribute getScriptedFilter_Script();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedTextFilter <em>Scripted Text Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Text Filter</em>'.
	 * @see org.nasdanika.codegen.ScriptedTextFilter
	 * @generated
	 */
	EClass getScriptedTextFilter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ScriptedStreamFilter <em>Scripted Stream Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Stream Filter</em>'.
	 * @see org.nasdanika.codegen.ScriptedStreamFilter
	 * @generated
	 */
	EClass getScriptedStreamFilter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.TextContentReference <em>Text Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content Reference</em>'.
	 * @see org.nasdanika.codegen.TextContentReference
	 * @generated
	 */
	EClass getTextContentReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StreamContentReference <em>Stream Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Content Reference</em>'.
	 * @see org.nasdanika.codegen.StreamContentReference
	 * @generated
	 */
	EClass getStreamContentReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ZipArchive <em>Zip Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zip Archive</em>'.
	 * @see org.nasdanika.codegen.ZipArchive
	 * @generated
	 */
	EClass getZipArchive();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.ZipArchive#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see org.nasdanika.codegen.ZipArchive#getGenerator()
	 * @see #getZipArchive()
	 * @generated
	 */
	EReference getZipArchive_Generator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.ZipArchive#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.ZipArchive#getMerger()
	 * @see #getZipArchive()
	 * @generated
	 */
	EReference getZipArchive_Merger();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reconcile Action</em>'.
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @generated
	 */
	EEnum getReconcileAction();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.config.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.nasdanika.config.Context
	 * @model instanceClass="org.nasdanika.config.Context"
	 * @generated
	 */
	EDataType getContext();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.lang.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Void</em>'.
	 * @see java.lang.Void
	 * @model instanceClass="java.lang.Void"
	 * @generated
	 */
	EDataType getVoid();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFolder <em>IFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFolder</em>'.
	 * @see org.eclipse.core.resources.IFolder
	 * @model instanceClass="org.eclipse.core.resources.IFolder"
	 * @generated
	 */
	EDataType getIFolder();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProjectNature <em>IProject Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject Nature</em>'.
	 * @see org.eclipse.core.resources.IProjectNature
	 * @model instanceClass="org.eclipse.core.resources.IProjectNature"
	 * @generated
	 */
	EDataType getIProjectNature();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IWorkspaceRoot <em>IWorkspace Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IWorkspace Root</em>'.
	 * @see org.eclipse.core.resources.IWorkspaceRoot
	 * @model instanceClass="org.eclipse.core.resources.IWorkspaceRoot"
	 * @generated
	 */
	EDataType getIWorkspaceRoot();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IResource</em>'.
	 * @see org.eclipse.core.resources.IResource
	 * @model instanceClass="org.eclipse.core.resources.IResource"
	 * @generated
	 */
	EDataType getIResource();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.codegen.Merger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.Merger
	 * @model instanceClass="org.nasdanika.codegen.Merger" typeParameters="T"
	 * @generated
	 */
	EDataType getMerger();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.SubMonitor <em>Sub Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Monitor</em>'.
	 * @see org.eclipse.core.runtime.SubMonitor
	 * @model instanceClass="org.eclipse.core.runtime.SubMonitor"
	 * @generated
	 */
	EDataType getSubMonitor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContainer</em>'.
	 * @see org.eclipse.core.resources.IContainer
	 * @model instanceClass="org.eclipse.core.resources.IContainer"
	 * @generated
	 */
	EDataType getIContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodegenFactory getCodegenFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.WorkFactory <em>Work Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.WorkFactory
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getWorkFactory()
		 * @generated
		 */
		EClass WORK_FACTORY = eINSTANCE.getWorkFactory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ITERATOR = eINSTANCE.getGenerator_Iterator();

		/**
		 * The meta object literal for the '<em><b>Configurator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONFIGURATOR = eINSTANCE.getGenerator_Configurator();

		/**
		 * The meta object literal for the '<em><b>Is Filterable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___IS_FILTERABLE = eINSTANCE.getGenerator__IsFilterable();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGenerator__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GroupImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SELECTOR = eINSTANCE.getGroup_Selector();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceGroupImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorImpl <em>Resource Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGenerator()
		 * @generated
		 */
		EClass RESOURCE_GENERATOR = eINSTANCE.getResourceGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.WorkspaceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.FolderImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CHILDREN = eINSTANCE.getFolder_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.NatureImpl <em>Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.NatureImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getNature()
		 * @generated
		 */
		EClass NATURE = eINSTANCE.getNature();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.FileImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__MERGER = eINSTANCE.getFile_Merger();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__GENERATOR = eINSTANCE.getFile_Generator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ProjectImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Natures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__NATURES = eINSTANCE.getProject_Natures();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '<em><b>Reconcile Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__RECONCILE_ACTION = eINSTANCE.getProject_ReconcileAction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Reconcile Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RECONCILE_ACTION = eINSTANCE.getResource_ReconcileAction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.BinaryFileImpl <em>Binary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.BinaryFileImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryFile()
		 * @generated
		 */
		EClass BINARY_FILE = eINSTANCE.getBinaryFile();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextFileImpl <em>Text File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextFileImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextFile()
		 * @generated
		 */
		EClass TEXT_FILE = eINSTANCE.getTextFile();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceReferenceImpl <em>Resource Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceReference()
		 * @generated
		 */
		EClass RESOURCE_REFERENCE = eINSTANCE.getResourceReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REFERENCE__TARGET = eINSTANCE.getResourceReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StaticTextImpl <em>Static Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StaticTextImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticText()
		 * @generated
		 */
		EClass STATIC_TEXT = eINSTANCE.getStaticText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TEXT__CONTENT = eINSTANCE.getStaticText_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContentReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentReference()
		 * @generated
		 */
		EClass CONTENT_REFERENCE = eINSTANCE.getContentReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__REF = eINSTANCE.getContentReference_Ref();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.FilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__GENERATOR = eINSTANCE.getFilter_Generator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaGeneratorImpl <em>Java Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaGenerator()
		 * @generated
		 */
		EClass JAVA_GENERATOR = eINSTANCE.getJavaGenerator();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_GENERATOR__CLASS_NAME = eINSTANCE.getJavaGenerator_ClassName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.InterpolatorImpl <em>Interpolator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.InterpolatorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInterpolator()
		 * @generated
		 */
		EClass INTERPOLATOR = eINSTANCE.getInterpolator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JETEmitterImpl <em>JET Emitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JETEmitterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJETEmitter()
		 * @generated
		 */
		EClass JET_EMITTER = eINSTANCE.getJETEmitter();

		/**
		 * The meta object literal for the '<em><b>Template URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JET_EMITTER__TEMPLATE_URI = eINSTANCE.getJETEmitter_TemplateURI();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaFilterImpl <em>Java Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaFilter()
		 * @generated
		 */
		EClass JAVA_FILTER = eINSTANCE.getJavaFilter();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__CLASS_NAME = eINSTANCE.getJavaFilter_ClassName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.Provider <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.Provider
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaTextFilterImpl <em>Java Text Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaTextFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextFilter()
		 * @generated
		 */
		EClass JAVA_TEXT_FILTER = eINSTANCE.getJavaTextFilter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaStreamFilterImpl <em>Java Stream Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaStreamFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamFilter()
		 * @generated
		 */
		EClass JAVA_STREAM_FILTER = eINSTANCE.getJavaStreamFilter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaTextGeneratorImpl <em>Java Text Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaTextGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextGenerator()
		 * @generated
		 */
		EClass JAVA_TEXT_GENERATOR = eINSTANCE.getJavaTextGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaStreamGeneratorImpl <em>Java Stream Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaStreamGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamGenerator()
		 * @generated
		 */
		EClass JAVA_STREAM_GENERATOR = eINSTANCE.getJavaStreamGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedGeneratorImpl <em>Scripted Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedGenerator()
		 * @generated
		 */
		EClass SCRIPTED_GENERATOR = eINSTANCE.getScriptedGenerator();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_GENERATOR__SCRIPT = eINSTANCE.getScriptedGenerator_Script();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedTextGeneratorImpl <em>Scripted Text Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedTextGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedTextGenerator()
		 * @generated
		 */
		EClass SCRIPTED_TEXT_GENERATOR = eINSTANCE.getScriptedTextGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedStreamGeneratorImpl <em>Scripted Stream Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedStreamGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedStreamGenerator()
		 * @generated
		 */
		EClass SCRIPTED_STREAM_GENERATOR = eINSTANCE.getScriptedStreamGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedFilterImpl <em>Scripted Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedFilter()
		 * @generated
		 */
		EClass SCRIPTED_FILTER = eINSTANCE.getScriptedFilter();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FILTER__SCRIPT = eINSTANCE.getScriptedFilter_Script();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedTextFilterImpl <em>Scripted Text Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedTextFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedTextFilter()
		 * @generated
		 */
		EClass SCRIPTED_TEXT_FILTER = eINSTANCE.getScriptedTextFilter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ScriptedStreamFilterImpl <em>Scripted Stream Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ScriptedStreamFilterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getScriptedStreamFilter()
		 * @generated
		 */
		EClass SCRIPTED_STREAM_FILTER = eINSTANCE.getScriptedStreamFilter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextContentReferenceImpl <em>Text Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextContentReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextContentReference()
		 * @generated
		 */
		EClass TEXT_CONTENT_REFERENCE = eINSTANCE.getTextContentReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StreamContentReferenceImpl <em>Stream Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StreamContentReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamContentReference()
		 * @generated
		 */
		EClass STREAM_CONTENT_REFERENCE = eINSTANCE.getStreamContentReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ZipArchiveImpl <em>Zip Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ZipArchiveImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getZipArchive()
		 * @generated
		 */
		EClass ZIP_ARCHIVE = eINSTANCE.getZipArchive();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZIP_ARCHIVE__GENERATOR = eINSTANCE.getZipArchive_Generator();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZIP_ARCHIVE__MERGER = eINSTANCE.getZipArchive_Merger();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ReconcileAction
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getReconcileAction()
		 * @generated
		 */
		EEnum RECONCILE_ACTION = eINSTANCE.getReconcileAction();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.Context
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContext()
		 * @generated
		 */
		EDataType CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Void</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Void
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getVoid()
		 * @generated
		 */
		EDataType VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '<em>IFolder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFolder
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIFolder()
		 * @generated
		 */
		EDataType IFOLDER = eINSTANCE.getIFolder();

		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em>IProject Nature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProjectNature
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIProjectNature()
		 * @generated
		 */
		EDataType IPROJECT_NATURE = eINSTANCE.getIProjectNature();

		/**
		 * The meta object literal for the '<em>IWorkspace Root</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IWorkspaceRoot
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIWorkspaceRoot()
		 * @generated
		 */
		EDataType IWORKSPACE_ROOT = eINSTANCE.getIWorkspaceRoot();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>IResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IResource
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIResource()
		 * @generated
		 */
		EDataType IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Merger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.Merger
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMerger()
		 * @generated
		 */
		EDataType MERGER = eINSTANCE.getMerger();

		/**
		 * The meta object literal for the '<em>Sub Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.SubMonitor
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getSubMonitor()
		 * @generated
		 */
		EDataType SUB_MONITOR = eINSTANCE.getSubMonitor();

		/**
		 * The meta object literal for the '<em>IContainer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IContainer
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getIContainer()
		 * @generated
		 */
		EDataType ICONTAINER = eINSTANCE.getIContainer();

	}

} //CodegenPackage
