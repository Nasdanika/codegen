/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.codegen.java.Constructor;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstructorImpl extends OperationImpl implements Constructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CONSTRUCTOR;
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
		
		// Name
		for (EObject c = eContainer(); c != null; c = c.eContainer()) {
			if (c instanceof Type) {
				ret.append(context.interpolate(((Type) c).getName()));
				break;
			}			
		}
		
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
		ret.append(" {").append(System.lineSeparator()).append(body).append(System.lineSeparator()).append("}").append(System.lineSeparator());
		return ret.toString();
	}
	

} //ConstructorImpl
