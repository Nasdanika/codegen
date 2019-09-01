/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.common.resources.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceGroupImpl extends GroupImpl<org.nasdanika.codegen.Resource<Object>> implements ResourceGroup {
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
	protected Resource<InputStream> join(List<Resource<InputStream>> ret) {
		return null;
	}

} //ResourceGroupImpl
