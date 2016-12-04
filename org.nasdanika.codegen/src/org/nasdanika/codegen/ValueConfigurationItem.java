/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value configuration items can be configured with value in addition to configuration elements.
 * 
 * If ``scripted`` is true, the value is evaluated as a script.
 * 
 * Script is a Java method body returning Object and taking ``Context contect, String valueType`` paramters:
 * 
 * ```java
 * Object evaluate(Context context, String valueType) throws Exception {
 *     // --- Script here ---
 * }
 * ```
 * 
 * Otherwise, value and configuration items are injected into the configuration item via constructor. An appropriate constructor is selected based on 
 * whether the value is blank and configuration items are present:
 * 
 * * Blank value, no configuration items - default constructor, if exists.
 * * Non-blank value, no configuration items - a constructor which takes String, if exists.
 * * Blank value, configuration items - a constructor which takes Context, if exists.
 * * Otherwise - a constructor which takes String and Context in any order.
 * 
 * If configuration item's type is assignable from ``org.nasdanika.codegen.Provider``, then it gets instantiated using
 * either the default constructor, if it exists and value is blank, or a constructor which takes String. The provider's ``get(Context)`` method is used
 * to obtain actual configuration item.
 * 
 * If value is not blank, it is interpolated using properties already defined in the context and inherited from the parent context. 
 * Interpolation is the process of expanding tokens enclosed into double-curly brackets to the values of properties with corresponding names.
 * 
 * If a property with a given name is not defined, a token does not get expanded.
 * 
 * Example:
 * ```
 * {{base-package}}.impl
 * ```
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ValueConfigurationItem#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ValueConfigurationItem#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ValueConfigurationItem#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ValueConfigurationItem#isScripted <em>Scripted</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getValueConfigurationItem()
 * @model abstract="true"
 * @generated
 */
public interface ValueConfigurationItem extends ConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration item value type. Defaults to ``java.lang.String``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getValueConfigurationItem_ValueType()
	 * @model
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ValueConfigurationItem#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration item value.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getValueConfigurationItem_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ValueConfigurationItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regular configuration shadow/override configuration items defined in parent context(s),
	 * default configuration items, on the contrary, get shadowed by parent's configuration items
	 * with the same keys.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getValueConfigurationItem_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ValueConfigurationItem#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Scripted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, value is treated as script and evaluated to compute actual value. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scripted</em>' attribute.
	 * @see #setScripted(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getValueConfigurationItem_Scripted()
	 * @model
	 * @generated
	 */
	boolean isScripted();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ValueConfigurationItem#isScripted <em>Scripted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripted</em>' attribute.
	 * @see #isScripted()
	 * @generated
	 */
	void setScripted(boolean value);

} // ValueConfigurationItem
