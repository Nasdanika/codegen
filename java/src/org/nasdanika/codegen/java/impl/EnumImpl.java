/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnumImpl extends TypeImpl implements org.nasdanika.codegen.java.Enum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.ENUM;
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
		for (String modifier: getModifiers()) {
			ret.append(context.interpolate(modifier)).append(" ");
		}
		ret.append("enum ").append(context.interpolate(getName()));
		
		if (!getSuperTypes().isEmpty()) {
			ret.append(" implements ");
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

} //EnumImpl
