/**
 */
package org.nasdanika.codegen.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.*;

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
			case CodegenPackage.GENERATOR:
				return validateGenerator((Generator)value, diagnostics, context);
			case CodegenPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR:
				return validateResourceGenerator((ResourceGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_GENERATOR:
				return validateContentGenerator((ContentGenerator)value, diagnostics, context);
			case CodegenPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case CodegenPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case CodegenPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case CodegenPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GROUP:
				return validateResourceGroup((ResourceGroup)value, diagnostics, context);
			case CodegenPackage.CONTENT_GROUP:
				return validateContentGroup((ContentGroup)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_GENERATOR:
				return validateFreeMarkerGenerator((FreeMarkerGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_REFERENCE:
				return validateContentReference((ContentReference)value, diagnostics, context);
			case CodegenPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case CodegenPackage.INTERPOLATOR:
				return validateInterpolator((Interpolator)value, diagnostics, context);
			case CodegenPackage.MUSTACHE:
				return validateMustache((Mustache)value, diagnostics, context);
			case CodegenPackage.ZIP_ARCHIVE:
				return validateZipArchive((ZipArchive)value, diagnostics, context);
			case CodegenPackage.GENERATOR_REFERENCE:
				return validateGeneratorReference((GeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE:
				return validateResourceGeneratorReference((ResourceGeneratorReference)value, diagnostics, context);
			case CodegenPackage.CONTENT_GENERATOR_REFERENCE:
				return validateContentGeneratorReference((ContentGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_COLLECTION:
				return validateResourceCollection((ResourceCollection)value, diagnostics, context);
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION:
				return validateBundleResourceCollection((BundleResourceCollection)value, diagnostics, context);
			case CodegenPackage.ZIP_RESOURCE_COLLECTION:
				return validateZipResourceCollection((ZipResourceCollection)value, diagnostics, context);
			case CodegenPackage.HTTP_CALL:
				return validateHttpCall((HttpCall)value, diagnostics, context);
			case CodegenPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case CodegenPackage.RECONCILE_ACTION:
				return validateReconcileAction((ReconcileAction)value, diagnostics, context);
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
			case CodegenPackage.GENERATOR:
				return validateGenerator((Generator)value, diagnostics, context);
			case CodegenPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR:
				return validateResourceGenerator((ResourceGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_GENERATOR:
				return validateContentGenerator((ContentGenerator)value, diagnostics, context);
			case CodegenPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case CodegenPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case CodegenPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case CodegenPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GROUP:
				return validateResourceGroup((ResourceGroup)value, diagnostics, context);
			case CodegenPackage.CONTENT_GROUP:
				return validateContentGroup((ContentGroup)value, diagnostics, context);
			case CodegenPackage.FREE_MARKER_GENERATOR:
				return validateFreeMarkerGenerator((FreeMarkerGenerator)value, diagnostics, context);
			case CodegenPackage.CONTENT_REFERENCE:
				return validateContentReference((ContentReference)value, diagnostics, context);
			case CodegenPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case CodegenPackage.INTERPOLATOR:
				return validateInterpolator((Interpolator)value, diagnostics, context);
			case CodegenPackage.MUSTACHE:
				return validateMustache((Mustache)value, diagnostics, context);
			case CodegenPackage.ZIP_ARCHIVE:
				return validateZipArchive((ZipArchive)value, diagnostics, context);
			case CodegenPackage.GENERATOR_REFERENCE:
				return validateGeneratorReference((GeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE:
				return validateResourceGeneratorReference((ResourceGeneratorReference)value, diagnostics, context);
			case CodegenPackage.CONTENT_GENERATOR_REFERENCE:
				return validateContentGeneratorReference((ContentGeneratorReference)value, diagnostics, context);
			case CodegenPackage.RESOURCE_COLLECTION:
				return validateResourceCollection((ResourceCollection)value, diagnostics, context);
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION:
				return validateBundleResourceCollection((BundleResourceCollection)value, diagnostics, context);
			case CodegenPackage.ZIP_RESOURCE_COLLECTION:
				return validateZipResourceCollection((ZipResourceCollection)value, diagnostics, context);
			case CodegenPackage.HTTP_CALL:
				return validateHttpCall((HttpCall)value, diagnostics, context);
			case CodegenPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case CodegenPackage.RECONCILE_ACTION:
				return validateReconcileAction((ReconcileAction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerator(Generator generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateGenerator_validate(Generator generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generator.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateResourceGenerator(ResourceGenerator resourceGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentGenerator(ContentGenerator contentGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(contentGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceContainer(ResourceContainer resourceContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateContentGroup(ContentGroup contentGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(contentGroup, diagnostics, context);
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
	public boolean validateContentReference(ContentReference contentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateGeneratorReference(GeneratorReference generatorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateContentGeneratorReference(ContentGeneratorReference contentGeneratorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentGeneratorReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentGeneratorReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(contentGeneratorReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCollection(ResourceCollection resourceCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceCollection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResourceCollection(BundleResourceCollection bundleResourceCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bundleResourceCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bundleResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(bundleResourceCollection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipResourceCollection(ZipResourceCollection zipResourceCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zipResourceCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zipResourceCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(zipResourceCollection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpCall(HttpCall httpCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(httpCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(httpCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(httpCall, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(text, diagnostics, context);
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
	public boolean validateReconcileAction(ReconcileAction reconcileAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
