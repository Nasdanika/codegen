/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Filter generates its output by processing and combining outputs of contained generators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Filter#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFilter()
 * @model abstract="true"
 * @generated
 */
public interface Filter extends ContentGenerator {
	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filter inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getFilter_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentGenerator> getGenerators();

} // Filter
