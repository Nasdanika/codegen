/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationIncludes <em>Interpolation Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationExcludes <em>Interpolation Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationCharset <em>Interpolation Charset</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getReconcileAction <em>Reconcile Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceCollectionImpl extends GeneratorImpl implements ResourceCollection {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInterpolationCharset() <em>Interpolation Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATION_CHARSET_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getReconcileAction() <em>Reconcile Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconcileAction()
	 * @generated
	 * @ordered
	 */
	protected static final ReconcileAction RECONCILE_ACTION_EDEFAULT = ReconcileAction.OVERWRITE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__PATH, CodegenPackage.Literals.RESOURCE_COLLECTION__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__PATH, CodegenPackage.Literals.RESOURCE_COLLECTION__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__PREFIX, CodegenPackage.Literals.RESOURCE_COLLECTION__PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__PREFIX, CodegenPackage.Literals.RESOURCE_COLLECTION__PREFIX, newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getIncludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExcludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getInterpolationIncludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getInterpolationExcludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpolationCharset() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolationCharset(String newInterpolationCharset) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, newInterpolationCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconcileAction getReconcileAction() {
		return (ReconcileAction)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE_COLLECTION__RECONCILE_ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconcileAction(ReconcileAction newReconcileAction) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE_COLLECTION__RECONCILE_ACTION, newReconcileAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				return getPath();
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				return getPrefix();
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				return getIncludes();
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				return getExcludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				return getInterpolationIncludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				return getInterpolationExcludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				return getInterpolationCharset();
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				return getReconcileAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				setPath((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				setPrefix((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				getInterpolationIncludes().clear();
				getInterpolationIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				getInterpolationExcludes().clear();
				getInterpolationExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				setInterpolationCharset((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				setReconcileAction((ReconcileAction)newValue);
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
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				getIncludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				getExcludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				getInterpolationIncludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				getInterpolationExcludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				setInterpolationCharset(INTERPOLATION_CHARSET_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				setReconcileAction(RECONCILE_ACTION_EDEFAULT);
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
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				return PREFIX_EDEFAULT == null ? getPrefix() != null : !PREFIX_EDEFAULT.equals(getPrefix());
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				return !getIncludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				return !getExcludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				return !getInterpolationIncludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				return !getInterpolationExcludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				return INTERPOLATION_CHARSET_EDEFAULT == null ? getInterpolationCharset() != null : !INTERPOLATION_CHARSET_EDEFAULT.equals(getInterpolationCharset());
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				return getReconcileAction() != RECONCILE_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ResourceCollectionImpl
