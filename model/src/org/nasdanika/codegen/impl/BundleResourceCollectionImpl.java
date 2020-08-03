/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.BundleResourceCollection;
import org.nasdanika.codegen.CodegenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceCollectionImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleResourceCollectionImpl extends ResourceCollectionImpl implements BundleResourceCollection {
	/**
	 * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleResourceCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBundle() {
		return (String)eDynamicGet(CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE, CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION__BUNDLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(String newBundle) {
		eDynamicSet(CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE, CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION__BUNDLE, newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				return getBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				setBundle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				setBundle(BUNDLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				return BUNDLE_EDEFAULT == null ? getBundle() != null : !BUNDLE_EDEFAULT.equals(getBundle());
		}
		return super.eIsSet(featureID);
	}

} //BundleResourceCollectionImpl
