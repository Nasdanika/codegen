/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Operation#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Member {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters, interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_ThrownExceptions()
	 * @model
	 * @generated
	 */
	EList<String> getThrownExceptions();

} // Operation
