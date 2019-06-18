/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ObjectStreamGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Stream Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectStreamGeneratorImpl extends ObjectGeneratorImpl<InputStream> implements ObjectStreamGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectStreamGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.OBJECT_STREAM_GENERATOR;
	}

} //ObjectStreamGeneratorImpl
