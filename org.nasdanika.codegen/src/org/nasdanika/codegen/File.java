/**
 */
package org.nasdanika.codegen;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.config.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates IFile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.File#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFile()
 * @model abstract="true" superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IFile&gt;"
 * @generated
 */
public interface File<C> extends Resource<IFile> {

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If reconcile action is ``Merge`` then merger gets instantiated to merge existing and new
	 * content of the file. The merger class shall implement ``org.nasdanika.codegen.Merger<T>`` 
	 * where ``T`` is ``String` for text files and ``InputStream`` for binary files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger</em>' containment reference.
	 * @see #setMerger(Service)
	 * @see org.nasdanika.codegen.CodegenPackage#getFile_Merger()
	 * @model containment="true"
	 * @generated
	 */
	Service getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.File#getMerger <em>Merger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' containment reference.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Service value);

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
