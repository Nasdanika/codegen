/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceGroupImpl extends GroupImpl<BinaryResource> implements ResourceGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_GROUP;
	}

	/**
	 * The group result is irrelevant because elements create output in the container passed as a context service.
	 */
	@Override
	protected BinaryResource join(List<BinaryResource> elementResults) {
		return null;
	}

} //ResourceGroupImpl
