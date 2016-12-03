/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ScriptedStreamGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Stream Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScriptedStreamGeneratorImpl extends ScriptedGeneratorImpl<InputStream> implements ScriptedStreamGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedStreamGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.SCRIPTED_STREAM_GENERATOR;
	}

} //ScriptedStreamGeneratorImpl
