/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ResourceGenerator generates a workspace resource - file or directory. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ResourceGenerator#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResourceGenerator()
 * @model abstract="true"
 * @generated
 */
public interface ResourceGenerator<T> extends Generator<T> {

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource generator generates resource only if this attribute is true. 
	 * The purpose of this attribute is to help with generator model development 
	 * by disabling model parts which are still work in progress and would fail the generation
	 * process, or, on the opposite, already working parts which would create delay and distraction
	 * in testing and troubleshooting. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceGenerator_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceGenerator#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);
} // ResourceGenerator
