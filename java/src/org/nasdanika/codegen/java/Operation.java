/**
 */
package org.nasdanika.codegen.java;

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
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter declarations, interpolated. Can be separated by commas or new line characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Operation#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions thrown by this operation, interpolated. Can be separated by commas or new line characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions</em>' attribute.
	 * @see #setExceptions(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getOperation_Exceptions()
	 * @model
	 * @generated
	 */
	String getExceptions();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Operation#getExceptions <em>Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exceptions</em>' attribute.
	 * @see #getExceptions()
	 * @generated
	 */
	void setExceptions(String value);

} // Operation
