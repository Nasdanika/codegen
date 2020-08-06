/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates File for a given content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.File#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.File#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Resource {
	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File content generators. 
	 * Content produced by each generator is appended to the file content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getFile_Generators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Generator> getGenerators();

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional character set for text files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getFile_Charset()
	 * @model
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.File#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

} // File
