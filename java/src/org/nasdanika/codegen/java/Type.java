/**
 */
package org.nasdanika.codegen.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for clas, interface, annotation, and enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Type#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Member {
	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supertypes. Interpolated. New line characters are replaced with commas.
	 * For classes the first supertype goes to the extends clause and the rest to the implements clause. If the first element in the class supertypes is ``java.lang.Object`` or an empty string then the ``extends`` clause is not generated.
	 * For interfaces all supertypes go to the implements clause.
	 * For enum everything goes to the implements clause. 
	 * Not applicable to annotations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Types</em>' attribute.
	 * @see #setSuperTypes(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getType_SuperTypes()
	 * @model
	 * @generated
	 */
	String getSuperTypes();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Type#getSuperTypes <em>Super Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Types</em>' attribute.
	 * @see #getSuperTypes()
	 * @generated
	 */
	void setSuperTypes(String value);

} // Type
