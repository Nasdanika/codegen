/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something which can contain resources, a grouping construct.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ResourceContainer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResourceContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ResourceGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Folder can contain other resource generators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceGenerator> getElements();

} // ResourceContainer
