/**
 */
package org.nasdanika.codegen.util;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.*;
import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Container;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.Converter;
import org.nasdanika.codegen.ECoreModelGenerator;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.FreeMarkerTemplateLoaderType;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorReference;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.JavaFilter;
import org.nasdanika.codegen.JavaGenerator;
import org.nasdanika.codegen.JavaResourceGenerator;
import org.nasdanika.codegen.JavaStreamFilter;
import org.nasdanika.codegen.JavaStreamGenerator;
import org.nasdanika.codegen.JavaTextFilter;
import org.nasdanika.codegen.JavaTextGenerator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.Mustache;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
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
import org.nasdanika.common.WorkFactory;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.CodegenPackage
 * @generated
 */
public class CodegenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CodegenValidator INSTANCE = new CodegenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.codegen";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERATOR__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CodegenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CodegenPackage.WORK_FACTORY:
				return validateWorkFactory((WorkFactory<?>)value, diagnostics, context);
			case CodegenPackage.GENERATOR:
				return validateGenerator((Generator<?>)value, diagnostics, context);
			case CodegenPackage.ABSTRACT_NAMED_GENERATOR:
				return validateAbstractNamedGenerator((AbstractNamedGenerator)value, diagnostics, context);
			case CodegenPackage.NAMED_GENERATOR:
				return validateNamedGenerator((NamedGenerator)value, diagnostics, context);
			case CodegenPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case CodegenPackage.GROUP:
				return validateGroup((Group<?>)value, diagnostics, context);
			case CodegenPackage.RESOURCE:
				return validateResource((Resource<?>)value, diagnostics, context);
			case CodegenPackage.FILE:
				return validateFile((File<?>)value, diagnostics, context);
			case CodegenPackage.BINARY_FILE:
				return validateBinaryFile((BinaryFile)value, diagnostics, context);
			case CodegenPackage.TEXT_FILE:
				return validateTextFile((TextFile)value, diagnostics, context);
			case CodegenPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GROUP:
				return validateResourceGroup((ResourceGroup)value, diagnostics, context);
			case CodegenPackage.STATIC_TEXT:
				return validateStaticText((StaticText)value, diagnostics, context);
			case CodegenPackage.STATIC_BYTES:
				return validateStaticBytes((StaticBytes)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_GENERATOR:
				return validateFreeMarkerGenerator((FreeMarkerGenerator)value, diagnostics, context);
			case CodegenPackage.ECORE_MODEL_GENERATOR:
				return validateECoreModelGenerator((ECoreModelGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_REFERENCE:
				return validateContentReference((ContentReference<?>)value, diagnostics, context);
			case CodegenPackage.CONVERTER:
				return validateConverter((Converter<?, ?>)value, diagnostics, context);
			case CodegenPackage.FILTER:
				return validateFilter((Filter<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_GENERATOR:
				return validateJavaGenerator((JavaGenerator<?>)value, diagnostics, context);
			case CodegenPackage.INTERPOLATOR:
				return validateInterpolator((Interpolator)value, diagnostics, context);
			case CodegenPackage.JAVA_FILTER:
				return validateJavaFilter((JavaFilter<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_FILTER:
				return validateJavaTextFilter((JavaTextFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_FILTER:
				return validateJavaStreamFilter((JavaStreamFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_GENERATOR:
				return validateJavaTextGenerator((JavaTextGenerator)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_GENERATOR:
				return validateJavaStreamGenerator((JavaStreamGenerator)value, diagnostics, context);
			case CodegenPackage.JAVA_RESOURCE_GENERATOR:
				return validateJavaResourceGenerator((JavaResourceGenerator)value, diagnostics, context);
			case CodegenPackage.TEXT_CONTENT_REFERENCE:
				return validateTextContentReference((TextContentReference)value, diagnostics, context);
			case CodegenPackage.STREAM_CONTENT_REFERENCE:
				return validateStreamContentReference((StreamContentReference)value, diagnostics, context);
			case CodegenPackage.MUSTACHE:
				return validateMustache((Mustache)value, diagnostics, context);
			case CodegenPackage.ZIP_ARCHIVE:
				return validateZipArchive((ZipArchive)value, diagnostics, context);
			case CodegenPackage.TEXT_GROUP:
				return validateTextGroup((TextGroup)value, diagnostics, context);
			case CodegenPackage.GENERATOR_REFERENCE:
				return validateGeneratorReference((GeneratorReference<?>)value, diagnostics, context);
			case CodegenPackage.TEXT_GENERATOR_REFERENCE:
				return validateTextGeneratorReference((TextGeneratorReference)value, diagnostics, context);
			case CodegenPackage.STREAM_GENERATOR_REFERENCE:
				return validateStreamGeneratorReference((StreamGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE:
				return validateResourceGeneratorReference((ResourceGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RECONCILE_ACTION:
				return validateReconcileAction((ReconcileAction)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_TEMPLATE_LOADER_TYPE:
				return validateFreeMarkerTemplateLoaderType((FreeMarkerTemplateLoaderType)value, diagnostics, context);
			case CodegenPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			case CodegenPackage.INPUT_STREAM:
				return validateInputStream((InputStream)value, diagnostics, context);
			case CodegenPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case CodegenPackage.BINARY_RESOURCE:
				return validateBinaryResource((BinaryResource)value, diagnostics, context);
			case CodegenPackage.BINARY_ENTITY:
				return validateBinaryEntity((BinaryEntity)value, diagnostics, context);
			case CodegenPackage.BINARY_ENTITY_CONTAINER:
				return validateBinaryEntityContainer((BinaryEntityContainer)value, diagnostics, context);
			case CodegenPackage.VOID:
				return validateVoid((Void)value, diagnostics, context);
			case CodegenPackage.LIST:
				return validateList((List<?>)value, diagnostics, context);
			case CodegenPackage.MERGER:
				return validateMerger((Merger<?>)value, diagnostics, context);
			default:
				return true;
		}
	}
	
	/**
	 * @generated
	 * @param classifierID
	 * @param value
	 * @param diagnostics
	 * @param context
	 * @return
	 */
	private boolean validateGen(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CodegenPackage.WORK_FACTORY:
				return validateWorkFactory((WorkFactory<?>)value, diagnostics, context);
			case CodegenPackage.GENERATOR:
				return validateGenerator((Generator<?>)value, diagnostics, context);
			case CodegenPackage.ABSTRACT_NAMED_GENERATOR:
				return validateAbstractNamedGenerator((AbstractNamedGenerator)value, diagnostics, context);
			case CodegenPackage.NAMED_GENERATOR:
				return validateNamedGenerator((NamedGenerator)value, diagnostics, context);
			case CodegenPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case CodegenPackage.GROUP:
				return validateGroup((Group<?>)value, diagnostics, context);
			case CodegenPackage.RESOURCE:
				return validateResource((Resource<?>)value, diagnostics, context);
			case CodegenPackage.FILE:
				return validateFile((File<?>)value, diagnostics, context);
			case CodegenPackage.BINARY_FILE:
				return validateBinaryFile((BinaryFile)value, diagnostics, context);
			case CodegenPackage.TEXT_FILE:
				return validateTextFile((TextFile)value, diagnostics, context);
			case CodegenPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GROUP:
				return validateResourceGroup((ResourceGroup)value, diagnostics, context);
			case CodegenPackage.STATIC_TEXT:
				return validateStaticText((StaticText)value, diagnostics, context);
			case CodegenPackage.STATIC_BYTES:
				return validateStaticBytes((StaticBytes)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_GENERATOR:
				return validateFreeMarkerGenerator((FreeMarkerGenerator)value, diagnostics, context);
			case CodegenPackage.ECORE_MODEL_GENERATOR:
				return validateECoreModelGenerator((ECoreModelGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_REFERENCE:
				return validateContentReference((ContentReference<?>)value, diagnostics, context);
			case CodegenPackage.CONVERTER:
				return validateConverter((Converter<?, ?>)value, diagnostics, context);
			case CodegenPackage.FILTER:
				return validateFilter((Filter<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_GENERATOR:
				return validateJavaGenerator((JavaGenerator<?>)value, diagnostics, context);
			case CodegenPackage.INTERPOLATOR:
				return validateInterpolator((Interpolator)value, diagnostics, context);
			case CodegenPackage.JAVA_FILTER:
				return validateJavaFilter((JavaFilter<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_FILTER:
				return validateJavaTextFilter((JavaTextFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_FILTER:
				return validateJavaStreamFilter((JavaStreamFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_GENERATOR:
				return validateJavaTextGenerator((JavaTextGenerator)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_GENERATOR:
				return validateJavaStreamGenerator((JavaStreamGenerator)value, diagnostics, context);
			case CodegenPackage.JAVA_RESOURCE_GENERATOR:
				return validateJavaResourceGenerator((JavaResourceGenerator)value, diagnostics, context);
			case CodegenPackage.TEXT_CONTENT_REFERENCE:
				return validateTextContentReference((TextContentReference)value, diagnostics, context);
			case CodegenPackage.STREAM_CONTENT_REFERENCE:
				return validateStreamContentReference((StreamContentReference)value, diagnostics, context);
			case CodegenPackage.MUSTACHE:
				return validateMustache((Mustache)value, diagnostics, context);
			case CodegenPackage.ZIP_ARCHIVE:
				return validateZipArchive((ZipArchive)value, diagnostics, context);
			case CodegenPackage.TEXT_GROUP:
				return validateTextGroup((TextGroup)value, diagnostics, context);
			case CodegenPackage.GENERATOR_REFERENCE:
				return validateGeneratorReference((GeneratorReference<?>)value, diagnostics, context);
			case CodegenPackage.TEXT_GENERATOR_REFERENCE:
				return validateTextGeneratorReference((TextGeneratorReference)value, diagnostics, context);
			case CodegenPackage.STREAM_GENERATOR_REFERENCE:
				return validateStreamGeneratorReference((StreamGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE:
				return validateResourceGeneratorReference((ResourceGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RECONCILE_ACTION:
				return validateReconcileAction((ReconcileAction)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_TEMPLATE_LOADER_TYPE:
				return validateFreeMarkerTemplateLoaderType((FreeMarkerTemplateLoaderType)value, diagnostics, context);
			case CodegenPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			case CodegenPackage.INPUT_STREAM:
				return validateInputStream((InputStream)value, diagnostics, context);
			case CodegenPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case CodegenPackage.BINARY_RESOURCE:
				return validateBinaryResource((BinaryResource)value, diagnostics, context);
			case CodegenPackage.BINARY_ENTITY:
				return validateBinaryEntity((BinaryEntity)value, diagnostics, context);
			case CodegenPackage.BINARY_ENTITY_CONTAINER:
				return validateBinaryEntityContainer((BinaryEntityContainer)value, diagnostics, context);
			case CodegenPackage.VOID:
				return validateVoid((Void)value, diagnostics, context);
			case CodegenPackage.LIST:
				return validateList((List<?>)value, diagnostics, context);
			case CodegenPackage.MERGER:
				return validateMerger((Merger<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFactory(WorkFactory<?> workFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)workFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerator(Generator<?> generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(generator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerator_validate(Generator<?> generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generator.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractNamedGenerator(AbstractNamedGenerator abstractNamedGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractNamedGenerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedGenerator(NamedGenerator namedGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedGenerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group<?> group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(group, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(group, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(group, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File<?> file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(file, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(file, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(file, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource<?> resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryFile(BinaryFile binaryFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binaryFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(binaryFile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFile(TextFile textFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textFile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(container, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceGroup(ResourceGroup resourceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticText(StaticText staticText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticText, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(staticText, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeMarkerGenerator(FreeMarkerGenerator freeMarkerGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(freeMarkerGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(freeMarkerGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(freeMarkerGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECoreModelGenerator(ECoreModelGenerator eCoreModelGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eCoreModelGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eCoreModelGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(eCoreModelGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentReference(ContentReference<?> contentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(contentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConverter(Converter<?, ?> converter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(converter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(converter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(converter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter<?> filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(filter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaGenerator(JavaGenerator<?> javaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolator(Interpolator interpolator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interpolator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(interpolator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaFilter(JavaFilter<?> javaFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTextFilter(JavaTextFilter javaTextFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaTextFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaTextFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaStreamFilter(JavaStreamFilter javaStreamFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaStreamFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaStreamFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTextGenerator(JavaTextGenerator javaTextGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaTextGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaTextGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaStreamGenerator(JavaStreamGenerator javaStreamGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaStreamGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaStreamGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceGenerator(JavaResourceGenerator javaResourceGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaResourceGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaResourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaResourceGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextContentReference(TextContentReference textContentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textContentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textContentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamContentReference(StreamContentReference streamContentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(streamContentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(streamContentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipArchive(ZipArchive zipArchive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zipArchive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(zipArchive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextGroup(TextGroup textGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorReference(GeneratorReference<?> generatorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generatorReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generatorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(generatorReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextGeneratorReference(TextGeneratorReference textGeneratorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textGeneratorReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textGeneratorReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamGeneratorReference(StreamGeneratorReference streamGeneratorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(streamGeneratorReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(streamGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(streamGeneratorReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceGeneratorReference(ResourceGeneratorReference resourceGeneratorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceGeneratorReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceGeneratorReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustache(Mustache mustache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mustache, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(mustache, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticBytes(StaticBytes staticBytes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticBytes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticBytes, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(staticBytes, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconcileAction(ReconcileAction reconcileAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeMarkerTemplateLoaderType(FreeMarkerTemplateLoaderType freeMarkerTemplateLoaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputStream(InputStream inputStream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryResource(BinaryResource binaryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEntity(BinaryEntity binaryEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEntityContainer(BinaryEntityContainer binaryEntityContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoid(Void void_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateException(Exception exception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List<?> list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerger(Merger<?> merger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CodegenValidator
