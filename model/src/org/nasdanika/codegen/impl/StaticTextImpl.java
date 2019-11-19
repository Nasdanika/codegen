/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.StaticTextImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.StaticTextImpl#isInterpolate <em>Interpolate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticTextImpl extends GeneratorImpl<String> implements StaticText {
	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENTS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERPOLATE_EDEFAULT = false;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STATIC_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContents() {
		return (String)eDynamicGet(CodegenPackage.STATIC_TEXT__CONTENTS, CodegenPackage.Literals.STATIC_TEXT__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(String newContents) {
		eDynamicSet(CodegenPackage.STATIC_TEXT__CONTENTS, CodegenPackage.Literals.STATIC_TEXT__CONTENTS, newContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(CodegenPackage.STATIC_TEXT__INTERPOLATE, CodegenPackage.Literals.STATIC_TEXT__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(CodegenPackage.STATIC_TEXT__INTERPOLATE, CodegenPackage.Literals.STATIC_TEXT__INTERPOLATE, newInterpolate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.STATIC_TEXT__CONTENTS:
				return getContents();
			case CodegenPackage.STATIC_TEXT__INTERPOLATE:
				return isInterpolate();
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
			case CodegenPackage.STATIC_TEXT__CONTENTS:
				setContents((String)newValue);
				return;
			case CodegenPackage.STATIC_TEXT__INTERPOLATE:
				setInterpolate((Boolean)newValue);
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
			case CodegenPackage.STATIC_TEXT__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case CodegenPackage.STATIC_TEXT__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
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
			case CodegenPackage.STATIC_TEXT__CONTENTS:
				return CONTENTS_EDEFAULT == null ? getContents() != null : !CONTENTS_EDEFAULT.equals(getContents());
			case CodegenPackage.STATIC_TEXT__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected Supplier<String> createWorkItem(Context context) throws Exception {
		
		return new Supplier<String>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String execute(ProgressMonitor monitor) throws Exception {
				return isInterpolate() ? context.interpolate(getContents()) : getContents();
			}

			@Override
			public String name() {
				return getTitle();
			}

			@Override
			public boolean rollback(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		};
	}

} //StaticTextImpl
