/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Converter converts input of a generator to produce output.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Converter#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getConverter()
 * @model abstract="true"
 * @generated
 */
public interface Converter<S, T> extends Generator<T> {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator producing converter input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(Generator)
	 * @see org.nasdanika.codegen.CodegenPackage#getConverter_Generator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Generator<S> getGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Converter#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator<S> value);

} // Converter
