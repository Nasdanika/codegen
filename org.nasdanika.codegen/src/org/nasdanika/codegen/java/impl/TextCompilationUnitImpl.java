/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.Generator;

import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.TextCompilationUnit;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.TextCompilationUnitImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextCompilationUnitImpl extends CompilationUnitImpl implements TextCompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextCompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.TEXT_COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.TEXT_COMPILATION_UNIT__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<String> newGenerator) {
		eSet(JavaPackage.Literals.TEXT_COMPILATION_UNIT__GENERATOR, newGenerator);
	}
	
	@Override
	public int getWorkFactorySize() {
		return super.getWorkFactorySize() + getGenerator().getWorkFactorySize();
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
			if (getGenerator() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
						 new Object [] { this }));
				
				result = false;
			}
		}
		return result;
	}	
	

} //TextCompilationUnitImpl
