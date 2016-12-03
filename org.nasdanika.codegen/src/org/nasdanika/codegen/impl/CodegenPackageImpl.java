/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Configuration;
import org.nasdanika.codegen.ConfigurationItem;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.Folder;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.WorkFactory;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.JETEmitter;
import org.nasdanika.codegen.JavaFilter;
import org.nasdanika.codegen.JavaGenerator;
import org.nasdanika.codegen.JavaStreamFilter;
import org.nasdanika.codegen.JavaStreamGenerator;
import org.nasdanika.codegen.JavaTextFilter;
import org.nasdanika.codegen.JavaTextGenerator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.NamedConfigurationItem;
import org.nasdanika.codegen.Nature;
import org.nasdanika.codegen.Project;
import org.nasdanika.codegen.Property;
import org.nasdanika.codegen.Provider;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ResourceReference;
import org.nasdanika.codegen.ScriptedFilter;
import org.nasdanika.codegen.ScriptedGenerator;
import org.nasdanika.codegen.ScriptedStreamFilter;
import org.nasdanika.codegen.ScriptedStreamGenerator;
import org.nasdanika.codegen.ScriptedTextFilter;
import org.nasdanika.codegen.ScriptedTextGenerator;
import org.nasdanika.codegen.Service;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.codegen.ValueConfigurationItem;
import org.nasdanika.codegen.Workspace;

import org.nasdanika.codegen.java.JavaPackage;

import org.nasdanika.codegen.java.impl.JavaPackageImpl;

import org.nasdanika.codegen.maven.MavenPackage;

