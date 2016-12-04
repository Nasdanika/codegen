/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.ScriptedGenerator;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ScriptedGeneratorImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScriptedGeneratorImpl<T> extends JavaGeneratorImpl<T> implements ScriptedGenerator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.SCRIPTED_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return (String)eGet(CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		eSet(CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT, newScript);
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
			if (getScript() == null || getScript().trim().length() == 0) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Empty script",
						 new Object [] { this }));
				
				result = false;
			} else {
				try {
					createScriptEvaluator(new MutableContext());						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Iterator script has errors: "+e.getMessage(),
						 new Object [] { this }));
				
					result = false;						
				}				
			}
		}
		return result;
	}	
		
	private ScriptEvaluator createScriptEvaluator(Context context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getScript());
		se.setReturnType(Context.class);
		se.setParameters(new String[] { "context", "generator" }, new Class[] { Context.class, this.getClass() });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}	

} //ScriptedGeneratorImpl
