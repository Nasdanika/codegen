/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text To Stream Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.TextToStreamConverter#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getTextToStreamConverter()
 * @model superTypes="org.nasdanika.codegen.Converter&lt;org.eclipse.emf.ecore.EString, org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface TextToStreamConverter extends Converter<String, InputStream> {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getTextToStreamConverter_Charset()
	 * @model default=""
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.TextToStreamConverter#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

} // TextToStreamConverter
