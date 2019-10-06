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
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

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
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Group</em>'.
	 * @generated
	 */
	ResourceGroup createResourceGroup();

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
	 * Returns a new object of class '<em>Text To Stream Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text To Stream Converter</em>'.
	 * @generated
	 */
	TextToStreamConverter createTextToStreamConverter();

	/**
	 * Returns a new object of class '<em>Stream To Text Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream To Text Converter</em>'.
	 * @generated
	 */
	StreamToTextConverter createStreamToTextConverter();

	/**
	 * Returns a new object of class '<em>Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolator</em>'.
	 * @generated
	 */
	Interpolator createInterpolator();

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
	 * Returns a new object of class '<em>Java Resource Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Resource Generator</em>'.
	 * @generated
	 */
	JavaResourceGenerator createJavaResourceGenerator();

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
	 * Returns a new object of class '<em>Text Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Group</em>'.
	 * @generated
	 */
	TextGroup createTextGroup();

	/**
	 * Returns a new object of class '<em>Text Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Generator Reference</em>'.
	 * @generated
	 */
	TextGeneratorReference createTextGeneratorReference();

	/**
	 * Returns a new object of class '<em>Stream Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Generator Reference</em>'.
	 * @generated
	 */
	StreamGeneratorReference createStreamGeneratorReference();

	/**
	 * Returns a new object of class '<em>Resource Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Generator Reference</em>'.
	 * @generated
	 */
	ResourceGeneratorReference createResourceGeneratorReference();

	/**
	 * Returns a new object of class '<em>Http Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Call</em>'.
	 * @generated
	 */
	HttpCall createHttpCall();

	/**
	 * Returns a new object of class '<em>Bundle Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Resource Collection</em>'.
	 * @generated
	 */
	BundleResourceCollection createBundleResourceCollection();

	/**
	 * Returns a new object of class '<em>Zip Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Resource Collection</em>'.
	 * @generated
	 */
	ZipResourceCollection createZipResourceCollection();

	/**
	 * Returns a new object of class '<em>Property Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Descriptor</em>'.
	 * @generated
	 */
	PropertyDescriptor createPropertyDescriptor();

	/**
	 * Returns a new object of class '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Descriptor</em>'.
	 * @generated
	 */
	ServiceDescriptor createServiceDescriptor();

	/**
	 * Returns a new object of class '<em>Descriptor Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Set</em>'.
	 * @generated
	 */
	DescriptorSet createDescriptorSet();

	/**
	 * Returns a new object of class '<em>Mustache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mustache</em>'.
	 * @generated
	 */
	Mustache createMustache();

	/**
	 * Returns a new object of class '<em>Static Bytes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Bytes</em>'.
	 * @generated
	 */
	StaticBytes createStaticBytes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodegenPackage getCodegenPackage();

} //CodegenFactory
