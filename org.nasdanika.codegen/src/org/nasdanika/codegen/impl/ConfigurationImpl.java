/**
 */
package org.nasdanika.codegen.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Configuration;
import org.nasdanika.codegen.ConfigurationItem;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.NamedConfigurationItem;
import org.nasdanika.codegen.Property;
import org.nasdanika.codegen.Service;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getDefaultIncludes <em>Default Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ConfigurationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends CDOObjectImpl implements Configuration {
	private static final String PROPERTY_PATH_SEPARATOR = "/";


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONFIGURATION;
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
	@SuppressWarnings("unchecked")
	public EList<String> getIncludes() {
		return (EList<String>)eGet(CodegenPackage.Literals.CONFIGURATION__INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConfigurationItem> getConfiguration() {
		return (EList<ConfigurationItem>)eGet(CodegenPackage.Literals.CONFIGURATION__CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDefaultIncludes() {
		return (EList<String>)eGet(CodegenPackage.Literals.CONFIGURATION__DEFAULT_INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return (String)eGet(CodegenPackage.Literals.CONFIGURATION__BASE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		eSet(CodegenPackage.Literals.CONFIGURATION__BASE_URL, newBaseURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getClassPath() {
		return (EList<String>)eGet(CodegenPackage.Literals.CONFIGURATION__CLASS_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Configuration> getInclude() {
		return (EList<Configuration>)eGet(CodegenPackage.Literals.CONFIGURATION__INCLUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(CodegenPackage.Literals.CONFIGURATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(CodegenPackage.Literals.CONFIGURATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Context createContext(Context parent) throws Exception {
		// Includes
		// TODO - implement
		if (!getIncludes().isEmpty()) {
			throw new UnsupportedOperationException("'includes' is not yet supported, feel free to implement and contribute - https://github.com/Nasdanika/codegen");
		}

		// Include
		for (Configuration inc: getInclude()) {
			parent = inc.createContext(parent);
		}
		
		// ClassLoader
		URL[] classPathURLs = getClassPath().isEmpty() ? null : new URL[getClassPath().size()];
		for (int i = 0; i < getClassPath().size(); ++i) {
			classPathURLs[i] = new URL(resolveBaseURL(), getClassPath().get(i));
		}
		ClassLoader classLoader = classPathURLs == null ? parent.getClassLoader() : new URLClassLoader(classPathURLs, parent.getClassLoader());
				
		// Configuration items
		Map<String, Object> properties = new HashMap<>();
		Map<String, Object> defaultProperties = new HashMap<>();
		Map<String, Context> subContexts = new LinkedHashMap<>();
		Map<Class<?>, Object> services = new HashMap<>();
		Map<Class<?>, Object> defaultServices = new HashMap<>();
				
		final Context finalParent = parent;
		
		Context ret = new Context() {

			@Override
			public Object get(String name) {
				if (name == null) {
					return null;
				}
				
				// Sub-contexts - only properties or subcontexts themselves.
				for (Entry<String, Context> sce: subContexts.entrySet()) {
					if (name.equals(sce.getKey())) {
						return sce.getValue();
					}
					
					if (name.startsWith(sce.getKey()+PROPERTY_PATH_SEPARATOR)) {
						return sce.getValue().get(name.substring(sce.getKey().length()+PROPERTY_PATH_SEPARATOR.length())); 
					}
				}				
				
				// Properties
				Object ret =  properties.get(name);
				if (ret != null) {
					return ret;
				}
				
				// Parent
				if (finalParent != null) {
					ret = finalParent.get(name);
					if (ret != null) {
						return ret;
					}
				}
				
				// Default properties
				return defaultProperties.get(name);
			}

			@SuppressWarnings("unchecked")
			@Override
			public <T> T get(Class<T> type) {
				// Services
				T ret = (T) services.get(type);
				if (ret != null) {
					return ret;
				}
				
				for (Entry<Class<?>, Object> e: services.entrySet()) {
					if (type.isAssignableFrom(e.getKey())) {
						return (T) e.getValue();
					}
				}
				
				// Parent
				if (finalParent != null) {
					ret = finalParent.get(type);
					if (ret != null) {
						return ret;
					}
				}
				
				// Default services
				ret = (T) defaultServices.get(type);
				if (ret != null) {
					return ret;
				}
				
				for (Entry<Class<?>, Object> e: defaultServices.entrySet()) {
					if (type.isAssignableFrom(e.getKey())) {
						return (T) e.getValue();
					}
				}
				
				return ret;
			}

			@Override
			public ClassLoader getClassLoader() {
				return classLoader;
			}
			
		};
		
		for (ConfigurationItem ci: getConfiguration()) {
			Object obj = ci.get(ret);
			if (ci instanceof Service) {
				Service service = (Service) ci;
				Class<?> serviceType = classLoader.loadClass(service.getServiceType());
				(service.isDefault() ? defaultServices : services).put(serviceType, obj);				
			} else if (ci instanceof Property) {
				Property property = (Property) ci;				
				(property.isDefault() ? defaultProperties : properties).put(property.getName(), obj);								
			} else {
				subContexts.put(((NamedConfigurationItem) ci).getName(), ci.createContext(new Context() {
					
					@Override
					public ClassLoader getClassLoader() {
						return ret.getClassLoader();
					}
					
					@Override
					public <T> T get(Class<T> type) {
						return null;
					}
					
					@Override
					public Object get(String name) {
						return null;
					}
				}));
			}
		}				
		
		return ret;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (diagnostics != null) {
			if (!getIncludes().isEmpty()) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Includes are not currently supported - feel free to contribute - https://github.com/Nasdanika/codegen",
						 new Object [] { this }));
				
				result = false;
				
				// TODO - once includes are supported validate extensions - .properties, .json, .yml, .nsdgen - and validate URL's.
			}
			
			if (!getDefaultIncludes().isEmpty()) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Default includes are not currently supported - feel free to contribute - https://github.com/Nasdanika/codegen",
						 new Object [] { this }));
				
				result = false;
				
				// TODO - once includes are supported validate extensions - .properties, .json, .yml, .nsdgen - and validate URL's.
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegenPackage.CONFIGURATION___CREATE_CONTEXT__CONTEXT:
				try {
					return createContext((Context)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CodegenPackage.CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Resolves base URL
	 * @return
	 * @throws Exception
	 */
	protected URL resolveBaseURL() throws Exception {		
		URL baseURL = null;
		if (eContainer() instanceof ConfigurationImpl) {
			baseURL = ((ConfigurationImpl) eContainer()).resolveBaseURL();
		} else {
			try {
				baseURL = new URL(eResource().getURI().toString());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		if (getBaseURL() != null && getBaseURL().trim().length() > 0) {
			baseURL = new URL(baseURL, getBaseURL());
		}
		return baseURL;
	}
	
} //ConfigurationImpl
