/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.SimpleMutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getConfigurator <em>Configurator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorImpl<T> extends ConfigurationImpl implements Generator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterator() {
		return (String)eGet(CodegenPackage.Literals.GENERATOR__ITERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(String newIterator) {
		eSet(CodegenPackage.Literals.GENERATOR__ITERATOR, newIterator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurator() {
		return (String)eGet(CodegenPackage.Literals.GENERATOR__CONFIGURATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurator(String newConfigurator) {
		eSet(CodegenPackage.Literals.GENERATOR__CONFIGURATOR, newConfigurator);
	}

	/**
	 * Creates iterable by creating a context from parent context and then evaluating iterator.
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Iterable<MutableContext> iterate(MutableContext thisContext) throws Exception {
		GeneratorFilter gf = thisContext.get(GeneratorFilter.class);
		if (gf != null && !gf.test(this)) {
			Collections.emptySet();
		}
		
		String iterator = getIterator();
		if (iterator == null || iterator.trim().length() == 0) {
			return Collections.singleton(thisContext);
		}
		
		Object result = createIteratorEvaluator(thisContext).evaluate(new Object[] { thisContext, this });
		if (result == null || Boolean.FALSE.equals(result)) {
			return Collections.emptySet();
		}
		
		if (result instanceof MutableContext) {
			return Collections.singleton((MutableContext) result);
		}
		
		if (result instanceof Iterable) {
			return (Iterable<MutableContext>) result;
		}
				
		if (result.getClass().isArray() && Context.class.isAssignableFrom(result.getClass().getComponentType())) {
			List<MutableContext> ret = new ArrayList<>();
			for (int i=0; i<Array.getLength(result); ++i) {
				ret.add((MutableContext) Array.get(result, i));
			}
			return ret;
		}
		
		throw new IllegalArgumentException("Unexpected iterator return value: "+result);
	}

	private ScriptEvaluator createIteratorEvaluator(Context context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getIterator());
		se.setReturnType(Object.class);
		se.setParameters(new String[] { "context", "generator" }, new Class[] { MutableContext.class, this.getClass() });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}
	
	private ScriptEvaluator createConfiguratorEvaluator(Context context, Class<?> resultType) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getConfigurator()+System.lineSeparator()+"return result;");
		se.setReturnType(resultType);
		se.setParameters(new String[] { "context", "result", "monitor" }, new Class[] { MutableContext.class, resultType, SubMonitor.class });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}	
	
	/**
	 * Executes configurator script.
	 * @param context
	 * @param result
	 * @param monitor
	 * @throws Exception
	 */
	protected T configure(MutableContext context, T result, SubMonitor monitor) throws Exception {
		if (result != null && getConfigurator() != null && getConfigurator().trim().length() > 0) {
			return (T) createConfiguratorEvaluator(context, result.getClass()).evaluate(new Object[] { context, result, monitor });
		}
		
		monitor.worked(1);
		return result;
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getIterator() != null && getIterator().trim().length() > 0) {
				try {
					createIteratorEvaluator(new SimpleMutableContext());						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Iterator script has errors: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.GENERATOR__ITERATOR }));
				
					result = false;						
				}
			}			
			if (getConfigurator() != null && getConfigurator().trim().length() > 0) {
				try {
					createConfiguratorEvaluator(new SimpleMutableContext(), Object.class);						
				} catch (CompileException e) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Configurator script has errors: "+e.getMessage(),
						 new Object [] { this, CodegenPackage.Literals.GENERATOR__CONFIGURATOR }));
				
					result = false;						
				}
			}			
		}
		return result;
	}
	
	/**
	 * This method is invoked by <code>createWork()</code> for each context produced by the iterator.
	 * @param context
	 * @param monitor
	 * @return work or null.
	 * @throws Exception
	 */
	protected abstract Work<T> doCreateWork(MutableContext iterationContext, IProgressMonitor monitor) throws Exception;	

	@Override
	final public Work<List<T>> createWork(Context parent, IProgressMonitor monitor) throws Exception {
		List<Work<T>> allWork = new ArrayList<>();
		int[] totalWork = {0};
		MutableContext thisContext = createContext(parent);
		for (MutableContext iCtx: iterate(thisContext)) {
			Work<T> iWork = doCreateWork(iCtx, monitor);
			if (iWork != null) {
				allWork.add(iWork);
				totalWork[0] += iWork.size();
			}
		}			
		
		return new Work<List<T>>() {
			
			@Override
			public int size() {
				return totalWork[0];
			}
			
			@Override
			public List<T> execute(IProgressMonitor monitor) throws Exception {
				List<T> ret = new ArrayList<>();
				SubMonitor sm = SubMonitor.convert(monitor, size());
				for (Work<T> iWork: allWork) {
					if (iWork != null) {
						T iResult = iWork.execute(sm.split(iWork.size()));
						if (iResult != null) {
							ret.add(iResult);
						}
					}
				}
				return ret;
			}
		};
	}
	


} //GeneratorImpl
