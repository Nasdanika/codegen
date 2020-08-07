/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.OperationImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends MemberImpl implements Operation {
	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExceptions() <em>Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public String getParameters() {
		return (String)eDynamicGet(JavaPackage.OPERATION__PARAMETERS, JavaPackage.Literals.OPERATION__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters(String newParameters) {
		eDynamicSet(JavaPackage.OPERATION__PARAMETERS, JavaPackage.Literals.OPERATION__PARAMETERS, newParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getExceptions() {
		return (String)eDynamicGet(JavaPackage.OPERATION__EXCEPTIONS, JavaPackage.Literals.OPERATION__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptions(String newExceptions) {
		eDynamicSet(JavaPackage.OPERATION__EXCEPTIONS, JavaPackage.Literals.OPERATION__EXCEPTIONS, newExceptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.OPERATION__PARAMETERS:
				return getParameters();
			case JavaPackage.OPERATION__EXCEPTIONS:
				return getExceptions();
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
			case JavaPackage.OPERATION__PARAMETERS:
				setParameters((String)newValue);
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				setExceptions((String)newValue);
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
			case JavaPackage.OPERATION__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				setExceptions(EXCEPTIONS_EDEFAULT);
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
			case JavaPackage.OPERATION__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? getParameters() != null : !PARAMETERS_EDEFAULT.equals(getParameters());
			case JavaPackage.OPERATION__EXCEPTIONS:
				return EXCEPTIONS_EDEFAULT == null ? getExceptions() != null : !EXCEPTIONS_EDEFAULT.equals(getExceptions());
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
