package org.nasdanika.codegen.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ContextIterator;
import org.nasdanika.common.Util;

public abstract class GeneratorAdapter<T extends Generator> {
	
	protected T target;
	
	protected GeneratorAdapter(T target) {
		this.target = target;
	}
	
	// enabled
	// iterator
	
	/**
	 * If enabled is false returns an empty iterator. 
	 * If iterator is blank returns an iterator with a single element - the parameter context.
	 * Otherwise calls processes the iterator as explained in the model documentation.   
	 * @param context
	 * @return
	 */
	protected Collection<Context> iterate(Context context) throws Exception {
		if (!target.isEnabled()) {
			return Collections.emptyList();
		}
		String iterator = target.getIterator();
		if (Util.isBlank(iterator)) {
			return Collections.singleton(context);
		}
		Object value = context.get(iterator);
		if (value == null) {
			// Sub-context - prefix.
			return Collections.singleton(context.map(key -> iterator + key));
		}
		
		return iterate(context, value);
	}
	
	/**
	 * Recursively iterates
	 * @param context
	 * @param iterator
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Collection<Context> iterate(Context context, Object value) throws Exception {	
		if (value instanceof AdapterFactory) {
			AdapterFactory factory = (AdapterFactory) value;
			if (!factory.isFactoryForType(ContextIterator.Factory.class)) {
				throw new IllegalArgumentException("Adapter factory is not for " + ContextIterator.Factory.class);
			}
			Adapter adapter = factory.adapt(target, ContextIterator.Factory.class);
			ContextIterator ci = ((ContextIterator.Factory) adapter).create(context);
			Collection<Context> ret = new ArrayList<>();
			while (ci.hasNext()) {
				ret.add(ci.next());
			}
			return ret;
		}
		
		if (value instanceof Map) {
			// Interpolate the map and wrap into context
			return Collections.singleton(Context.wrap(context.interpolate((Map<String,Object>) value)::get));
		}
		if (value instanceof Collection) {
			Collection<Context> ret = new ArrayList<>();
			for (Object e: (Collection<?>) value) {
				ret.addAll(iterate(context, e));
			}
			return ret;
		}
		
		return Collections.singleton(context.compose(Context.singleton("data", value instanceof String ? context.interpolate((String) value) : value))); 		
	}

}
