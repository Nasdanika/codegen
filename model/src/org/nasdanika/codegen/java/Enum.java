/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Enum#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type {
	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Superinterfaces are listed in implements clause. Elements are interpolated and each element can be a comma-separated list of superinterfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getEnum_SuperInterfaces()
	 * @model
	 * @generated
	 */
	EList<String> getSuperInterfaces();

} // Enum
