/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.common.resources.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceGeneratorReferenceImpl extends GeneratorReferenceImpl<Resource<InputStream>> implements ResourceGeneratorReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGeneratorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_GENERATOR_REFERENCE;
	}

} //ResourceGeneratorReferenceImpl
