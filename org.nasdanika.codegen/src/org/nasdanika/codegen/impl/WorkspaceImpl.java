/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Workspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WorkspaceImpl extends GroupImpl<IProject> implements Workspace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.WORKSPACE;
	}

} //WorkspaceRootImpl
