/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Property;
import org.nasdanika.common.Context;
import org.nasdanika.common.DescriptorSet;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.PropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.PropertyImpl#isInterpolate <em>Interpolate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends AbstractNamedGeneratorImpl implements Property {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(CodegenPackage.PROPERTY__VALUE, CodegenPackage.Literals.PROPERTY__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(CodegenPackage.PROPERTY__VALUE, CodegenPackage.Literals.PROPERTY__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(CodegenPackage.PROPERTY__INTERPOLATE, CodegenPackage.Literals.PROPERTY__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(CodegenPackage.PROPERTY__INTERPOLATE, CodegenPackage.Literals.PROPERTY__INTERPOLATE, newInterpolate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.PROPERTY__VALUE:
				return getValue();
			case CodegenPackage.PROPERTY__INTERPOLATE:
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
			case CodegenPackage.PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case CodegenPackage.PROPERTY__INTERPOLATE:
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
			case CodegenPackage.PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CodegenPackage.PROPERTY__INTERPOLATE:
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
			case CodegenPackage.PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case CodegenPackage.PROPERTY__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Work<String> createWork(Context context) throws Exception {
		
		return new Work<String>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String execute(ProgressMonitor monitor) throws Exception {
				return isInterpolate() ? context.interpolate(getValue()) : getValue();
			}
	
			@Override
			public String getName() {
				return "Property "+getName();
			}
	
			@Override
			public boolean rollback(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		};
	}

	@Override
	public DescriptorSet getDescriptor(Context dataSource) {
		// TODO Auto-generated method stub
		return null;
	}
	

} //PropertyImpl
