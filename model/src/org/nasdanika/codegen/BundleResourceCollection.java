/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coolection of resources from an OSGi bundle (Eclipse plug-in).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.BundleResourceCollection#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getBundleResourceCollection()
 * @model
 * @generated
 */
public interface BundleResourceCollection extends ResourceCollection {
	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle symbolic name. Defaults to the bundle containing the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' attribute.
	 * @see #setBundle(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getBundleResourceCollection_Bundle()
	 * @model
	 * @generated
	 */
	String getBundle();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.BundleResourceCollection#getBundle <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' attribute.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(String value);

} // BundleResourceCollection
