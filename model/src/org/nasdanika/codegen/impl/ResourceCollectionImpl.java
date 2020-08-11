/**
 */
package org.nasdanika.codegen.impl;

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
	 * The default value of the '{@link #getIncludes() <em>Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInterpolationIncludes() <em>Interpolation Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationIncludes()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATION_INCLUDES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInterpolationExcludes() <em>Interpolation Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationExcludes()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATION_EXCLUDES_EDEFAULT = null;

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
	public String getIncludes() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludes(String newIncludes) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INCLUDES, newIncludes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getExcludes() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludes(String newExcludes) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__EXCLUDES, newExcludes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getInterpolationIncludes() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolationIncludes(String newInterpolationIncludes) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, newInterpolationIncludes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getInterpolationExcludes() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolationExcludes(String newInterpolationExcludes) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, newInterpolationExcludes);
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
				setIncludes((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				setExcludes((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				setInterpolationIncludes((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				setInterpolationExcludes((String)newValue);
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
				setIncludes(INCLUDES_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				setExcludes(EXCLUDES_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				setInterpolationIncludes(INTERPOLATION_INCLUDES_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				setInterpolationExcludes(INTERPOLATION_EXCLUDES_EDEFAULT);
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
				return INCLUDES_EDEFAULT == null ? getIncludes() != null : !INCLUDES_EDEFAULT.equals(getIncludes());
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				return EXCLUDES_EDEFAULT == null ? getExcludes() != null : !EXCLUDES_EDEFAULT.equals(getExcludes());
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				return INTERPOLATION_INCLUDES_EDEFAULT == null ? getInterpolationIncludes() != null : !INTERPOLATION_INCLUDES_EDEFAULT.equals(getInterpolationIncludes());
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				return INTERPOLATION_EXCLUDES_EDEFAULT == null ? getInterpolationExcludes() != null : !INTERPOLATION_EXCLUDES_EDEFAULT.equals(getInterpolationExcludes());
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				return getReconcileAction() != RECONCILE_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ResourceCollectionImpl
