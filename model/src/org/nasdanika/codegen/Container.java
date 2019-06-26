/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates IFolder.
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
 * @model superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IContainer&lt;org.nasdanika.codegen.InputStream&gt;&gt;"
 * @generated
 */
public interface Container extends Resource<org.nasdanika.common.resources.Container<InputStream>> {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;org.nasdanika.common.resources.Resource&lt;java.io.InputStream&gt;&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Folder can contain other resource generators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getContainer_Children()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.IResource&lt;org.nasdanika.codegen.InputStream&gt;&gt;" containment="true"
	 * @generated
	 */
	EList<Generator<org.nasdanika.common.resources.Resource<InputStream>>> getChildren();

} // Container
