/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.ContentGeneratorReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Generator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContentGeneratorReferenceImpl extends GeneratorReferenceImpl<ContentGenerator> implements ContentGeneratorReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentGeneratorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONTENT_GENERATOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTarget(ContentGenerator newTarget) {
		super.setTarget(newTarget);
	}

} //ContentGeneratorReferenceImpl
