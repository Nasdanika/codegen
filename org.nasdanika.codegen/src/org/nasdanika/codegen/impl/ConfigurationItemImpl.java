/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ConfigurationItem;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationItemImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConfigurationItemImpl extends ConfigurationImpl implements ConfigurationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONFIGURATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(CodegenPackage.Literals.CONFIGURATION_ITEM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(CodegenPackage.Literals.CONFIGURATION_ITEM__DESCRIPTION, newDescription);
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
		
	@SuppressWarnings("unchecked")
	@Override
	public Object get(Context context) throws Exception {
		if (getValueType() == null || getValueType().trim().length() == 0 || String.class.getName().equals(getValueType().trim())) {
			if (!getConfiguration().isEmpty()) {
				throw new IllegalStateException("String values are not configurable configuration");
			}
			return context.interpolate(getValue());
		}
		
		Class<?> valueClass = context.getClassLoader().loadClass(getValueType().trim());
		// Blank value
		String interpolatedValue = context.interpolate(getValue());
		boolean isBlankValue = interpolatedValue == null || interpolatedValue.trim().length() == 0;
		if (Provider.class.isAssignableFrom(valueClass)) {
			if (isBlankValue) {
				// Try default constructor
				Object ret = instantiate(valueClass, new Class<?>[] {}, new Object[] {});
				if (ret != null) {
					return ((Provider<Object>) ret).get(createContext(context));
				}				
			}
			Object ret = instantiate(valueClass, new Class<?>[] { String.class }, new Object[] { interpolatedValue });
			if (ret == null) {
				throw new IllegalStateException("Cannot create provider (no appropriate constructor found) "+valueClass);
			}				
			return ((Provider<Object>) ret).get(createContext(context));
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
			Object ret = instantiate(valueClass, new Class<?>[] { Context.class }, new Object[] {createContext(context) });
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
		Object ret = instantiate(valueClass, new Class<?>[] { String.class, Context.class }, new Object[] { interpolatedValue, createContext(context) });
		if (ret != null) {
			return ret;
		}				

		throw new IllegalStateException("Cannot create value (no appropriate constructor found) "+valueClass);
		
	}

} //ConfigurationItemImpl
