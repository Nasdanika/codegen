/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StreamGeneratorReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StreamGeneratorReferenceImpl extends GeneratorReferenceImpl<InputStream> implements StreamGeneratorReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamGeneratorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STREAM_GENERATOR_REFERENCE;
	}

} //StreamGeneratorReferenceImpl
