/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Work;
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
						 new Object [] { this, JavaPackage.Literals.TEXT_COMPILATION_UNIT__GENERATOR }));
				
				result = false;
			}
		}
		return result;
	}
	
	@Override
	protected Work<ICompilationUnit> createWorkItem() throws Exception {
		Work<List<String>> gWork = getGenerator().createWork();
		
		return new Work<ICompilationUnit>() {

			@Override
			public int size() {
				return gWork.size() + 3; // 3 is generateCompilationUnit work size
			}
			
			@Override
			public ICompilationUnit execute(Context context, SubMonitor monitor) throws Exception {
				StringBuilder contentBuilder = new StringBuilder();
				for (String e: gWork.execute(context, monitor)) {
					if (contentBuilder.length() > 0) {
						contentBuilder.append(System.lineSeparator());
					}
					contentBuilder.append(e);
				}
				return generateCompilationUnit(context, contentBuilder.toString(), monitor);
			}
			
		};
	}	
	

} //TextCompilationUnitImpl
