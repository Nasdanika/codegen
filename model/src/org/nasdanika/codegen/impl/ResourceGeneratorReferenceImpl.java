/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ResourceGeneratorReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceGeneratorReferenceImpl extends GeneratorReferenceImpl<ResourceGenerator> implements ResourceGeneratorReference {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTarget(ResourceGenerator newTarget) {
		super.setTarget(newTarget);
	}

} //ResourceGeneratorReferenceImpl
