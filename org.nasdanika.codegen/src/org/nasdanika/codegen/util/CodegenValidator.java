/**
 */
package org.nasdanika.codegen.util;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.CodeGenPlugin;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.nasdanika.codegen.*;
import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.Folder;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.JETEmitter;
import org.nasdanika.codegen.JavaFilter;
import org.nasdanika.codegen.JavaGenerator;
import org.nasdanika.codegen.JavaStreamFilter;
import org.nasdanika.codegen.JavaStreamGenerator;
import org.nasdanika.codegen.JavaTextFilter;
import org.nasdanika.codegen.JavaTextGenerator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.Nature;
import org.nasdanika.codegen.Project;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.ResourceReference;
import org.nasdanika.codegen.ScriptedFilter;
import org.nasdanika.codegen.ScriptedGenerator;
import org.nasdanika.codegen.ScriptedStreamFilter;
import org.nasdanika.codegen.ScriptedStreamGenerator;
import org.nasdanika.codegen.ScriptedTextFilter;
import org.nasdanika.codegen.ScriptedTextGenerator;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.StreamContentReference;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.codegen.WorkFactory;
import org.nasdanika.codegen.Workspace;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.config.Context;
import org.nasdanika.config.Provider;
import org.nasdanika.config.util.ConfigValidator;

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigValidator configValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenValidator() {
		super();
		configValidator = ConfigValidator.INSTANCE;
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
	 * @generated NOT
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (value instanceof EObject) {
			org.eclipse.emf.ecore.resource.Resource resource = ((EObject) value).eResource();
			if (resource != null) {
				IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resource.getURI().toPlatformString(true)));
				if (modelFile.exists()) {
					IProject project = modelFile.getProject();
					if (project.exists()) {
						try {
							IProjectNature javaNature = project.getNature(JavaCore.NATURE_ID);
							if (javaNature instanceof IJavaProject) {
								context.put(ClassLoader.class, new JavaProjectClassLoader(getClass().getClassLoader(), (IJavaProject) javaNature));
							}
						} catch (Exception e) {
							CodeGenPlugin.getPlugin().log(e);
						}
					}
				}
			}
		}
		
		// TODO - inject project class loader into context if not there yet.
		return validateGen(classifierID, value, diagnostics, context);
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
			case CodegenPackage.NAMED_GENERATOR:
				return validateNamedGenerator((NamedGenerator)value, diagnostics, context);
			case CodegenPackage.GROUP:
				return validateGroup((Group<?>)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GROUP:
				return validateResourceGroup((ResourceGroup)value, diagnostics, context);
			case CodegenPackage.RESOURCE_GENERATOR:
				return validateResourceGenerator((ResourceGenerator<?>)value, diagnostics, context);
			case CodegenPackage.WORKSPACE:
				return validateWorkspace((Workspace)value, diagnostics, context);
			case CodegenPackage.FOLDER:
				return validateFolder((Folder)value, diagnostics, context);
			case CodegenPackage.NATURE:
				return validateNature((Nature)value, diagnostics, context);
			case CodegenPackage.FILE:
				return validateFile((File<?>)value, diagnostics, context);
			case CodegenPackage.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case CodegenPackage.RESOURCE:
				return validateResource((Resource<?>)value, diagnostics, context);
			case CodegenPackage.BINARY_FILE:
				return validateBinaryFile((BinaryFile)value, diagnostics, context);
			case CodegenPackage.TEXT_FILE:
				return validateTextFile((TextFile)value, diagnostics, context);
			case CodegenPackage.RESOURCE_REFERENCE:
				return validateResourceReference((ResourceReference)value, diagnostics, context);
			case CodegenPackage.STATIC_TEXT:
				return validateStaticText((StaticText)value, diagnostics, context);
			case CodegenPackage.CONTENT_REFERENCE:
				return validateContentReference((ContentReference<?>)value, diagnostics, context);
			case CodegenPackage.FILTER:
				return validateFilter((Filter<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_GENERATOR:
				return validateJavaGenerator((JavaGenerator<?>)value, diagnostics, context);
			case CodegenPackage.INTERPOLATOR:
				return validateInterpolator((Interpolator)value, diagnostics, context);
			case CodegenPackage.JET_EMITTER:
				return validateJETEmitter((JETEmitter)value, diagnostics, context);
			case CodegenPackage.JAVA_FILTER:
				return validateJavaFilter((JavaFilter<?>)value, diagnostics, context);
			case CodegenPackage.PROVIDER:
				return validateProvider((Provider<?>)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_FILTER:
				return validateJavaTextFilter((JavaTextFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_FILTER:
				return validateJavaStreamFilter((JavaStreamFilter)value, diagnostics, context);
			case CodegenPackage.JAVA_TEXT_GENERATOR:
				return validateJavaTextGenerator((JavaTextGenerator)value, diagnostics, context);
			case CodegenPackage.JAVA_STREAM_GENERATOR:
				return validateJavaStreamGenerator((JavaStreamGenerator)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_GENERATOR:
				return validateScriptedGenerator((ScriptedGenerator<?>)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_TEXT_GENERATOR:
				return validateScriptedTextGenerator((ScriptedTextGenerator)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_STREAM_GENERATOR:
				return validateScriptedStreamGenerator((ScriptedStreamGenerator)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_FILTER:
				return validateScriptedFilter((ScriptedFilter<?>)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_TEXT_FILTER:
				return validateScriptedTextFilter((ScriptedTextFilter)value, diagnostics, context);
			case CodegenPackage.SCRIPTED_STREAM_FILTER:
				return validateScriptedStreamFilter((ScriptedStreamFilter)value, diagnostics, context);
			case CodegenPackage.TEXT_CONTENT_REFERENCE:
				return validateTextContentReference((TextContentReference)value, diagnostics, context);
			case CodegenPackage.STREAM_CONTENT_REFERENCE:
				return validateStreamContentReference((StreamContentReference)value, diagnostics, context);
			case CodegenPackage.ZIP_ARCHIVE:
				return validateZipArchive((ZipArchive)value, diagnostics, context);
			case CodegenPackage.MUSTACHE:
				return validateMustache((Mustache)value, diagnostics, context);
			case CodegenPackage.RECONCILE_ACTION:
				return validateReconcileAction((ReconcileAction)value, diagnostics, context);
			case CodegenPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case CodegenPackage.INPUT_STREAM:
				return validateInputStream((InputStream)value, diagnostics, context);
			case CodegenPackage.VOID:
				return validateVoid((Void)value, diagnostics, context);
			case CodegenPackage.IFILE:
				return validateIFile((IFile)value, diagnostics, context);
			case CodegenPackage.IFOLDER:
				return validateIFolder((IFolder)value, diagnostics, context);
			case CodegenPackage.IPROJECT:
				return validateIProject((IProject)value, diagnostics, context);
			case CodegenPackage.IPROJECT_NATURE:
				return validateIProjectNature((IProjectNature)value, diagnostics, context);
			case CodegenPackage.IWORKSPACE_ROOT:
				return validateIWorkspaceRoot((IWorkspaceRoot)value, diagnostics, context);
			case CodegenPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			case CodegenPackage.IRESOURCE:
				return validateIResource((IResource)value, diagnostics, context);
			case CodegenPackage.LIST:
				return validateList((List<?>)value, diagnostics, context);
			case CodegenPackage.MERGER:
				return validateMerger((Merger<?>)value, diagnostics, context);
			case CodegenPackage.SUB_MONITOR:
				return validateSubMonitor((SubMonitor)value, diagnostics, context);
			case CodegenPackage.ICONTAINER:
				return validateIContainer((IContainer)value, diagnostics, context);
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
		if (!validate_NoCircularContainment((EObject)generator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)generator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)generator, diagnostics, context);
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
	public boolean validateNamedGenerator(NamedGenerator namedGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)namedGenerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group<?> group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)group, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)group, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(group, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceGroup(ResourceGroup resourceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)resourceGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)resourceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceGenerator(ResourceGenerator<?> resourceGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)resourceGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)resourceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkspace(Workspace workspace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)workspace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)workspace, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(workspace, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolder(Folder folder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)folder, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)folder, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(folder, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNature(Nature nature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)nature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)nature, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(nature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File<?> file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)file, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)file, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(file, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)project, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)project, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(project, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource<?> resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryFile(BinaryFile binaryFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)binaryFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)binaryFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(binaryFile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFile(TextFile textFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)textFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)textFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textFile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceReference(ResourceReference resourceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)resourceReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)resourceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(resourceReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticText(StaticText staticText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)staticText, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)staticText, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(staticText, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentReference(ContentReference<?> contentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)contentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)contentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(contentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter<?> filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)filter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)filter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(filter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaGenerator(JavaGenerator<?> javaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolator(Interpolator interpolator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)interpolator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)interpolator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(interpolator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJETEmitter(JETEmitter jetEmitter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)jetEmitter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)jetEmitter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(jetEmitter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaFilter(JavaFilter<?> javaFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider<?> provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTextFilter(JavaTextFilter javaTextFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaTextFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaTextFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaStreamFilter(JavaStreamFilter javaStreamFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaStreamFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaStreamFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTextGenerator(JavaTextGenerator javaTextGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaTextGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaTextGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaStreamGenerator(JavaStreamGenerator javaStreamGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)javaStreamGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)javaStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(javaStreamGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedGenerator(ScriptedGenerator<?> scriptedGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedTextGenerator(ScriptedTextGenerator scriptedTextGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedTextGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedTextGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedTextGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedStreamGenerator(ScriptedStreamGenerator scriptedStreamGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedStreamGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedStreamGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedStreamGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedFilter(ScriptedFilter<?> scriptedFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedTextFilter(ScriptedTextFilter scriptedTextFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedTextFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedTextFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedTextFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptedStreamFilter(ScriptedStreamFilter scriptedStreamFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scriptedStreamFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scriptedStreamFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(scriptedStreamFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextContentReference(TextContentReference textContentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)textContentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)textContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(textContentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamContentReference(StreamContentReference streamContentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)streamContentReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)streamContentReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(streamContentReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipArchive(ZipArchive zipArchive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)zipArchive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)zipArchive, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenerator_validate(zipArchive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustache(Mustache mustache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)mustache, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)mustache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)mustache, diagnostics, context);
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
	public boolean validateInputStream(InputStream inputStream, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateIFile(IFile iFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIFolder(IFolder iFolder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProject(IProject iProject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProjectNature(IProjectNature iProjectNature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIWorkspaceRoot(IWorkspaceRoot iWorkspaceRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateIResource(IResource iResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubMonitor(SubMonitor subMonitor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIContainer(IContainer iContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
