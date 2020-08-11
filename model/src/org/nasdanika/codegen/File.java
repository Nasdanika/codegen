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
 *   <li>{@link org.nasdanika.codegen.File#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Resource {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File content generators. 
	 * Content produced by each generator is appended to the file content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getFile_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContentGenerator> getContent();

} // File
