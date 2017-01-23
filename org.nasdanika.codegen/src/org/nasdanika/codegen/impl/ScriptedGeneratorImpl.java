/**
 */
package org.nasdanika.codegen.impl;

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
import org.nasdanika.codegen.ScriptedGenerator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.SimpleMutableContext;

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
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Empty script",
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT }));
				
				result = false;
			} else {
				try {
					SimpleMutableContext evaluatorContext = new SimpleMutableContext();
					ClassLoader classLoader = (ClassLoader) context.get(ClassLoader.class);
					if (classLoader == null) {
						classLoader = getClass().getClassLoader();
					}
					evaluatorContext.setClassLoader(classLoader);				
					createScriptEvaluator(evaluatorContext);						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Script has errors: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT }));
				
					result = false;						
				} catch (Exception e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Could not validate script: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.SCRIPTED_GENERATOR__SCRIPT }));
				
					result = false;						
				}				
			}
		}
		return result;
	}	
		
	private ScriptEvaluator createScriptEvaluator(Context context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator();
		se.setReturnType(Context.class);
		se.setParameters(new String[] { "context", "generator", "monitor" }, new Class[] { Context.class, this.getClass(), SubMonitor.class });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		se.cook(getScript());
		return se;
	}	
		
	@Override
	public Work<T> createWorkItem() throws Exception {
		return new Work<T>() {
			
			@Override
			public int size() {
				return 2;
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public T execute(Context context, SubMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				return (T) createScriptEvaluator(context).evaluate(new Object[] { context, ScriptedGeneratorImpl.this, subMon.split(1) });
			}
			
		};
	}
	

} //ScriptedGeneratorImpl
