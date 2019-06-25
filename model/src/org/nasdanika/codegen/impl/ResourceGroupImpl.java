/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
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
public class ResourceGroupImpl extends GroupImpl<Resource<InputStream>> implements ResourceGroup {
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

} //ResourceGroupImpl