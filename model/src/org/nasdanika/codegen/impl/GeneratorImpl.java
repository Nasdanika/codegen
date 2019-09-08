/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executor;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ExpressionEvaluator;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.AbstractNamedGenerator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.GeneratorFilter;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.Converter;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.InterpolatingSource;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.emf.DiagnosticHelper;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;

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
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getConfigurationReference <em>Configuration Reference</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GeneratorImpl#getPredicate <em>Predicate</em>}</li>
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
	 * The default value of the '{@link #getConfigurationReference() <em>Configuration Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_REFERENCE_EDEFAULT = null;
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
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;
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
	public EList<AbstractNamedGenerator> getNamedGenerators() {
		return (EList<AbstractNamedGenerator>)eDynamicGet(CodegenPackage.GENERATOR__NAMED_GENERATORS, CodegenPackage.Literals.GENERATOR__NAMED_GENERATORS, true, true);
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
	public String getConfigurationReference() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE, CodegenPackage.Literals.GENERATOR__CONFIGURATION_REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationReference(String newConfigurationReference) {
		eDynamicSet(CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE, CodegenPackage.Literals.GENERATOR__CONFIGURATION_REFERENCE, newConfigurationReference);
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
	 * @generated
	 */
	@Override
	public String getPredicate() {
		return (String)eDynamicGet(CodegenPackage.GENERATOR__PREDICATE, CodegenPackage.Literals.GENERATOR__PREDICATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicate(String newPredicate) {
		eDynamicSet(CodegenPackage.GENERATOR__PREDICATE, CodegenPackage.Literals.GENERATOR__PREDICATE, newPredicate);
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
	
	@SuppressWarnings("unchecked")
	protected GeneratorController<T, Generator<T>> createController(Context context) throws Exception {
		String controllerName = getController();
		if (controllerName == null || controllerName.trim().length() == 0) {
			return null;
		}
		
		int idx = controllerName.indexOf("::");
		if (idx == -1) {
			return (GeneratorController<T, Generator<T>>) instantiate(context, controllerName, getControllerArguments());
		}
		
		String controllerClassName = controllerName.substring(0, idx);
		String controllerMethodName = controllerName.substring(idx + 2).trim();
		Class<?> controllerClass = loadClass(controllerClassName);
		Optional<Method> controllerMethodOptional = Arrays.stream(controllerClass.getMethods())
			.filter(m -> m.getName().equals(controllerMethodName))
			.filter(m -> m.getParameterCount() == 2)			
			.filter(m -> Context.class.equals(m.getParameterTypes()[0]) && Generator.class.equals(m.getParameterTypes()[1]))
			.filter(m -> Collection.class.isAssignableFrom(m.getReturnType()))
			.findFirst();
		
		if (controllerMethodOptional.isEmpty()) {
			throw new IllegalArgumentException("Cannot find method Collection<Context>"+controllerMethodName+"(Context,Generator) in "+controllerClassName);
		}
		
		Method controllerMethod = controllerMethodOptional.get();
		Object controller;
		if (Modifier.isStatic(controllerMethod.getModifiers())) {
			if (!getControllerArguments().isEmpty()) {
				throw new IllegalStateException("Controller method "+controllerMethodName+" is static and controller arguments list is not empty");
			}
			controller = null;
		} else {
			controller = instantiate(context, controllerClassName, getControllerArguments());
		}
		return new GeneratorController<T,Generator<T>>() {

			@Override
			public Collection<Context> iterate(Context context, Generator<T> generator) throws Exception {
				return (Collection<Context>) controllerMethod.invoke(controller, context, generator);
			}
			
		};
		
	}
	
	@SuppressWarnings("unchecked")
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
					Context nCtx = (Context) context.get(Context.class);
					Object controller = createController(nCtx);
					if (controller instanceof GeneratorController) {
						result = ((GeneratorController<T, Generator<T>>) controller).validate(this, diagnostics, nCtx) && result;
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
			case CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE:
				return getConfigurationReference();
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				return getContextPath();
			case CodegenPackage.GENERATOR__PREDICATE:
				return getPredicate();
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
			case CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE:
				setConfigurationReference((String)newValue);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case CodegenPackage.GENERATOR__PREDICATE:
				setPredicate((String)newValue);
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
				getNamedGenerators().addAll((Collection<? extends AbstractNamedGenerator>)newValue);
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
			case CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE:
				setConfigurationReference(CONFIGURATION_REFERENCE_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case CodegenPackage.GENERATOR__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
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
			case CodegenPackage.GENERATOR__CONFIGURATION_REFERENCE:
				return CONFIGURATION_REFERENCE_EDEFAULT == null ? getConfigurationReference() != null : !CONFIGURATION_REFERENCE_EDEFAULT.equals(getConfigurationReference());
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? getContextPath() != null : !CONTEXT_PATH_EDEFAULT.equals(getContextPath());
			case CodegenPackage.GENERATOR__PREDICATE:
				return PREDICATE_EDEFAULT == null ? getPredicate() != null : !PREDICATE_EDEFAULT.equals(getPredicate());
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
	 * This method delegates to createWorkItem. Override if the generator produces multiple results.
	 * @param context
	 * @return
	 * @throws Exception
	 */
	protected Work<List<T>> createMultiWorkItem(Context context) throws Exception {
		Work<T> workItem = createWorkItem(context);
		return new Work<List<T>>() {

			@Override
			public long size() {
				return workItem.size();
			}

			@Override
			public String getName() {
				return workItem.getName();
			}

			@Override
			public List<T> execute(ProgressMonitor progressMonitor) throws Exception {
				return Collections.singletonList(workItem.execute(progressMonitor));
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return workItem.undo(progressMonitor);
			}
			
		};
	}

	/**
	 * Creates a work item for this generator for each context entry returned by the iterator. 
	 * @throws Exception
	 */
	protected Work<T> createWorkItem(Context context) throws Exception {
		throw new UnsupportedOperationException("Override in suclass");
	}
	
	@SuppressWarnings("unchecked")
	protected Collection<Context> iterate(Context thisContext) throws Exception {
		
		if (getController() == null || getController().trim().length() == 0) {
			return Collections.singleton(thisContext);
		}
					
		GeneratorController<T, Generator<T>> controller = (GeneratorController<T, Generator<T>>) instantiate(thisContext, getController(), getControllerArguments());
		return controller.iterate(thisContext, this);
	}
	
	/**
	 * @return {@link Executor} provided in the context (if any) if elements of the compound work created by this generator can be executed in parallel, null otherwise. 
	 * This implementation returns executor service from the context. Override to return null for sequential execution in the caller thread.
	 */
	protected Executor getExecutor(Context context) {
		return context == null ? null : context.get(Executor.class);
	}
	
	
	/**
	 * Creates sub-contexts by composing the argument context, configuration, configuration reference, named entries context, and then passing the composed
	 * context to iterate().
	 * 
	 * TODO - refine 
	 */
	@Override
	final public Work<List<T>> createWork(Context context) throws Exception {
		Work<List<T>> noWork = new Work<List<T>>() {

			@Override
			public long size() {
				return 0;
			}

			@Override
			public String getName() {
				return "[Disabled] "+getTitle();
			}

			@Override
			public List<T> execute(ProgressMonitor progressMonitor) throws Exception {
				return Collections.emptyList();
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		};
		
		if (!isEnabled()) {
			return noWork;
		}
		
		String predicate = context.interpolate(getPredicate());
		if (predicate != null && predicate.trim().length() > 0) {
			ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
			ClassLoader classLoader = getClassLoader();
			expressionEvaluator.setParentClassLoader(classLoader);
			expressionEvaluator.setExpressionType(Boolean.class);
			expressionEvaluator.setParameters(new String[] { "context" }, new Class[] { Context.class });
			try {
				expressionEvaluator.cook(predicate);
			} catch (CompileException e) {
				throw new NasdanikaException("Cannot compile predicate: "+predicate, e);
			}
			
			try {
				if (!Boolean.TRUE.equals((Boolean) expressionEvaluator.evaluate(new Object[] { context }))) {
					return noWork;
				};
			} catch (InvocationTargetException e) {
				throw new NasdanikaException("Cannot evaluate predicate: "+predicate, e);
			}
		}
		
		if (isFilterable()) {
			GeneratorFilter gf = context.get(GeneratorFilter.class);
			if (gf != null && !gf.test(this)) {
				return null;
			}
		}

		Context thisContext = createContext(context);
				
		if (!getNamedGenerators().isEmpty()) {
			throw new UnsupportedOperationException("Not implemented yet - see the comment above");
		}
		
		GeneratorController<T, Generator<T>> controller = createController(thisContext);
				
		CompoundWork<List<T>, List<T>> ret = new CompoundWork<List<T>, List<T>>(getTitle(), getExecutor(thisContext)) { 
			
			@Override
			protected List<T> combine(List<List<T>> results, ProgressMonitor monitor) {
				return results.stream().reduce(new ArrayList<T>(), (a,r) -> { a.addAll(r); return a; });
			}
			
		};

		if (controller == null) {
			ret.add(createMultiWorkItem(thisContext));
		} else {
			Collection<Context> iContexts = iterate(createContext(thisContext));
			for (Context itemContext: iContexts) {
				// TODO - namedGenerators
				ret.add(createMultiWorkItem(itemContext));
				// TODO - explicit configure - sub-work item?
			}
		}
		
//		List<Work<?>> namedGenerators = new ArrayList<>();
		

		// TODO named generators here?
		
		return ret;
		
	}	
	
	/**
	 * Creates a context by returning the parent context if the configuration is empty
	 * and parsing the configuration as YAML, creating a context from it and chaining that context with the parent context. 
	 * @param parent
	 * @return
	 */
	protected Context createContext(Context parent) {
		if (parent != null && getContextPath() != null && getContextPath().trim().length() > 0) {
			parent = parent.map(key -> getContextPath()+key);
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
	 * Class loading - bundle symbolic name from uri (authority?), then iterate over bundles adapt them to {@link BundleWiring} to get {@link ClassLoader}.
	 * otherwise use the thread context classloader, context classloader, and this class classloader.
	 * @param className
	 * @return
	 * @throws ClassNotFoundException 
	 */
	protected ClassLoader getClassLoader()  {
		URI uri = eResource().getURI();
		if (uri.isPlatformPlugin() && uri.segmentCount() > 2 && "plugin".equals(uri.segment(0))) {
			String pluginName = uri.segment(1);
			for (Bundle bundle: FrameworkUtil.getBundle(GeneratorImpl.class).getBundleContext().getBundles()) {
				if (bundle.getSymbolicName().equals(pluginName)) {					
					return bundle.adapt(BundleWiring.class).getClassLoader();
				}
			}			
		}
		return getClass().getClassLoader();
	}
	
	/**
	 * Class loading - bundle symbolic name from uri (authority?), then iterate over bundles and use bundle's loadClass() if found
	 * otherwise use the thread context classloader, context classloader, and this class classloader.
	 * @param className
	 * @return
	 * @throws ClassNotFoundException 
	 */
	protected Class<?> loadClass(String className) throws ClassNotFoundException {
		return getClassLoader().loadClass(className);
	}
	
	protected Object instantiate(Context context, String className) throws Exception {
		return instantiate(context, className, Collections.emptyList());
	}
	
	protected Object instantiate(Context context, String className, List<String> arguments) throws Exception {
		if (className == null || className.trim().length() == 0) {
			return null;
		}
		if (arguments == null) {
			arguments = Collections.emptyList();
		}
		Class<?> clazz = loadClass(className.trim());
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
