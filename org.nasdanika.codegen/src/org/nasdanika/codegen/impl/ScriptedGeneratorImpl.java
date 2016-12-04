/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.IGenerator;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Provider;
import org.nasdanika.codegen.ScriptedGenerator;
import org.nasdanika.codegen.SimpleMutableContext;
import org.nasdanika.codegen.Work;
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
public abstract class ScriptedGeneratorImpl<T> extends GeneratorImpl<T> implements ScriptedGenerator<T> {
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
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT }));
				
				result = false;
			} else {
				try {
					createScriptEvaluator(new SimpleMutableContext());						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Script has errors: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT }));
				
					result = false;						
				}				
			}
		}
		return result;
	}	
		
	private ScriptEvaluator createScriptEvaluator(MutableContext context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getScript());
		se.setReturnType(Context.class);
		se.setParameters(new String[] { "context", "generator", "monitor" }, new Class[] { MutableContext.class, this.getClass(), SubMonitor.class });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}	
		
	@Override
	public Work<T> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		SubMonitor.convert(monitor, getWorkFactorySize()).worked(getWorkFactorySize());;
		return new Work<T>() {
			
			@Override
			public int size() {
				return 2;
			}
			
			@Override
			public T execute(IProgressMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				@SuppressWarnings("unchecked")
				T result = (T) createScriptEvaluator(context).evaluate(new Object[] { context, ScriptedGeneratorImpl.this, subMon.split(1) });
				return configure(context, result, subMon.split(1));
			}
			
		};
	}
	
	@Override
	public int getWorkFactorySize() {
		return 1;
	}
	

} //ScriptedGeneratorImpl
