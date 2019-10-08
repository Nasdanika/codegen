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
	 * The meta object id for the '{@link org.nasdanika.common.WorkFactory <em>Work Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.WorkFactory
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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TITLE = WORK_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ENABLED = WORK_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DESCRIPTION = WORK_FACTORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONFIGURATION = WORK_FACTORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONFIGURATION_REFERENCE = WORK_FACTORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONTEXT_PATH = WORK_FACTORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PREDICATE = WORK_FACTORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONTROLLER = WORK_FACTORY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONTROLLER_ARGUMENTS = WORK_FACTORY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAMED_GENERATORS = WORK_FACTORY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DESCRIPTORS = WORK_FACTORY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = WORK_FACTORY_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___IS_FILTERABLE = WORK_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = WORK_FACTORY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = WORK_FACTORY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.AbstractNamedGeneratorImpl <em>Abstract Named Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.AbstractNamedGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getAbstractNamedGenerator()
	 * @generated
	 */
	int ABSTRACT_NAMED_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_GENERATOR__NAME = WORK_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_GENERATOR__DESCRIPTION = WORK_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Named Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT = WORK_FACTORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Named Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_GENERATOR_OPERATION_COUNT = WORK_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.NamedGeneratorImpl <em>Named Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.NamedGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getNamedGenerator()
	 * @generated
	 */
	int NAMED_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GENERATOR__NAME = ABSTRACT_NAMED_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GENERATOR__DESCRIPTION = ABSTRACT_NAMED_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GENERATOR__GENERATORS = ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GENERATOR_FEATURE_COUNT = ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GENERATOR_OPERATION_COUNT = ABSTRACT_NAMED_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.PropertyImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ABSTRACT_NAMED_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = ABSTRACT_NAMED_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INTERPOLATE = ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ABSTRACT_NAMED_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = ABSTRACT_NAMED_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.ResourceGenerator <em>Resource Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ResourceGenerator
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGenerator()
	 * @generated
	 */
	int RESOURCE_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The number of structural features of the '<em>Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.ResourceContainer <em>Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ResourceContainer
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceContainer()
	 * @generated
	 */
	int RESOURCE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TITLE = RESOURCE_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENABLED = RESOURCE_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATION_REFERENCE = RESOURCE_GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_PATH = RESOURCE_GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PREDICATE = RESOURCE_GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTROLLER = RESOURCE_GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTROLLER_ARGUMENTS = RESOURCE_GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAMED_GENERATORS = RESOURCE_GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTORS = RESOURCE_GENERATOR__DESCRIPTORS;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FileImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ENABLED = RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONFIGURATION_REFERENCE = RESOURCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTEXT_PATH = RESOURCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PREDICATE = RESOURCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTROLLER = RESOURCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTROLLER_ARGUMENTS = RESOURCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAMED_GENERATORS = RESOURCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTORS = RESOURCE__DESCRIPTORS;

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
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GENERATORS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MERGER = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MERGER_ARGUMENTS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.BinaryFileImpl <em>Binary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.BinaryFileImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryFile()
	 * @generated
	 */
	int BINARY_FILE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__TITLE = FILE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__ENABLED = FILE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONFIGURATION = FILE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONFIGURATION_REFERENCE = FILE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONTEXT_PATH = FILE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__PREDICATE = FILE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONTROLLER = FILE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__CONTROLLER_ARGUMENTS = FILE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__NAMED_GENERATORS = FILE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__DESCRIPTORS = FILE__DESCRIPTORS;

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
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__GENERATORS = FILE__GENERATORS;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__MERGER = FILE__MERGER;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__MERGER_ARGUMENTS = FILE__MERGER_ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

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
	int TEXT_FILE = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__TITLE = FILE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__ENABLED = FILE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONFIGURATION = FILE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONFIGURATION_REFERENCE = FILE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONTEXT_PATH = FILE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__PREDICATE = FILE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONTROLLER = FILE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONTROLLER_ARGUMENTS = FILE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__NAMED_GENERATORS = FILE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__DESCRIPTORS = FILE__DESCRIPTORS;

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
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__GENERATORS = FILE__GENERATORS;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__MERGER = FILE__MERGER;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__MERGER_ARGUMENTS = FILE__MERGER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__ENCODING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContainerImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENABLED = RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONFIGURATION_REFERENCE = RESOURCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_PATH = RESOURCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PREDICATE = RESOURCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTROLLER = RESOURCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTROLLER_ARGUMENTS = RESOURCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAMED_GENERATORS = RESOURCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTORS = RESOURCE__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RECONCILE_ACTION = RESOURCE__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___IS_FILTERABLE = RESOURCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__TITLE = GROUP__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ENABLED = GROUP__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONFIGURATION_REFERENCE = GROUP__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONTEXT_PATH = GROUP__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__PREDICATE = GROUP__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONTROLLER = GROUP__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONTROLLER_ARGUMENTS = GROUP__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__NAMED_GENERATORS = GROUP__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTORS = GROUP__DESCRIPTORS;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StaticTextImpl <em>Static Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StaticTextImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticText()
	 * @generated
	 */
	int STATIC_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__CONTENTS = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT__INTERPOLATE = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TEXT_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl <em>Free Marker Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFreeMarkerGenerator()
	 * @generated
	 */
	int FREE_MARKER_GENERATOR = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ECoreModelGeneratorImpl <em>ECore Model Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ECoreModelGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getECoreModelGenerator()
	 * @generated
	 */
	int ECORE_MODEL_GENERATOR = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentReference()
	 * @generated
	 */
	int CONTENT_REFERENCE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ConverterImpl <em>Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ConverterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getConverter()
	 * @generated
	 */
	int CONVERTER = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaGeneratorImpl <em>Java Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaGenerator()
	 * @generated
	 */
	int JAVA_GENERATOR = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.InterpolatorImpl <em>Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.InterpolatorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInterpolator()
	 * @generated
	 */
	int INTERPOLATOR = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaFilterImpl <em>Java Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaFilter()
	 * @generated
	 */
	int JAVA_FILTER = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaTextFilterImpl <em>Java Text Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaTextFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextFilter()
	 * @generated
	 */
	int JAVA_TEXT_FILTER = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaStreamFilterImpl <em>Java Stream Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaStreamFilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamFilter()
	 * @generated
	 */
	int JAVA_STREAM_FILTER = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaTextGeneratorImpl <em>Java Text Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaTextGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaTextGenerator()
	 * @generated
	 */
	int JAVA_TEXT_GENERATOR = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaStreamGeneratorImpl <em>Java Stream Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaStreamGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaStreamGenerator()
	 * @generated
	 */
	int JAVA_STREAM_GENERATOR = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.JavaResourceGeneratorImpl <em>Java Resource Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.JavaResourceGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaResourceGenerator()
	 * @generated
	 */
	int JAVA_RESOURCE_GENERATOR = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextContentReferenceImpl <em>Text Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextContentReference()
	 * @generated
	 */
	int TEXT_CONTENT_REFERENCE = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StreamContentReferenceImpl <em>Stream Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StreamContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamContentReference()
	 * @generated
	 */
	int STREAM_CONTENT_REFERENCE = 32;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.MustacheImpl <em>Mustache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.MustacheImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMustache()
	 * @generated
	 */
	int MUSTACHE = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StaticBytesImpl <em>Static Bytes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StaticBytesImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticBytes()
	 * @generated
	 */
	int STATIC_BYTES = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES__CONTENTS = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Bytes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Static Bytes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_BYTES_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Template Loader Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__BASE = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__TEMPLATE = GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__MODEL = GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Free Marker Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Free Marker Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR__MODEL = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECore Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>ECore Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DESCRIPTORS = GENERATOR__DESCRIPTORS;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__GENERATORS = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextToStreamConverterImpl <em>Text To Stream Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextToStreamConverterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextToStreamConverter()
	 * @generated
	 */
	int TEXT_TO_STREAM_CONVERTER = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__TITLE = CONVERTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__ENABLED = CONVERTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__DESCRIPTION = CONVERTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CONFIGURATION = CONVERTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CONFIGURATION_REFERENCE = CONVERTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CONTEXT_PATH = CONVERTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__PREDICATE = CONVERTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CONTROLLER = CONVERTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CONTROLLER_ARGUMENTS = CONVERTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__NAMED_GENERATORS = CONVERTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__DESCRIPTORS = CONVERTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__GENERATORS = CONVERTER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER__CHARSET = CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text To Stream Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER_FEATURE_COUNT = CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER___IS_FILTERABLE = CONVERTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP = CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text To Stream Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_STREAM_CONVERTER_OPERATION_COUNT = CONVERTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StreamToTextConverterImpl <em>Stream To Text Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StreamToTextConverterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamToTextConverter()
	 * @generated
	 */
	int STREAM_TO_TEXT_CONVERTER = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__TITLE = CONVERTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__ENABLED = CONVERTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__DESCRIPTION = CONVERTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CONFIGURATION = CONVERTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CONFIGURATION_REFERENCE = CONVERTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CONTEXT_PATH = CONVERTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__PREDICATE = CONVERTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CONTROLLER = CONVERTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CONTROLLER_ARGUMENTS = CONVERTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__NAMED_GENERATORS = CONVERTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__DESCRIPTORS = CONVERTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__GENERATORS = CONVERTER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER__CHARSET = CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stream To Text Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER_FEATURE_COUNT = CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER___IS_FILTERABLE = CONVERTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP = CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stream To Text Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_TO_TEXT_CONVERTER_OPERATION_COUNT = CONVERTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TITLE = CONVERTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ENABLED = CONVERTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DESCRIPTION = CONVERTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONFIGURATION = CONVERTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONFIGURATION_REFERENCE = CONVERTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONTEXT_PATH = CONVERTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PREDICATE = CONVERTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONTROLLER = CONVERTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONTROLLER_ARGUMENTS = CONVERTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAMED_GENERATORS = CONVERTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DESCRIPTORS = CONVERTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__GENERATORS = CONVERTER__GENERATORS;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___IS_FILTERABLE = CONVERTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = CONVERTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = CONVERTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__CLASS_NAME = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR__ARGUMENTS = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__TITLE = FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ENABLED = FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONFIGURATION_REFERENCE = FILTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONTEXT_PATH = FILTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__PREDICATE = FILTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONTROLLER = FILTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONTROLLER_ARGUMENTS = FILTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__NAMED_GENERATORS = FILTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__DESCRIPTORS = FILTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__GENERATORS = FILTER__GENERATORS;

	/**
	 * The number of structural features of the '<em>Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__TITLE = FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__ENABLED = FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONFIGURATION_REFERENCE = FILTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONTEXT_PATH = FILTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__PREDICATE = FILTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONTROLLER = FILTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CONTROLLER_ARGUMENTS = FILTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__NAMED_GENERATORS = FILTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__DESCRIPTORS = FILTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__GENERATORS = FILTER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__CLASS_NAME = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__ARGUMENTS = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__TITLE = JAVA_FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__ENABLED = JAVA_FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__DESCRIPTION = JAVA_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONFIGURATION = JAVA_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONFIGURATION_REFERENCE = JAVA_FILTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONTEXT_PATH = JAVA_FILTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__PREDICATE = JAVA_FILTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONTROLLER = JAVA_FILTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CONTROLLER_ARGUMENTS = JAVA_FILTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__NAMED_GENERATORS = JAVA_FILTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__DESCRIPTORS = JAVA_FILTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__GENERATORS = JAVA_FILTER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__CLASS_NAME = JAVA_FILTER__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER__ARGUMENTS = JAVA_FILTER__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Java Text Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__TITLE = JAVA_FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__ENABLED = JAVA_FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__DESCRIPTION = JAVA_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONFIGURATION = JAVA_FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONFIGURATION_REFERENCE = JAVA_FILTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONTEXT_PATH = JAVA_FILTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__PREDICATE = JAVA_FILTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONTROLLER = JAVA_FILTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CONTROLLER_ARGUMENTS = JAVA_FILTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__NAMED_GENERATORS = JAVA_FILTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__DESCRIPTORS = JAVA_FILTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__GENERATORS = JAVA_FILTER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__CLASS_NAME = JAVA_FILTER__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER__ARGUMENTS = JAVA_FILTER__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Java Stream Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__TITLE = JAVA_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__ENABLED = JAVA_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__DESCRIPTION = JAVA_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONFIGURATION = JAVA_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONFIGURATION_REFERENCE = JAVA_GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONTEXT_PATH = JAVA_GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__PREDICATE = JAVA_GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONTROLLER = JAVA_GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CONTROLLER_ARGUMENTS = JAVA_GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__NAMED_GENERATORS = JAVA_GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__DESCRIPTORS = JAVA_GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__CLASS_NAME = JAVA_GENERATOR__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR__ARGUMENTS = JAVA_GENERATOR__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Java Text Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEXT_GENERATOR_FEATURE_COUNT = JAVA_GENERATOR_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__TITLE = JAVA_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__ENABLED = JAVA_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__DESCRIPTION = JAVA_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONFIGURATION = JAVA_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONFIGURATION_REFERENCE = JAVA_GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONTEXT_PATH = JAVA_GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__PREDICATE = JAVA_GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONTROLLER = JAVA_GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CONTROLLER_ARGUMENTS = JAVA_GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__NAMED_GENERATORS = JAVA_GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__DESCRIPTORS = JAVA_GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__CLASS_NAME = JAVA_GENERATOR__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR__ARGUMENTS = JAVA_GENERATOR__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Java Stream Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STREAM_GENERATOR_FEATURE_COUNT = JAVA_GENERATOR_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__TITLE = JAVA_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__ENABLED = JAVA_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__DESCRIPTION = JAVA_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CONFIGURATION = JAVA_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CONFIGURATION_REFERENCE = JAVA_GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CONTEXT_PATH = JAVA_GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__PREDICATE = JAVA_GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CONTROLLER = JAVA_GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CONTROLLER_ARGUMENTS = JAVA_GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__NAMED_GENERATORS = JAVA_GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__DESCRIPTORS = JAVA_GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__CLASS_NAME = JAVA_GENERATOR__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR__ARGUMENTS = JAVA_GENERATOR__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Java Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR_FEATURE_COUNT = JAVA_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR___IS_FILTERABLE = JAVA_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = JAVA_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Java Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_GENERATOR_OPERATION_COUNT = JAVA_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__TITLE = CONTENT_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__ENABLED = CONTENT_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__DESCRIPTION = CONTENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONFIGURATION = CONTENT_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONFIGURATION_REFERENCE = CONTENT_REFERENCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONTEXT_PATH = CONTENT_REFERENCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__PREDICATE = CONTENT_REFERENCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONTROLLER = CONTENT_REFERENCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__CONTROLLER_ARGUMENTS = CONTENT_REFERENCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__NAMED_GENERATORS = CONTENT_REFERENCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__DESCRIPTORS = CONTENT_REFERENCE__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__REF = CONTENT_REFERENCE__REF;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE__INTERPOLATE = CONTENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_REFERENCE_FEATURE_COUNT = CONTENT_REFERENCE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__TITLE = CONTENT_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__ENABLED = CONTENT_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__DESCRIPTION = CONTENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONFIGURATION = CONTENT_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONFIGURATION_REFERENCE = CONTENT_REFERENCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONTEXT_PATH = CONTENT_REFERENCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__PREDICATE = CONTENT_REFERENCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONTROLLER = CONTENT_REFERENCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__CONTROLLER_ARGUMENTS = CONTENT_REFERENCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__NAMED_GENERATORS = CONTENT_REFERENCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_CONTENT_REFERENCE__DESCRIPTORS = CONTENT_REFERENCE__DESCRIPTORS;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__TITLE = FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__ENABLED = FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONFIGURATION_REFERENCE = FILTER__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONTEXT_PATH = FILTER__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__PREDICATE = FILTER__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONTROLLER = FILTER__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONTROLLER_ARGUMENTS = FILTER__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__NAMED_GENERATORS = FILTER__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__DESCRIPTORS = FILTER__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__GENERATORS = FILTER__GENERATORS;

	/**
	 * The number of structural features of the '<em>Mustache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE___IS_FILTERABLE = FILTER___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE___VALIDATE__DIAGNOSTICCHAIN_MAP = FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Mustache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ELEMENTS = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextGroupImpl <em>Text Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextGroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextGroup()
	 * @generated
	 */
	int TEXT_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__TITLE = GROUP__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__ENABLED = GROUP__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__CONFIGURATION_REFERENCE = GROUP__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__CONTEXT_PATH = GROUP__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__PREDICATE = GROUP__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__CONTROLLER = GROUP__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__CONTROLLER_ARGUMENTS = GROUP__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__NAMED_GENERATORS = GROUP__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__DESCRIPTORS = GROUP__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Text Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP___IS_FILTERABLE = GROUP___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorReferenceImpl <em>Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorReference()
	 * @generated
	 */
	int GENERATOR_REFERENCE = 36;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__MODEL = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextGeneratorReferenceImpl <em>Text Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextGeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextGeneratorReference()
	 * @generated
	 */
	int TEXT_GENERATOR_REFERENCE = 37;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__TITLE = GENERATOR_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__ENABLED = GENERATOR_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__DESCRIPTION = GENERATOR_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__CONFIGURATION = GENERATOR_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__CONFIGURATION_REFERENCE = GENERATOR_REFERENCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__CONTEXT_PATH = GENERATOR_REFERENCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__PREDICATE = GENERATOR_REFERENCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__CONTROLLER = GENERATOR_REFERENCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS = GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__NAMED_GENERATORS = GENERATOR_REFERENCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__DESCRIPTORS = GENERATOR_REFERENCE__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE__MODEL = GENERATOR_REFERENCE__MODEL;

	/**
	 * The number of structural features of the '<em>Text Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE___IS_FILTERABLE = GENERATOR_REFERENCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATOR_REFERENCE_OPERATION_COUNT = GENERATOR_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.StreamGeneratorReferenceImpl <em>Stream Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.StreamGeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamGeneratorReference()
	 * @generated
	 */
	int STREAM_GENERATOR_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__TITLE = GENERATOR_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__ENABLED = GENERATOR_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__DESCRIPTION = GENERATOR_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__CONFIGURATION = GENERATOR_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__CONFIGURATION_REFERENCE = GENERATOR_REFERENCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__CONTEXT_PATH = GENERATOR_REFERENCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__PREDICATE = GENERATOR_REFERENCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__CONTROLLER = GENERATOR_REFERENCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS = GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__NAMED_GENERATORS = GENERATOR_REFERENCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__DESCRIPTORS = GENERATOR_REFERENCE__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE__MODEL = GENERATOR_REFERENCE__MODEL;

	/**
	 * The number of structural features of the '<em>Stream Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE___IS_FILTERABLE = GENERATOR_REFERENCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stream Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_GENERATOR_REFERENCE_OPERATION_COUNT = GENERATOR_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl <em>Resource Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorReference()
	 * @generated
	 */
	int RESOURCE_GENERATOR_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__TITLE = GENERATOR_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__ENABLED = GENERATOR_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__DESCRIPTION = GENERATOR_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONFIGURATION = GENERATOR_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONFIGURATION_REFERENCE = GENERATOR_REFERENCE__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONTEXT_PATH = GENERATOR_REFERENCE__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__PREDICATE = GENERATOR_REFERENCE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONTROLLER = GENERATOR_REFERENCE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS = GENERATOR_REFERENCE__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__NAMED_GENERATORS = GENERATOR_REFERENCE__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__DESCRIPTORS = GENERATOR_REFERENCE__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__MODEL = GENERATOR_REFERENCE__MODEL;

	/**
	 * The number of structural features of the '<em>Resource Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE___IS_FILTERABLE = GENERATOR_REFERENCE___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE_OPERATION_COUNT = GENERATOR_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.HttpCallImpl <em>Http Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.HttpCallImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getHttpCall()
	 * @generated
	 */
	int HTTP_CALL = 40;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONFIGURATION_REFERENCE = GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONTEXT_PATH = GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__PREDICATE = GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONTROLLER = GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONTROLLER_ARGUMENTS = GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__NAMED_GENERATORS = GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__DESCRIPTORS = GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__URL = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__METHOD = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__BODY_GENERATOR = GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__HEADERS = GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONNECT_TIMEOUT = GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Read Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__READ_TIMEOUT = GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Success Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__SUCCESS_CODE = GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Http Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL___IS_FILTERABLE = GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Http Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceCollectionImpl <em>Resource Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceCollectionImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceCollection()
	 * @generated
	 */
	int RESOURCE_COLLECTION = 41;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__TITLE = RESOURCE_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__ENABLED = RESOURCE_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONFIGURATION_REFERENCE = RESOURCE_GENERATOR__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONTEXT_PATH = RESOURCE_GENERATOR__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__PREDICATE = RESOURCE_GENERATOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONTROLLER = RESOURCE_GENERATOR__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONTROLLER_ARGUMENTS = RESOURCE_GENERATOR__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__NAMED_GENERATORS = RESOURCE_GENERATOR__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__DESCRIPTORS = RESOURCE_GENERATOR__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__PATH = RESOURCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__PREFIX = RESOURCE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__EXCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interpolation Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INTERPOLATION_CHARSET = RESOURCE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__MERGER = RESOURCE_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__MERGER_ARGUMENTS = RESOURCE_GENERATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION_FEATURE_COUNT = RESOURCE_GENERATOR_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION___IS_FILTERABLE = RESOURCE_GENERATOR___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION_OPERATION_COUNT = RESOURCE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.BundleResourceCollectionImpl <em>Bundle Resource Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.BundleResourceCollectionImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBundleResourceCollection()
	 * @generated
	 */
	int BUNDLE_RESOURCE_COLLECTION = 42;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__TITLE = RESOURCE_COLLECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__ENABLED = RESOURCE_COLLECTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_COLLECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_COLLECTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONFIGURATION_REFERENCE = RESOURCE_COLLECTION__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONTEXT_PATH = RESOURCE_COLLECTION__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__PREDICATE = RESOURCE_COLLECTION__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONTROLLER = RESOURCE_COLLECTION__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONTROLLER_ARGUMENTS = RESOURCE_COLLECTION__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__NAMED_GENERATORS = RESOURCE_COLLECTION__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__DESCRIPTORS = RESOURCE_COLLECTION__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__PATH = RESOURCE_COLLECTION__PATH;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__PREFIX = RESOURCE_COLLECTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INCLUDES = RESOURCE_COLLECTION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__EXCLUDES = RESOURCE_COLLECTION__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_COLLECTION__INTERPOLATION_INCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INTERPOLATION_CHARSET = RESOURCE_COLLECTION__INTERPOLATION_CHARSET;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_COLLECTION__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__MERGER = RESOURCE_COLLECTION__MERGER;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__MERGER_ARGUMENTS = RESOURCE_COLLECTION__MERGER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__BUNDLE = RESOURCE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION_FEATURE_COUNT = RESOURCE_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION___IS_FILTERABLE = RESOURCE_COLLECTION___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE_COLLECTION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Bundle Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION_OPERATION_COUNT = RESOURCE_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ZipResourceCollectionImpl <em>Zip Resource Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ZipResourceCollectionImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getZipResourceCollection()
	 * @generated
	 */
	int ZIP_RESOURCE_COLLECTION = 43;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__TITLE = RESOURCE_COLLECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__ENABLED = RESOURCE_COLLECTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_COLLECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_COLLECTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONFIGURATION_REFERENCE = RESOURCE_COLLECTION__CONFIGURATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONTEXT_PATH = RESOURCE_COLLECTION__CONTEXT_PATH;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__PREDICATE = RESOURCE_COLLECTION__PREDICATE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONTROLLER = RESOURCE_COLLECTION__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Controller Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONTROLLER_ARGUMENTS = RESOURCE_COLLECTION__CONTROLLER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Named Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__NAMED_GENERATORS = RESOURCE_COLLECTION__NAMED_GENERATORS;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__DESCRIPTORS = RESOURCE_COLLECTION__DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__PATH = RESOURCE_COLLECTION__PATH;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__PREFIX = RESOURCE_COLLECTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INCLUDES = RESOURCE_COLLECTION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__EXCLUDES = RESOURCE_COLLECTION__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_COLLECTION__INTERPOLATION_INCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INTERPOLATION_CHARSET = RESOURCE_COLLECTION__INTERPOLATION_CHARSET;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_COLLECTION__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__MERGER = RESOURCE_COLLECTION__MERGER;

	/**
	 * The feature id for the '<em><b>Merger Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__MERGER_ARGUMENTS = RESOURCE_COLLECTION__MERGER_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__GENERATORS = RESOURCE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zip Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION_FEATURE_COUNT = RESOURCE_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Filterable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION___IS_FILTERABLE = RESOURCE_COLLECTION___IS_FILTERABLE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION___VALIDATE__DIAGNOSTICCHAIN_MAP = RESOURCE_COLLECTION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Zip Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION_OPERATION_COUNT = RESOURCE_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.DescriptorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 44;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__ICON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__PREDICATE = 3;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ValueDescriptorImpl <em>Value Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ValueDescriptorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getValueDescriptor()
	 * @generated
	 */
	int VALUE_DESCRIPTOR = 45;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__LABEL = DESCRIPTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__ICON = DESCRIPTOR__ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__PREDICATE = DESCRIPTOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__TYPE = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__REQUIRED = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR__CHOICES = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DESCRIPTOR_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.PropertyDescriptorImpl <em>Property Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.PropertyDescriptorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getPropertyDescriptor()
	 * @generated
	 */
	int PROPERTY_DESCRIPTOR = 46;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__LABEL = VALUE_DESCRIPTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__ICON = VALUE_DESCRIPTOR__ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__DESCRIPTION = VALUE_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__PREDICATE = VALUE_DESCRIPTOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__TYPE = VALUE_DESCRIPTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__REQUIRED = VALUE_DESCRIPTOR__REQUIRED;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__CHOICES = VALUE_DESCRIPTOR__CHOICES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__NAME = VALUE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR_FEATURE_COUNT = VALUE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR_OPERATION_COUNT = VALUE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ServiceDescriptorImpl <em>Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ServiceDescriptorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getServiceDescriptor()
	 * @generated
	 */
	int SERVICE_DESCRIPTOR = 47;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__LABEL = VALUE_DESCRIPTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__ICON = VALUE_DESCRIPTOR__ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__DESCRIPTION = VALUE_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__PREDICATE = VALUE_DESCRIPTOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__TYPE = VALUE_DESCRIPTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__REQUIRED = VALUE_DESCRIPTOR__REQUIRED;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__CHOICES = VALUE_DESCRIPTOR__CHOICES;

	/**
	 * The number of structural features of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR_FEATURE_COUNT = VALUE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR_OPERATION_COUNT = VALUE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.DescriptorSetImpl <em>Descriptor Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.DescriptorSetImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getDescriptorSet()
	 * @generated
	 */
	int DESCRIPTOR_SET = 48;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__LABEL = DESCRIPTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__ICON = DESCRIPTOR__ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__PREDICATE = DESCRIPTOR__PREDICATE;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__DESCRIPTORS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Descriptor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getReconcileAction()
	 * @generated
	 */
	int RECONCILE_ACTION = 49;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.FreeMarkerTemplateLoaderType <em>Free Marker Template Loader Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.FreeMarkerTemplateLoaderType
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFreeMarkerTemplateLoaderType()
	 * @generated
	 */
	int FREE_MARKER_TEMPLATE_LOADER_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.HttpMethod
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 51;

	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.Context
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 54;

	/**
	 * The meta object id for the '<em>Binary Resource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.resources.BinaryResource
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryResource()
	 * @generated
	 */
	int BINARY_RESOURCE = 55;

	/**
	 * The meta object id for the '<em>Binary Entity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.resources.BinaryEntity
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryEntity()
	 * @generated
	 */
	int BINARY_ENTITY = 56;

	/**
	 * The meta object id for the '<em>Binary Entity Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.resources.BinaryEntityContainer
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryEntityContainer()
	 * @generated
	 */
	int BINARY_ENTITY_CONTAINER = 57;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 53;

	/**
	 * The meta object id for the '<em>Void</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Void
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 58;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 52;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getList()
	 * @generated
	 */
	int LIST = 59;


	/**
	 * The meta object id for the '<em>Merger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.Merger
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMerger()
	 * @generated
	 */
	int MERGER = 60;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.common.WorkFactory <em>Work Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Factory</em>'.
	 * @see org.nasdanika.common.WorkFactory
	 * @model instanceClass="org.nasdanika.common.WorkFactory" typeParameters="T"
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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.codegen.Generator#getTitle()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see org.nasdanika.codegen.Generator#getController()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Controller();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.Generator#getControllerArguments <em>Controller Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Controller Arguments</em>'.
	 * @see org.nasdanika.codegen.Generator#getControllerArguments()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ControllerArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Generator#getNamedGenerators <em>Named Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Generators</em>'.
	 * @see org.nasdanika.codegen.Generator#getNamedGenerators()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_NamedGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Generator#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see org.nasdanika.codegen.Generator#getDescriptors()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Descriptors();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.nasdanika.codegen.Generator#isEnabled()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.Generator#getDescription()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.nasdanika.codegen.Generator#getConfiguration()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getConfigurationReference <em>Configuration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Reference</em>'.
	 * @see org.nasdanika.codegen.Generator#getConfigurationReference()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ConfigurationReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getContextPath <em>Context Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Path</em>'.
	 * @see org.nasdanika.codegen.Generator#getContextPath()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ContextPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see org.nasdanika.codegen.Generator#getPredicate()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Predicate();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.AbstractNamedGenerator <em>Abstract Named Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Generator</em>'.
	 * @see org.nasdanika.codegen.AbstractNamedGenerator
	 * @generated
	 */
	EClass getAbstractNamedGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.AbstractNamedGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.AbstractNamedGenerator#getName()
	 * @see #getAbstractNamedGenerator()
	 * @generated
	 */
	EAttribute getAbstractNamedGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.AbstractNamedGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.AbstractNamedGenerator#getDescription()
	 * @see #getAbstractNamedGenerator()
	 * @generated
	 */
	EAttribute getAbstractNamedGenerator_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.NamedGenerator <em>Named Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Generator</em>'.
	 * @see org.nasdanika.codegen.NamedGenerator
	 * @generated
	 */
	EClass getNamedGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.NamedGenerator#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.NamedGenerator#getGenerators()
	 * @see #getNamedGenerator()
	 * @generated
	 */
	EReference getNamedGenerator_Generators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.codegen.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.codegen.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Property#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.Property#isInterpolate()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Interpolate();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGenerator <em>Resource Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Generator</em>'.
	 * @see org.nasdanika.codegen.ResourceGenerator
	 * @generated
	 */
	EClass getResourceGenerator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container</em>'.
	 * @see org.nasdanika.codegen.ResourceContainer
	 * @generated
	 */
	EClass getResourceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ResourceContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.codegen.ResourceContainer#getElements()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_Elements();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.File#getMerger()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Merger();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.File#getMergerArguments <em>Merger Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Merger Arguments</em>'.
	 * @see org.nasdanika.codegen.File#getMergerArguments()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_MergerArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.File#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.File#getGenerators()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Generators();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.TextFile#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.nasdanika.codegen.TextFile#getEncoding()
	 * @see #getTextFile()
	 * @generated
	 */
	EAttribute getTextFile_Encoding();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.codegen.Container
	 * @generated
	 */
	EClass getContainer();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StaticText <em>Static Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Text</em>'.
	 * @see org.nasdanika.codegen.StaticText
	 * @generated
	 */
	EClass getStaticText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.StaticText#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see org.nasdanika.codegen.StaticText#getContents()
	 * @see #getStaticText()
	 * @generated
	 */
	EAttribute getStaticText_Contents();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.StaticText#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.StaticText#isInterpolate()
	 * @see #getStaticText()
	 * @generated
	 */
	EAttribute getStaticText_Interpolate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.FreeMarkerGenerator <em>Free Marker Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Marker Generator</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerGenerator
	 * @generated
	 */
	EClass getFreeMarkerGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplateLoaderType <em>Template Loader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Loader Type</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerGenerator#getTemplateLoaderType()
	 * @see #getFreeMarkerGenerator()
	 * @generated
	 */
	EAttribute getFreeMarkerGenerator_TemplateLoaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.FreeMarkerGenerator#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerGenerator#getBase()
	 * @see #getFreeMarkerGenerator()
	 * @generated
	 */
	EAttribute getFreeMarkerGenerator_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerGenerator#getTemplate()
	 * @see #getFreeMarkerGenerator()
	 * @generated
	 */
	EAttribute getFreeMarkerGenerator_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.FreeMarkerGenerator#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerGenerator#getModel()
	 * @see #getFreeMarkerGenerator()
	 * @generated
	 */
	EAttribute getFreeMarkerGenerator_Model();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ECoreModelGenerator <em>ECore Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECore Model Generator</em>'.
	 * @see org.nasdanika.codegen.ECoreModelGenerator
	 * @generated
	 */
	EClass getECoreModelGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ECoreModelGenerator#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.codegen.ECoreModelGenerator#getModel()
	 * @see #getECoreModelGenerator()
	 * @generated
	 */
	EAttribute getECoreModelGenerator_Model();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Converter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Converter</em>'.
	 * @see org.nasdanika.codegen.Converter
	 * @generated
	 */
	EClass getConverter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Converter#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.Converter#getGenerators()
	 * @see #getConverter()
	 * @generated
	 */
	EReference getConverter_Generators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.TextToStreamConverter <em>Text To Stream Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text To Stream Converter</em>'.
	 * @see org.nasdanika.codegen.TextToStreamConverter
	 * @generated
	 */
	EClass getTextToStreamConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.TextToStreamConverter#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.nasdanika.codegen.TextToStreamConverter#getCharset()
	 * @see #getTextToStreamConverter()
	 * @generated
	 */
	EAttribute getTextToStreamConverter_Charset();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StreamToTextConverter <em>Stream To Text Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream To Text Converter</em>'.
	 * @see org.nasdanika.codegen.StreamToTextConverter
	 * @generated
	 */
	EClass getStreamToTextConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.StreamToTextConverter#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.nasdanika.codegen.StreamToTextConverter#getCharset()
	 * @see #getStreamToTextConverter()
	 * @generated
	 */
	EAttribute getStreamToTextConverter_Charset();

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
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.JavaGenerator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see org.nasdanika.codegen.JavaGenerator#getArguments()
	 * @see #getJavaGenerator()
	 * @generated
	 */
	EAttribute getJavaGenerator_Arguments();

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
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.JavaFilter#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see org.nasdanika.codegen.JavaFilter#getArguments()
	 * @see #getJavaFilter()
	 * @generated
	 */
	EAttribute getJavaFilter_Arguments();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.JavaResourceGenerator <em>Java Resource Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Resource Generator</em>'.
	 * @see org.nasdanika.codegen.JavaResourceGenerator
	 * @generated
	 */
	EClass getJavaResourceGenerator();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.TextContentReference#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.TextContentReference#isInterpolate()
	 * @see #getTextContentReference()
	 * @generated
	 */
	EAttribute getTextContentReference_Interpolate();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.TextGroup <em>Text Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Group</em>'.
	 * @see org.nasdanika.codegen.TextGroup
	 * @generated
	 */
	EClass getTextGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.GeneratorReference <em>Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Reference</em>'.
	 * @see org.nasdanika.codegen.GeneratorReference
	 * @generated
	 */
	EClass getGeneratorReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.GeneratorReference#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.codegen.GeneratorReference#getModel()
	 * @see #getGeneratorReference()
	 * @generated
	 */
	EAttribute getGeneratorReference_Model();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.TextGeneratorReference <em>Text Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Generator Reference</em>'.
	 * @see org.nasdanika.codegen.TextGeneratorReference
	 * @generated
	 */
	EClass getTextGeneratorReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StreamGeneratorReference <em>Stream Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Generator Reference</em>'.
	 * @see org.nasdanika.codegen.StreamGeneratorReference
	 * @generated
	 */
	EClass getStreamGeneratorReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGeneratorReference <em>Resource Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Generator Reference</em>'.
	 * @see org.nasdanika.codegen.ResourceGeneratorReference
	 * @generated
	 */
	EClass getResourceGeneratorReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.HttpCall <em>Http Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Call</em>'.
	 * @see org.nasdanika.codegen.HttpCall
	 * @generated
	 */
	EClass getHttpCall();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getUrl()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getMethod()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.HttpCall#getBodyGenerator <em>Body Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Generator</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getBodyGenerator()
	 * @see #getHttpCall()
	 * @generated
	 */
	EReference getHttpCall_BodyGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.HttpCall#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getHeaders()
	 * @see #getHttpCall()
	 * @generated
	 */
	EReference getHttpCall_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#getConnectTimeout <em>Connect Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Timeout</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getConnectTimeout()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_ConnectTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#getReadTimeout <em>Read Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Timeout</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getReadTimeout()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_ReadTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#getSuccessCode <em>Success Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Code</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getSuccessCode()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_SuccessCode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceCollection <em>Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Collection</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection
	 * @generated
	 */
	EClass getResourceCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getPath()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getPrefix()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Prefix();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ResourceCollection#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Includes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getIncludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Includes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ResourceCollection#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excludes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getExcludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Excludes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes <em>Interpolation Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interpolation Includes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_InterpolationIncludes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes <em>Interpolation Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interpolation Excludes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_InterpolationExcludes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationCharset <em>Interpolation Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Charset</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getInterpolationCharset()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_InterpolationCharset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getReconcileAction <em>Reconcile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Action</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getReconcileAction()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_ReconcileAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getMerger()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Merger();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ResourceCollection#getMergerArguments <em>Merger Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Merger Arguments</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getMergerArguments()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_MergerArguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.BundleResourceCollection <em>Bundle Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Resource Collection</em>'.
	 * @see org.nasdanika.codegen.BundleResourceCollection
	 * @generated
	 */
	EClass getBundleResourceCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.BundleResourceCollection#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle</em>'.
	 * @see org.nasdanika.codegen.BundleResourceCollection#getBundle()
	 * @see #getBundleResourceCollection()
	 * @generated
	 */
	EAttribute getBundleResourceCollection_Bundle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ZipResourceCollection <em>Zip Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zip Resource Collection</em>'.
	 * @see org.nasdanika.codegen.ZipResourceCollection
	 * @generated
	 */
	EClass getZipResourceCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ZipResourceCollection#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.ZipResourceCollection#getGenerators()
	 * @see #getZipResourceCollection()
	 * @generated
	 */
	EReference getZipResourceCollection_Generators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see org.nasdanika.codegen.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Descriptor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.codegen.Descriptor#getLabel()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Descriptor#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.codegen.Descriptor#getIcon()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Descriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.Descriptor#getDescription()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Descriptor#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see org.nasdanika.codegen.Descriptor#getPredicate()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Predicate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ValueDescriptor <em>Value Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Descriptor</em>'.
	 * @see org.nasdanika.codegen.ValueDescriptor
	 * @generated
	 */
	EClass getValueDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ValueDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.codegen.ValueDescriptor#getType()
	 * @see #getValueDescriptor()
	 * @generated
	 */
	EAttribute getValueDescriptor_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ValueDescriptor#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.codegen.ValueDescriptor#isRequired()
	 * @see #getValueDescriptor()
	 * @generated
	 */
	EAttribute getValueDescriptor_Required();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ValueDescriptor#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choices</em>'.
	 * @see org.nasdanika.codegen.ValueDescriptor#getChoices()
	 * @see #getValueDescriptor()
	 * @generated
	 */
	EAttribute getValueDescriptor_Choices();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.PropertyDescriptor <em>Property Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Descriptor</em>'.
	 * @see org.nasdanika.codegen.PropertyDescriptor
	 * @generated
	 */
	EClass getPropertyDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.PropertyDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.PropertyDescriptor#getName()
	 * @see #getPropertyDescriptor()
	 * @generated
	 */
	EAttribute getPropertyDescriptor_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Descriptor</em>'.
	 * @see org.nasdanika.codegen.ServiceDescriptor
	 * @generated
	 */
	EClass getServiceDescriptor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.DescriptorSet <em>Descriptor Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Set</em>'.
	 * @see org.nasdanika.codegen.DescriptorSet
	 * @generated
	 */
	EClass getDescriptorSet();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.codegen.DescriptorSet#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptors</em>'.
	 * @see org.nasdanika.codegen.DescriptorSet#getDescriptors()
	 * @see #getDescriptorSet()
	 * @generated
	 */
	EReference getDescriptorSet_Descriptors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Mustache <em>Mustache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mustache</em>'.
	 * @see org.nasdanika.codegen.Mustache
	 * @generated
	 */
	EClass getMustache();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.StaticBytes <em>Static Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Bytes</em>'.
	 * @see org.nasdanika.codegen.StaticBytes
	 * @generated
	 */
	EClass getStaticBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.StaticBytes#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see org.nasdanika.codegen.StaticBytes#getContents()
	 * @see #getStaticBytes()
	 * @generated
	 */
	EAttribute getStaticBytes_Contents();

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
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.FreeMarkerTemplateLoaderType <em>Free Marker Template Loader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Free Marker Template Loader Type</em>'.
	 * @see org.nasdanika.codegen.FreeMarkerTemplateLoaderType
	 * @generated
	 */
	EEnum getFreeMarkerTemplateLoaderType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see org.nasdanika.codegen.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Context provides access to properties and services. Contexts are typically chained
     * with a child context "inheriting" properties and services of the parent context.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.nasdanika.common.Context
	 * @model instanceClass="org.nasdanika.common.Context"
	 * @generated
	 */
	EDataType getContext();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.resources.BinaryResource <em>Binary Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Resource</em>'.
	 * @see org.nasdanika.common.resources.BinaryResource
	 * @model instanceClass="org.nasdanika.common.resources.BinaryResource"
	 * @generated
	 */
	EDataType getBinaryResource();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.resources.BinaryEntity <em>Binary Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Entity</em>'.
	 * @see org.nasdanika.common.resources.BinaryEntity
	 * @model instanceClass="org.nasdanika.common.resources.BinaryEntity"
	 * @generated
	 */
	EDataType getBinaryEntity();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.resources.BinaryEntityContainer <em>Binary Entity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Entity Container</em>'.
	 * @see org.nasdanika.common.resources.BinaryEntityContainer
	 * @model instanceClass="org.nasdanika.common.resources.BinaryEntityContainer"
	 * @generated
	 */
	EDataType getBinaryEntityContainer();

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
		 * The meta object literal for the '{@link org.nasdanika.common.WorkFactory <em>Work Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.WorkFactory
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
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__TITLE = eINSTANCE.getGenerator_Title();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONTROLLER = eINSTANCE.getGenerator_Controller();

		/**
		 * The meta object literal for the '<em><b>Controller Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONTROLLER_ARGUMENTS = eINSTANCE.getGenerator_ControllerArguments();

		/**
		 * The meta object literal for the '<em><b>Named Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__NAMED_GENERATORS = eINSTANCE.getGenerator_NamedGenerators();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__DESCRIPTORS = eINSTANCE.getGenerator_Descriptors();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ENABLED = eINSTANCE.getGenerator_Enabled();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__DESCRIPTION = eINSTANCE.getGenerator_Description();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONFIGURATION = eINSTANCE.getGenerator_Configuration();

		/**
		 * The meta object literal for the '<em><b>Configuration Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONFIGURATION_REFERENCE = eINSTANCE.getGenerator_ConfigurationReference();

		/**
		 * The meta object literal for the '<em><b>Context Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONTEXT_PATH = eINSTANCE.getGenerator_ContextPath();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__PREDICATE = eINSTANCE.getGenerator_Predicate();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.AbstractNamedGeneratorImpl <em>Abstract Named Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.AbstractNamedGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getAbstractNamedGenerator()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_GENERATOR = eINSTANCE.getAbstractNamedGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_GENERATOR__NAME = eINSTANCE.getAbstractNamedGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_GENERATOR__DESCRIPTION = eINSTANCE.getAbstractNamedGenerator_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.NamedGeneratorImpl <em>Named Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.NamedGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getNamedGenerator()
		 * @generated
		 */
		EClass NAMED_GENERATOR = eINSTANCE.getNamedGenerator();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_GENERATOR__GENERATORS = eINSTANCE.getNamedGenerator_Generators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.PropertyImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__INTERPOLATE = eINSTANCE.getProperty_Interpolate();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ResourceGenerator <em>Resource Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ResourceGenerator
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGenerator()
		 * @generated
		 */
		EClass RESOURCE_GENERATOR = eINSTANCE.getResourceGenerator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ResourceContainer <em>Resource Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ResourceContainer
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceContainer()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER = eINSTANCE.getResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__ELEMENTS = eINSTANCE.getResourceContainer_Elements();

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
		 * The meta object literal for the '<em><b>Merger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MERGER = eINSTANCE.getFile_Merger();

		/**
		 * The meta object literal for the '<em><b>Merger Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MERGER_ARGUMENTS = eINSTANCE.getFile_MergerArguments();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__GENERATORS = eINSTANCE.getFile_Generators();

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
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FILE__ENCODING = eINSTANCE.getTextFile_Encoding();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContainerImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StaticTextImpl <em>Static Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StaticTextImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticText()
		 * @generated
		 */
		EClass STATIC_TEXT = eINSTANCE.getStaticText();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TEXT__CONTENTS = eINSTANCE.getStaticText_Contents();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TEXT__INTERPOLATE = eINSTANCE.getStaticText_Interpolate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl <em>Free Marker Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFreeMarkerGenerator()
		 * @generated
		 */
		EClass FREE_MARKER_GENERATOR = eINSTANCE.getFreeMarkerGenerator();

		/**
		 * The meta object literal for the '<em><b>Template Loader Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE = eINSTANCE.getFreeMarkerGenerator_TemplateLoaderType();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_MARKER_GENERATOR__BASE = eINSTANCE.getFreeMarkerGenerator_Base();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_MARKER_GENERATOR__TEMPLATE = eINSTANCE.getFreeMarkerGenerator_Template();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_MARKER_GENERATOR__MODEL = eINSTANCE.getFreeMarkerGenerator_Model();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ECoreModelGeneratorImpl <em>ECore Model Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ECoreModelGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getECoreModelGenerator()
		 * @generated
		 */
		EClass ECORE_MODEL_GENERATOR = eINSTANCE.getECoreModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MODEL_GENERATOR__MODEL = eINSTANCE.getECoreModelGenerator_Model();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ConverterImpl <em>Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ConverterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getConverter()
		 * @generated
		 */
		EClass CONVERTER = eINSTANCE.getConverter();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERTER__GENERATORS = eINSTANCE.getConverter_Generators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextToStreamConverterImpl <em>Text To Stream Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextToStreamConverterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextToStreamConverter()
		 * @generated
		 */
		EClass TEXT_TO_STREAM_CONVERTER = eINSTANCE.getTextToStreamConverter();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_STREAM_CONVERTER__CHARSET = eINSTANCE.getTextToStreamConverter_Charset();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StreamToTextConverterImpl <em>Stream To Text Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StreamToTextConverterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamToTextConverter()
		 * @generated
		 */
		EClass STREAM_TO_TEXT_CONVERTER = eINSTANCE.getStreamToTextConverter();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_TO_TEXT_CONVERTER__CHARSET = eINSTANCE.getStreamToTextConverter_Charset();

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
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_GENERATOR__ARGUMENTS = eINSTANCE.getJavaGenerator_Arguments();

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
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FILTER__ARGUMENTS = eINSTANCE.getJavaFilter_Arguments();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.JavaResourceGeneratorImpl <em>Java Resource Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.JavaResourceGeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getJavaResourceGenerator()
		 * @generated
		 */
		EClass JAVA_RESOURCE_GENERATOR = eINSTANCE.getJavaResourceGenerator();

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
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT_REFERENCE__INTERPOLATE = eINSTANCE.getTextContentReference_Interpolate();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextGroupImpl <em>Text Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextGroupImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextGroup()
		 * @generated
		 */
		EClass TEXT_GROUP = eINSTANCE.getTextGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorReferenceImpl <em>Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorReference()
		 * @generated
		 */
		EClass GENERATOR_REFERENCE = eINSTANCE.getGeneratorReference();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_REFERENCE__MODEL = eINSTANCE.getGeneratorReference_Model();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextGeneratorReferenceImpl <em>Text Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextGeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getTextGeneratorReference()
		 * @generated
		 */
		EClass TEXT_GENERATOR_REFERENCE = eINSTANCE.getTextGeneratorReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StreamGeneratorReferenceImpl <em>Stream Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StreamGeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStreamGeneratorReference()
		 * @generated
		 */
		EClass STREAM_GENERATOR_REFERENCE = eINSTANCE.getStreamGeneratorReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl <em>Resource Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorReference()
		 * @generated
		 */
		EClass RESOURCE_GENERATOR_REFERENCE = eINSTANCE.getResourceGeneratorReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.HttpCallImpl <em>Http Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.HttpCallImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getHttpCall()
		 * @generated
		 */
		EClass HTTP_CALL = eINSTANCE.getHttpCall();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__URL = eINSTANCE.getHttpCall_Url();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__METHOD = eINSTANCE.getHttpCall_Method();

		/**
		 * The meta object literal for the '<em><b>Body Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_CALL__BODY_GENERATOR = eINSTANCE.getHttpCall_BodyGenerator();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_CALL__HEADERS = eINSTANCE.getHttpCall_Headers();

		/**
		 * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__CONNECT_TIMEOUT = eINSTANCE.getHttpCall_ConnectTimeout();

		/**
		 * The meta object literal for the '<em><b>Read Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__READ_TIMEOUT = eINSTANCE.getHttpCall_ReadTimeout();

		/**
		 * The meta object literal for the '<em><b>Success Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__SUCCESS_CODE = eINSTANCE.getHttpCall_SuccessCode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceCollectionImpl <em>Resource Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceCollectionImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceCollection()
		 * @generated
		 */
		EClass RESOURCE_COLLECTION = eINSTANCE.getResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__PATH = eINSTANCE.getResourceCollection_Path();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__PREFIX = eINSTANCE.getResourceCollection_Prefix();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INCLUDES = eINSTANCE.getResourceCollection_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__EXCLUDES = eINSTANCE.getResourceCollection_Excludes();

		/**
		 * The meta object literal for the '<em><b>Interpolation Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = eINSTANCE.getResourceCollection_InterpolationIncludes();

		/**
		 * The meta object literal for the '<em><b>Interpolation Excludes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = eINSTANCE.getResourceCollection_InterpolationExcludes();

		/**
		 * The meta object literal for the '<em><b>Interpolation Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INTERPOLATION_CHARSET = eINSTANCE.getResourceCollection_InterpolationCharset();

		/**
		 * The meta object literal for the '<em><b>Reconcile Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__RECONCILE_ACTION = eINSTANCE.getResourceCollection_ReconcileAction();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__MERGER = eINSTANCE.getResourceCollection_Merger();

		/**
		 * The meta object literal for the '<em><b>Merger Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__MERGER_ARGUMENTS = eINSTANCE.getResourceCollection_MergerArguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.BundleResourceCollectionImpl <em>Bundle Resource Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.BundleResourceCollectionImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBundleResourceCollection()
		 * @generated
		 */
		EClass BUNDLE_RESOURCE_COLLECTION = eINSTANCE.getBundleResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_RESOURCE_COLLECTION__BUNDLE = eINSTANCE.getBundleResourceCollection_Bundle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ZipResourceCollectionImpl <em>Zip Resource Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ZipResourceCollectionImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getZipResourceCollection()
		 * @generated
		 */
		EClass ZIP_RESOURCE_COLLECTION = eINSTANCE.getZipResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZIP_RESOURCE_COLLECTION__GENERATORS = eINSTANCE.getZipResourceCollection_Generators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.DescriptorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__LABEL = eINSTANCE.getDescriptor_Label();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__ICON = eINSTANCE.getDescriptor_Icon();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__DESCRIPTION = eINSTANCE.getDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__PREDICATE = eINSTANCE.getDescriptor_Predicate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ValueDescriptorImpl <em>Value Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ValueDescriptorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getValueDescriptor()
		 * @generated
		 */
		EClass VALUE_DESCRIPTOR = eINSTANCE.getValueDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DESCRIPTOR__TYPE = eINSTANCE.getValueDescriptor_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DESCRIPTOR__REQUIRED = eINSTANCE.getValueDescriptor_Required();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DESCRIPTOR__CHOICES = eINSTANCE.getValueDescriptor_Choices();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.PropertyDescriptorImpl <em>Property Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.PropertyDescriptorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getPropertyDescriptor()
		 * @generated
		 */
		EClass PROPERTY_DESCRIPTOR = eINSTANCE.getPropertyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DESCRIPTOR__NAME = eINSTANCE.getPropertyDescriptor_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ServiceDescriptorImpl <em>Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ServiceDescriptorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getServiceDescriptor()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTOR = eINSTANCE.getServiceDescriptor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.DescriptorSetImpl <em>Descriptor Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.DescriptorSetImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getDescriptorSet()
		 * @generated
		 */
		EClass DESCRIPTOR_SET = eINSTANCE.getDescriptorSet();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_SET__DESCRIPTORS = eINSTANCE.getDescriptorSet_Descriptors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.MustacheImpl <em>Mustache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.MustacheImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMustache()
		 * @generated
		 */
		EClass MUSTACHE = eINSTANCE.getMustache();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.StaticBytesImpl <em>Static Bytes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.StaticBytesImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getStaticBytes()
		 * @generated
		 */
		EClass STATIC_BYTES = eINSTANCE.getStaticBytes();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_BYTES__CONTENTS = eINSTANCE.getStaticBytes_Contents();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.FreeMarkerTemplateLoaderType <em>Free Marker Template Loader Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.FreeMarkerTemplateLoaderType
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFreeMarkerTemplateLoaderType()
		 * @generated
		 */
		EEnum FREE_MARKER_TEMPLATE_LOADER_TYPE = eINSTANCE.getFreeMarkerTemplateLoaderType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.HttpMethod
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.Context
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContext()
		 * @generated
		 */
		EDataType CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em>Binary Resource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.resources.BinaryResource
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryResource()
		 * @generated
		 */
		EDataType BINARY_RESOURCE = eINSTANCE.getBinaryResource();

		/**
		 * The meta object literal for the '<em>Binary Entity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.resources.BinaryEntity
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryEntity()
		 * @generated
		 */
		EDataType BINARY_ENTITY = eINSTANCE.getBinaryEntity();

		/**
		 * The meta object literal for the '<em>Binary Entity Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.resources.BinaryEntityContainer
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getBinaryEntityContainer()
		 * @generated
		 */
		EDataType BINARY_ENTITY_CONTAINER = eINSTANCE.getBinaryEntityContainer();

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
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

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

	}

} //CodegenPackage
