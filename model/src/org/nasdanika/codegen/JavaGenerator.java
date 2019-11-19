/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This generator instantiates and invokes Java class to generate output. 
 * The generator Java class shall implement ``org.nasdanika.common.Supplier<Context, T>`` where ``T`` is the generator/supplier return type.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.JavaGenerator#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.JavaGenerator#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getJavaGenerator()
 * @model abstract="true"
 * @generated
 */
public interface JavaGenerator<T> extends Generator<T> {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getJavaGenerator_ClassName()
	 * @model annotation="org.nasdanika.ui.java-class root-type='org.nasdanika.codegen.Generator' super-interfaces='org.nasdanika.codegen.Generator'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.JavaGenerator#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator constructor arguments. Codegen uses the first constructor with the matching number of parameters.
	 * 
	 * String argument values are interpolated by the context and then are converted to 
	 * the constructor parameter types using ``Converter`` service obtained from the context
	 * or ``DefaultConverter.INSTANCE`` if there is no converter service. 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getJavaGenerator_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

} // JavaGenerator
