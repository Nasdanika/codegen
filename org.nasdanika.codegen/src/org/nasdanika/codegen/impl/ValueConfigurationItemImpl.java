/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Provider;
import org.nasdanika.codegen.SimpleMutableContext;
import org.nasdanika.codegen.ValueConfigurationItem;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ValueConfigurationItemImpl#isScripted <em>Scripted</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueConfigurationItemImpl extends ConfigurationItemImpl implements ValueConfigurationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return (String)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE_TYPE, newValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return (Boolean)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScripted() {
		return (Boolean)eGet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__SCRIPTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScripted(boolean newScripted) {
		eSet(CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__SCRIPTED, newScripted);
	}
	

	/**
	 * Attempts to instantiate a class by finding a constructor which would accept provided arguments in any combination.
	 * @param clazz
	 * @param args
	 * @return instance or null if approriate constructor was not found.
	 * @throws Exception
	 */
	static Object instantiate(Class<?> clazz, Class<?>[] types, Object[] args) throws Exception {
		C: for (Constructor<?> constructor: clazz.getConstructors()) {
			Class<?>[] pt = constructor.getParameterTypes();
			if (pt.length == args.length) {
				List<Object> aList = new ArrayList<>(Arrays.asList(args));
				Object[] cArgs = new Object[pt.length];
				
				A: for (int i=0; i<cArgs.length; ++i) {
					Iterator<Object> ait = aList.iterator();
					while (ait.hasNext()) {
						Object na = ait.next();
						if (pt[i].isAssignableFrom(types[i])) {
							cArgs[i] = na;
							ait.remove();
							continue A; // Argument found.
						}
					}
					continue C; // Argument not found.
				}
				
				if (aList.isEmpty()) { // Extra check.
					return constructor.newInstance(cArgs);
				}				
			}
		}
		
		return null;
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
			if (isScripted()) {
				if (getValue() == null || getValue().trim().length() == 0) {
					diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 CodegenValidator.DIAGNOSTIC_SOURCE,
							 CodegenValidator.CONFIGURATION__VALIDATE,
							 "["+EObjectValidator.getObjectLabel(this, context)+"] Empty values for scripted configuration item",
							 new Object [] { this, CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE }));
					
					result = false;
				} else {
					try {
						createValueEvaluator(new SimpleMutableContext());						
					} catch (CompileException e) {
						diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 CodegenValidator.DIAGNOSTIC_SOURCE,
							 CodegenValidator.CONFIGURATION__VALIDATE,
							 "["+EObjectValidator.getObjectLabel(this, context)+"] Value script has errors: "+e.getMessage(),
							 new Object [] { this, CodegenPackage.Literals.VALUE_CONFIGURATION_ITEM__VALUE }));
					
						result = false;						
					}
				}
			}
		}
		return result;
	}	
		
	@SuppressWarnings("unchecked")
	@Override
	public Object get(Context context) throws Exception {
		Context thisContext = createContext(context);
		
		if (isScripted()) {
			if (getValueType() == null || getValueType().trim().length() == 0 || String.class.getName().equals(getValueType().trim())) {
				throw new IllegalStateException("Empty values for scripted configuration item");
			}
			
			return createValueEvaluator(thisContext).evaluate(new Object[] { thisContext, getValueType() });						
		}		
		
		if (getValueType() == null || getValueType().trim().length() == 0 || String.class.getName().equals(getValueType().trim())) {
			if (!getConfiguration().isEmpty()) {
				throw new IllegalStateException("String values are not configurable");
			}
			return thisContext.interpolate(getValue());
		}
		
		Class<?> valueClass = thisContext.getClassLoader().loadClass(getValueType().trim());
		// Blank value
		String interpolatedValue = thisContext.interpolate(getValue());
		boolean isBlankValue = interpolatedValue == null || interpolatedValue.trim().length() == 0;
		if (Provider.class.isAssignableFrom(valueClass)) {
			if (isBlankValue) {
				// Try default constructor
				Object ret = instantiate(valueClass, new Class<?>[] {}, new Object[] {});
				if (ret != null) {
					return ((Provider<Object>) ret).get(thisContext);
				}				
			}
			Object ret = instantiate(valueClass, new Class<?>[] { String.class }, new Object[] { interpolatedValue });
			if (ret == null) {
				throw new IllegalStateException("Cannot create provider (no appropriate constructor found) "+valueClass);
			}				
			return ((Provider<Object>) ret).get(thisContext);
		}
		
		if (isBlankValue) {
			if (getConfiguration().isEmpty()) {
				// Try default constructor
				Object ret = instantiate(valueClass, new Class<?>[] {}, new Object[] {});
				if (ret != null) {
					return ret;
				}				
			}
			// Try constructor which accepts Context
			Object ret = instantiate(valueClass, new Class<?>[] { Context.class }, new Object[] { thisContext });
			if (ret != null) {
				return ret;
			}				
		}
		
		if (getConfiguration().isEmpty()) {
			// Try String constructor
			Object ret = instantiate(valueClass, new Class<?>[] { String.class }, new Object[] { interpolatedValue });
			if (ret != null) {
				return ret;
			}				
		}
		
		// Try constructor which accepts Context and String
		Object ret = instantiate(valueClass, new Class<?>[] { String.class, Context.class }, new Object[] { interpolatedValue, thisContext });
		if (ret != null) {
			return ret;
		}				

		throw new IllegalStateException("Cannot create value (no appropriate constructor found) "+valueClass);
		
	}

	private ScriptEvaluator createValueEvaluator(Context thisContext) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getValue());
		se.setReturnType(Object.class);
		se.setParameters(new String[] { "context", "valueType" }, new Class[] { Context.class, String.class });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(thisContext.getClassLoader());
		return se;
	}
	

} //ValueConfigurationItemImpl
