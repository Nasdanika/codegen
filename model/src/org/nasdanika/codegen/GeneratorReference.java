/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a generator. Generator references can be used to create multi-resource federated generation models. 
 * Federated generation models can be used to keep reusable logic in shared models referenced by multiple other models.
 * Model federation can also be used to keep the models of manageable size, simplify testing, and to facilitate team modeling by assigning different models to different team members.
 * 
 * Generator references would typically be used to reference generators defined in models in the same project or in generator models reacheable at both the modeling time and generation time.
 * 
 * See also [GeneratorLink](GeneratorLink.html) for another approach to referencing generators.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.GeneratorReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorReference()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorReference<T extends Generator> extends Generator {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target generator is invoked to perform actual generation with context(s) iterated, mapped, and configured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Generator)
	 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorReference_Target()
	 * @model required="true"
	 * @generated
	 */
	T getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.GeneratorReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(T value);

} // GeneratorReference
