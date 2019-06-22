/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;
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
 *   <li>{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFile()
 * @model abstract="true" superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IFile&lt;org.nasdanika.codegen.InputStream&gt;&gt;"
 * @generated
 */
public interface File<C> extends Resource<org.nasdanika.common.resources.File<InputStream>> {

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If reconcile action is ``Merge`` then merger gets instantiated to merge existing and new
	 * content of the file. The merger class shall implement ``org.nasdanika.codegen.Merger<T>`` 
	 * where ``T`` is ``String`` for text files and ``InputStream`` for binary files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger</em>' attribute.
	 * @see #setMerger(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getFile_Merger()
	 * @model annotation="org.nasdanika.ui.java-class root-type='org.nasdanika.codegen.Merger' super-interfaces='org.nasdanika.codegen.Merger'"
	 * @generated
	 */
	String getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' attribute.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(String value);

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;C&gt;</code>.
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
	EList<Generator<C>> getGenerators();
} // File
