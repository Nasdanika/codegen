/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JavaGenerator;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.JavaGeneratorImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.JavaGeneratorImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaGeneratorImpl<T> extends GeneratorImpl<T> implements JavaGenerator<T> {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassName() {
		return (String)eDynamicGet(CodegenPackage.JAVA_GENERATOR__CLASS_NAME, CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassName(String newClassName) {
		eDynamicSet(CodegenPackage.JAVA_GENERATOR__CLASS_NAME, CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME, newClassName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getArguments() {
		return (EList<String>)eDynamicGet(CodegenPackage.JAVA_GENERATOR__ARGUMENTS, CodegenPackage.Literals.JAVA_GENERATOR__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.JAVA_GENERATOR__CLASS_NAME:
				return getClassName();
			case CodegenPackage.JAVA_GENERATOR__ARGUMENTS:
				return getArguments();
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
			case CodegenPackage.JAVA_GENERATOR__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CodegenPackage.JAVA_GENERATOR__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends String>)newValue);
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
			case CodegenPackage.JAVA_GENERATOR__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CodegenPackage.JAVA_GENERATOR__ARGUMENTS:
				getArguments().clear();
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
			case CodegenPackage.JAVA_GENERATOR__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? getClassName() != null : !CLASS_NAME_EDEFAULT.equals(getClassName());
			case CodegenPackage.JAVA_GENERATOR__ARGUMENTS:
				return !getArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getClassName() == null || getClassName().trim().length() == 0) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator class name is not set",
					 new Object [] { this, CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME }));
			
				result = false;						
			}			
		}
		return result;
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	protected Supplier<T> createWorkItem(Context context) throws Exception {
		return (Supplier<T>) instantiate(context, getClassName(), getArguments());
	}

	
} //JavaGeneratorImpl
