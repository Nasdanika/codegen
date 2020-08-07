/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.codegen.BundleResourceCollection;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.ContentGeneratorReference;
import org.nasdanika.codegen.ContentGroup;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorReference;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.HttpCall;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.Mustache;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.ResourceCollection;
import org.nasdanika.codegen.ResourceContainer;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.Text;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.codegen.ZipResourceCollection;

import org.nasdanika.codegen.util.CodegenValidator;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodegenPackageImpl extends EPackageImpl implements CodegenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeMarkerGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpolatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zipArchiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGeneratorReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentGeneratorReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleResourceCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zipResourceCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconcileActionEEnum = null;

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
	 * @see org.nasdanika.codegen.CodegenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodegenPackageImpl() {
		super(eNS_URI, CodegenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodegenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodegenPackage init() {
		if (isInited) return (CodegenPackage)EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodegenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodegenPackageImpl theCodegenPackage = registeredCodegenPackage instanceof CodegenPackageImpl ? (CodegenPackageImpl)registeredCodegenPackage : new CodegenPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodegenPackage.createPackageContents();

		// Initialize created meta-data
		theCodegenPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCodegenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return CodegenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCodegenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodegenPackage.eNS_URI, theCodegenPackage);
		return theCodegenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_Enabled() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_Iterator() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGenerator__Validate__DiagnosticChain_Map() {
		return generatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Elements() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceGenerator() {
		return resourceGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentGenerator() {
		return contentGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainer() {
		return resourceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_Elements() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ReconcileAction() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFile_Content() {
		return (EReference)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Charset() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceGroup() {
		return resourceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentGroup() {
		return contentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreeMarkerGenerator() {
		return freeMarkerGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeMarkerGenerator_Base() {
		return (EAttribute)freeMarkerGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeMarkerGenerator_Template() {
		return (EAttribute)freeMarkerGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeMarkerGenerator_Model() {
		return (EAttribute)freeMarkerGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentReference() {
		return contentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_Ref() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_Generators() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterpolator() {
		return interpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMustache() {
		return mustacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZipArchive() {
		return zipArchiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratorReference() {
		return generatorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorReference_Ref() {
		return (EAttribute)generatorReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceGeneratorReference() {
		return resourceGeneratorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentGeneratorReference() {
		return contentGeneratorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceCollection() {
		return resourceCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_Path() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_Prefix() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_Includes() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_Excludes() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_InterpolationIncludes() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_InterpolationExcludes() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_InterpolationCharset() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCollection_ReconcileAction() {
		return (EAttribute)resourceCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleResourceCollection() {
		return bundleResourceCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleResourceCollection_Bundle() {
		return (EAttribute)bundleResourceCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZipResourceCollection() {
		return zipResourceCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZipResourceCollection_Content() {
		return (EReference)zipResourceCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHttpCall() {
		return httpCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpCall_Url() {
		return (EAttribute)httpCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpCall_Method() {
		return (EAttribute)httpCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHttpCall_Headers() {
		return (EReference)httpCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpCall_ConnectTimeout() {
		return (EAttribute)httpCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpCall_ReadTimeout() {
		return (EAttribute)httpCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpCall_SuccessCode() {
		return (EAttribute)httpCallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHttpCall_Body() {
		return (EReference)httpCallEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Text() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Interpolate() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReconcileAction() {
		return reconcileActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodegenFactory getCodegenFactory() {
		return (CodegenFactory)getEFactoryInstance();
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
		generatorEClass = createEClass(GENERATOR);
		createEAttribute(generatorEClass, GENERATOR__ENABLED);
		createEAttribute(generatorEClass, GENERATOR__ITERATOR);
		createEOperation(generatorEClass, GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__ELEMENTS);

		resourceGeneratorEClass = createEClass(RESOURCE_GENERATOR);

		contentGeneratorEClass = createEClass(CONTENT_GENERATOR);

		resourceContainerEClass = createEClass(RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__ELEMENTS);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__RECONCILE_ACTION);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__CONTENT);
		createEAttribute(fileEClass, FILE__CHARSET);

		containerEClass = createEClass(CONTAINER);

		resourceGroupEClass = createEClass(RESOURCE_GROUP);

		contentGroupEClass = createEClass(CONTENT_GROUP);

		freeMarkerGeneratorEClass = createEClass(FREE_MARKER_GENERATOR);
		createEAttribute(freeMarkerGeneratorEClass, FREE_MARKER_GENERATOR__BASE);
		createEAttribute(freeMarkerGeneratorEClass, FREE_MARKER_GENERATOR__TEMPLATE);
		createEAttribute(freeMarkerGeneratorEClass, FREE_MARKER_GENERATOR__MODEL);

		contentReferenceEClass = createEClass(CONTENT_REFERENCE);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__REF);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__GENERATORS);

		interpolatorEClass = createEClass(INTERPOLATOR);

		mustacheEClass = createEClass(MUSTACHE);

		zipArchiveEClass = createEClass(ZIP_ARCHIVE);

		generatorReferenceEClass = createEClass(GENERATOR_REFERENCE);
		createEAttribute(generatorReferenceEClass, GENERATOR_REFERENCE__REF);

		resourceGeneratorReferenceEClass = createEClass(RESOURCE_GENERATOR_REFERENCE);

		contentGeneratorReferenceEClass = createEClass(CONTENT_GENERATOR_REFERENCE);

		resourceCollectionEClass = createEClass(RESOURCE_COLLECTION);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__PATH);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__PREFIX);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__INCLUDES);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__EXCLUDES);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__INTERPOLATION_INCLUDES);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__INTERPOLATION_CHARSET);
		createEAttribute(resourceCollectionEClass, RESOURCE_COLLECTION__RECONCILE_ACTION);

		bundleResourceCollectionEClass = createEClass(BUNDLE_RESOURCE_COLLECTION);
		createEAttribute(bundleResourceCollectionEClass, BUNDLE_RESOURCE_COLLECTION__BUNDLE);

		zipResourceCollectionEClass = createEClass(ZIP_RESOURCE_COLLECTION);
		createEReference(zipResourceCollectionEClass, ZIP_RESOURCE_COLLECTION__CONTENT);

		httpCallEClass = createEClass(HTTP_CALL);
		createEAttribute(httpCallEClass, HTTP_CALL__URL);
		createEAttribute(httpCallEClass, HTTP_CALL__METHOD);
		createEReference(httpCallEClass, HTTP_CALL__HEADERS);
		createEAttribute(httpCallEClass, HTTP_CALL__CONNECT_TIMEOUT);
		createEAttribute(httpCallEClass, HTTP_CALL__READ_TIMEOUT);
		createEAttribute(httpCallEClass, HTTP_CALL__SUCCESS_CODE);
		createEReference(httpCallEClass, HTTP_CALL__BODY);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);
		createEAttribute(textEClass, TEXT__INTERPOLATE);

		// Create enums
		reconcileActionEEnum = createEEnum(RECONCILE_ACTION);
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
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generatorEClass.getESuperTypes().add(theNcorePackage.getEntity());
		generatorEClass.getESuperTypes().add(theNcorePackage.getConfigurable());
		groupEClass.getESuperTypes().add(this.getGenerator());
		resourceGeneratorEClass.getESuperTypes().add(this.getGenerator());
		contentGeneratorEClass.getESuperTypes().add(this.getGenerator());
		resourceEClass.getESuperTypes().add(this.getResourceGenerator());
		resourceEClass.getESuperTypes().add(theNcorePackage.getNamedElement());
		fileEClass.getESuperTypes().add(this.getResource());
		containerEClass.getESuperTypes().add(this.getResource());
		containerEClass.getESuperTypes().add(this.getResourceContainer());
		resourceGroupEClass.getESuperTypes().add(this.getGroup());
		resourceGroupEClass.getESuperTypes().add(this.getResourceGenerator());
		contentGroupEClass.getESuperTypes().add(this.getGroup());
		contentGroupEClass.getESuperTypes().add(this.getContentGenerator());
		freeMarkerGeneratorEClass.getESuperTypes().add(this.getGenerator());
		contentReferenceEClass.getESuperTypes().add(this.getContentGenerator());
		filterEClass.getESuperTypes().add(this.getContentGenerator());
		interpolatorEClass.getESuperTypes().add(this.getFilter());
		mustacheEClass.getESuperTypes().add(this.getFilter());
		zipArchiveEClass.getESuperTypes().add(this.getContentGenerator());
		zipArchiveEClass.getESuperTypes().add(this.getResourceContainer());
		generatorReferenceEClass.getESuperTypes().add(this.getGenerator());
		resourceGeneratorReferenceEClass.getESuperTypes().add(this.getGeneratorReference());
		resourceGeneratorReferenceEClass.getESuperTypes().add(this.getResourceGenerator());
		contentGeneratorReferenceEClass.getESuperTypes().add(this.getGeneratorReference());
		contentGeneratorReferenceEClass.getESuperTypes().add(this.getContentGenerator());
		resourceCollectionEClass.getESuperTypes().add(this.getResourceGenerator());
		bundleResourceCollectionEClass.getESuperTypes().add(this.getResourceCollection());
		zipResourceCollectionEClass.getESuperTypes().add(this.getResourceCollection());
		httpCallEClass.getESuperTypes().add(this.getContentGenerator());
		textEClass.getESuperTypes().add(this.getContentGenerator());

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorEClass, Generator.class, "Generator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerator_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_Iterator(), ecorePackage.getEString(), "iterator", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGenerator__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Elements(), this.getGenerator(), null, "elements", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceGeneratorEClass, ResourceGenerator.class, "ResourceGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentGeneratorEClass, ContentGenerator.class, "ContentGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceContainerEClass, ResourceContainer.class, "ResourceContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceContainer_Elements(), this.getResourceGenerator(), null, "elements", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_ReconcileAction(), this.getReconcileAction(), "reconcileAction", "Overwrite", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Content(), this.getContentGenerator(), null, "content", null, 1, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Charset(), ecorePackage.getEString(), "charset", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.codegen.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceGroupEClass, ResourceGroup.class, "ResourceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentGroupEClass, ContentGroup.class, "ContentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(freeMarkerGeneratorEClass, FreeMarkerGenerator.class, "FreeMarkerGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeMarkerGenerator_Base(), ecorePackage.getEString(), "base", null, 0, 1, FreeMarkerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeMarkerGenerator_Template(), ecorePackage.getEString(), "template", null, 1, 1, FreeMarkerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeMarkerGenerator_Model(), ecorePackage.getEString(), "model", null, 0, 1, FreeMarkerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentReferenceEClass, ContentReference.class, "ContentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentReference_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Generators(), this.getGenerator(), null, "generators", null, 0, -1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interpolatorEClass, Interpolator.class, "Interpolator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mustacheEClass, Mustache.class, "Mustache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zipArchiveEClass, ZipArchive.class, "ZipArchive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatorReferenceEClass, GeneratorReference.class, "GeneratorReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorReference_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, GeneratorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceGeneratorReferenceEClass, ResourceGeneratorReference.class, "ResourceGeneratorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentGeneratorReferenceEClass, ContentGeneratorReference.class, "ContentGeneratorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceCollectionEClass, ResourceCollection.class, "ResourceCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceCollection_Path(), ecorePackage.getEString(), "path", null, 0, 1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_Includes(), ecorePackage.getEString(), "includes", null, 0, -1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_Excludes(), ecorePackage.getEString(), "excludes", null, 0, -1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_InterpolationIncludes(), ecorePackage.getEString(), "interpolationIncludes", null, 0, -1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_InterpolationExcludes(), ecorePackage.getEString(), "interpolationExcludes", null, 0, -1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_InterpolationCharset(), ecorePackage.getEString(), "interpolationCharset", "", 0, 1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCollection_ReconcileAction(), this.getReconcileAction(), "reconcileAction", "Overwrite", 0, 1, ResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleResourceCollectionEClass, BundleResourceCollection.class, "BundleResourceCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleResourceCollection_Bundle(), ecorePackage.getEString(), "bundle", null, 0, 1, BundleResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zipResourceCollectionEClass, ZipResourceCollection.class, "ZipResourceCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZipResourceCollection_Content(), this.getContentGenerator(), null, "content", null, 1, -1, ZipResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpCallEClass, HttpCall.class, "HttpCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpCall_Url(), ecorePackage.getEString(), "url", null, 1, 1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpCall_Method(), theNcorePackage.getHttpMethod(), "method", "GET", 0, 1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpCall_Headers(), theNcorePackage.getEntry(), null, "headers", null, 0, -1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpCall_ConnectTimeout(), ecorePackage.getEInt(), "connectTimeout", "60", 0, 1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpCall_ReadTimeout(), ecorePackage.getEInt(), "readTimeout", "60", 0, 1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpCall_SuccessCode(), ecorePackage.getEInt(), "successCode", "200", 0, 1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpCall_Body(), this.getContentGenerator(), null, "body", null, 0, -1, HttpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Interpolate(), ecorePackage.getEBoolean(), "interpolate", "true", 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reconcileActionEEnum, ReconcileAction.class, "ReconcileAction");
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.KEEP);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.APPEND);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.MERGE);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.OVERWRITE);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.CANCEL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getText_Text(),
		   source,
		   new String[] {
			   "content-type", "text/code"
		   });
	}

} //CodegenPackageImpl
