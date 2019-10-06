/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Descriptor;
import org.nasdanika.codegen.DescriptorSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.DescriptorSetImpl#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptorSetImpl extends DescriptorImpl implements DescriptorSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.DESCRIPTOR_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Descriptor> getDescriptors() {
		return (EList<Descriptor>)eDynamicGet(CodegenPackage.DESCRIPTOR_SET__DESCRIPTORS, CodegenPackage.Literals.DESCRIPTOR_SET__DESCRIPTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.DESCRIPTOR_SET__DESCRIPTORS:
				return getDescriptors();
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
			case CodegenPackage.DESCRIPTOR_SET__DESCRIPTORS:
				getDescriptors().clear();
				getDescriptors().addAll((Collection<? extends Descriptor>)newValue);
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
			case CodegenPackage.DESCRIPTOR_SET__DESCRIPTORS:
				getDescriptors().clear();
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
			case CodegenPackage.DESCRIPTOR_SET__DESCRIPTORS:
				return !getDescriptors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DescriptorSetImpl
