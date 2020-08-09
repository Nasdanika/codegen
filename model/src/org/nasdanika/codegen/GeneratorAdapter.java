/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for resource and content adapters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.GeneratorAdapter#getFactory <em>Factory</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorAdapter()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorAdapter extends Generator {
	/**
	 * Returns the value of the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of a named factory. The factory shall be for ${javadoc/org.nasdanika.common.SupplierFactory} type for content generators and of ${javadoc/org.nasdanika.common.ConsumerFactory} for resource generators. 
	 * In the resource adapter consumer is passed in instance of ${javadoc/org.nasdanika.common.resources.Container} for manipulation with container resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory</em>' attribute.
	 * @see #setFactory(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorAdapter_Factory()
	 * @model required="true"
	 * @generated
	 */
	String getFactory();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.GeneratorAdapter#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' attribute.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(String value);

} // GeneratorAdapter
