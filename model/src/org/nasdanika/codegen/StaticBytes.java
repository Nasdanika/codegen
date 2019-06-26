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
 *   <li>{@link org.nasdanika.codegen.StaticBytes#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getStaticBytes()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface StaticBytes extends Generator<InputStream> {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(byte[])
	 * @see org.nasdanika.codegen.CodegenPackage#getStaticBytes_Contents()
	 * @model
	 * @generated
	 */
	byte[] getContents();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.StaticBytes#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(byte[] value);

} // StaticBytes
