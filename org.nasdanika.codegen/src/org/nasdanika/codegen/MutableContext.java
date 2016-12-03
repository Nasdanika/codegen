package org.nasdanika.codegen;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MutableContext implements Context {
		
	private Map<Class<?>, Object> services = new HashMap<>();
	private Map<String, Object> properties = new HashMap<>();
	private Context[] parents;
	private ClassLoader classLoader;
	
	public MutableContext(Context... parents) {
		this.parents = parents;
	}

	public MutableContext set(String name, Object value) {
		if (value == null) {
			properties.remove(name);
		} else {
			properties.put(name, value);
		}
		return this;		
	}
	
	public <T> MutableContext set(Class<T> type, T service) {
		if (service == null) {
			services.remove(type);
		} else {
			services.put(type, service);
		}
		return this;				
	}

	@Override
	public Object get(String name) {
		Object ret =  properties.get(name);
		if (ret != null) {
			return ret;
		}
		
		for (Context parent: parents) {
			ret = parent == null ? null : parent.get(name);
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> type) {
		T ret = (T) services.get(type);
		if (ret != null) {
			return ret;
		}
		
		for (Entry<Class<?>, Object> e: services.entrySet()) {
			if (type.isAssignableFrom(e.getKey())) {
				return (T) e.getValue();
			}
		}
		
		for (Context parent: parents) {
			ret = parent == null ? null : parent.get(type);
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}

	@Override
	public ClassLoader getClassLoader() {
		if (classLoader != null) {
			return classLoader;
		}
		
		for (Context parent: parents) {
			ClassLoader ret = parent == null ? null : parent.getClassLoader();
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}
	
	public MutableContext setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
		return this;
	}
			
	/**
	 * @return New instance of {@link MutableContext} with context as parent.
	 */
	public MutableContext createSubContext() {
		return new MutableContext(this);
	}
	
	// TODO - Autocloseable - cascade-close sub-contexts (track them) and properties/services.
	
	// TODO - default properties and services
	
	// TODO - suppress properties and services
}
