/**
 */
package org.nasdanika.codegen;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.nasdanika.engineering.AbstractComponent;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generator is the base class for model element performing code generation.
 * 
 * Generator final context is constucted in the following order:
 * 
 * * Iterator is processed
 * * If context map is not blank then iterator contexts are mapped
 * * If configuration elements are present they are injected into the previously constructed context
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getContextMap <em>Context Map</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGenerator()
 * @model abstract="true"
 * @generated
 */
public interface Generator extends Entity, Configurable, AbstractComponent {
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
	 *     * ${javadoc/org.eclipse.emf.common.notify.AdapterFactory} - the factory shall be for ${javadoc/org.nasdanika.common.ContextIterator$Factory}. A context iterator is created by the factory and is used to iterate over the element.
	 * 
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
	 * Returns the value of the '<em><b>Context Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If context map is not blank then it is parsed as [YAML](https://en.wikipedia.org/wiki/YAML) and used to construct a generation context or contexts from the current context.
	 * If contextMap value is string then it is used as a relative URL to load a YAML resource with context mapping. The resource is processed in the same way as the context map text.
	 * If it is a map then then the map is interpolated by the current context and wrapped into a context.
	 * If the value is a list then each of its elements is processed as explained here to produce a mapped context. In this case the generator is executed once for each list element for each iterator entry (nested loop). 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Map</em>' attribute.
	 * @see #setContextMap(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_ContextMap()
	 * @model annotation="urn:org.nasdanika content-type='text/code'"
	 * @generated
	 */
	String getContextMap();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getContextMap <em>Context Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Map</em>' attribute.
	 * @see #getContextMap()
	 * @generated
	 */
	void setContextMap(String value);

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
