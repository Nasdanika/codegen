/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.FreeMarkerGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Marker Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeMarkerGeneratorImpl extends GeneratorImpl implements FreeMarkerGenerator {
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeMarkerGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FREE_MARKER_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__BASE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__BASE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplate() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(String newTemplate) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__MODEL, CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__MODEL, CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				return getBase();
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				return getTemplate();
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				return getModel();
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
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				setBase((String)newValue);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				setModel((String)newValue);
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
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				return BASE_EDEFAULT == null ? getBase() != null : !BASE_EDEFAULT.equals(getBase());
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? getTemplate() != null : !TEMPLATE_EDEFAULT.equals(getTemplate());
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
		}
		return super.eIsSet(featureID);
	}

} //FreeMarkerGeneratorImpl
