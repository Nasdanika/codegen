/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ScriptedStreamFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Stream Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScriptedStreamFilterImpl extends ScriptedFilterImpl<InputStream> implements ScriptedStreamFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedStreamFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.SCRIPTED_STREAM_FILTER;
	}

} //ScriptedStreamFilterImpl
