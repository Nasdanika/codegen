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
 *   <li>{@link org.nasdanika.codegen.Generator#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getCondition <em>Condition</em>}</li>
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
	 * Generator creates work  only if this attribute is true. 
	 * The purpose of this attribute is to help with generator model development 
	 * by disabling model parts which are still work in progress and would fail the generation
	 * process, or, on the opposite, already working parts which would create delay and distraction
	 * in testing and troubleshooting. 
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
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If contextPath is not null and not empty/blank then the given path used as a prefix 
	 * prepended to the propety names when getting property values from the context. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_ContextPath()
	 * @model
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not blank the predicate shall be a Java expression evaluating to boolean. 
	 * If it evaluates to true then generation work gets executed. 
	 * The predicate expression has access to ``context`` variable. Use ``context.get()`` for retrieval of values from the context.
	 * 
	 * The predicate expression is interpolated with the context, so another way to access context properties is to use tokens. 
	 * For example ``context.get("my-property") > 0`` and ``${my-property} > 0`` are equivalent. 
	 * To safely handle the case ``my-property`` not being set  a property default value may be used in the second option ``${my-property|0} > 0``.
	 * 
	 * For more advanced control over execution use controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource generators shall return true from this method, e.g.:
	 * 
	 * * Project, 
	 * * File, 
	 * * Folder, 
	 * * Package fragment (root)
	 * * Compilation unit.
	 * * Zip Archive
	 * 
	 * Generators which do not create resources but rather contribute to their creation shall return false.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFilterable();

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
