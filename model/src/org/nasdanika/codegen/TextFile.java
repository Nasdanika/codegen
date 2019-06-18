/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Text file with ``String`` content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.TextFile#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getTextFile()
 * @model superTypes="org.nasdanika.codegen.File&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface TextFile extends File<String> {

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional character encoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getTextFile_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.TextFile#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // TextFile
