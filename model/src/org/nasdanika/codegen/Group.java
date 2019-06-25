/**
 */
package org.nasdanika.codegen;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of generators from which zero to all can be invoked during the generation process. The group itself doesn't generate anything - it is an aggregation and conditional invocation construct.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Group#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGroup()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.List&lt;T&gt;&gt;"
 * @generated
 */
public interface Group<T> extends Generator<List<T>> {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;T&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getGroup_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generator<T>> getElements();

} // Group