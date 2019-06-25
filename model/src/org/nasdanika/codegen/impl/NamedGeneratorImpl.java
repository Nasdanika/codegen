/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.NamedGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedGeneratorImpl extends MinimalEObjectImpl.Container implements NamedGenerator {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.NAMED_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CodegenPackage.NAMED_GENERATOR__NAME, CodegenPackage.Literals.NAMED_GENERATOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CodegenPackage.NAMED_GENERATOR__NAME, CodegenPackage.Literals.NAMED_GENERATOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generator<String> getGenerator() {
		return (Generator<String>)eDynamicGet(CodegenPackage.NAMED_GENERATOR__GENERATOR, CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(Generator<String> newGenerator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGenerator, CodegenPackage.NAMED_GENERATOR__GENERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerator(Generator<String> newGenerator) {
		eDynamicSet(CodegenPackage.NAMED_GENERATOR__GENERATOR, CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CodegenPackage.NAMED_GENERATOR__DESCRIPTION, CodegenPackage.Literals.NAMED_GENERATOR__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CodegenPackage.NAMED_GENERATOR__DESCRIPTION, CodegenPackage.Literals.NAMED_GENERATOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
				return basicSetGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.NAMED_GENERATOR__NAME:
				return getName();
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
				return getGenerator();
			case CodegenPackage.NAMED_GENERATOR__DESCRIPTION:
				return getDescription();
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
			case CodegenPackage.NAMED_GENERATOR__NAME:
				setName((String)newValue);
				return;
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
				setGenerator((Generator<String>)newValue);
				return;
			case CodegenPackage.NAMED_GENERATOR__DESCRIPTION:
				setDescription((String)newValue);
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
			case CodegenPackage.NAMED_GENERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
				setGenerator((Generator<String>)null);
				return;
			case CodegenPackage.NAMED_GENERATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CodegenPackage.NAMED_GENERATOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
				return getGenerator() != null;
			case CodegenPackage.NAMED_GENERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //NamedGeneratorImpl
