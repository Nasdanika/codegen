/**
 */
package org.nasdanika.codegen.wizard.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.wizard.WizardPackage;
import org.nasdanika.codegen.wizard.WizardPageContent;

import org.nasdanika.codegen.wizard.util.WizardValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class WizardPageContentImpl extends CDOObjectImpl implements WizardPageContent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardPageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.WIZARD_PAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						 WizardValidator.DIAGNOSTIC_SOURCE,
						 WizardValidator.WIZARD_PAGE_CONTENT__VALIDATE,
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
	 * @generated NOT
	 */
	public boolean shallShow() {
		return true;
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
			case WizardPackage.WIZARD_PAGE_CONTENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardPackage.WIZARD_PAGE_CONTENT___SHALL_SHOW:
				return shallShow();
		}
		return super.eInvoke(operationID, arguments);
	}

} //WizardPageContentImpl
