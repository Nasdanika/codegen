/**
 */
package org.nasdanika.codegen;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generator is the base class for model element performing code generation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGenerator()
 * @model abstract="true"
 * @generated
 */
public interface Generator extends Entity, Configurable {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator creates work only if this attribute is true. 
	 * The purpose of this attribute is to help with generator model development 
	 * by disabling model parts which are still work in progress and would fail the generation
	 * process, or, on the opposite, already working parts which would create delay and distraction
	 * in testing and troubleshooting. Use ``Iterator`` for conditional generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Iterator contains context property name and allows to execute generator zero or more times depending on the property type.
	 * 
	 * * If iterator is blank then generator is executed once using the current generation context.
	 * * If iterator is not blank its value is used to get a property from the current generation context. Depending on the property value the generator is executed zero or more times:
	 *     * null - in this case iterator value is used as a prefix to create a sub-context to be used by the generator. E.g. if iterator value is ``my-component/`` then ``my-property`` property of the sub-context maps to ``my-component/my-property`` property of the parent context.
	 *     * boolean ``false`` - generator is not executed.
	 *     * boolean ``true`` - generator is executed once with the current context, same as for a blank iterator.
	 *     * single value (scalar) - generator is executed once with the current context and value available via ``data`` context property.
	 *     * list - generator is executed once for each list element with element value being processed as explained here.
	 *     * map - the map values are interoplated recursively by the current context. Then the map is wrapped into a context which is used to execute the generator.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iterator</em>' attribute.
	 * @see #setIterator(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Iterator()
	 * @model
	 * @generated
	 */
	String getIterator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getIterator <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' attribute.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Generator
