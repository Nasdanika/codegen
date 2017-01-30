/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.codegen.java.impl.OperationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends MemberImpl implements Operation {
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
	@SuppressWarnings("unchecked")
	public EList<String> getParameters() {
		return (EList<String>)eGet(JavaPackage.Literals.OPERATION__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getThrownExceptions() {
		return (EList<String>)eGet(JavaPackage.Literals.OPERATION__THROWN_EXCEPTIONS, true);
	}

} //OperationImpl
