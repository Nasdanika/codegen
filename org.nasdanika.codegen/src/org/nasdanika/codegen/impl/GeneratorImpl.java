/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getIterator <em>Iterator</em>}</li>
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
	 * Creates iterable by creating a context from parent context and then evaluating iterator.
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Iterable<Context> iterate(Context parentContext) throws Exception {
		GeneratorFilter gf = parentContext.get(GeneratorFilter.class);
		if (gf != null && !gf.test(this)) {
			Collections.emptySet();
		}
		
		Context context = createContext(parentContext);
		
		String iterator = getIterator();
		if (iterator == null || iterator.trim().length() == 0) {
			return Collections.singleton(context);
		}
		
		ScriptEvaluator se = new ScriptEvaluator(iterator);
		se.setReturnType(Object.class);
		se.setParameters(new String[] { "context", "generator" }, new Class[] { Context.class, this.getClass() });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		Object result = se.evaluate(new Object[] { context, this });
		if (result == null || Boolean.FALSE.equals(result)) {
			return Collections.emptySet();
		}
		
		if (result instanceof Context) {
			return Collections.singleton((Context) result);
		}
		
		if (result instanceof Iterable) {
			return (Iterable<Context>) result;
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
	
	/**
	 * This method is invoked by <code>createWork()</code> for each context produced by the iterator.
	 * @param context
	 * @param monitor
	 * @return work or null.
	 * @throws Exception
	 */
	protected abstract Work<T> doCreateWork(Context iterationContext, IProgressMonitor monitor) throws Exception;	

	@Override
	final public Work<List<T>> createWork(Context context, IProgressMonitor monitor) throws Exception {
		List<Work<T>> allWork = new ArrayList<>();
		int[] totalWork = {0};
		for (Context iCtx: iterate(context)) {
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
