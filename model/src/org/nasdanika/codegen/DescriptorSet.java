/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.DescriptorSet#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getDescriptorSet()
 * @model
 * @generated
 */
public interface DescriptorSet extends Descriptor {
	/**
	 * Returns the value of the '<em><b>Descriptors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Descriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors</em>' reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getDescriptorSet_Descriptors()
	 * @model
	 * @generated
	 */
	EList<Descriptor> getDescriptors();

} // DescriptorSet
