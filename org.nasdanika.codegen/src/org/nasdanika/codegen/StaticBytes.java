/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Bytes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Static bytes array. Typically it would be used in programmatically created generator models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.StaticBytes#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getStaticBytes()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface StaticBytes extends Generator<InputStream> {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see org.nasdanika.codegen.CodegenPackage#getStaticBytes_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.StaticBytes#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

} // StaticBytes
