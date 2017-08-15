/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.GenericFile;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic File</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GenericFileImpl<C> extends ResourceImpl<IFile> implements GenericFile<C> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GENERIC_FILE;
	}
	
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
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generic File requires a controller",
						 new Object [] { this, CodegenPackage.Literals.RESOURCE__NAME }));
				
				result = false;
			}
		}
		return result;
	}

} //GenericFileImpl
