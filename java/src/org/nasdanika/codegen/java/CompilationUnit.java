/**
 */
package org.nasdanika.codegen.java;

import org.nasdanika.codegen.TextFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compilation unit is a specialization of TextFile with support of Java merging and formatting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.CompilationUnit#isMerge <em>Merge</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.CompilationUnit#isFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends TextFile {
	/**
	 * Returns the value of the '<em><b>Merge</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, new and old compilation unit content gets merged with ``org.eclipse.emf.codegen.merge.java.JMerger``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merge</em>' attribute.
	 * @see #setMerge(boolean)
	 * @see org.nasdanika.codegen.java.JavaPackage#getCompilationUnit_Merge()
	 * @model default="true"
	 * @generated
	 */
	boolean isMerge();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.CompilationUnit#isMerge <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' attribute.
	 * @see #isMerge()
	 * @generated
	 */
	void setMerge(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, generated/merged source is automatically formatted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(boolean)
	 * @see org.nasdanika.codegen.java.JavaPackage#getCompilationUnit_Format()
	 * @model default="true"
	 * @generated
	 */
	boolean isFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.CompilationUnit#isFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #isFormat()
	 * @generated
	 */
	void setFormat(boolean value);

} // CompilationUnit
