/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.impl.ContainerImpl;
import org.nasdanika.codegen.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PackageImpl extends ContainerImpl implements org.nasdanika.codegen.java.Package {
	public static final String PACKAGE_NAME_KEY = "package-name";
	
	/**
	 * This key value contains a list of types defined in this package.
	 */
	public static final String PACKAGE_TYPES_KEY = "package-types";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PACKAGE;
	}

	@Override
	public boolean isFilterable() {
		return true;
	}

} //PackageFragmentImpl
