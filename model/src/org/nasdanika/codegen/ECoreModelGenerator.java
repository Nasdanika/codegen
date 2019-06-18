/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECore Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Writes the model specified in ``model`` context property to XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ECoreModelGenerator#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getECoreModelGenerator()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface ECoreModelGenerator extends Generator<InputStream> {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the property which value is the model to write to XML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getECoreModelGenerator_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ECoreModelGenerator#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // ECoreModelGenerator
