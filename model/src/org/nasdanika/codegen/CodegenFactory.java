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
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

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
	 * Returns a new object of class '<em>Content Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Group</em>'.
	 * @generated
	 */
	ContentGroup createContentGroup();

	/**
	 * Returns a new object of class '<em>Free Marker Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Marker Generator</em>'.
	 * @generated
	 */
	FreeMarkerGenerator createFreeMarkerGenerator();

	/**
	 * Returns a new object of class '<em>Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Reference</em>'.
	 * @generated
	 */
	ContentReference createContentReference();

	/**
	 * Returns a new object of class '<em>Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolator</em>'.
	 * @generated
	 */
	Interpolator createInterpolator();

	/**
	 * Returns a new object of class '<em>Mustache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mustache</em>'.
	 * @generated
	 */
	Mustache createMustache();

	/**
	 * Returns a new object of class '<em>Zip Archive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Archive</em>'.
	 * @generated
	 */
	ZipArchive createZipArchive();

	/**
	 * Returns a new object of class '<em>Resource Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Generator Reference</em>'.
	 * @generated
	 */
	ResourceGeneratorReference createResourceGeneratorReference();

	/**
	 * Returns a new object of class '<em>Content Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Generator Reference</em>'.
	 * @generated
	 */
	ContentGeneratorReference createContentGeneratorReference();

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
	 * Returns a new object of class '<em>Http Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Call</em>'.
	 * @generated
	 */
	HttpCall createHttpCall();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Resource Generator Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Generator Adapter</em>'.
	 * @generated
	 */
	ResourceGeneratorAdapter createResourceGeneratorAdapter();

	/**
	 * Returns a new object of class '<em>Content Generator Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Generator Adapter</em>'.
	 * @generated
	 */
	ContentGeneratorAdapter createContentGeneratorAdapter();

	/**
	 * Returns a new object of class '<em>Resource Generator Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Generator Link</em>'.
	 * @generated
	 */
	ResourceGeneratorLink createResourceGeneratorLink();

	/**
	 * Returns a new object of class '<em>Content Generator Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Generator Link</em>'.
	 * @generated
	 */
	ContentGeneratorLink createContentGeneratorLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodegenPackage getCodegenPackage();

} //CodegenFactory
