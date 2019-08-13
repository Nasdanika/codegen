/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Iterator;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.java.Interface;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterfaceImpl extends TypeImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.INTERFACE;
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
		for (String modifier: getModifiers()) {
			ret.append(context.interpolate(modifier)).append(" ");
		}
		ret.append("interface ").append(context.interpolate(getName()));
		if (!getTypeParameters().isEmpty()) {
			ret.append("<");
			boolean isFirst = true;
			for (String tp: getTypeParameters()) {
				if (!isFirst) {
					ret.append(",");
				}
				ret.append(context.interpolate(tp));
				isFirst = false;
			}
			ret.append(">");
		}
		
		if (!getSuperTypes().isEmpty()) {
			ret.append(" extends ");
			Iterator<String> stit = getSuperTypes().iterator();
			while (stit.hasNext()) {
				ret.append(context.interpolate(stit.next()));
				if (stit.hasNext()) {
					ret.append(", ");
				}
			}
		}
		ret.append(" {").append(System.lineSeparator()).append(body).append(System.lineSeparator()).append("}").append(System.lineSeparator());		
		return ret.toString();
	}
	

} //InterfaceImpl
