/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Container#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getContainer()
 * @model superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.BinaryEntityContainer&gt;"
 * @generated
 */
public interface Container extends Resource<BinaryEntityContainer> {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Resource}<code>&lt;org.nasdanika.common.resources.BinaryResource&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Folder can contain other resource generators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getContainer_Children()
	 * @model type="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.BinaryResource&gt;" containment="true"
	 * @generated
	 */
	EList<Resource<BinaryResource>> getChildren();

} // Container
