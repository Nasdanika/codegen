/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.codegen.*;
import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Configuration;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Folder;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.JETEmitter;
import org.nasdanika.codegen.JavaStreamFilter;
import org.nasdanika.codegen.JavaStreamGenerator;
import org.nasdanika.codegen.JavaTextFilter;
import org.nasdanika.codegen.JavaTextGenerator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.NamedConfigurationItem;
import org.nasdanika.codegen.Project;
import org.nasdanika.codegen.Property;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.ResourceReference;
import org.nasdanika.codegen.ScriptedStreamFilter;
import org.nasdanika.codegen.ScriptedStreamGenerator;
import org.nasdanika.codegen.ScriptedTextFilter;
import org.nasdanika.codegen.ScriptedTextGenerator;
import org.nasdanika.codegen.Service;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.StreamContentReference;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.codegen.Workspace;

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
			case CodegenPackage.CONFIGURATION: return (EObject)createConfiguration();
			case CodegenPackage.SERVICE: return (EObject)createService();
			case CodegenPackage.PROPERTY: return (EObject)createProperty();
			case CodegenPackage.GROUP: return (EObject)createGroup();
			case CodegenPackage.RESOURCE_GROUP: return (EObject)createResourceGroup();
			case CodegenPackage.WORKSPACE: return (EObject)createWorkspace();
			case CodegenPackage.FOLDER: return (EObject)createFolder();
			case CodegenPackage.PROJECT: return (EObject)createProject();
			case CodegenPackage.BINARY_FILE: return (EObject)createBinaryFile();
			case CodegenPackage.TEXT_FILE: return (EObject)createTextFile();
			case CodegenPackage.RESOURCE_REFERENCE: return (EObject)createResourceReference();
			case CodegenPackage.STATIC_TEXT: return (EObject)createStaticText();
			case CodegenPackage.INTERPOLATOR: return (EObject)createInterpolator();
			case CodegenPackage.JET_EMITTER: return (EObject)createJETEmitter();
			case CodegenPackage.JAVA_TEXT_FILTER: return (EObject)createJavaTextFilter();
			case CodegenPackage.JAVA_STREAM_FILTER: return (EObject)createJavaStreamFilter();
			case CodegenPackage.JAVA_TEXT_GENERATOR: return (EObject)createJavaTextGenerator();
			case CodegenPackage.JAVA_STREAM_GENERATOR: return (EObject)createJavaStreamGenerator();
			case CodegenPackage.NAMED_CONFIGURATION_ITEM: return (EObject)createNamedConfigurationItem();
			case CodegenPackage.SCRIPTED_TEXT_GENERATOR: return (EObject)createScriptedTextGenerator();
			case CodegenPackage.SCRIPTED_STREAM_GENERATOR: return (EObject)createScriptedStreamGenerator();
			case CodegenPackage.SCRIPTED_TEXT_FILTER: return (EObject)createScriptedTextFilter();
			case CodegenPackage.SCRIPTED_STREAM_FILTER: return (EObject)createScriptedStreamFilter();
			case CodegenPackage.TEXT_CONTENT_REFERENCE: return (EObject)createTextContentReference();
			case CodegenPackage.STREAM_CONTENT_REFERENCE: return (EObject)createStreamContentReference();
			case CodegenPackage.ZIP_ARCHIVE: return (EObject)createZipArchive();
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
			case CodegenPackage.CONTEXT:
				return createContextFromString(eDataType, initialValue);
			case CodegenPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case CodegenPackage.VOID:
				return createVoidFromString(eDataType, initialValue);
			case CodegenPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case CodegenPackage.IFOLDER:
				return createIFolderFromString(eDataType, initialValue);
			case CodegenPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case CodegenPackage.IPROJECT_NATURE:
				return createIProjectNatureFromString(eDataType, initialValue);
			case CodegenPackage.IWORKSPACE_ROOT:
				return createIWorkspaceRootFromString(eDataType, initialValue);
			case CodegenPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case CodegenPackage.IRESOURCE:
				return createIResourceFromString(eDataType, initialValue);
			case CodegenPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case CodegenPackage.MERGER:
				return createMergerFromString(eDataType, initialValue);
			case CodegenPackage.SUB_MONITOR:
				return createSubMonitorFromString(eDataType, initialValue);
			case CodegenPackage.ICONTAINER:
				return createIContainerFromString(eDataType, initialValue);
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
			case CodegenPackage.CONTEXT:
				return convertContextToString(eDataType, instanceValue);
			case CodegenPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case CodegenPackage.VOID:
				return convertVoidToString(eDataType, instanceValue);
			case CodegenPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case CodegenPackage.IFOLDER:
				return convertIFolderToString(eDataType, instanceValue);
			case CodegenPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case CodegenPackage.IPROJECT_NATURE:
				return convertIProjectNatureToString(eDataType, instanceValue);
			case CodegenPackage.IWORKSPACE_ROOT:
				return convertIWorkspaceRootToString(eDataType, instanceValue);
			case CodegenPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case CodegenPackage.IRESOURCE:
				return convertIResourceToString(eDataType, instanceValue);
			case CodegenPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case CodegenPackage.MERGER:
				return convertMergerToString(eDataType, instanceValue);
			case CodegenPackage.SUB_MONITOR:
				return convertSubMonitorToString(eDataType, instanceValue);
			case CodegenPackage.ICONTAINER:
				return convertIContainerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> Group<T> createGroup() {
		GroupImpl<T> group = new GroupImpl<T>();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroup createResourceGroup() {
		ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFile createBinaryFile() {
		BinaryFileImpl binaryFile = new BinaryFileImpl();
		return binaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFile createTextFile() {
		TextFileImpl textFile = new TextFileImpl();
		return textFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReference createResourceReference() {
		ResourceReferenceImpl resourceReference = new ResourceReferenceImpl();
		return resourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticText createStaticText() {
		StaticTextImpl staticText = new StaticTextImpl();
		return staticText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpolator createInterpolator() {
		InterpolatorImpl interpolator = new InterpolatorImpl();
		return interpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JETEmitter createJETEmitter() {
		JETEmitterImpl jetEmitter = new JETEmitterImpl();
		return jetEmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTextFilter createJavaTextFilter() {
		JavaTextFilterImpl javaTextFilter = new JavaTextFilterImpl();
		return javaTextFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaStreamFilter createJavaStreamFilter() {
		JavaStreamFilterImpl javaStreamFilter = new JavaStreamFilterImpl();
		return javaStreamFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTextGenerator createJavaTextGenerator() {
		JavaTextGeneratorImpl javaTextGenerator = new JavaTextGeneratorImpl();
		return javaTextGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaStreamGenerator createJavaStreamGenerator() {
		JavaStreamGeneratorImpl javaStreamGenerator = new JavaStreamGeneratorImpl();
		return javaStreamGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedConfigurationItem createNamedConfigurationItem() {
		NamedConfigurationItemImpl namedConfigurationItem = new NamedConfigurationItemImpl();
		return namedConfigurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptedTextGenerator createScriptedTextGenerator() {
		ScriptedTextGeneratorImpl scriptedTextGenerator = new ScriptedTextGeneratorImpl();
		return scriptedTextGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptedStreamGenerator createScriptedStreamGenerator() {
		ScriptedStreamGeneratorImpl scriptedStreamGenerator = new ScriptedStreamGeneratorImpl();
		return scriptedStreamGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptedTextFilter createScriptedTextFilter() {
		ScriptedTextFilterImpl scriptedTextFilter = new ScriptedTextFilterImpl();
		return scriptedTextFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptedStreamFilter createScriptedStreamFilter() {
		ScriptedStreamFilterImpl scriptedStreamFilter = new ScriptedStreamFilterImpl();
		return scriptedStreamFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextContentReference createTextContentReference() {
		TextContentReferenceImpl textContentReference = new TextContentReferenceImpl();
		return textContentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamContentReference createStreamContentReference() {
		StreamContentReferenceImpl streamContentReference = new StreamContentReferenceImpl();
		return streamContentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZipArchive createZipArchive() {
		ZipArchiveImpl zipArchive = new ZipArchiveImpl();
		return zipArchive;
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
	public IFile createIFileFromString(EDataType eDataType, String initialValue) {
		return (IFile)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFolder createIFolderFromString(EDataType eDataType, String initialValue) {
		return (IFolder)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProjectNature createIProjectNatureFromString(EDataType eDataType, String initialValue) {
		return (IProjectNature)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectNatureToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWorkspaceRoot createIWorkspaceRootFromString(EDataType eDataType, String initialValue) {
		return (IWorkspaceRoot)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIWorkspaceRootToString(EDataType eDataType, Object instanceValue) {
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
	public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
		return (IResource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
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
	public SubMonitor createSubMonitorFromString(EDataType eDataType, String initialValue) {
		return (SubMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer createIContainerFromString(EDataType eDataType, String initialValue) {
		return (IContainer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
