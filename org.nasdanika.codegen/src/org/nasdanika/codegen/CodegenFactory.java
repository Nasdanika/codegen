/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.CodegenPackage
 * @generated
 */
public interface CodegenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodegenFactory eINSTANCE = org.nasdanika.codegen.impl.CodegenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Generator</em>'.
	 * @generated
	 */
	NamedGenerator createNamedGenerator();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	<T> Group<T> createGroup();

	/**
	 * Returns a new object of class '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Group</em>'.
	 * @generated
	 */
	ResourceGroup createResourceGroup();

	/**
	 * Returns a new object of class '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	Workspace createWorkspace();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>Generic File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic File</em>'.
	 * @generated
	 */
	GenericFile createGenericFile();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary File</em>'.
	 * @generated
	 */
	BinaryFile createBinaryFile();

	/**
	 * Returns a new object of class '<em>Text File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text File</em>'.
	 * @generated
	 */
	TextFile createTextFile();

	/**
	 * Returns a new object of class '<em>Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Reference</em>'.
	 * @generated
	 */
	ResourceReference createResourceReference();

	/**
	 * Returns a new object of class '<em>Static Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Text</em>'.
	 * @generated
	 */
	StaticText createStaticText();

	/**
	 * Returns a new object of class '<em>Free Marker Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Marker Generator</em>'.
	 * @generated
	 */
	FreeMarkerGenerator createFreeMarkerGenerator();

	/**
	 * Returns a new object of class '<em>ECore Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECore Model Generator</em>'.
	 * @generated
	 */
	ECoreModelGenerator createECoreModelGenerator();

	/**
	 * Returns a new object of class '<em>Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolator</em>'.
	 * @generated
	 */
	Interpolator createInterpolator();

	/**
	 * Returns a new object of class '<em>JET Emitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JET Emitter</em>'.
	 * @generated
	 */
	JETEmitter createJETEmitter();

	/**
	 * Returns a new object of class '<em>Java Text Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Text Filter</em>'.
	 * @generated
	 */
	JavaTextFilter createJavaTextFilter();

	/**
	 * Returns a new object of class '<em>Java Stream Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Stream Filter</em>'.
	 * @generated
	 */
	JavaStreamFilter createJavaStreamFilter();

	/**
	 * Returns a new object of class '<em>Java Text Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Text Generator</em>'.
	 * @generated
	 */
	JavaTextGenerator createJavaTextGenerator();

	/**
	 * Returns a new object of class '<em>Java Stream Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Stream Generator</em>'.
	 * @generated
	 */
	JavaStreamGenerator createJavaStreamGenerator();

	/**
	 * Returns a new object of class '<em>Scripted Text Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Text Generator</em>'.
	 * @generated
	 */
	ScriptedTextGenerator createScriptedTextGenerator();

	/**
	 * Returns a new object of class '<em>Scripted Stream Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Stream Generator</em>'.
	 * @generated
	 */
	ScriptedStreamGenerator createScriptedStreamGenerator();

	/**
	 * Returns a new object of class '<em>Scripted Text Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Text Filter</em>'.
	 * @generated
	 */
	ScriptedTextFilter createScriptedTextFilter();

	/**
	 * Returns a new object of class '<em>Scripted Stream Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Stream Filter</em>'.
	 * @generated
	 */
	ScriptedStreamFilter createScriptedStreamFilter();

	/**
	 * Returns a new object of class '<em>Text Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Content Reference</em>'.
	 * @generated
	 */
	TextContentReference createTextContentReference();

	/**
	 * Returns a new object of class '<em>Stream Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Content Reference</em>'.
	 * @generated
	 */
	StreamContentReference createStreamContentReference();

	/**
	 * Returns a new object of class '<em>Zip Archive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Archive</em>'.
	 * @generated
	 */
	ZipArchive createZipArchive();

	/**
	 * Returns a new object of class '<em>Mustache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mustache</em>'.
	 * @generated
	 */
	Mustache createMustache();

	/**
	 * Returns a new object of class '<em>Bundle Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Resource</em>'.
	 * @generated
	 */
	BundleResource createBundleResource();

	/**
	 * Returns a new object of class '<em>Static Bytes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Bytes</em>'.
	 * @generated
	 */
	StaticBytes createStaticBytes();

	/**
	 * Returns a new object of class '<em>Object Text Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Text Generator</em>'.
	 * @generated
	 */
	ObjectTextGenerator createObjectTextGenerator();

	/**
	 * Returns a new object of class '<em>Object Stream Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Stream Generator</em>'.
	 * @generated
	 */
	ObjectStreamGenerator createObjectStreamGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodegenPackage getCodegenPackage();

} //CodegenFactory
