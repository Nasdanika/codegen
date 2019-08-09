/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceImpl#getReconcileAction <em>Reconcile Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl<T extends org.nasdanika.common.resources.Resource<InputStream>> extends GeneratorImpl<T> implements Resource<T> {
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
	 * The default value of the '{@link #getReconcileAction() <em>Reconcile Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconcileAction()
	 * @generated
	 * @ordered
	 */
	protected static final ReconcileAction RECONCILE_ACTION_EDEFAULT = ReconcileAction.OVERWRITE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE__NAME, CodegenPackage.Literals.RESOURCE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CodegenPackage.RESOURCE__NAME, CodegenPackage.Literals.RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconcileAction getReconcileAction() {
		return (ReconcileAction)eDynamicGet(CodegenPackage.RESOURCE__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE__RECONCILE_ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconcileAction(ReconcileAction newReconcileAction) {
		eDynamicSet(CodegenPackage.RESOURCE__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE__RECONCILE_ACTION, newReconcileAction);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.RESOURCE__NAME:
				return getName();
			case CodegenPackage.RESOURCE__RECONCILE_ACTION:
				return getReconcileAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case CodegenPackage.RESOURCE__RECONCILE_ACTION:
				setReconcileAction((ReconcileAction)newValue);
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
			case CodegenPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE__RECONCILE_ACTION:
				setReconcileAction(RECONCILE_ACTION_EDEFAULT);
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
			case CodegenPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CodegenPackage.RESOURCE__RECONCILE_ACTION:
				return getReconcileAction() != RECONCILE_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * 
	 * @return true if name cannot be blank.
	 */
	protected boolean isNonBlankName() {
		return true;
	}
	
	@Override
	public boolean isFilterable() {
		return true;
	}

} //ResourceImpl
