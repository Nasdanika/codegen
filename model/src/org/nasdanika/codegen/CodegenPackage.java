/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.ncore.NcorePackage;

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
 * Code generation model is a hierarchy of resource generators and resource content generators.
 * 
 * 
 * 
 * 
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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TITLE = NcorePackage.ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DESCRIPTION = NcorePackage.ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ID = NcorePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONFIGURATION = NcorePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OWNERS = NcorePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ISSUES = NcorePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ENABLED = NcorePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ITERATOR = NcorePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONTEXT_MAP = NcorePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = NcorePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = NcorePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = NcorePackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

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
	int RESOURCE_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

	/**
	 * The number of structural features of the '<em>Resource Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.ContentGenerator <em>Content Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ContentGenerator
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGenerator()
	 * @generated
	 */
	int CONTENT_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

	/**
	 * The number of structural features of the '<em>Content Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ResourceContainer <em>Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ResourceContainer
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceContainer()
	 * @generated
	 */
	int RESOURCE_CONTAINER = 4;

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
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TITLE = RESOURCE_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = RESOURCE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNERS = RESOURCE_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ISSUES = RESOURCE_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENABLED = RESOURCE_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ITERATOR = RESOURCE_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_MAP = RESOURCE_GENERATOR__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MERGER = RESOURCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = RESOURCE_GENERATOR_FEATURE_COUNT + 3;

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
	int FILE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNERS = RESOURCE__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ISSUES = RESOURCE__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ENABLED = RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTEXT_MAP = RESOURCE__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MERGER = RESOURCE__MERGER;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContainerImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONFIGURATION = RESOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNERS = RESOURCE__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ISSUES = RESOURCE__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENABLED = RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ITERATOR = RESOURCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_MAP = RESOURCE__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MERGER = RESOURCE__MERGER;

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
	int RESOURCE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__TITLE = GROUP__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__OWNERS = GROUP__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ISSUES = GROUP__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ENABLED = GROUP__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ITERATOR = GROUP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__CONTEXT_MAP = GROUP__CONTEXT_MAP;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentGroupImpl <em>Content Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentGroupImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGroup()
	 * @generated
	 */
	int CONTENT_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__TITLE = GROUP__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__CONFIGURATION = GROUP__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__OWNERS = GROUP__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__ISSUES = GROUP__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__ENABLED = GROUP__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__ITERATOR = GROUP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__CONTEXT_MAP = GROUP__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Content Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl <em>Free Marker Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFreeMarkerGenerator()
	 * @generated
	 */
	int FREE_MARKER_GENERATOR = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__BASE = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__TEMPLATE = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR__MODEL = CONTENT_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Free Marker Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Free Marker Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_MARKER_GENERATOR_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentReference()
	 * @generated
	 */
	int CONTENT_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__REF = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__INTERPOLATE = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.FilterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__GENERATORS = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.InterpolatorImpl <em>Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.InterpolatorImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getInterpolator()
	 * @generated
	 */
	int INTERPOLATOR = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__TITLE = FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ID = FILTER__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__OWNERS = FILTER__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ISSUES = FILTER__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ENABLED = FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__ITERATOR = FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR__CONTEXT_MAP = FILTER__CONTEXT_MAP;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.MustacheImpl <em>Mustache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.MustacheImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMustache()
	 * @generated
	 */
	int MUSTACHE = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__TITLE = FILTER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__DESCRIPTION = FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__ID = FILTER__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONFIGURATION = FILTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__OWNERS = FILTER__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__ISSUES = FILTER__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__ENABLED = FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__ITERATOR = FILTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSTACHE__CONTEXT_MAP = FILTER__CONTEXT_MAP;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ZipArchiveImpl <em>Zip Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ZipArchiveImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getZipArchive()
	 * @generated
	 */
	int ZIP_ARCHIVE = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE__ELEMENTS = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Zip Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_ARCHIVE_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorReferenceImpl <em>Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorReference()
	 * @generated
	 */
	int GENERATOR_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE__TARGET = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl <em>Resource Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorReference()
	 * @generated
	 */
	int RESOURCE_GENERATOR_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__TITLE = GENERATOR_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__DESCRIPTION = GENERATOR_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__ID = GENERATOR_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONFIGURATION = GENERATOR_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__OWNERS = GENERATOR_REFERENCE__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__ISSUES = GENERATOR_REFERENCE__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__ENABLED = GENERATOR_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__ITERATOR = GENERATOR_REFERENCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__CONTEXT_MAP = GENERATOR_REFERENCE__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE__TARGET = GENERATOR_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Resource Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_REFERENCE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentGeneratorReferenceImpl <em>Content Generator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentGeneratorReferenceImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorReference()
	 * @generated
	 */
	int CONTENT_GENERATOR_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__TITLE = GENERATOR_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__DESCRIPTION = GENERATOR_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__ID = GENERATOR_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__CONFIGURATION = GENERATOR_REFERENCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__OWNERS = GENERATOR_REFERENCE__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__ISSUES = GENERATOR_REFERENCE__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__ENABLED = GENERATOR_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__ITERATOR = GENERATOR_REFERENCE__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__CONTEXT_MAP = GENERATOR_REFERENCE__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE__TARGET = GENERATOR_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Content Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE_FEATURE_COUNT = GENERATOR_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Generator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_REFERENCE_OPERATION_COUNT = GENERATOR_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceCollectionImpl <em>Resource Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceCollectionImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceCollection()
	 * @generated
	 */
	int RESOURCE_COLLECTION = 19;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__TITLE = RESOURCE_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__ID = RESOURCE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__OWNERS = RESOURCE_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__ISSUES = RESOURCE_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__ENABLED = RESOURCE_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__ITERATOR = RESOURCE_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__CONTEXT_MAP = RESOURCE_GENERATOR__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__EXCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COLLECTION_FEATURE_COUNT = RESOURCE_GENERATOR_FEATURE_COUNT + 7;

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
	int BUNDLE_RESOURCE_COLLECTION = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__TITLE = RESOURCE_COLLECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_COLLECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__ID = RESOURCE_COLLECTION__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_COLLECTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__OWNERS = RESOURCE_COLLECTION__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__ISSUES = RESOURCE_COLLECTION__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__ENABLED = RESOURCE_COLLECTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__ITERATOR = RESOURCE_COLLECTION__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__CONTEXT_MAP = RESOURCE_COLLECTION__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INCLUDES = RESOURCE_COLLECTION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__EXCLUDES = RESOURCE_COLLECTION__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_COLLECTION__INTERPOLATION_INCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_COLLECTION__RECONCILE_ACTION;

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
	int ZIP_RESOURCE_COLLECTION = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__TITLE = RESOURCE_COLLECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__DESCRIPTION = RESOURCE_COLLECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__ID = RESOURCE_COLLECTION__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONFIGURATION = RESOURCE_COLLECTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__OWNERS = RESOURCE_COLLECTION__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__ISSUES = RESOURCE_COLLECTION__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__ENABLED = RESOURCE_COLLECTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__ITERATOR = RESOURCE_COLLECTION__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONTEXT_MAP = RESOURCE_COLLECTION__CONTEXT_MAP;

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
	 * The feature id for the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INCLUDES = RESOURCE_COLLECTION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__EXCLUDES = RESOURCE_COLLECTION__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = RESOURCE_COLLECTION__INTERPOLATION_INCLUDES;

	/**
	 * The feature id for the '<em><b>Interpolation Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Reconcile Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__RECONCILE_ACTION = RESOURCE_COLLECTION__RECONCILE_ACTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION__CONTENT = RESOURCE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zip Resource Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_RESOURCE_COLLECTION_FEATURE_COUNT = RESOURCE_COLLECTION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.HttpCallImpl <em>Http Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.HttpCallImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getHttpCall()
	 * @generated
	 */
	int HTTP_CALL = 22;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__URL = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__METHOD = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__HEADERS = CONTENT_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__CONNECT_TIMEOUT = CONTENT_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Read Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__READ_TIMEOUT = CONTENT_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Success Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__SUCCESS_CODE = CONTENT_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__BODY = CONTENT_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL__INTERPOLATE = CONTENT_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Http Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Http Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CALL_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.TextImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 23;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TITLE = CONTENT_GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTION = CONTENT_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = CONTENT_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONFIGURATION = CONTENT_GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OWNERS = CONTENT_GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ISSUES = CONTENT_GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ENABLED = CONTENT_GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ITERATOR = CONTENT_GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTEXT_MAP = CONTENT_GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = CONTENT_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__INTERPOLATE = CONTENT_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = CONTENT_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTENT_GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = CONTENT_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorAdapterImpl <em>Generator Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorAdapterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorAdapter()
	 * @generated
	 */
	int GENERATOR_ADAPTER = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER__FACTORY = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ADAPTER_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorAdapterImpl <em>Resource Generator Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGeneratorAdapterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorAdapter()
	 * @generated
	 */
	int RESOURCE_GENERATOR_ADAPTER = 25;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__TITLE = GENERATOR_ADAPTER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__DESCRIPTION = GENERATOR_ADAPTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__ID = GENERATOR_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__CONFIGURATION = GENERATOR_ADAPTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__OWNERS = GENERATOR_ADAPTER__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__ISSUES = GENERATOR_ADAPTER__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__ENABLED = GENERATOR_ADAPTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__ITERATOR = GENERATOR_ADAPTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__CONTEXT_MAP = GENERATOR_ADAPTER__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER__FACTORY = GENERATOR_ADAPTER__FACTORY;

	/**
	 * The number of structural features of the '<em>Resource Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER_FEATURE_COUNT = GENERATOR_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_ADAPTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_ADAPTER_OPERATION_COUNT = GENERATOR_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentGeneratorAdapterImpl <em>Content Generator Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentGeneratorAdapterImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorAdapter()
	 * @generated
	 */
	int CONTENT_GENERATOR_ADAPTER = 26;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__TITLE = GENERATOR_ADAPTER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__DESCRIPTION = GENERATOR_ADAPTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__ID = GENERATOR_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__CONFIGURATION = GENERATOR_ADAPTER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__OWNERS = GENERATOR_ADAPTER__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__ISSUES = GENERATOR_ADAPTER__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__ENABLED = GENERATOR_ADAPTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__ITERATOR = GENERATOR_ADAPTER__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__CONTEXT_MAP = GENERATOR_ADAPTER__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER__FACTORY = GENERATOR_ADAPTER__FACTORY;

	/**
	 * The number of structural features of the '<em>Content Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER_FEATURE_COUNT = GENERATOR_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_ADAPTER___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Generator Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_ADAPTER_OPERATION_COUNT = GENERATOR_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.GeneratorLinkImpl <em>Generator Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.GeneratorLinkImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorLink()
	 * @generated
	 */
	int GENERATOR_LINK = 27;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__TITLE = GENERATOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__DESCRIPTION = GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__ID = GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__CONFIGURATION = GENERATOR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__OWNERS = GENERATOR__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__ISSUES = GENERATOR__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__ENABLED = GENERATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__ITERATOR = GENERATOR__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__CONTEXT_MAP = GENERATOR__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK__REF = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LINK_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorLinkImpl <em>Resource Generator Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ResourceGeneratorLinkImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorLink()
	 * @generated
	 */
	int RESOURCE_GENERATOR_LINK = 28;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__TITLE = GENERATOR_LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__DESCRIPTION = GENERATOR_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__ID = GENERATOR_LINK__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__CONFIGURATION = GENERATOR_LINK__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__OWNERS = GENERATOR_LINK__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__ISSUES = GENERATOR_LINK__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__ENABLED = GENERATOR_LINK__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__ITERATOR = GENERATOR_LINK__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__CONTEXT_MAP = GENERATOR_LINK__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK__REF = GENERATOR_LINK__REF;

	/**
	 * The number of structural features of the '<em>Resource Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK_FEATURE_COUNT = GENERATOR_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GENERATOR_LINK_OPERATION_COUNT = GENERATOR_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.impl.ContentGeneratorLinkImpl <em>Content Generator Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.impl.ContentGeneratorLinkImpl
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorLink()
	 * @generated
	 */
	int CONTENT_GENERATOR_LINK = 29;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__TITLE = GENERATOR_LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__DESCRIPTION = GENERATOR_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__ID = GENERATOR_LINK__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__CONFIGURATION = GENERATOR_LINK__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__OWNERS = GENERATOR_LINK__OWNERS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__ISSUES = GENERATOR_LINK__ISSUES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__ENABLED = GENERATOR_LINK__ENABLED;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__ITERATOR = GENERATOR_LINK__ITERATOR;

	/**
	 * The feature id for the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__CONTEXT_MAP = GENERATOR_LINK__CONTEXT_MAP;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK__REF = GENERATOR_LINK__REF;

	/**
	 * The number of structural features of the '<em>Content Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK_FEATURE_COUNT = GENERATOR_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP = GENERATOR_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content Generator Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_GENERATOR_LINK_OPERATION_COUNT = GENERATOR_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getReconcileAction()
	 * @generated
	 */
	int RECONCILE_ACTION = 30;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Generator#getContextMap <em>Context Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Map</em>'.
	 * @see org.nasdanika.codegen.Generator#getContextMap()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ContextMap();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentGenerator <em>Content Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Generator</em>'.
	 * @see org.nasdanika.codegen.ContentGenerator
	 * @generated
	 */
	EClass getContentGenerator();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.codegen.Resource
	 * @generated
	 */
	EClass getResource();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Resource#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merger</em>'.
	 * @see org.nasdanika.codegen.Resource#getMerger()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Merger();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.File#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.codegen.File#getContent()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Content();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentGroup <em>Content Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Group</em>'.
	 * @see org.nasdanika.codegen.ContentGroup
	 * @generated
	 */
	EClass getContentGroup();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ContentReference#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.ContentReference#isInterpolate()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_Interpolate();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.Filter#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.nasdanika.codegen.Filter#getGenerators()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Generators();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Mustache <em>Mustache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mustache</em>'.
	 * @see org.nasdanika.codegen.Mustache
	 * @generated
	 */
	EClass getMustache();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.GeneratorReference <em>Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Reference</em>'.
	 * @see org.nasdanika.codegen.GeneratorReference
	 * @generated
	 */
	EClass getGeneratorReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.codegen.GeneratorReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.codegen.GeneratorReference#getTarget()
	 * @see #getGeneratorReference()
	 * @generated
	 */
	EReference getGeneratorReference_Target();

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
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentGeneratorReference <em>Content Generator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Generator Reference</em>'.
	 * @see org.nasdanika.codegen.ContentGeneratorReference
	 * @generated
	 */
	EClass getContentGeneratorReference();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getIncludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Includes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excludes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getExcludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_Excludes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes <em>Interpolation Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Includes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_InterpolationIncludes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes <em>Interpolation Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Excludes</em>'.
	 * @see org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes()
	 * @see #getResourceCollection()
	 * @generated
	 */
	EAttribute getResourceCollection_InterpolationExcludes();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ZipResourceCollection#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.codegen.ZipResourceCollection#getContent()
	 * @see #getZipResourceCollection()
	 * @generated
	 */
	EReference getZipResourceCollection_Content();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.HttpCall#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.nasdanika.codegen.HttpCall#getBody()
	 * @see #getHttpCall()
	 * @generated
	 */
	EReference getHttpCall_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.HttpCall#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.HttpCall#isInterpolate()
	 * @see #getHttpCall()
	 * @generated
	 */
	EAttribute getHttpCall_Interpolate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.codegen.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.codegen.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.Text#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.codegen.Text#isInterpolate()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Interpolate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.GeneratorAdapter <em>Generator Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Adapter</em>'.
	 * @see org.nasdanika.codegen.GeneratorAdapter
	 * @generated
	 */
	EClass getGeneratorAdapter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.GeneratorAdapter#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory</em>'.
	 * @see org.nasdanika.codegen.GeneratorAdapter#getFactory()
	 * @see #getGeneratorAdapter()
	 * @generated
	 */
	EAttribute getGeneratorAdapter_Factory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGeneratorAdapter <em>Resource Generator Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Generator Adapter</em>'.
	 * @see org.nasdanika.codegen.ResourceGeneratorAdapter
	 * @generated
	 */
	EClass getResourceGeneratorAdapter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentGeneratorAdapter <em>Content Generator Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Generator Adapter</em>'.
	 * @see org.nasdanika.codegen.ContentGeneratorAdapter
	 * @generated
	 */
	EClass getContentGeneratorAdapter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.GeneratorLink <em>Generator Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Link</em>'.
	 * @see org.nasdanika.codegen.GeneratorLink
	 * @generated
	 */
	EClass getGeneratorLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.GeneratorLink#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.codegen.GeneratorLink#getRef()
	 * @see #getGeneratorLink()
	 * @generated
	 */
	EAttribute getGeneratorLink_Ref();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ResourceGeneratorLink <em>Resource Generator Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Generator Link</em>'.
	 * @see org.nasdanika.codegen.ResourceGeneratorLink
	 * @generated
	 */
	EClass getResourceGeneratorLink();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ContentGeneratorLink <em>Content Generator Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Generator Link</em>'.
	 * @see org.nasdanika.codegen.ContentGeneratorLink
	 * @generated
	 */
	EClass getContentGeneratorLink();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ENABLED = eINSTANCE.getGenerator_Enabled();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ITERATOR = eINSTANCE.getGenerator_Iterator();

		/**
		 * The meta object literal for the '<em><b>Context Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CONTEXT_MAP = eINSTANCE.getGenerator_ContextMap();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.ContentGenerator <em>Content Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ContentGenerator
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGenerator()
		 * @generated
		 */
		EClass CONTENT_GENERATOR = eINSTANCE.getContentGenerator();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Reconcile Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RECONCILE_ACTION = eINSTANCE.getResource_ReconcileAction();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__MERGER = eINSTANCE.getResource_Merger();

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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CONTENT = eINSTANCE.getFile_Content();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContentGroupImpl <em>Content Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContentGroupImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGroup()
		 * @generated
		 */
		EClass CONTENT_GROUP = eINSTANCE.getContentGroup();

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
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__INTERPOLATE = eINSTANCE.getContentReference_Interpolate();

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
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__GENERATORS = eINSTANCE.getFilter_Generators();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.MustacheImpl <em>Mustache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.MustacheImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getMustache()
		 * @generated
		 */
		EClass MUSTACHE = eINSTANCE.getMustache();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorReferenceImpl <em>Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorReference()
		 * @generated
		 */
		EClass GENERATOR_REFERENCE = eINSTANCE.getGeneratorReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_REFERENCE__TARGET = eINSTANCE.getGeneratorReference_Target();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContentGeneratorReferenceImpl <em>Content Generator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContentGeneratorReferenceImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorReference()
		 * @generated
		 */
		EClass CONTENT_GENERATOR_REFERENCE = eINSTANCE.getContentGeneratorReference();

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
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INCLUDES = eINSTANCE.getResourceCollection_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__EXCLUDES = eINSTANCE.getResourceCollection_Excludes();

		/**
		 * The meta object literal for the '<em><b>Interpolation Includes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INTERPOLATION_INCLUDES = eINSTANCE.getResourceCollection_InterpolationIncludes();

		/**
		 * The meta object literal for the '<em><b>Interpolation Excludes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES = eINSTANCE.getResourceCollection_InterpolationExcludes();

		/**
		 * The meta object literal for the '<em><b>Reconcile Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_COLLECTION__RECONCILE_ACTION = eINSTANCE.getResourceCollection_ReconcileAction();

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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZIP_RESOURCE_COLLECTION__CONTENT = eINSTANCE.getZipResourceCollection_Content();

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
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_CALL__BODY = eINSTANCE.getHttpCall_Body();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_CALL__INTERPOLATE = eINSTANCE.getHttpCall_Interpolate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.TextImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__INTERPOLATE = eINSTANCE.getText_Interpolate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorAdapterImpl <em>Generator Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorAdapterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorAdapter()
		 * @generated
		 */
		EClass GENERATOR_ADAPTER = eINSTANCE.getGeneratorAdapter();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ADAPTER__FACTORY = eINSTANCE.getGeneratorAdapter_Factory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorAdapterImpl <em>Resource Generator Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceGeneratorAdapterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorAdapter()
		 * @generated
		 */
		EClass RESOURCE_GENERATOR_ADAPTER = eINSTANCE.getResourceGeneratorAdapter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContentGeneratorAdapterImpl <em>Content Generator Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContentGeneratorAdapterImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorAdapter()
		 * @generated
		 */
		EClass CONTENT_GENERATOR_ADAPTER = eINSTANCE.getContentGeneratorAdapter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.GeneratorLinkImpl <em>Generator Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.GeneratorLinkImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getGeneratorLink()
		 * @generated
		 */
		EClass GENERATOR_LINK = eINSTANCE.getGeneratorLink();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LINK__REF = eINSTANCE.getGeneratorLink_Ref();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ResourceGeneratorLinkImpl <em>Resource Generator Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ResourceGeneratorLinkImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getResourceGeneratorLink()
		 * @generated
		 */
		EClass RESOURCE_GENERATOR_LINK = eINSTANCE.getResourceGeneratorLink();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.impl.ContentGeneratorLinkImpl <em>Content Generator Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.impl.ContentGeneratorLinkImpl
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getContentGeneratorLink()
		 * @generated
		 */
		EClass CONTENT_GENERATOR_LINK = eINSTANCE.getContentGeneratorLink();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ReconcileAction <em>Reconcile Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ReconcileAction
		 * @see org.nasdanika.codegen.impl.CodegenPackageImpl#getReconcileAction()
		 * @generated
		 */
		EEnum RECONCILE_ACTION = eINSTANCE.getReconcileAction();

	}

} //CodegenPackage
