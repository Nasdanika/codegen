/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generator delegating to a Java object. Typically sub-classes of this class would be used by programmatically constructed generators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ObjectGenerator#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getObjectGenerator()
 * @model abstract="true"
 * @generated
 */
public interface ObjectGenerator<T> extends Generator<T> {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object to which generation is delegated. Must implement Generator<T> where T is String or InputStream depending on the sub-class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegate</em>' attribute.
	 * @see #setDelegate(Object)
	 * @see org.nasdanika.codegen.CodegenPackage#getObjectGenerator_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Object getDelegate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ObjectGenerator#getDelegate <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' attribute.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Object value);

} // ObjectGenerator
