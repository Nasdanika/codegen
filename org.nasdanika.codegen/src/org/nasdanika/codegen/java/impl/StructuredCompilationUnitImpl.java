/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.StructuredCompilationUnit;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StructuredCompilationUnitImpl extends CompilationUnitImpl implements StructuredCompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredCompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.STRUCTURED_COMPILATION_UNIT;
	}
	
	@Override
	protected Work<ICompilationUnit> createWorkItem() throws Exception {
		throw new UnsupportedOperationException();
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
			diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Not yet supported",
					 new Object [] { this }));
			
			result = false;
		}
		return result;
	}	
	

} //StructuredCompilationUnitImpl
