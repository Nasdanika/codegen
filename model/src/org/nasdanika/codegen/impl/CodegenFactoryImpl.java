/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.codegen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodegenFactoryImpl extends EFactoryImpl implements CodegenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodegenFactory init() {
		try {
			CodegenFactory theCodegenFactory = (CodegenFactory)EPackage.Registry.INSTANCE.getEFactory(CodegenPackage.eNS_URI);
			if (theCodegenFactory != null) {
				return theCodegenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodegenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodegenPackage.FILE: return createFile();
			case CodegenPackage.CONTAINER: return createContainer();
			case CodegenPackage.RESOURCE_GROUP: return createResourceGroup();
			case CodegenPackage.CONTENT_GROUP: return createContentGroup();
			case CodegenPackage.FREE_MARKER_GENERATOR: return createFreeMarkerGenerator();
			case CodegenPackage.CONTENT_REFERENCE: return createContentReference();
			case CodegenPackage.INTERPOLATOR: return createInterpolator();
			case CodegenPackage.MUSTACHE: return createMustache();
			case CodegenPackage.ZIP_ARCHIVE: return createZipArchive();
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE: return createResourceGeneratorReference();
			case CodegenPackage.CONTENT_GENERATOR_REFERENCE: return createContentGeneratorReference();
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION: return createBundleResourceCollection();
			case CodegenPackage.ZIP_RESOURCE_COLLECTION: return createZipResourceCollection();
			case CodegenPackage.HTTP_CALL: return createHttpCall();
			case CodegenPackage.TEXT: return createText();
			case CodegenPackage.RESOURCE_GENERATOR_ADAPTER: return createResourceGeneratorAdapter();
			case CodegenPackage.CONTENT_GENERATOR_ADAPTER: return createContentGeneratorAdapter();
			case CodegenPackage.RESOURCE_GENERATOR_LINK: return createResourceGeneratorLink();
			case CodegenPackage.CONTENT_GENERATOR_LINK: return createContentGeneratorLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CodegenPackage.RECONCILE_ACTION:
				return createReconcileActionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CodegenPackage.RECONCILE_ACTION:
				return convertReconcileActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.codegen.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGroup createResourceGroup() {
		ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentGroup createContentGroup() {
		ContentGroupImpl contentGroup = new ContentGroupImpl();
		return contentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeMarkerGenerator createFreeMarkerGenerator() {
		FreeMarkerGeneratorImpl freeMarkerGenerator = new FreeMarkerGeneratorImpl();
		return freeMarkerGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentReference createContentReference() {
		ContentReferenceImpl contentReference = new ContentReferenceImpl();
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interpolator createInterpolator() {
		InterpolatorImpl interpolator = new InterpolatorImpl();
		return interpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mustache createMustache() {
		MustacheImpl mustache = new MustacheImpl();
		return mustache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipArchive createZipArchive() {
		ZipArchiveImpl zipArchive = new ZipArchiveImpl();
		return zipArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGeneratorReference createResourceGeneratorReference() {
		ResourceGeneratorReferenceImpl resourceGeneratorReference = new ResourceGeneratorReferenceImpl();
		return resourceGeneratorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentGeneratorReference createContentGeneratorReference() {
		ContentGeneratorReferenceImpl contentGeneratorReference = new ContentGeneratorReferenceImpl();
		return contentGeneratorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleResourceCollection createBundleResourceCollection() {
		BundleResourceCollectionImpl bundleResourceCollection = new BundleResourceCollectionImpl();
		return bundleResourceCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipResourceCollection createZipResourceCollection() {
		ZipResourceCollectionImpl zipResourceCollection = new ZipResourceCollectionImpl();
		return zipResourceCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpCall createHttpCall() {
		HttpCallImpl httpCall = new HttpCallImpl();
		return httpCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGeneratorAdapter createResourceGeneratorAdapter() {
		ResourceGeneratorAdapterImpl resourceGeneratorAdapter = new ResourceGeneratorAdapterImpl();
		return resourceGeneratorAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentGeneratorAdapter createContentGeneratorAdapter() {
		ContentGeneratorAdapterImpl contentGeneratorAdapter = new ContentGeneratorAdapterImpl();
		return contentGeneratorAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGeneratorLink createResourceGeneratorLink() {
		ResourceGeneratorLinkImpl resourceGeneratorLink = new ResourceGeneratorLinkImpl();
		return resourceGeneratorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentGeneratorLink createContentGeneratorLink() {
		ContentGeneratorLinkImpl contentGeneratorLink = new ContentGeneratorLinkImpl();
		return contentGeneratorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconcileAction createReconcileActionFromString(EDataType eDataType, String initialValue) {
		ReconcileAction result = ReconcileAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconcileActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodegenPackage getCodegenPackage() {
		return (CodegenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodegenPackage getPackage() {
		return CodegenPackage.eINSTANCE;
	}

} //CodegenFactoryImpl