import org.nasdanika.codegen.maven.impl.MavenPackageImpl;
import org.nasdanika.codegen.util.CodegenValidator;

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
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFactoryEClass = null;

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
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natureEClass = null;

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
	private EClass projectEClass = null;

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
	private EClass binaryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticTextEClass = null;

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
	private EClass javaGeneratorEClass = null;

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
	private EClass jetEmitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTextFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStreamFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTextGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStreamGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConfigurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedConfigurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedTextGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedStreamGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedTextFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedStreamFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconcileActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFolderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectNatureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iWorkspaceRootEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mergerEDataType = null;

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
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodegenPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		MavenPackageImpl theMavenPackage = (MavenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) instanceof MavenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI) : MavenPackage.eINSTANCE);

		// Create package meta-data objects
		theCodegenPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theMavenPackage.createPackageContents();

		// Initialize created meta-data
		theCodegenPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theMavenPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCodegenPackage, 
			 new EValidator.Descriptor() {
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
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Includes() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Configuration() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_DefaultIncludes() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_BaseURL() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ClassPath() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Include() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Description() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__CreateContext__Context() {
		return configurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__Validate__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationItem() {
		return configurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceType() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkFactory() {
		return workFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_Iterator() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Selector() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Elements() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceGenerator() {
		return resourceGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Children() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNature() {
		return natureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Merger() {
		return (EReference)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Generator() {
		return (EReference)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Natures() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Resources() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ReconcileAction() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ReconcileAction() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFile() {
		return binaryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFile() {
		return textFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReference() {
		return resourceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceReference_Target() {
		return (EReference)resourceReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticText() {
		return staticTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticText_Content() {
		return (EAttribute)staticTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentReference() {
		return contentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentReference_Ref() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Generator() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaGenerator() {
		return javaGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaGenerator_ClassName() {
		return (EAttribute)javaGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpolator() {
		return interpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJETEmitter() {
		return jetEmitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJETEmitter_TemplateURI() {
		return (EAttribute)jetEmitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaFilter() {
		return javaFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaFilter_ClassName() {
		return (EAttribute)javaFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTextFilter() {
		return javaTextFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStreamFilter() {
		return javaStreamFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTextGenerator() {
		return javaTextGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStreamGenerator() {
		return javaStreamGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConfigurationItem() {
		return valueConfigurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_ValueType() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Value() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Default() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Scripted() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedConfigurationItem() {
		return namedConfigurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedConfigurationItem_Name() {
		return (EAttribute)namedConfigurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedGenerator() {
		return scriptedGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptedGenerator_Script() {
		return (EAttribute)scriptedGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedTextGenerator() {
		return scriptedTextGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedStreamGenerator() {
		return scriptedStreamGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedFilter() {
		return scriptedFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptedFilter_Script() {
		return (EAttribute)scriptedFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedTextFilter() {
		return scriptedTextFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedStreamFilter() {
		return scriptedStreamFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReconcileAction() {
		return reconcileActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContext() {
		return contextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoid() {
		return voidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFolder() {
		return iFolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProjectNature() {
		return iProjectNatureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIWorkspaceRoot() {
		return iWorkspaceRootEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIResource() {
		return iResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMerger() {
		return mergerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__INCLUDES);
		createEReference(configurationEClass, CONFIGURATION__CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__DEFAULT_INCLUDES);
		createEAttribute(configurationEClass, CONFIGURATION__BASE_URL);
		createEAttribute(configurationEClass, CONFIGURATION__CLASS_PATH);
		createEReference(configurationEClass, CONFIGURATION__INCLUDE);
		createEAttribute(configurationEClass, CONFIGURATION__DESCRIPTION);
		createEOperation(configurationEClass, CONFIGURATION___CREATE_CONTEXT__CONTEXT);
		createEOperation(configurationEClass, CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP);

		configurationItemEClass = createEClass(CONFIGURATION_ITEM);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_TYPE);

		propertyEClass = createEClass(PROPERTY);

		workFactoryEClass = createEClass(WORK_FACTORY);

		generatorEClass = createEClass(GENERATOR);
		createEAttribute(generatorEClass, GENERATOR__ITERATOR);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__SELECTOR);
		createEReference(groupEClass, GROUP__ELEMENTS);

		resourceGeneratorEClass = createEClass(RESOURCE_GENERATOR);

		workspaceEClass = createEClass(WORKSPACE);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__CHILDREN);

		natureEClass = createEClass(NATURE);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__MERGER);
		createEReference(fileEClass, FILE__GENERATOR);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__NATURES);
		createEReference(projectEClass, PROJECT__RESOURCES);
		createEAttribute(projectEClass, PROJECT__RECONCILE_ACTION);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__RECONCILE_ACTION);

		binaryFileEClass = createEClass(BINARY_FILE);

		textFileEClass = createEClass(TEXT_FILE);

		resourceReferenceEClass = createEClass(RESOURCE_REFERENCE);
		createEReference(resourceReferenceEClass, RESOURCE_REFERENCE__TARGET);

		staticTextEClass = createEClass(STATIC_TEXT);
		createEAttribute(staticTextEClass, STATIC_TEXT__CONTENT);

		contentReferenceEClass = createEClass(CONTENT_REFERENCE);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__REF);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__GENERATOR);

		javaGeneratorEClass = createEClass(JAVA_GENERATOR);
		createEAttribute(javaGeneratorEClass, JAVA_GENERATOR__CLASS_NAME);

		interpolatorEClass = createEClass(INTERPOLATOR);

		jetEmitterEClass = createEClass(JET_EMITTER);
		createEAttribute(jetEmitterEClass, JET_EMITTER__TEMPLATE_URI);

		javaFilterEClass = createEClass(JAVA_FILTER);
		createEAttribute(javaFilterEClass, JAVA_FILTER__CLASS_NAME);

		providerEClass = createEClass(PROVIDER);

		javaTextFilterEClass = createEClass(JAVA_TEXT_FILTER);

		javaStreamFilterEClass = createEClass(JAVA_STREAM_FILTER);

		javaTextGeneratorEClass = createEClass(JAVA_TEXT_GENERATOR);

		javaStreamGeneratorEClass = createEClass(JAVA_STREAM_GENERATOR);

		valueConfigurationItemEClass = createEClass(VALUE_CONFIGURATION_ITEM);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__VALUE_TYPE);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__VALUE);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__DEFAULT);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__SCRIPTED);

		namedConfigurationItemEClass = createEClass(NAMED_CONFIGURATION_ITEM);
		createEAttribute(namedConfigurationItemEClass, NAMED_CONFIGURATION_ITEM__NAME);

		scriptedGeneratorEClass = createEClass(SCRIPTED_GENERATOR);
		createEAttribute(scriptedGeneratorEClass, SCRIPTED_GENERATOR__SCRIPT);

		scriptedTextGeneratorEClass = createEClass(SCRIPTED_TEXT_GENERATOR);

		scriptedStreamGeneratorEClass = createEClass(SCRIPTED_STREAM_GENERATOR);

		scriptedFilterEClass = createEClass(SCRIPTED_FILTER);
		createEAttribute(scriptedFilterEClass, SCRIPTED_FILTER__SCRIPT);

		scriptedTextFilterEClass = createEClass(SCRIPTED_TEXT_FILTER);

		scriptedStreamFilterEClass = createEClass(SCRIPTED_STREAM_FILTER);

		// Create enums
		reconcileActionEEnum = createEEnum(RECONCILE_ACTION);

		// Create data types
		contextEDataType = createEDataType(CONTEXT);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		voidEDataType = createEDataType(VOID);
		iFileEDataType = createEDataType(IFILE);
		iFolderEDataType = createEDataType(IFOLDER);
		iProjectEDataType = createEDataType(IPROJECT);
		iProjectNatureEDataType = createEDataType(IPROJECT_NATURE);
		iWorkspaceRootEDataType = createEDataType(IWORKSPACE_ROOT);
		exceptionEDataType = createEDataType(EXCEPTION);
		iResourceEDataType = createEDataType(IRESOURCE);
		listEDataType = createEDataType(LIST);
		mergerEDataType = createEDataType(MERGER);
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
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		MavenPackage theMavenPackage = (MavenPackage)EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theJavaPackage);
		getESubpackages().add(theMavenPackage);

		// Create type parameters
		addETypeParameter(workFactoryEClass, "T");
		ETypeParameter generatorEClass_T = addETypeParameter(generatorEClass, "T");
		ETypeParameter groupEClass_T = addETypeParameter(groupEClass, "T");
		ETypeParameter resourceGeneratorEClass_T = addETypeParameter(resourceGeneratorEClass, "T");
		ETypeParameter fileEClass_C = addETypeParameter(fileEClass, "C");
		ETypeParameter resourceEClass_T = addETypeParameter(resourceEClass, "T");
		ETypeParameter contentReferenceEClass_T = addETypeParameter(contentReferenceEClass, "T");
		ETypeParameter filterEClass_T = addETypeParameter(filterEClass, "T");
		ETypeParameter javaGeneratorEClass_T = addETypeParameter(javaGeneratorEClass, "T");
		ETypeParameter javaFilterEClass_T = addETypeParameter(javaFilterEClass, "T");
		addETypeParameter(providerEClass, "T");
		ETypeParameter scriptedGeneratorEClass_T = addETypeParameter(scriptedGeneratorEClass, "T");
		ETypeParameter scriptedFilterEClass_T = addETypeParameter(scriptedFilterEClass, "T");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(mergerEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getConfiguration());
		configurationItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProvider());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		configurationItemEClass.getEGenericSuperTypes().add(g1);
		serviceEClass.getESuperTypes().add(this.getValueConfigurationItem());
		propertyEClass.getESuperTypes().add(this.getValueConfigurationItem());
		propertyEClass.getESuperTypes().add(this.getNamedConfigurationItem());
		g1 = createEGenericType(this.getConfiguration());
		generatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getWorkFactory());
		g2 = createEGenericType(this.getList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(generatorEClass_T);
		g2.getETypeArguments().add(g3);
		generatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(groupEClass_T);
		g1.getETypeArguments().add(g2);
		groupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(resourceGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		resourceGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroup());
		g2 = createEGenericType(this.getIProject());
		g1.getETypeArguments().add(g2);
		workspaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIFolder());
		g1.getETypeArguments().add(g2);
		folderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(this.getIProjectNature());
		g1.getETypeArguments().add(g2);
		natureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIFile());
		g1.getETypeArguments().add(g2);
		fileEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceGenerator());
		g2 = createEGenericType(this.getIProject());
		g1.getETypeArguments().add(g2);
		projectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceGenerator());
		g2 = createEGenericType(resourceEClass_T);
		g1.getETypeArguments().add(g2);
		resourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFile());
		g2 = createEGenericType(this.getInputStream());
		g1.getETypeArguments().add(g2);
		binaryFileEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFile());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		textFileEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIResource());
		g1.getETypeArguments().add(g2);
		resourceReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		staticTextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(contentReferenceEClass_T);
		g1.getETypeArguments().add(g2);
		contentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(filterEClass_T);
		g1.getETypeArguments().add(g2);
		filterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(javaGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		javaGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFilter());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		interpolatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		jetEmitterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFilter());
		g2 = createEGenericType(javaFilterEClass_T);
		g1.getETypeArguments().add(g2);
		javaFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJavaFilter());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		javaTextFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJavaFilter());
		g2 = createEGenericType(this.getInputStream());
		g1.getETypeArguments().add(g2);
		javaStreamFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJavaGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		javaTextGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJavaGenerator());
		g2 = createEGenericType(this.getInputStream());
		g1.getETypeArguments().add(g2);
		javaStreamGeneratorEClass.getEGenericSuperTypes().add(g1);
		valueConfigurationItemEClass.getESuperTypes().add(this.getConfigurationItem());
		namedConfigurationItemEClass.getESuperTypes().add(this.getConfigurationItem());
		g1 = createEGenericType(this.getJavaGenerator());
		g2 = createEGenericType(scriptedGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		scriptedGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScriptedGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		scriptedTextGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScriptedGenerator());
		g2 = createEGenericType(this.getInputStream());
		g1.getETypeArguments().add(g2);
		scriptedStreamGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFilter());
		g2 = createEGenericType(scriptedFilterEClass_T);
		g1.getETypeArguments().add(g2);
		scriptedFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScriptedFilter());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		scriptedTextFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScriptedFilter());
		g2 = createEGenericType(this.getInputStream());
		g1.getETypeArguments().add(g2);
		scriptedStreamFilterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Includes(), ecorePackage.getEString(), "includes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Configuration(), this.getConfigurationItem(), null, "configuration", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_DefaultIncludes(), ecorePackage.getEString(), "defaultIncludes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ClassPath(), ecorePackage.getEString(), "classPath", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Include(), this.getConfiguration(), null, "include", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getConfiguration__CreateContext__Context(), this.getContext(), "createContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getConfiguration__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configurationItemEClass, ConfigurationItem.class, "ConfigurationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workFactoryEClass, WorkFactory.class, "WorkFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatorEClass, Generator.class, "Generator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerator_Iterator(), ecorePackage.getEString(), "iterator", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Selector(), ecorePackage.getEString(), "selector", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(groupEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getGroup_Elements(), g1, null, "elements", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceGeneratorEClass, ResourceGenerator.class, "ResourceGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIResource());
		g1.getETypeArguments().add(g2);
		initEReference(getFolder_Children(), g1, null, "children", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natureEClass, Nature.class, "Nature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Merger(), this.getService(), null, "merger", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(fileEClass_C);
		g1.getETypeArguments().add(g2);
		initEReference(getFile_Generator(), g1, null, "generator", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Natures(), this.getNature(), null, "natures", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIResource());
		g1.getETypeArguments().add(g2);
		initEReference(getProject_Resources(), g1, null, "resources", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ReconcileAction(), this.getReconcileAction(), "reconcileAction", "Append", 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ReconcileAction(), this.getReconcileAction(), "reconcileAction", "Append", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryFileEClass, BinaryFile.class, "BinaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFileEClass, TextFile.class, "TextFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceReferenceEClass, ResourceReference.class, "ResourceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(this.getIResource());
		g1.getETypeArguments().add(g2);
		initEReference(getResourceReference_Target(), g1, null, "target", null, 0, 1, ResourceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticTextEClass, StaticText.class, "StaticText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticText_Content(), ecorePackage.getEString(), "content", null, 0, 1, StaticText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentReferenceEClass, ContentReference.class, "ContentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentReference_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getGenerator());
		g2 = createEGenericType(filterEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getFilter_Generator(), g1, null, "generator", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaGeneratorEClass, JavaGenerator.class, "JavaGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaGenerator_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JavaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interpolatorEClass, Interpolator.class, "Interpolator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jetEmitterEClass, JETEmitter.class, "JETEmitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJETEmitter_TemplateURI(), ecorePackage.getEString(), "templateURI", null, 0, 1, JETEmitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaFilterEClass, JavaFilter.class, "JavaFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaFilter_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaTextFilterEClass, JavaTextFilter.class, "JavaTextFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStreamFilterEClass, JavaStreamFilter.class, "JavaStreamFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaTextGeneratorEClass, JavaTextGenerator.class, "JavaTextGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStreamGeneratorEClass, JavaStreamGenerator.class, "JavaStreamGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueConfigurationItemEClass, ValueConfigurationItem.class, "ValueConfigurationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueConfigurationItem_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Scripted(), ecorePackage.getEBoolean(), "scripted", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedConfigurationItemEClass, NamedConfigurationItem.class, "NamedConfigurationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedConfigurationItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptedGeneratorEClass, ScriptedGenerator.class, "ScriptedGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptedGenerator_Script(), ecorePackage.getEString(), "script", null, 0, 1, ScriptedGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptedTextGeneratorEClass, ScriptedTextGenerator.class, "ScriptedTextGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptedStreamGeneratorEClass, ScriptedStreamGenerator.class, "ScriptedStreamGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptedFilterEClass, ScriptedFilter.class, "ScriptedFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptedFilter_Script(), ecorePackage.getEString(), "script", null, 0, 1, ScriptedFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptedTextFilterEClass, ScriptedTextFilter.class, "ScriptedTextFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptedStreamFilterEClass, ScriptedStreamFilter.class, "ScriptedStreamFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(reconcileActionEEnum, ReconcileAction.class, "ReconcileAction");
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.KEEP);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.APPEND);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.MERGE);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.OVERWRITE);
		addEEnumLiteral(reconcileActionEEnum, ReconcileAction.CANCEL);

		// Initialize data types
		initEDataType(contextEDataType, Context.class, "Context", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voidEDataType, Void.class, "Void", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFolderEDataType, IFolder.class, "IFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectNatureEDataType, IProjectNature.class, "IProjectNature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iWorkspaceRootEDataType, IWorkspaceRoot.class, "IWorkspaceRoot", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iResourceEDataType, IResource.class, "IResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mergerEDataType, Merger.class, "Merger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
			 "documentation", "Code generation model."
		   });	
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Container of configuration items - properties and services.\r\nGenerators extend configuration. Configuration can also be defined in a standalone model to be provided as input to generators.\r\n"
		   });	
		addAnnotation
		  (getConfiguration__CreateContext__Context(), 
		   source, 
		   new String[] {
			 "documentation", "Creates ``org.nasdanika.codegen.Context`` which provides access to properties and services."
		   });	
		addAnnotation
		  ((getConfiguration__CreateContext__Context()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Parent context."
		   });	
		addAnnotation
		  (getConfiguration__Validate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "documentation", "Validates element for execution/generation. Adds messages to diagnostics and "
		   });	
		addAnnotation
		  ((getConfiguration__Validate__DiagnosticChain_Map()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Diagnostics to add validation messages to."
		   });	
		addAnnotation
		  ((getConfiguration__Validate__DiagnosticChain_Map()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Validation context."
		   });	
		addAnnotation
		  (getConfiguration_Includes(), 
		   source, 
		   new String[] {
			 "documentation", "URL\'s of configuration files to load into the this configurable\'s context.\r\nURL\'s are resolved relative to the ``baseURL``, which in turn is resolved relative to the model resource. \r\n\r\nThe following custom schemes supported:\r\n\r\n* ``bundle`` - ``bundle:<bundle symbolic name>/<resource path in the bundle>``\r\n* ``java`` - ``java:<classloader path>``\r\n\r\nConfiguration files can be in the following formats:\r\n\r\n* XMI model - ``.xml`` or ``.nsdgen`` extension.\r\n* Properties file - ``.properties`` extension.\r\n* JSON file following the structure of the configuration model - ``.json`` extension.\r\n* YAML file following the structure of the configuration model - ``.yml`` extension.\r\n\r\nIf XML/JSON/YAML contains configuration definition, then its ``createContext()`` method is invoked in sequence\r\nto create a chain of contexts. If property or service is contained in the definition, it gets mounted to a context created by this configuration."
		   });	
		addAnnotation
		  (getConfiguration_Configuration(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration items - properties and services."
		   });	
		addAnnotation
		  (getConfiguration_DefaultIncludes(), 
		   source, 
		   new String[] {
			 "documentation", "Same as ``includes``, but default includes are used only if the parent context doesn\'t contain configuration items with requested keys (names or types)."
		   });	
		addAnnotation
		  (getConfiguration_BaseURL(), 
		   source, 
		   new String[] {
			 "documentation", "Base URL to resolve includes, default includes, and classpath entries. \r\nThe URL is resolved relative to the model location and defaults to the model location URL."
		   });	
		addAnnotation
		  (getConfiguration_ClassPath(), 
		   source, 
		   new String[] {
			 "documentation", "Class path for loading classes of configuration elements."
		   });	
		addAnnotation
		  (getConfiguration_Include(), 
		   source, 
		   new String[] {
			 "documentation", "Configurations defined elsewhere to be included into this configuration. \r\nConfigurations get chained and configuration items (properties and services) get\r\nmounted to the context created by this configuration."
		   });	
		addAnnotation
		  (getConfiguration_Description(), 
		   source, 
		   new String[] {
			 "documentation", "Optional description."
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Configuration item contributes to the context of Configurable and can itself be configurable.\r\n"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Service is a configuration item keyed by its type or one of types it implements/extends.\r\n"
		   });	
		addAnnotation
		  (getService_ServiceType(), 
		   source, 
		   new String[] {
			 "documentation", "Service type. Shall be a superclass or implemented interface of the value type.\r\nDefaults to value type."
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "documentation", "Property is a valued configuration item keyed by a String."
		   });	
		addAnnotation
		  (workFactoryEClass, 
		   source, 
		   new String[] {
			 "documentation", "Work factory creates work to be executed during generation."
		   });	
		addAnnotation
		  (contextEDataType, 
		   source, 
		   new String[] {
			 "documentation", "Context provides access to properties and services. Contexts are typically chained\r\nwith a child context \"inheriting\" properties and services of the parent context(s)."
		   });	
		addAnnotation
		  (generatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generator is the base class for model element performing code generation."
		   });	
		addAnnotation
		  (getGenerator_Iterator(), 
		   source, 
		   new String[] {
			 "documentation", "Iterator attribute may contain a fragment of Java code which controls\r\nhow many times the generator will be invoked and can modify generator\'s \r\ncontext for each invocation.\r\n\r\nThe iterator\'s code shall be a Java method body as shown below:\r\n\r\n```java\r\n<T extends Generator> Object iterate(Context context, T generator) throws Exception {\r\n    // --- Iterator code here ---\r\n}\r\n```\r\n\r\nwhere ``T`` is the type of the iterator declaring generator model element. \r\n\r\nIterator code may return one of the following:\r\n\r\n* ``null`` or ``false`` or empty collection - no iteration.\r\n* ``java.lang.Iterable`` with elements of type ``org.nasdanika.codegen.Context`` or an array containing ``Context`` elements - generator will be invoked for each element of array/iterable and the element will be passed to the generator as its context.\r\n* ``Context`` - single invocation with returned context.\r\n\r\nIf the iterator returns any other result, then the generator throws ``IllegalArgumentException``.\r\n\r\nBlank iterator code is equivalent to ``return context;``"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "documentation", "Group of generators from which zero to all can be invoked during the generation process."
		   });	
		addAnnotation
		  (getGroup_Selector(), 
		   source, 
		   new String[] {
			 "documentation", "Java code to select which group elements shall be invoked and to customize their contexts. Selector code is a Java method body as shown below\r\n\r\n```java\r\n<G extends Generator> Context select(Context context, G group, Generator element) throws Exception {\r\n    // --- Selector code here ---\r\n}\r\n```\r\n\r\nwhere ``G`` is the type of the selector declaring group model element and ``element`` is the group element being evaluated. \r\n\r\nIf selector returns ``null`` then given group element is not invoked during generation. Otherwise it is invoked with the returned context.\r\n\r\nBlank selector code is equivalent to ``return context;``"
		   });	
		addAnnotation
		  (getGroup_Elements(), 
		   source, 
		   new String[] {
			 "documentation", "Group elements."
		   });	
		addAnnotation
		  (resourceGeneratorEClass, 
		   source, 
		   new String[] {
			 "documentation", "ResourceGenerator generates a workspace resource - file or directory. "
		   });	
		addAnnotation
		  (workspaceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Workspace is a group of projects."
		   });	
		addAnnotation
		  (folderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generates IFolder."
		   });	
		addAnnotation
		  (getFolder_Children(), 
		   source, 
		   new String[] {
			 "documentation", "Folder can contain other resource generators."
		   });	
		addAnnotation
		  (natureEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generates project nature, e.g. Java or Maven nature."
		   });	
		addAnnotation
		  (fileEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generates IFile."
		   });	
		addAnnotation
		  (getFile_Merger(), 
		   source, 
		   new String[] {
			 "documentation", "If reconcile action is ``Merge`` then merger gets instantiated to merge existing and new\r\ncontent of the file. The merger class shall implement ``org.nasdanika.codegen.Merger<T>`` \r\nwhere ``T`` is ``String` for text files and ``InputStream`` for binary files."
		   });	
		addAnnotation
		  (getFile_Generator(), 
		   source, 
		   new String[] {
			 "documentation", "File content generator."
		   });	
		addAnnotation
		  (projectEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generates workspace project."
		   });	
		addAnnotation
		  (getProject_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Project name. The name is interpolated \r\nduring generation and as such may contain tokens to be expanded."
		   });	
		addAnnotation
		  (getProject_Natures(), 
		   source, 
		   new String[] {
			 "documentation", "Project natures."
		   });	
		addAnnotation
		  (getProject_Resources(), 
		   source, 
		   new String[] {
			 "documentation", "Project resources."
		   });	
		addAnnotation
		  (getProject_ReconcileAction(), 
		   source, 
		   new String[] {
			 "documentation", "Action to take if a project with given name already exists."
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Generates project resource - file or directory."
		   });	
		addAnnotation
		  (getResource_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Resource name. Interpolated. May be a path name, i.e. contain separators, e.g. ``mydir/myfile.txt``"
		   });	
		addAnnotation
		  (getResource_ReconcileAction(), 
		   source, 
		   new String[] {
			 "documentation", "Action to take if resource with given name already exists."
		   });	
		addAnnotation
		  (binaryFileEClass, 
		   source, 
		   new String[] {
			 "documentation", "Binary file, with ``InputStream`` content."
		   });	
		addAnnotation
		  (textFileEClass, 
		   source, 
		   new String[] {
			 "documentation", "Text file with ``String`` content."
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
			 "documentation", "Append the new content to the existing. For project and directories it means\r\nadding new resources next to the existing, which is semantically equivalent to merging."
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
			 "documentation", "Replace existing content with the new one. \r\nFor directories and projects it means deleting the project/directory\r\nand re-creating with the new content.\r\n\r\nIf the generation context contains ``overwrite-predicate`` property, then the value\r\nof the property is cast to ``java.util.function.Predicate`` and its ``test()`` method is invoked.\r\nIf the return value is ``true`` then the resource/project get overwritten, if ``false`` it is left intact (same as ``Keep``).\r\n\r\nThe predicate may throw ``org.eclipse.core.runtime.OperationCanceledException`` to cancel generation (same as ``Cancel``).\r\n\r\nClients may create overwrite predicates which open an overwrite confirmation dialog to solicit overwrite decision from the user. "
		   });	
		addAnnotation
		  (reconcileActionEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "documentation", "Throw ``OperationCancelledException`` if resource/project already exists."
		   });	
		addAnnotation
		  (resourceReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Reference to a resource generator defined elsewhere."
		   });	
		addAnnotation
		  (getResourceReference_Target(), 
		   source, 
		   new String[] {
			 "documentation", "Reference target."
		   });	
		addAnnotation
		  (staticTextEClass, 
		   source, 
		   new String[] {
			 "documentation", "Static text. Can be used as text file content or as input to interpolator or filter."
		   });	
		addAnnotation
		  (getStaticText_Content(), 
		   source, 
		   new String[] {
			 "documentation", "Text content."
		   });	
		addAnnotation
		  (contentReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Reference (URL) to a content residing elsewhere, e.g. a template in a version control\r\nsystem available for download over HTTP."
		   });	
		addAnnotation
		  (getContentReference_Ref(), 
		   source, 
		   new String[] {
			 "documentation", "Content location (URL)."
		   });	
		addAnnotation
		  (filterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Filter transforms input of a generator to produce output."
		   });	
		addAnnotation
		  (getFilter_Generator(), 
		   source, 
		   new String[] {
			 "documentation", "Generator producing filter input."
		   });	
		addAnnotation
		  (javaGeneratorEClass, 
		   source, 
		   new String[] {
			 "documentation", "This generator instantiates and invokes Java class to generate output. \r\nThe generator Java class shall implement ``org.nasdanika.codegen.IGenerator``.\r\n\r\nFor example, JET templates may use a skeleton like shown below:\r\n\r\n\r\n```java\r\npublic class CLASS implements org.nasdanika.codegen.IGenerator<String> {\r\n\n    \n\npublic String generate(org.nasdanika.codegen.Context context, org.eclipse.core.runtime.IProgressMonitor monitor) throws Exception {\r\n        \nreturn \"\";\n   \r\n    }\n \r\n}\r\n```\r\n\r\nand classes compiled from these template can be used by the JavaGenerator."
		   });	
		addAnnotation
		  (getJavaGenerator_ClassName(), 
		   source, 
		   new String[] {
			 "documentation", "Generator class name."
		   });	
		addAnnotation
		  (interpolatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Interpolator produces output by expanding mustache tokens ``{{token}}`` in the \r\ninput using context properties."
		   });	
		addAnnotation
		  (jetEmitterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Invokes ``org.eclipse.emf.codegen.jet.JETEmitter`` to compile and evaluate a template."
		   });	
		addAnnotation
		  (getJETEmitter_TemplateURI(), 
		   source, 
		   new String[] {
			 "documentation", "Template location."
		   });	
		addAnnotation
		  (javaFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Instantiates a Java class to filter content. \r\nThe filter Java class shall implement ``org.nasdanika.codegen.IFilter<T>``, where\r\n``T`` is content type - ``String`` for text files and ``InputStream`` for binary files."
		   });	
		addAnnotation
		  (getJavaFilter_ClassName(), 
		   source, 
		   new String[] {
			 "documentation", "Filter class name."
		   });	
		addAnnotation
		  (providerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Providers are used to create configuration items using given context."
		   });	
		addAnnotation
		  (javaTextFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "``String`` binding of JavaFilter."
		   });	
		addAnnotation
		  (javaStreamFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "``InputStream`` binding of JavaFilter."
		   });	
		addAnnotation
		  (javaTextGeneratorEClass, 
		   source, 
		   new String[] {
			 "documentation", "``String`` binding of JavaGenerator."
		   });	
		addAnnotation
		  (javaStreamGeneratorEClass, 
		   source, 
		   new String[] {
			 "documentation", "``InputStream`` binding of JavaGenerator."
		   });	
		addAnnotation
		  (valueConfigurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Value configuration items can be configured with value in addition to configuration elements.\r\n\r\nValue and configuration items are injected into the configuration item via constructor. An appropriate constructor is selected based on \r\nwhether the value is blank and configuration items are present:\r\n\r\n* Blank value, no configuration items - default constructor, if exists.\r\n* Non-blank value, no configuration items - a constructor which takes String, if exists.\r\n* Blank value, configuration items - a constructor which takes Context, if exists.\r\n* Otherwise - a constructor which takes String and Context in any order.\r\n\r\nIf configuration item\'s type is assignable from ``org.nasdanika.codegen.Provider``, then it gets instantiated using\r\neither the default constructor, if it exists and value is blank, or a constructor which takes String. The provider\'s ``get(Context)`` method is used\r\nto obtain actual configuration item.\r\n\r\nIf value is not blank, it is interpolated using properties already defined in the context and inherited from the parent context. \r\nInterpolation is the process of expanding tokens enclosed into double-curly brackets to the values of properties with corresponding names.\r\n\r\nIf a property with a given name is not defined, a token does not get expanded.\r\n\r\nExample:\r\n```\r\n{{base-package}}.impl\r\n```"
		   });	
		addAnnotation
		  (getValueConfigurationItem_ValueType(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration item value type. Defaults to ``java.lang.String``."
		   });	
		addAnnotation
		  (getValueConfigurationItem_Value(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration item value."
		   });	
		addAnnotation
		  (getValueConfigurationItem_Default(), 
		   source, 
		   new String[] {
			 "documentation", "Regular configuration shadow/override configuration items defined in parent context(s),\r\ndefault configuration items, on the contrary, get shadowed by parent\'s configuration items\r\nwith the same keys."
		   });	
		addAnnotation
		  (getValueConfigurationItem_Scripted(), 
		   source, 
		   new String[] {
			 "documentation", "If true, value is treated as script and evaluated to compute actual value. \r\nScript is a Java method body returning Object and taking ``Context contect, String valueType`` paramters:\r\n\r\n```java\r\nObject evaluate(Context context, String valueType) throws Exception {\r\n    // --- Script here ---\r\n}\r\n```"
		   });	
		addAnnotation
		  (namedConfigurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Named configuration is keyed by a String.\r\n\r\nNamed configuration item is facaded by Context at runtime. Properties of the named configuration item can be accessed using / separator, e.g. ``feature/includedFeatures``."
		   });	
		addAnnotation
		  (getNamedConfigurationItem_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Property name."
		   });
	}

} //CodegenPackageImpl
