/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.impl.ContainerImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.SourceFolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SourceFolderImpl extends ContainerImpl implements SourceFolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.SOURCE_FOLDER;
	}
	
	@Override
	public boolean isFilterable() {
		return true;
	}

} //PackageFragmentRootImpl
