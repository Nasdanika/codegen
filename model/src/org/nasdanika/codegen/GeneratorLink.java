/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a generator using a URI resolved relatively to the link's resource URI. 
 * Similarly to [GeneratorRefernce](GeneratorReference.html) generator links can be used to create multi-resource federated generation models. 
 * Links do not require referenced models to be reacheable at the modeling time. Also ``ref`` is interpolated and as such can point to different generators depending on context properties.
 * Linked models/elements are loaded at generation time, diagnosed and then executed.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.GeneratorLink#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorLink()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorLink extends Generator {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generato URI resolved relative to the generator link resource. If there is no fragment then the root model element is used. Otherwise the model element identified by the fragment part is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGeneratorLink_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.GeneratorLink#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // GeneratorLink
