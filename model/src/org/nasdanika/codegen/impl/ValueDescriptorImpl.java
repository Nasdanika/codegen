/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ValueDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ValueDescriptorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueDescriptorImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueDescriptorImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueDescriptorImpl extends DescriptorImpl implements ValueDescriptor {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.VALUE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(CodegenPackage.VALUE_DESCRIPTOR__TYPE, CodegenPackage.Literals.VALUE_DESCRIPTOR__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(CodegenPackage.VALUE_DESCRIPTOR__TYPE, CodegenPackage.Literals.VALUE_DESCRIPTOR__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return (Boolean)eDynamicGet(CodegenPackage.VALUE_DESCRIPTOR__REQUIRED, CodegenPackage.Literals.VALUE_DESCRIPTOR__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		eDynamicSet(CodegenPackage.VALUE_DESCRIPTOR__REQUIRED, CodegenPackage.Literals.VALUE_DESCRIPTOR__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getChoices() {
		return (EList<String>)eDynamicGet(CodegenPackage.VALUE_DESCRIPTOR__CHOICES, CodegenPackage.Literals.VALUE_DESCRIPTOR__CHOICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.VALUE_DESCRIPTOR__TYPE:
				return getType();
			case CodegenPackage.VALUE_DESCRIPTOR__REQUIRED:
				return isRequired();
			case CodegenPackage.VALUE_DESCRIPTOR__CHOICES:
				return getChoices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.VALUE_DESCRIPTOR__TYPE:
				setType((String)newValue);
				return;
			case CodegenPackage.VALUE_DESCRIPTOR__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CodegenPackage.VALUE_DESCRIPTOR__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.VALUE_DESCRIPTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CodegenPackage.VALUE_DESCRIPTOR__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CodegenPackage.VALUE_DESCRIPTOR__CHOICES:
				getChoices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.VALUE_DESCRIPTOR__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case CodegenPackage.VALUE_DESCRIPTOR__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case CodegenPackage.VALUE_DESCRIPTOR__CHOICES:
				return !getChoices().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueDescriptorImpl
