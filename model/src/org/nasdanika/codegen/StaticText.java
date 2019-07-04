/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ![static text](https://www.nasdanika.org/home/products/codegen/icons/StaticText.gif) Static text. Can be used as a text file contents or as an input to an interpolator or a filter.
 * Use static text for relatively small amounts of text which are convenient to edit in the generator model editor. 
 * For large amounts of text or for content types which are easier to edit in a specialized editor (e.g. JavaScript or XML), use external files and TextContentReference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.StaticText#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.codegen.StaticText#isInterpolate <em>Interpolate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getStaticText()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface StaticText extends Generator<String> {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getStaticText_Contents()
	 * @model
	 * @generated
	 */
	String getContents();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.StaticText#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(String value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true the contents is interpolated using the context. 
	 * It is a shortcut for having an Interpolator in front of static contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getStaticText_Interpolate()
	 * @model
	 * @generated
	 */
	boolean isInterpolate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.StaticText#isInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #isInterpolate()
	 * @generated
	 */
	void setInterpolate(boolean value);

} // StaticText
