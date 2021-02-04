package org.nasdanika.codegen.gen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ContextIterator;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.ext.EmfUtilEx;
import org.nasdanika.ncore.AbstractEntry;
import org.yaml.snakeyaml.Yaml;

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
			return map(context);
		}
		Object value = context.get(iterator);
		if (value == null) {
			// Sub-context - prefix.
			return map(context.map(Util.hierarchicalMapper(iterator)));
		}
		
		return map(iterate(context, value));
	}
	
	/**
	 * Recursively iterates
	 * @param context
	 * @param iterator
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Collection<Context> iterate(Context context, Object value) throws Exception {	
		if (Boolean.TRUE.equals(value)) {
			return Collections.singleton(context);			
		}
		if (Boolean.FALSE.equals(value)) {
			return Collections.emptyList();
		}
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
			Context ctx = Context.wrap(context.interpolate((Map<String,Object>) value)::get).compose(new Context() {

				@Override
				public Object get(String key) {
					// Not inheriting properties
					return null;
				}

				@Override
				public <S> S get(Class<S> type) {
					return context.get(type);
				}
				
			});
			return Collections.singleton(ctx);
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
	
	private Collection<Context> map(Collection<Context> contexts) throws Exception {	
		if (contexts.size() == 1) {
			return map(contexts.iterator().next());
		}
		
		Collection<Context> ret = new ArrayList<>();
		for (Context c: contexts) {
			ret.addAll(map(c));
		}
		return ret;
	}
	
	/**
	 * Maps context
	 * @param context
	 * @return
	 * @throws Exception 
	 */
	private Collection<Context> map(Context context) throws Exception {
		if (Util.isBlank(target.getContextMap())) {
			return Collections.singleton(context);
		}
		
		Yaml yaml = new Yaml();
		Object spec = yaml.load(target.getContextMap());
		return map(context, spec);		
	}
	
	@SuppressWarnings("unchecked")
	private Collection<Context> map(Context context, Object spec) throws Exception {
		if (spec instanceof Collection) {
			Collection<Object> sc = (Collection<Object>) spec;
			if (sc.size() == 1) {
				return map(context, sc.iterator().next());
			}
			
			Collection<Context> ret = new ArrayList<>();
			for (Object se: sc) {
				ret.addAll(map(context, se));
			}
			return ret;
		}
		
		if (spec instanceof Map) {
			Map<String, Object> iMap = context.interpolate((Map<String,Object>) spec);
			Context ctx = Context.wrap(iMap::get).compose(new Context() {

				@Override
				public Object get(String key) {
					// Not inheriting properties
					return null;
				}

				@Override
				public <S> S get(Class<S> type) {
					return context.get(type);
				}
				
			});  
			return Collections.singleton(ctx);
		}
		
		// Treating spec as a relative URL
		URL ref = EmfUtilEx.resolveReference(target.eResource(), context.interpolateToString(String.valueOf(spec)));
		Yaml yaml = new Yaml();
		return map(context, yaml.load(ref.openStream()));
	}
		
	/**
	 * Creates context supplier factory from configuration for contextification.
	 * 
	 * @return Context supplier factory or null if configuration is empty.
	 */
	protected org.nasdanika.common.SupplierFactory<Context> createContextSupplierFactory() {
		if (target.getConfiguration().isEmpty()) {
			return null;
		}
		MapCompoundSupplierFactory<String, Object> entriesFactory = new MapCompoundSupplierFactory<String, Object>("Entries");
		for (EObject ce: target.getConfiguration()) {
			if (ce instanceof AbstractEntry) {
				entriesFactory.put(((AbstractEntry) ce).getName(), EObjectAdaptable.adaptToSupplierFactory(ce, Object.class));
			}
		}
		
		FunctionFactory<Map<String, java.lang.Object>, org.nasdanika.common.Context> contextFactory = new FunctionFactory<Map<String,Object>, org.nasdanika.common.Context>() {
			
			@Override
			public Function<Map<String, java.lang.Object>, org.nasdanika.common.Context> create(org.nasdanika.common.Context context) throws Exception {
				return Function.fromBiFunction((map, progressMonitor) -> {
					return org.nasdanika.common.Context.wrap(map::get).compose(context);
				}, "Contextifier", 1);
			}
			
		};
		
		return entriesFactory.then(contextFactory);
	}
	
	/**
	 * Resolves reference relative to the target's resource location, loads and diagnoses linked object.
	 * @param ref
	 * @return
	 * @throws DiagnosticException 
	 */
	protected EObject loadLink(Context context, String ref) throws DiagnosticException {
		URI refUri = URI.createURI(context.interpolateToString(ref));
		Resource resource = target.eResource();
		if (resource != null) {
			URI resUri = resource.getURI();
			refUri = refUri.resolve(resUri);
		}
				
		java.util.function.Function<Class<ResourceSet>,ResourceSet> factory = type -> {
			if (ResourceSet.class.isAssignableFrom(type)) {
				return new ResourceSetImpl();
			}
			throw new UnsupportedOperationException("Unsupported type: " + type + ", expected "+ResourceSet.class);
		};
		
		ResourceSet resourceSet = context.get(ResourceSet.class, factory);
		Resource refResource = resourceSet.getResource(refUri, true);
		String fragment = refUri.fragment();				
		EObject ret = fragment == null ? refResource.getContents().get(0) : refResource.getEObject(fragment);
		
		Diagnostician diagnostician = new Diagnostician() {
			
			public Map<Object,Object> createDefaultContext() {
				Map<Object, Object> ctx = super.createDefaultContext();
				ctx.put(Context.class, context);
				return ctx;
			};
			
		};				
		Diagnostic validationResult = diagnostician.validate(ret);
		if (validationResult.getSeverity() == Diagnostic.ERROR) {
			throw new DiagnosticException(validationResult);
		}
		
		return ret;		
	}
	
}
