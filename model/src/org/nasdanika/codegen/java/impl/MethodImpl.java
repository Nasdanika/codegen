/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Iterator;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.config.Context;

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
	public String getReturnType() {
		return (String)eGet(JavaPackage.Literals.METHOD__RETURN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		eSet(JavaPackage.Literals.METHOD__RETURN_TYPE, newReturnType);
	}
	
	@Override
	protected String generate(Context context, SubMonitor monitor, String comment, String body) throws Exception {
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
		if (!getThrownExceptions().isEmpty()) {
			ret.append(" throws ");
			Iterator<String> eit = getThrownExceptions().iterator();
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
