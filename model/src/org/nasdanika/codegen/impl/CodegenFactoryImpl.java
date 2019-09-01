/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ECoreModelGenerator;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.FreeMarkerTemplateLoaderType;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.JavaResourceGenerator;
import org.nasdanika.codegen.JavaStreamFilter;
import org.nasdanika.codegen.JavaStreamGenerator;
import org.nasdanika.codegen.JavaTextFilter;
import org.nasdanika.codegen.JavaTextGenerator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.Mustache;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.StaticBytes;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.StreamContentReference;
import org.nasdanika.codegen.StreamGeneratorReference;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.codegen.TextGeneratorReference;
import org.nasdanika.codegen.TextGroup;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryContainer;

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
			case CodegenPackage.NAMED_GENERATOR: return createNamedGenerator();
			case CodegenPackage.BINARY_FILE: return createBinaryFile();
			case CodegenPackage.TEXT_FILE: return createTextFile();
			case CodegenPackage.CONTAINER: return createContainer();
			case CodegenPackage.RESOURCE_GROUP: return createResourceGroup();
			case CodegenPackage.STATIC_TEXT: return createStaticText();
			case CodegenPackage.STATIC_BYTES: return createStaticBytes();
			case CodegenPackage.FREE_MARKER_GENERATOR: return createFreeMarkerGenerator();
			case CodegenPackage.ECORE_MODEL_GENERATOR: return createECoreModelGenerator();
			case CodegenPackage.INTERPOLATOR: return createInterpolator();
			case CodegenPackage.JAVA_TEXT_FILTER: return createJavaTextFilter();
			case CodegenPackage.JAVA_STREAM_FILTER: return createJavaStreamFilter();
			case CodegenPackage.JAVA_TEXT_GENERATOR: return createJavaTextGenerator();
			case CodegenPackage.JAVA_STREAM_GENERATOR: return createJavaStreamGenerator();
			case CodegenPackage.JAVA_RESOURCE_GENERATOR: return createJavaResourceGenerator();
			case CodegenPackage.TEXT_CONTENT_REFERENCE: return createTextContentReference();
			case CodegenPackage.STREAM_CONTENT_REFERENCE: return createStreamContentReference();
			case CodegenPackage.MUSTACHE: return createMustache();
			case CodegenPackage.ZIP_ARCHIVE: return createZipArchive();
			case CodegenPackage.TEXT_GROUP: return createTextGroup();
			case CodegenPackage.TEXT_GENERATOR_REFERENCE: return createTextGeneratorReference();
			case CodegenPackage.STREAM_GENERATOR_REFERENCE: return createStreamGeneratorReference();
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE: return createResourceGeneratorReference();
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
			case CodegenPackage.FREE_MARKER_TEMPLATE_LOADER_TYPE:
				return createFreeMarkerTemplateLoaderTypeFromString(eDataType, initialValue);
			case CodegenPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case CodegenPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case CodegenPackage.CONTEXT:
				return createContextFromString(eDataType, initialValue);
			case CodegenPackage.BINARY_CONTAINER:
				return createBinaryContainerFromString(eDataType, initialValue);
			case CodegenPackage.VOID:
				return createVoidFromString(eDataType, initialValue);
			case CodegenPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case CodegenPackage.MERGER:
				return createMergerFromString(eDataType, initialValue);
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
			case CodegenPackage.FREE_MARKER_TEMPLATE_LOADER_TYPE:
				return convertFreeMarkerTemplateLoaderTypeToString(eDataType, instanceValue);
			case CodegenPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case CodegenPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case CodegenPackage.CONTEXT:
				return convertContextToString(eDataType, instanceValue);
			case CodegenPackage.BINARY_CONTAINER:
				return convertBinaryContainerToString(eDataType, instanceValue);
			case CodegenPackage.VOID:
				return convertVoidToString(eDataType, instanceValue);
			case CodegenPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case CodegenPackage.MERGER:
				return convertMergerToString(eDataType, instanceValue);
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
	public NamedGenerator createNamedGenerator() {
		NamedGeneratorImpl namedGenerator = new NamedGeneratorImpl();
		return namedGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryFile createBinaryFile() {
		BinaryFileImpl binaryFile = new BinaryFileImpl();
		return binaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextFile createTextFile() {
		TextFileImpl textFile = new TextFileImpl();
		return textFile;
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
	public StaticText createStaticText() {
		StaticTextImpl staticText = new StaticTextImpl();
		return staticText;
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
	public ECoreModelGenerator createECoreModelGenerator() {
		ECoreModelGeneratorImpl eCoreModelGenerator = new ECoreModelGeneratorImpl();
		return eCoreModelGenerator;
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
	public JavaTextFilter createJavaTextFilter() {
		JavaTextFilterImpl javaTextFilter = new JavaTextFilterImpl();
		return javaTextFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaStreamFilter createJavaStreamFilter() {
		JavaStreamFilterImpl javaStreamFilter = new JavaStreamFilterImpl();
		return javaStreamFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaTextGenerator createJavaTextGenerator() {
		JavaTextGeneratorImpl javaTextGenerator = new JavaTextGeneratorImpl();
		return javaTextGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaStreamGenerator createJavaStreamGenerator() {
		JavaStreamGeneratorImpl javaStreamGenerator = new JavaStreamGeneratorImpl();
		return javaStreamGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaResourceGenerator createJavaResourceGenerator() {
		JavaResourceGeneratorImpl javaResourceGenerator = new JavaResourceGeneratorImpl();
		return javaResourceGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextContentReference createTextContentReference() {
		TextContentReferenceImpl textContentReference = new TextContentReferenceImpl();
		return textContentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamContentReference createStreamContentReference() {
		StreamContentReferenceImpl streamContentReference = new StreamContentReferenceImpl();
		return streamContentReference;
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
	public TextGroup createTextGroup() {
		TextGroupImpl textGroup = new TextGroupImpl();
		return textGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextGeneratorReference createTextGeneratorReference() {
		TextGeneratorReferenceImpl textGeneratorReference = new TextGeneratorReferenceImpl();
		return textGeneratorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamGeneratorReference createStreamGeneratorReference() {
		StreamGeneratorReferenceImpl streamGeneratorReference = new StreamGeneratorReferenceImpl();
		return streamGeneratorReference;
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
	public StaticBytes createStaticBytes() {
		StaticBytesImpl staticBytes = new StaticBytesImpl();
		return staticBytes;
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
	public FreeMarkerTemplateLoaderType createFreeMarkerTemplateLoaderTypeFromString(EDataType eDataType, String initialValue) {
		FreeMarkerTemplateLoaderType result = FreeMarkerTemplateLoaderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeMarkerTemplateLoaderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContextFromString(EDataType eDataType, String initialValue) {
		return (Context)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryContainer createBinaryContainerFromString(EDataType eDataType, String initialValue) {
		return (BinaryContainer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Void createVoidFromString(EDataType eDataType, String initialValue) {
		return (Void)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoidToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merger<?> createMergerFromString(EDataType eDataType, String initialValue) {
		return (Merger<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
