/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ScriptedGenerator#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getScriptedGenerator()
 * @model abstract="true"
 * @generated
 */
public interface ScriptedGenerator<T> extends JavaGenerator<T> {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Script is a Java method body taking ``Context context, IProgressMonitor monitor`` and returning String or InputStream depending on type binding:
	 * 
	 * ```java
	 * T generate(Context context, IProgressMonitor monitor) throws Exception {
	 *     // --- Script here ---
	 * }
	 * ```
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getScriptedGenerator_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ScriptedGenerator#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // ScriptedGenerator
