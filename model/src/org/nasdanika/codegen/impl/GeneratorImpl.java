/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;

import org.nasdanika.codegen.util.CodegenValidator;

import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getContextMap <em>Context Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorImpl extends EntityImpl implements Generator {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getIterator() <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContextMap() <em>Context Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextMap()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_MAP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getConfiguration() {
		return (EList<EObject>)eDynamicGet(CodegenPackage.GENERATOR__CONFIGURATION, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return (Boolean)eDynamicGet(CodegenPackage.GENERATOR__ENABLED, CodegenPackage.Literals.GENERATOR__ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		eDynamicSet(CodegenPackage.GENERATOR__ENABLED, CodegenPackage.Literals.GENERATOR__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIterator() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__ITERATOR, CodegenPackage.Literals.GENERATOR__ITERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIterator(String newIterator) {
		eDynamicSet(CodegenPackage.GENERATOR__ITERATOR, CodegenPackage.Literals.GENERATOR__ITERATOR, newIterator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextMap() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__CONTEXT_MAP, CodegenPackage.Literals.GENERATOR__CONTEXT_MAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextMap(String newContextMap) {
		eDynamicSet(CodegenPackage.GENERATOR__CONTEXT_MAP, CodegenPackage.Literals.GENERATOR__CONTEXT_MAP, newContextMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return getConfiguration();
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled();
			case CodegenPackage.GENERATOR__ITERATOR:
				return getIterator();
			case CodegenPackage.GENERATOR__CONTEXT_MAP:
				return getContextMap();
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
			case CodegenPackage.GENERATOR__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends EObject>)newValue);
				return;
			case CodegenPackage.GENERATOR__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CodegenPackage.GENERATOR__ITERATOR:
				setIterator((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_MAP:
				setContextMap((String)newValue);
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
			case CodegenPackage.GENERATOR__CONFIGURATION:
				getConfiguration().clear();
				return;
			case CodegenPackage.GENERATOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__ITERATOR:
				setIterator(ITERATOR_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_MAP:
				setContextMap(CONTEXT_MAP_EDEFAULT);
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
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled() != ENABLED_EDEFAULT;
			case CodegenPackage.GENERATOR__ITERATOR:
				return ITERATOR_EDEFAULT == null ? getIterator() != null : !ITERATOR_EDEFAULT.equals(getIterator());
			case CodegenPackage.GENERATOR__CONTEXT_MAP:
				return CONTEXT_MAP_EDEFAULT == null ? getContextMap() != null : !CONTEXT_MAP_EDEFAULT.equals(getContextMap());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Configurable.class) {
			switch (derivedFeatureID) {
				case CodegenPackage.GENERATOR__CONFIGURATION: return NcorePackage.CONFIGURABLE__CONFIGURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Configurable.class) {
			switch (baseFeatureID) {
				case NcorePackage.CONFIGURABLE__CONFIGURATION: return CodegenPackage.GENERATOR__CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorImpl
