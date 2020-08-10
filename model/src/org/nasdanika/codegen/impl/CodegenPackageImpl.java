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
import org.nasdanika.codegen.ContentGeneratorAdapter;
import org.nasdanika.codegen.ContentGeneratorReference;
import org.nasdanika.codegen.ContentGroup;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorAdapter;
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
import org.nasdanika.codegen.ResourceGeneratorAdapter;
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
	private EClass generatorAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGeneratorAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentGeneratorAdapterEClass = null;

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
	public EAttribute getResource_Merger() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
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
	public EClass getGeneratorAdapter() {
		return generatorAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorAdapter_Factory() {
		return (EAttribute)generatorAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceGeneratorAdapter() {
		return resourceGeneratorAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentGeneratorAdapter() {
		return contentGeneratorAdapterEClass;
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
		createEAttribute(resourceEClass, RESOURCE__MERGER);

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

		generatorAdapterEClass = createEClass(GENERATOR_ADAPTER);
		createEAttribute(generatorAdapterEClass, GENERATOR_ADAPTER__FACTORY);

		resourceGeneratorAdapterEClass = createEClass(RESOURCE_GENERATOR_ADAPTER);

		contentGeneratorAdapterEClass = createEClass(CONTENT_GENERATOR_ADAPTER);

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
		freeMarkerGeneratorEClass.getESuperTypes().add(this.getContentGenerator());
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
		generatorAdapterEClass.getESuperTypes().add(this.getGenerator());
		resourceGeneratorAdapterEClass.getESuperTypes().add(this.getGeneratorAdapter());
		resourceGeneratorAdapterEClass.getESuperTypes().add(this.getResourceGenerator());
		contentGeneratorAdapterEClass.getESuperTypes().add(this.getGeneratorAdapter());
		contentGeneratorAdapterEClass.getESuperTypes().add(this.getContentGenerator());

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
		initEAttribute(getResource_Merger(), ecorePackage.getEString(), "merger", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(generatorAdapterEClass, GeneratorAdapter.class, "GeneratorAdapter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorAdapter_Factory(), ecorePackage.getEString(), "factory", null, 1, 1, GeneratorAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceGeneratorAdapterEClass, ResourceGeneratorAdapter.class, "ResourceGeneratorAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentGeneratorAdapterEClass, ContentGeneratorAdapter.class, "ContentGeneratorAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
			   "documentation", "Code generation model is a hierarchy of resource generators and resource content generators.\n\n\n\n"
		   });
		addAnnotation
		  (generatorEClass,
		   source,
		   new String[] {
			   "documentation", "Generator is the base class for model element performing code generation."
		   });
		addAnnotation
		  (getGenerator__Validate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "documentation", "Validates element."
		   });
		addAnnotation
		  ((getGenerator__Validate__DiagnosticChain_Map()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Diagnostics to add validation messages to."
		   });
		addAnnotation
		  ((getGenerator__Validate__DiagnosticChain_Map()).getEParameters().get(1),
		   source,
		   new String[] {
			   "documentation", "Validation context."
		   });
		addAnnotation
		  (getGenerator_Enabled(),
		   source,
		   new String[] {
			   "documentation", "Generator creates work only if this attribute is true. \nThe purpose of this attribute is to help with generator model development \nby disabling model parts which are still work in progress and would fail the generation\nprocess, or, on the opposite, already working parts which would create delay and distraction\nin testing and troubleshooting. Use ``Iterator`` for conditional generation."
		   });
		addAnnotation
		  (getGenerator_Iterator(),
		   source,
		   new String[] {
			   "documentation", "Iterator contains context property name and allows to execute generator zero or more times depending on the property type.\n\n* If iterator is blank then generator is executed once using the current generation context.\n* If iterator is not blank its value is used to get a property from the current generation context. Depending on the property value the generator is executed zero or more times:\n    * null - in this case iterator value is used as a prefix to create a sub-context to be used by the generator. E.g. if iterator value is ``my-component/`` then ``my-property`` property of the sub-context maps to ``my-component/my-property`` property of the parent context.\n    * boolean ``false`` - generator is not executed.\n    * boolean ``true`` - generator is executed once with the current context, same as for a blank iterator.\n    * single value (scalar) - generator is executed once with the current context and value available via ``data`` context property.\n    * list - generator is executed once for each list element with element value being processed as explained here.\n    * map - the map values are interoplated recursively by the current context. Then the map is wrapped into a context which is used to execute the generator.\n    * ${javadoc/org.eclipse.emf.common.notify.AdapterFactory} - the factory shall be for ${javadoc/org.nasdanika.common.ContextIterator$Factory}. A context iterator is created by the factory and is used to iterate over the element.\n\n"
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "documentation", "A group of generators. The group itself doesn\'t generate anything - it is an aggregation and conditional invocation (iteration) construct."
		   });
		addAnnotation
		  (getGroup_Elements(),
		   source,
		   new String[] {
			   "documentation", "Group elements."
		   });
		addAnnotation
		  (reconcileActionEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines an action to take if project/resource with a given name already exists in the workspace."
		   });
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Discard the generated content and keep the original or skip the generation step altogether."
		   });
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Append the new content to the existing. For containers (directories) it means\nadding new resources next to the existing, which is semantically equivalent to merging."
		   });
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Merge new and existing content, typically using a merger service for files. \r\nFor projects and directories merge is equivalent to append."
		   });
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Replace existing content with the new one. \nFor containers (directories) it means deleting container elements before generation.\n"
		   });
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Throw ``OperationCancelledException`` if resource/project already exists."
		   });
		addAnnotation
		  (resourceGeneratorEClass,
		   source,
		   new String[] {
			   "documentation", "Base interface for resources and resource group"
		   });
		addAnnotation
		  (contentGeneratorEClass,
		   source,
		   new String[] {
			   "documentation", "Base interface for generators of file content."
		   });
		addAnnotation
		  (resourceContainerEClass,
		   source,
		   new String[] {
			   "documentation", "Something which can contain resources, a grouping construct."
		   });
		addAnnotation
		  (getResourceContainer_Elements(),
		   source,
		   new String[] {
			   "documentation", "Folder can contain other resource generators."
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "Generates a resource - file or container. "
		   });
		addAnnotation
		  (getResource_ReconcileAction(),
		   source,
		   new String[] {
			   "documentation", "Action to take if resource with given name already exists."
		   });
		addAnnotation
		  (getResource_Merger(),
		   source,
		   new String[] {
			   "documentation", "Context property for a merger if reconcile action is Merge. \nThe property shall be either of type ${javadoc/org.nasdanika.codegen.gen.Merger} or ${javadoc/org.eclipse.emf.common.notify.AdapterFactory}. \nIn the latter case the factory shall be for ${javadoc/org.nasdanika.codegen.gen.Merger} type.\nSome resource types may have a default merger. E.g. ${ecore-doc/codegen-java/CompilationUnit} or [Container](Container.html). \n"
		   });
		addAnnotation
		  (fileEClass,
		   source,
		   new String[] {
			   "documentation", "Generates File for a given content."
		   });
		addAnnotation
		  (getFile_Content(),
		   source,
		   new String[] {
			   "documentation", "File content generators. \r\nContent produced by each generator is appended to the file content."
		   });
		addAnnotation
		  (getFile_Charset(),
		   source,
		   new String[] {
			   "documentation", "Optional character set for text files."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "Nameed container of resources, e.g. a folder/directory."
		   });
		addAnnotation
		  (resourceGroupEClass,
		   source,
		   new String[] {
			   "documentation", "A group of resources. "
		   });
		addAnnotation
		  (contentGroupEClass,
		   source,
		   new String[] {
			   "documentation", "A group of resources. "
		   });
		addAnnotation
		  (freeMarkerGeneratorEClass,
		   source,
		   new String[] {
			   "documentation", "Generates text from template and model using [FreeMarker](http://freemarker.org/)."
		   });
		addAnnotation
		  (getFreeMarkerGenerator_Base(),
		   source,
		   new String[] {
			   "documentation", "Base URL for resolving templates. The URL is resolved relative to the model location.\nIf empty, then templates are resolved relative to the generator model location."
		   });
		addAnnotation
		  (getFreeMarkerGenerator_Template(),
		   source,
		   new String[] {
			   "documentation", "Template name."
		   });
		addAnnotation
		  (getFreeMarkerGenerator_Model(),
		   source,
		   new String[] {
			   "documentation", "The name of a property which value is used as a model for the template.\r\nIf blank, the generation context is used as the model."
		   });
		addAnnotation
		  (contentReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Reference (URL) to content residing elsewhere, e.g. a template in a version control\nsystem available for download over HTTP."
		   });
		addAnnotation
		  (getContentReference_Ref(),
		   source,
		   new String[] {
			   "documentation", "Content location (URL) resolved relative to the model location."
		   });
		addAnnotation
		  (filterEClass,
		   source,
		   new String[] {
			   "documentation", "Filter generates its output by processing and combining outputs of contained generators."
		   });
		addAnnotation
		  (getFilter_Generators(),
		   source,
		   new String[] {
			   "documentation", "Filter inputs."
		   });
		addAnnotation
		  (interpolatorEClass,
		   source,
		   new String[] {
			   "documentation", "Interpolator produces output by expanding tokens ``${token}`` in the \ninput using context properties."
		   });
		addAnnotation
		  (mustacheEClass,
		   source,
		   new String[] {
			   "documentation", "Evaluates template using [Mustache for Java](https://github.com/spullara/mustache.java) with contexts bridged to Map scope.\n\nPropertes which values are functions can be invoked using {{#func}}...{{/func}} syntax, e.g. {{#import}}java.io.InputStream{{/import}}."
		   });
		addAnnotation
		  (zipArchiveEClass,
		   source,
		   new String[] {
			   "documentation", "Creates a zip archive (binary stream) from contained resources."
		   });
		addAnnotation
		  (generatorReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Reference to a generator model."
		   });
		addAnnotation
		  (getGeneratorReference_Ref(),
		   source,
		   new String[] {
			   "documentation", "Model URL resolved relative to this model. If there is no fragment then the root model element is used. Otherwise the model element identified by the fragment part is used."
		   });
		addAnnotation
		  (resourceCollectionEClass,
		   source,
		   new String[] {
			   "documentation", "Resource collection adds zero or more resources to the containing resource container."
		   });
		addAnnotation
		  (getResourceCollection_Path(),
		   source,
		   new String[] {
			   "documentation", "Path in the underlying container to use as a source of collection elements. Path prefix is removed from element name. E.g. if path is ``images`` and there is a resource named ``images/logo.png`` then there will be a collection element ``logo.png``."
		   });
		addAnnotation
		  (getResourceCollection_Prefix(),
		   source,
		   new String[] {
			   "documentation", "Prefix to add to resource paths. E.g. if the prefix is ``gen_`` then ``logo.png`` will be added to the resource container as ``gen_logo.png``."
		   });
		addAnnotation
		  (getResourceCollection_Includes(),
		   source,
		   new String[] {
			   "documentation", "A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying resources to include into the collection.\nAll resources are included if the includes list is empty.\n\n## Matching rules\n\n* `?` matches one character\n* `*` matches zero or more characters\n* `**` matches zero or more **directories** in a path\n"
		   });
		addAnnotation
		  (getResourceCollection_Excludes(),
		   source,
		   new String[] {
			   "documentation", "A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying resources to exclude from the collection. Nothing is excluded if this list is empty."
		   });
		addAnnotation
		  (getResourceCollection_InterpolationIncludes(),
		   source,
		   new String[] {
			   "documentation", "A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying which included resources shall be interpolated. E.g. if ``includes`` contains ``*.bin`` and ``*.txt`` and ``interpolationIncludes`` contains ``*.txt`` then only text files will be interpolated. Unlike ``includes``, if this list is empty then nothing gets interpolated."
		   });
		addAnnotation
		  (getResourceCollection_InterpolationExcludes(),
		   source,
		   new String[] {
			   "documentation", "A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying which resources shall be excluded from interpolation."
		   });
		addAnnotation
		  (getResourceCollection_InterpolationCharset(),
		   source,
		   new String[] {
			   "documentation", "Charset to use when reading/writing resources for interpolation."
		   });
		addAnnotation
		  (getResourceCollection_ReconcileAction(),
		   source,
		   new String[] {
			   "documentation", "Action to take if resources (entities) contributed by the collection already exist in the container."
		   });
		addAnnotation
		  (bundleResourceCollectionEClass,
		   source,
		   new String[] {
			   "documentation", "A coolection of resources from an OSGi bundle (Eclipse plug-in)."
		   });
		addAnnotation
		  (getBundleResourceCollection_Bundle(),
		   source,
		   new String[] {
			   "documentation", "Bundle symbolic name. Defaults to the bundle containing the model."
		   });
		addAnnotation
		  (zipResourceCollectionEClass,
		   source,
		   new String[] {
			   "documentation", "A coolection of resources from Zip input streams."
		   });
		addAnnotation
		  (getZipResourceCollection_Content(),
		   source,
		   new String[] {
			   "documentation", "Generators of zip input streams providing collection elements."
		   });
		addAnnotation
		  (httpCallEClass,
		   source,
		   new String[] {
			   "documentation", "Makes an HTTP Call. Converts result to Map/List for ``application/json`` content type, to text for ``text/...`` content types. Returns a byte array otherwise."
		   });
		addAnnotation
		  (getHttpCall_Url(),
		   source,
		   new String[] {
			   "documentation", "URL resolved relative to the model."
		   });
		addAnnotation
		  (getHttpCall_ConnectTimeout(),
		   source,
		   new String[] {
			   "documentation", "Connect timeout in seconds"
		   });
		addAnnotation
		  (getHttpCall_ReadTimeout(),
		   source,
		   new String[] {
			   "documentation", "Read timeout in seconds"
		   });
		addAnnotation
		  (getHttpCall_SuccessCode(),
		   source,
		   new String[] {
			   "documentation", "HTTP response code indicating success."
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "documentation", "Value computes its result from text. \n\nValue implementation can be defined as follows:\n\n* Fully qualified class name, e.g. ``java.lang.Integer``. An instance of the implementation class is constructed using a contructor which takes ``org.nasdanika.common.Context`` and ``java.lang.String``, just ``java.lang.String``.\n* Method reference using ``::`` as a separator between the fully qualified class name and the method name. This definition can be used if the type is a functional interface with a single method. If the method is not static then an instance of the implementation class is constructed using a contructor which takes ``org.nasdanika.common.Context`` and ``java.lang.String``, or just ``java.lang.String``.\n* Provider reference using ``->`` as a separator between the fully qualified class name and the provider method. If the method is static then it shall take Context and String or just String. Otherwise an instance of the implementation class is constructed using a contructor which takes ``org.nasdanika.common.Context`` and ``java.lang.String``, or just ``java.lang.String``.\n\nWhen implementation is specified, value is equivalent to an operation with a single String argument."
		   });
		addAnnotation
		  (getText_Text(),
		   source,
		   new String[] {
			   "documentation", "Textual representation of the value. If interpolate is ``true`` then the value is interpolated in the context. If type and implementation are empty value is returned as is. \nIf type is specified and the result is not of that type, then the result is converted to the type using the context converter service.\n"
		   });
		addAnnotation
		  (getText_Interpolate(),
		   source,
		   new String[] {
			   "documentation", "If ``true`` (default) the value is interpolated."
		   });
		addAnnotation
		  (generatorAdapterEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for resource and content adapters."
		   });
		addAnnotation
		  (getGeneratorAdapter_Factory(),
		   source,
		   new String[] {
			   "documentation", "Id of a named factory. The factory shall be for ${javadoc/org.nasdanika.common.SupplierFactory} type for content generators and of ${javadoc/org.nasdanika.common.ConsumerFactory} for resource generators. \nIn the resource adapter consumer is passed in instance of ${javadoc/org.nasdanika.common.resources.Container} for manipulation with container resources."
		   });
		addAnnotation
		  (resourceGeneratorAdapterEClass,
		   source,
		   new String[] {
			   "documentation", "Adapter generating resources."
		   });
		addAnnotation
		  (contentGeneratorAdapterEClass,
		   source,
		   new String[] {
			   "documentation", "Adapter generating file content."
		   });
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
