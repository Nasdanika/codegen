/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ScriptedFilter#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getScriptedFilter()
 * @model abstract="true"
 * @generated
 */
public interface ScriptedFilter<T> extends Filter<T> {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Script is a Java method body taking ``Context context, IGenerator generator, IProgressMonitor monitor`` and returning String or InputStream depending on type binding:
	 * 
	 * ```java
	 * T generate(Context context, IGenerator generator, IProgressMonitor monitor) throws Exception {
	 *     // --- Script here ---
	 * }
	 * ```
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getScriptedFilter_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ScriptedFilter#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // ScriptedFilter
