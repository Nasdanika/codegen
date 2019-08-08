/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.TextGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextGroupImpl extends GroupImpl<String> implements TextGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.TEXT_GROUP;
	}

	/**
	 * Concatenates results.
	 */
	@Override
	protected String join(List<String> results) {
		StringBuilder ret = new StringBuilder();
		results.forEach(ret::append);
		return ret.toString();
	}

} //TextGroupImpl
