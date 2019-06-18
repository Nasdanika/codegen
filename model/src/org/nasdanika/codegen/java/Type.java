/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
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
	 * Returns the value of the '<em><b>Super Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supertypes. Elements are interpolated and each element can be a comma-separated list of supertypes.
	 * For classes the first supertype goes to the extends clause and the rest to the implements clause. For interfaces all supertypes go to the implements clause.
	 * For enum everything goes to the implements clause. Not applicable to annotations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Types</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<String> getSuperTypes();

} // Type
