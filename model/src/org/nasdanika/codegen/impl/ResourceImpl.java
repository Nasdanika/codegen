/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceImpl#getReconcileAction <em>Reconcile Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl<T> extends ResourceGeneratorImpl<T> implements Resource<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CodegenPackage.Literals.RESOURCE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CodegenPackage.Literals.RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconcileAction getReconcileAction() {
		return (ReconcileAction)eGet(CodegenPackage.Literals.RESOURCE__RECONCILE_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcileAction(ReconcileAction newReconcileAction) {
		eSet(CodegenPackage.Literals.RESOURCE__RECONCILE_ACTION, newReconcileAction);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (isNonBlankName() && (getName() == null || getName().trim().length() == 0)) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, CodegenPackage.Literals.RESOURCE__NAME }));
				
				result = false;
			}
		}
		return result;
	}	
	
	/**
	 * 
	 * @return true if name cannot be blank.
	 */
	protected boolean isNonBlankName() {
		return true;
	}
	
	@Override
	public boolean isFilterable() {
		return true;
	}

} //ResourceImpl
