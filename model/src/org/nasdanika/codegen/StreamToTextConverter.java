/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream To Text Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.StreamToTextConverter#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getStreamToTextConverter()
 * @model superTypes="org.nasdanika.codegen.Converter&lt;org.nasdanika.codegen.InputStream, org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface StreamToTextConverter extends Converter<InputStream, String> {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getStreamToTextConverter_Charset()
	 * @model default=""
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.StreamToTextConverter#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

} // StreamToTextConverter
