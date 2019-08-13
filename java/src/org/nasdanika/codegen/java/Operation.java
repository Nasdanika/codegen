/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for constructor and method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Operation#getExceptions <em>Exceptions</em>}</li>
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
	 * Parameter declarations, interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions thrown by this operation, interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_Exceptions()
	 * @model
	 * @generated
	 */
	EList<String> getExceptions();

} // Operation
