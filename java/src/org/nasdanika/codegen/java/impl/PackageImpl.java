/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.impl.ContainerImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.common.Context;

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
	protected Context createContext(Context parent) {
		Context ctx = super.createContext(parent);
		String parentPackageName = ctx.getString(PACKAGE_NAME_KEY);
		String packageName = ctx.interpolate(getName());
		String fullyQualifiedName = parentPackageName == null ? packageName : parentPackageName+"."+packageName;
		return Context.singleton(PACKAGE_NAME_KEY, fullyQualifiedName)
				.compose(Context.singleton(PACKAGE_TYPES_KEY, new ArrayList<>()))
				.compose(ctx);
	}
	
	@Override
	protected String finalName(String name) {
		return name.replace('.',  '/');
	}
	
	@Override
	public boolean isFilterable() {
		return true;
	}

} //PackageFragmentImpl
