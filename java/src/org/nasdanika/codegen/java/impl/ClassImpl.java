/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements org.nasdanika.codegen.java.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CLASS;
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
		ret.append("class ").append(context.interpolate(getName()));
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
			int idx = 0;
			for (String st: getSuperTypes()) {
				String superTypeName = context.interpolate(st);
				if (superTypeName.trim().length() > 0) {
					if (idx == 0) {
						if (Object.class.getName().equals(superTypeName)) {
							++idx;
							continue; 
						}
						ret.append(" extends ");
					} else {
						if (idx == 1) {
							ret.append(" implements ");
						} else {
							ret.append(", ");
						}
					}
					ret.append(superTypeName);
					++idx;
				}
			}
		}
		ret.append(" {").append(System.lineSeparator()).append(body).append(System.lineSeparator()).append("}").append(System.lineSeparator());		
		return ret.toString();
	}

} //ClassImpl
