/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JavaTextFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Text Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaTextFilterImpl extends JavaFilterImpl<String> implements JavaTextFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTextFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_TEXT_FILTER;
	}

	@Override
	protected String combine(List<String> generationResult) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (String str: generationResult) {
			sb.append(str);
		}
		return sb.toString();
	}

} //JavaTextFilterImpl
