/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;
import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ScriptedFilter;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.SimpleMutableContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ScriptedFilterImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScriptedFilterImpl<T> extends FilterImpl<T> implements ScriptedFilter<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.SCRIPTED_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return (String)eGet(CodegenPackage.Literals.SCRIPTED_FILTER__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		eSet(CodegenPackage.Literals.SCRIPTED_FILTER__SCRIPT, newScript);
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
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Empty script",
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_FILTER__SCRIPT }));
				
				result = false;
			} else {
				try {
					createScriptEvaluator(new SimpleMutableContext());						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Script has errors: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_FILTER__SCRIPT }));
				
					result = false;						
				}				
			}
		}
		return result;
	}	
		
	private ScriptEvaluator createScriptEvaluator(Context context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getScript());
		se.setReturnType(Object.class);
		se.setParameters(new String[] { "context", "generator", "monitor" }, new Class[] { Context.class, this.getClass(), SubMonitor.class });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}	
	
	@Override
	protected T filter(Context context, List<T> generationResult, SubMonitor subMonitor) throws Exception {
		return (T) createScriptEvaluator(context).evaluate(new Object[] { context, generationResult, subMonitor.split(getFilterWorkSize()) });
	}
	
	@Override
	protected int getFilterWorkSize() {
		return 1;
	}

} //ScriptedFilterImpl
