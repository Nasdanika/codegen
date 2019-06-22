/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.GeneratorLabelProvider;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.Work;
import org.osgi.framework.FrameworkUtil;

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
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorImpl<T> extends MinimalEObjectImpl.Container implements Generator<T> {
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
		
		ClassLoader classLoader = thisContext.get(ClassLoader.class, getClass().getClassLoader());		
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) classLoader.loadClass(getController().trim()).newInstance();
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
		
		ClassLoader classLoader = context.get(ClassLoader.class, getClass().getClassLoader());		
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) classLoader.loadClass(getController().trim()).newInstance();
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
		boolean result = true;
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
			case CodegenPackage.GENERATOR__CONTROLLER:
				return getController();
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				return getNamedGenerators();
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled();
			case CodegenPackage.GENERATOR__DESCRIPTION:
				return getDescription();
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return getConfiguration();
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
			case CodegenPackage.GENERATOR__CONTROLLER:
				setController((String)newValue);
				return;
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				getNamedGenerators().clear();
				getNamedGenerators().addAll((Collection<? extends NamedGenerator>)newValue);
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
			case CodegenPackage.GENERATOR__CONTROLLER:
				setController(CONTROLLER_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				getNamedGenerators().clear();
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
			case CodegenPackage.GENERATOR__CONTROLLER:
				return CONTROLLER_EDEFAULT == null ? getController() != null : !CONTROLLER_EDEFAULT.equals(getController());
			case CodegenPackage.GENERATOR__NAMED_GENERATORS:
				return !getNamedGenerators().isEmpty();
			case CodegenPackage.GENERATOR__ENABLED:
				return isEnabled() != ENABLED_EDEFAULT;
			case CodegenPackage.GENERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CodegenPackage.GENERATOR__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null : !CONFIGURATION_EDEFAULT.equals(getConfiguration());
		}
		return super.eIsSet(featureID);
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
		
		class NamedGeneratorWorkEntry<WT> {
			Work<List<WT>> work;
			boolean execute;
			
			NamedGeneratorWorkEntry(Work<List<WT>> work, boolean execute) {
				this.work = work;
				this.execute = execute;
			}
		}
		
		// Strings for now.
		Map<String, NamedGeneratorWorkEntry<String>> namedGeneratorsWork = new HashMap<>();

		for (NamedGenerator ng: getNamedGenerators()) {
			namedGeneratorsWork.put(ng.getName(), new NamedGeneratorWorkEntry<String>(ng.getGenerator().createWork(), ng.isExecuteWork()));
		}		
		
		return new Work<List<T>>() {
			
			@Override
			public int size() {
				int ret = workItem.size() + (isExplicitConfigure() ? 0 : 1);
				for (NamedGeneratorWorkEntry<String> v: namedGeneratorsWork.values()) {
					if (v.execute) {
						ret += v.work.size();
					}
				}
				return ret;
			}
			
			@Override
			public List<T> execute(Context context, SubMonitor monitor) throws Exception {
				GeneratorLabelProvider labelProvider = context.get(GeneratorLabelProvider.class);
				String label = labelProvider == null ? null : labelProvider.getLabel(GeneratorImpl.this);
				if (label == null) {
					label = EcoreUtil.getID(GeneratorImpl.this);
				}
				if (label == null || label.trim().length() == 0) {
					label = GeneratorImpl.this.eClass().getName();
				}
				monitor.setTaskName("Generating "+label);
				Collection<Context> iContexts = iterate(createContext(context, monitor));
				if (iContexts.isEmpty()) {
					monitor.worked(workItem.size());
					return Collections.emptyList();
				}
				
				if (iContexts.size() == 1) {
					Context iCtx = iContexts.iterator().next();
					T workResult = workItem.execute(injectNamedGenerators(iCtx, monitor), monitor);
					return Collections.singletonList(isExplicitConfigure() ? workResult : configure(iCtx, workResult, monitor.split(1)));
				}

				List<T> ret = new ArrayList<>();
				monitor.setWorkRemaining(iContexts.size()*size());
				for (Context iCtx: iContexts) {
					T workResult = workItem.execute(injectNamedGenerators(iCtx, monitor), monitor);
					ret.add(isExplicitConfigure() ? workResult : configure(iCtx, workResult, monitor.split(1)));
				}
				return ret;
			}

			private Context injectNamedGenerators(Context context, SubMonitor monitor) throws Exception {
				if (namedGeneratorsWork.isEmpty()) {
					return context;
				}
				
				MutableContext mctx = context.fork();
				for (Entry<String, NamedGeneratorWorkEntry<String>> ngwe: namedGeneratorsWork.entrySet()) {
					if (ngwe.getValue().execute) {
						StringBuilder sb = new StringBuilder();
						for (String we: ngwe.getValue().work.execute(mctx, monitor)) {
							sb.append(we);
						}						
						mctx.set(ngwe.getKey(), sb.toString());						
					} else {
						mctx.set(ngwe.getKey(), ngwe.getValue());
					}
				}
				return mctx;
			}
		};
	}		
	
	// Class loading - bundle symbolic name from uri (authority?), then iterate over bundles and use bundle's loadClass() if found
	// otherwise use the thead context classloader, context classloader, and this class classloader.
	private void test() {
		URI uri = eResource().getURI();
		if (uri.isPlatformPlugin()) {
			
		}
//		FrameworkUtil.getBundle(getClass()).getBundleContext().get
	}
		
} //GeneratorImpl
