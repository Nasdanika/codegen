/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends OperationImpl implements Method {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.METHOD__RETURN_TYPE:
				return getReturnType();
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
			case JavaPackage.METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
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
			case JavaPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
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
			case JavaPackage.METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

	@Override
	protected String generate(Context context, ProgressMonitor monitor, String comment, String body) throws Exception {
		StringBuilder ret = new StringBuilder();
		// Comment
		ret.append(comment);
		// Annotations
		for (String ann: getAnnotations()) {
			ret.append("@").append(context.interpolate(ann)).append(System.lineSeparator());
		}
		// Modifiers
		for (String modifier: getModifiers()) {
			ret.append(context.interpolate(modifier)).append(" ");
		}
		// Type parameters
		if (!getTypeParameters().isEmpty()) {
			ret.append("<");
			Iterator<String> tpit = getTypeParameters().iterator();
			while (tpit.hasNext()) {
				ret.append(context.interpolate(tpit.next()));
				if (tpit.hasNext()) {
					ret.append(", ");
				}
			}
			ret.append("> ");
		}
		// Return type
		String returnType = getReturnType();
		if (returnType == null || returnType.trim().length() == 0) {
			returnType = "void";
		} else {
			returnType= context.interpolate(returnType);
		}
		ret.append(returnType).append(" ");
		
		// Name
		ret.append(context.interpolate(getName()));
		
		// Parameters
		ret.append("(");
		Iterator<String> pit = getParameters().iterator();
		while (pit.hasNext()) {
			ret.append(context.interpolate(pit.next()));
			if (pit.hasNext()) {
				ret.append(", ");
			}
		}		
		ret.append(")");
		
		// Thrown exceptions
		if (!getExceptions().isEmpty()) {
			ret.append(" throws ");
			Iterator<String> eit = getExceptions().iterator();
			while (eit.hasNext()) {
				ret.append(context.interpolate(eit.next()));
				if (eit.hasNext()) {
					ret.append(", ");
				}
			}					
		}
		if (body.trim().length() == 0) { // Empty body - abstract or interface method. Use a comment to produce methods with empty bodies.
			ret.append(";").append(System.lineSeparator());
		} else {
			ret.append(" {").append(System.lineSeparator()).append(body).append(System.lineSeparator()).append("}").append(System.lineSeparator());
		}
		return ret.toString();
	}


} //MethodImpl
