/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.GeneratorLabelProvider;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;
import org.nasdanika.config.Provider;
import org.nasdanika.config.impl.ConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getNamedGenerators <em>Named Generators</em>}</li>
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
	public String getController() {
		return (String)eGet(CodegenPackage.Literals.GENERATOR__CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(String newController) {
		eSet(CodegenPackage.Literals.GENERATOR__CONTROLLER, newController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedGenerator> getNamedGenerators() {
		return (EList<NamedGenerator>)eGet(CodegenPackage.Literals.GENERATOR__NAMED_GENERATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFilterable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegenPackage.GENERATOR___IS_FILTERABLE:
				return isFilterable();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Creates a collection of contexts by creating a context from parent context and then evaluating iterator.
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Collection<Context> iterate(Context thisContext) throws Exception {
		if (isFilterable()) {
			GeneratorFilter gf = thisContext.get(GeneratorFilter.class);
			if (gf != null && !gf.test(this)) {
				return Collections.emptySet();
			}
		}
		
		if (getController() == null || getController().trim().length() == 0) {
			return Collections.singleton(thisContext);
		}
		
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) thisContext.getClassLoader().loadClass(getController().trim()).newInstance();
		return controller.iterate(thisContext, this);
	}
	
	/**
	 * @param context
	 * @param result
	 * @param monitor
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	protected T configure(Context context, T result, SubMonitor monitor) throws Exception {
		if (getController() == null || getController().trim().length() == 0) {
			monitor.worked(1);
			return result;
		}
		
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) context.getClassLoader().loadClass(getController().trim()).newInstance();
		return controller.configure(this, context, result, monitor);		
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
		if (diagnostics != null && getController() != null && getController().trim().length() > 0) {
			ClassLoader classLoader = (ClassLoader) context.get(ClassLoader.class);
			if (classLoader == null) {
				classLoader = getClass().getClassLoader();
			}
			try {
				@SuppressWarnings("unchecked")
				GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) classLoader.loadClass(getController().trim()).newInstance();
				controller.validate(this, diagnostics, context);
			} catch (ClassNotFoundException e) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Controller class not found in context classloader: "+e.getMessage(),
					 new Object [] { this, CodegenPackage.Literals.GENERATOR__CONTROLLER }));
			
				result = false;										
			} catch (InstantiationException e) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Controller class could not be instantiated: "+e.getMessage(),
					 new Object [] { this, CodegenPackage.Literals.GENERATOR__CONTROLLER }));
			
				result = false;														
			} catch (Exception e) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Validation error: "+e.getMessage(),
					 new Object [] { this, CodegenPackage.Literals.GENERATOR__CONTROLLER }));
			
				result = false;																		
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
				String label = labelProvider == null ? null : labelProvider.getLabel(GeneratorImpl.this);
				if (label == null) {
					label = EcoreUtil.getID(GeneratorImpl.this);
				}
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
	
	@Override
	public Context createContext(Context parent, SubMonitor monitor) throws Exception {
		Context ctx = super.createContext(parent, monitor);
		if (getNamedGenerators().isEmpty()) {
			return ctx;
		}
		MutableContext mctx = ctx.createSubContext();
		for (NamedGenerator ng: getNamedGenerators()) {
			mctx.set(ng.getName(), ng.getGenerator().createWork());
		}
		return mctx;
	}
		

} //GeneratorImpl
