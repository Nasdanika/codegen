/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.internal.content.ILazySource;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.GeneratorLabelProvider;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.SimpleMutableContext;
import org.nasdanika.config.impl.ConfigurationImpl;

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
	 * Creates a collection of contexts by creating a context from parent context and then evaluating iterator.
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Collection<Context> iterate(Context thisContext) throws Exception {
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
		
		if (result instanceof Context) {
			return Collections.singleton((Context) result);
		}
		
		if (result instanceof Collection) {
			return (Collection<Context>) result;
		}
						
		if (result.getClass().isArray() && Context.class.isAssignableFrom(result.getClass().getComponentType())) {
			List<Context> ret = new ArrayList<>();
			for (int i=0; i<Array.getLength(result); ++i) {
				ret.add((Context) Array.get(result, i));
			}
			return ret;
		}
		
		throw new IllegalArgumentException("Unexpected iterator return value: "+result);
	}

	private ScriptEvaluator createIteratorEvaluator(Context context) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getIterator());
		se.setReturnType(Object.class);
		se.setParameters(new String[] { "context", "generator" }, new Class[] { Context.class, this.getClass() });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}
	
	private ScriptEvaluator createConfiguratorEvaluator(Context context, Class<?> resultType) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getConfigurator()+System.lineSeparator()+"return result;");
		se.setReturnType(resultType);
		se.setParameters(new String[] { "context", "result", "monitor" }, new Class[] { Context.class, resultType, SubMonitor.class });
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
	@SuppressWarnings("unchecked")
	protected T configure(Context context, T result, SubMonitor monitor) throws Exception {
		if (result != null && getConfigurator() != null && getConfigurator().trim().length() > 0) {
			return (T) createConfiguratorEvaluator(context, result.getClass()).evaluate(new Object[] { context, result, monitor });
		}
		
		monitor.worked(1);
		return result;
	}
	
	/**
	 * @return true if subclass explicitly invokes configure and it shall not be implicitly invoked from <code>createWork()</code> method.
	 */
	protected boolean isExplicitConfigure() {
		return false;
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
	 * Creates a work item for this generator. 
	 * The work item may be invoked zero or more times depending on the result returned by iterator.
	 * The work item execute() method receives context created by the generator using parent context passed to the work which wraps this work.
	 * @throws Exception
	 */
	protected abstract Work<T> createWorkItem() throws Exception;	

	/**
	 * Creates work which creates context and then iterates over contexts created 
	 * the iterator and invokes work created by <code>createWorkItem()</code> for each context. 
	 */
	@Override
	final public Work<List<T>> createWork() throws Exception {
		Work<T> workItem = createWorkItem();
		
		return new Work<List<T>>() {
			
			@Override
			public int size() {
				return getConfigWorkSize() + workItem.size() + (isExplicitConfigure() ? 0 : 1);
			}
			
			@Override
			public List<T> execute(Context context, SubMonitor monitor) throws Exception {
				GeneratorLabelProvider labelProvider = context.get(GeneratorLabelProvider.class);
				String label = labelProvider == null ? EcoreUtil.getIdentification(GeneratorImpl.this) : labelProvider.getLabel(GeneratorImpl.this);
				monitor.setTaskName("Generating "+label);
				Collection<Context> iContexts = iterate(createContext(context, monitor));
				if (iContexts.isEmpty()) {
					monitor.worked(workItem.size());
					return Collections.emptyList();
				}
				
				if (iContexts.size() == 1) {
					return Collections.singletonList(workItem.execute(iContexts.iterator().next(), monitor));
				}

				List<T> ret = new ArrayList<>();
				monitor.setWorkRemaining(iContexts.size()*size());
				for (Context iCtx: iContexts) {
					T workResult = workItem.execute(iCtx, monitor);
					ret.add(isExplicitConfigure() ? workResult : configure(iCtx, workResult, monitor.split(1)));
				}
				return ret;
			}
		};
	}
	


} //GeneratorImpl
