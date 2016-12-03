/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ValueConfigurationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#isScripted <em>Scripted</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueConfigurationItemImpl extends ConfigurationItemImpl implements ValueConfigurationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return (String)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE_TYPE, newValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return (Boolean)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScripted() {
		return (Boolean)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__SCRIPTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScripted(boolean newScripted) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__SCRIPTED, newScripted);
	}

} //ValueConfigurationItemImpl
