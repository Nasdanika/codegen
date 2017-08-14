/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Marker Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates text from template and model using [FreeMarker](http://freemarker.org/).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplateLoaderType <em>Template Loader Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.FreeMarkerGenerator#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.codegen.FreeMarkerGenerator#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getFreeMarkerGenerator()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface FreeMarkerGenerator extends Generator<String> {
	/**
	 * Returns the value of the '<em><b>Template Loader Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.FreeMarkerTemplateLoaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Loader Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Loader Type</em>' attribute.
	 * @see org.nasdanika.codegen.FreeMarkerTemplateLoaderType
	 * @see #setTemplateLoaderType(FreeMarkerTemplateLoaderType)
	 * @see org.nasdanika.codegen.CodegenPackage#getFreeMarkerGenerator_TemplateLoaderType()
	 * @model required="true"
	 * @generated
	 */
	FreeMarkerTemplateLoaderType getTemplateLoaderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplateLoaderType <em>Template Loader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Loader Type</em>' attribute.
	 * @see org.nasdanika.codegen.FreeMarkerTemplateLoaderType
	 * @see #getTemplateLoaderType()
	 * @generated
	 */
	void setTemplateLoaderType(FreeMarkerTemplateLoaderType value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL, bundle path, or package for resolving templates. 
	 * If empty, then templates are resolved relative to the 
	 * context base URL, which typically would be the generator model location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getFreeMarkerGenerator_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.FreeMarkerGenerator#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Template name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getFreeMarkerGenerator_Template()
	 * @model required="true"
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.FreeMarkerGenerator#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a property which value is used as the model for the template.
	 * If blank, the generation context is used as the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getFreeMarkerGenerator_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.FreeMarkerGenerator#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // FreeMarkerGenerator
