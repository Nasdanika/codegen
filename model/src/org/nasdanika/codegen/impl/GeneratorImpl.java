/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.Context;
import org.nasdanika.common.Converter;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.InterpolatingSource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.emf.DiagnosticHelper;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getControllerArguments <em>Controller Arguments</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getNamedGenerators <em>Named Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorImpl<T> extends MinimalEObjectImpl.Container implements Generator<T> {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__TITLE, CodegenPackage.Literals.GENERATOR__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(CodegenPackage.GENERATOR__TITLE, CodegenPackage.Literals.GENERATOR__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getController() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__CONTROLLER, CodegenPackage.Literals.GENERATOR__CONTROLLER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(String newController) {
		eDynamicSet(CodegenPackage.GENERATOR__CONTROLLER, CodegenPackage.Literals.GENERATOR__CONTROLLER, newController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getControllerArguments() {
		return (EList<String>)eDynamicGet(CodegenPackage.GENERATOR__CONTROLLER_ARGUMENTS, CodegenPackage.Literals.GENERATOR__CONTROLLER_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedGenerator> getNamedGenerators() {
		return (EList<NamedGenerator>)eDynamicGet(CodegenPackage.GENERATOR__NAMED_GENERATORS, CodegenPackage.Literals.GENERATOR__NAMED_GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return (Boolean)eDynamicGet(CodegenPackage.GENERATOR__ENABLED, CodegenPackage.Literals.GENERATOR__ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		eDynamicSet(CodegenPackage.GENERATOR__ENABLED, CodegenPackage.Literals.GENERATOR__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__DESCRIPTION, CodegenPackage.Literals.GENERATOR__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CodegenPackage.GENERATOR__DESCRIPTION, CodegenPackage.Literals.GENERATOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__CONFIGURATION, CodegenPackage.Literals.GENERATOR__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(CodegenPackage.GENERATOR__CONFIGURATION, CodegenPackage.Literals.GENERATOR__CONFIGURATION, newConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextPath() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__CONTEXT_PATH, CodegenPackage.Literals.GENERATOR__CONTEXT_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextPath(String newContextPath) {
		eDynamicSet(CodegenPackage.GENERATOR__CONTEXT_PATH, CodegenPackage.Literals.GENERATOR__CONTEXT_PATH, newContextPath);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegenPackage.GENERATOR___IS_FILTERABLE:
				return isFilterable();
			case CodegenPackage.GENERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
					
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) loadClass(getController().trim()).getConstructor().newInstance();
		return controller.iterate(thisContext, this);
	}
	
	/**
	 * @param context
	 * @param result
	 * @param monitor
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	protected T configure(Context context, T result, ProgressMonitor monitor) throws Exception {
		if (getController() == null || getController().trim().length() == 0) {
			return result;
		}
		
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) loadClass(getController().trim()).getConstructor().newInstance();
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
		DiagnosticHelper helper = new DiagnosticHelper(diagnostics, CodegenValidator.DIAGNOSTIC_SOURCE, CodegenValidator.GENERATOR__VALIDATE, this);
		boolean result = true;
		if (diagnostics != null && isEnabled()) {
			if (getController() == null || getController().trim().length() == 0) {
				if (!getControllerArguments().isEmpty()) {
					helper.warning("Arguments without a controller", CodegenPackage.Literals.GENERATOR__CONTROLLER_ARGUMENTS);
				}				
			} else if (context != null && Boolean.TRUE.equals(context.get(Generator.VALIDATE_JAVA_CONTRIBUTORS))) {
				try {
					Class<?> controllerClass = loadClass(getController().trim());
					if (GeneratorController.class.isAssignableFrom(controllerClass)) {
						@SuppressWarnings("unchecked")
						GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) controllerClass.getConstructor().newInstance();
						result = controller.validate(this, diagnostics, (Context) context.get(Context.class)) && result;
					} else {
						helper.error(
								"["+EObjectValidator.getObjectLabel(this, context)+"] Controller class does not implement " + GeneratorController.class,
								CodegenPackage.Literals.GENERATOR__CONTROLLER);					
					}
				} catch (ClassNotFoundException e) {
					helper.error(
							"["+EObjectValidator.getObjectLabel(this, context)+"] Controller class not found in context classloader: "+e.getMessage(),
							CodegenPackage.Literals.GENERATOR__CONTROLLER);
				} catch (InstantiationException e) {
					helper.error(
							"["+EObjectValidator.getObjectLabel(this, context)+"] Controller class could not be instantiated: "+e.getMessage(),
							CodegenPackage.Literals.GENERATOR__CONTROLLER);
				} catch (Exception e) {
					helper.error(
							"["+EObjectValidator.getObjectLabel(this, context)+"] Validation error: "+e.getMessage(),
							CodegenPackage.Literals.GENERATOR__CONTROLLER);
				}
			}
		}
		return result && helper.isSuccess();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				return ((InternalEList<?>)getNamedGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__TITLE:
				return getTitle();
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled();
			case CodegenPackage.GENERATOR__DESCRIPTION:
				return getDescription();
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return getConfiguration();
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				return getContextPath();
			case CodegenPackage.GENERATOR__CONTROLLER:
				return getController();
			case CodegenPackage.GENERATOR__CONTROLLER_ARGUMENTS:
				return getControllerArguments();
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				return getNamedGenerators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__TITLE:
				setTitle((String)newValue);
				return;
			case CodegenPackage.GENERATOR__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CodegenPackage.GENERATOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONTROLLER:
				setController((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONTROLLER_ARGUMENTS:
				getControllerArguments().clear();
				getControllerArguments().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				getNamedGenerators().clear();
				getNamedGenerators().addAll((Collection<? extends NamedGenerator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONTROLLER:
				setController(CONTROLLER_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONTROLLER_ARGUMENTS:
				getControllerArguments().clear();
				return;
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				getNamedGenerators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.GENERATOR__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled() != ENABLED_EDEFAULT;
			case CodegenPackage.GENERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null : !CONFIGURATION_EDEFAULT.equals(getConfiguration());
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? getContextPath() != null : !CONTEXT_PATH_EDEFAULT.equals(getContextPath());
			case CodegenPackage.GENERATOR__CONTROLLER:
				return CONTROLLER_EDEFAULT == null ? getController() != null : !CONTROLLER_EDEFAULT.equals(getController());
			case CodegenPackage.GENERATOR__CONTROLLER_ARGUMENTS:
				return !getControllerArguments().isEmpty();
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				return !getNamedGenerators().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Creates a work item for this generator. 
	 * The work item may be invoked zero or more times depending on the result returned by iterator.
	 * The work item execute() method receives context created by the generator using parent context passed to the work which wraps this work.
	 * @throws Exception
	 */
	protected abstract Work<Context, T> createWorkItem() throws Exception;	

	/**
	 * Creates work which creates a context by:
	 * 
	 * * Combining the passed context and generator configuration, 
	 * * Injecting named generators as property computers. Each named generator is allocated 100 progress monitor ticks.
	 * 
	 * Then the work iterates over the contexts created 
	 * by the iterator and invokes work created by <code>createWorkItem()</code> for each context.
	 *  
	 */
	@Override
	final public Work<Context, List<T>> createWork() throws Exception {
		Work<Context, T> workItem = createWorkItem();

// TODO - implement named generators as property computers with pre-allocated ticks executed once and then returning computed value if accessed again.		
//		class NamedGeneratorWorkEntry<WT> {
//			Work<Context, List<WT>> work;
//			boolean execute;
//			
//			NamedGeneratorWorkEntry(Work<Context, List<WT>> work, boolean execute) {
//				this.work = work;
//				this.execute = execute;
//			}
//		}
//		
//		// Strings for now.
//		Map<String, NamedGeneratorWorkEntry<String>> namedGeneratorsWork = new HashMap<>();
//
//		for (NamedGenerator ng: getNamedGenerators()) {
//			namedGeneratorsWork.put(ng.getName(), new NamedGeneratorWorkEntry<String>(ng.getGenerator().createWork(), ng.isExecuteWork()));
//		}		
		
		if (!getNamedGenerators().isEmpty()) {
			throw new UnsupportedOperationException("Not implemented yet - see the comment above");
		}
		
		return new Work<Context, List<T>>() {
			
			@Override
			public long size() {
				long ret = workItem.size() + (isExplicitConfigure() ? 0 : 1);
//				for (NamedGeneratorWorkEntry<String> v: namedGeneratorsWork.values()) {
//					if (v.execute) {
//						ret += v.work.size();
//					}
//				}
				return ret;
			}
			
			@Override
			public String getName() {
				return getTitle();
			}
			
			@Override
			public List<T> execute(Context context, ProgressMonitor monitor) throws Exception {
				Collection<Context> iContexts = iterate(createContext(context));
				if (iContexts.isEmpty()) {
					return Collections.emptyList();
				}
				
				if (iContexts.size() == 1) {
					Context iCtx = iContexts.iterator().next();
					T workResult = workItem.execute(injectNamedGenerators(iCtx, monitor).computingContext(), monitor);
					return Collections.singletonList(isExplicitConfigure() ? workResult : configure(iCtx.computingContext(), workResult, monitor.split("Configuring work result", 1, workResult)));
				}

				List<T> ret = new ArrayList<>();
				for (Context iCtx: iContexts) {
					T workResult = workItem.execute(injectNamedGenerators(iCtx, monitor).computingContext(), monitor);
					ret.add(isExplicitConfigure() ? workResult : configure(iCtx.computingContext(), workResult, monitor.split("Configuring work result", 1, workResult)));
				}
				return ret;
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return workItem.undo(progressMonitor);
			}

			private Context injectNamedGenerators(Context context, ProgressMonitor monitor) throws Exception {
				EList<NamedGenerator> namedGenerators = getNamedGenerators();
				if (namedGenerators.isEmpty()) {
					return context;
				}
				
				// TODO
				throw new UnsupportedOperationException("Named generators are not implemented yet");
//				
//				MutableContext mctx = context.fork();
//				for (Entry<String, NamedGeneratorWorkEntry<String>> ngwe: namedGeneratorsWork.entrySet()) {
//					if (ngwe.getValue().execute) {
//						StringBuilder sb = new StringBuilder();
//						for (String we: ngwe.getValue().work.execute(mctx, monitor)) {
//							sb.append(we);
//						}						
//						mctx.set(ngwe.getKey(), sb.toString());						
//					} else {
//						mctx.set(ngwe.getKey(), ngwe.getValue());
//					}
//				}
//				return mctx;
			}
		};
	}	
	
	/**
	 * Creates a context by returning the parent context if the configuration is empty
	 * and parsing the configuration as YAML, creating a context from it and chaining that context with the parent context. 
	 * @param parent
	 * @return
	 */
	protected Context createContext(Context parent) {
		if (parent != null && getContextPath() != null && getContextPath().trim().length() > 0) {
			parent = parent.subContext(getContextPath());
		}
		
		String configuration = getConfiguration();
		if (configuration == null || configuration.trim().length() == 0) {
			return parent;
		}
		
		Map<String, Object> configMap = DefaultConverter.INSTANCE.toYamlMap(configuration);
		if (configMap == null) {
			throw new IllegalStateException("Configuration is not a YAML map");
		}
		
		return Context.wrap(new InterpolatingSource(configMap::get)).compose(parent);
	}
	
	/**
	 * Class loading - bundle symbolic name from uri (authority?), then iterate over bundles and use bundle's loadClass() if found
	 * otherwise use the thread context classloader, context classloader, and this class classloader.
	 * @param className
	 * @return
	 * @throws ClassNotFoundException 
	 */
	protected Class<?> loadClass(String className) throws ClassNotFoundException {
		URI uri = eResource().getURI();
		if (uri.isPlatformPlugin()) {
			for (Bundle bundle: FrameworkUtil.getBundle(GeneratorImpl.class).getBundleContext().getBundles()) {
				if (bundle.getSymbolicName().equals(uri.authority())) {
					return bundle.loadClass(className);
				}
			}			
		}
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		if (cl == null) {
			cl = getClass().getClassLoader();
		}
		return cl.loadClass(className);
	}
	
	protected Object instantiate(Context context, String className, List<String> arguments) throws Exception {
		Class<?> clazz = loadClass(className);
		for (Constructor<?> constructor: clazz.getConstructors()) {
			if (constructor.getParameterCount() == arguments.size()) {
				Class<?>[] pt = constructor.getParameterTypes();
				Object[] args = new Object[pt.length];
				Converter converter = context.get(Converter.class);
				if (converter == null) {
					converter = DefaultConverter.INSTANCE;
				}
				for (int i=0; i < args.length; ++i) {
					String arg = context.interpolate(arguments.get(i));
					args[i] = converter.convert(arg, pt[i]);
					if (args[i] == null) {
						throw new IllegalArgumentException("Cannot convert '"+arg+"' to "+pt[i]);
					}
				}
				return constructor.newInstance(args);
			}
		}
		throw new InstantiationException("Could not find a constructor with "+arguments.size()+" parameters in "+className);
	}
		
} //GeneratorImpl
