package org.nasdanika.codegen.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.emf.EObjectContext;

/**
 * Generator which is configured by a subclass of EObject.
 * @author Pavel
 *
 * @param <T>
 * @param <C>
 */
public class EObjectConfigurableValidatingModelGenerator<T, C extends EObject> extends ConfigurableValidatingModelGenerator<T, C> {

	public EObjectConfigurableValidatingModelGenerator(ResourceSet resourceSet, String platformPluginUri, C configuration) throws Exception {
		super(resourceSet, platformPluginUri, configuration);
	}

	public EObjectConfigurableValidatingModelGenerator(ResourceSet resourceSet, URI modelUri, C configuration) throws Exception {
		super(resourceSet, modelUri, configuration);
	}

	public EObjectConfigurableValidatingModelGenerator(String platformPluginUri, C configuration) throws Exception {
		super(platformPluginUri, configuration);
	}

	public EObjectConfigurableValidatingModelGenerator(URI modelUri, C configuration) throws Exception {
		super(modelUri, configuration);
	}

	/**
	 * Uses {@link Diagnostician} to validate configuration.
	 */
	@Override
	protected Diagnostic validateConfiguration(Context context) {
		Diagnostician diagnostician = new Diagnostician() {
			
			public Map<Object,Object> createDefaultContext() {
				Map<Object, Object> ctx = super.createDefaultContext();
				ctx.put(Context.class, context);
				ctx.put(Generator.VALIDATE_JAVA_CONTRIBUTORS, Boolean.TRUE);
				return ctx;
			};
			
		};				
		return diagnostician.validate(configuration);
	}

	/**
	 * Adapts configuration to Context.
	 */
	@Override
	protected Context createConfigurationContext(Context chain) {
		if (configuration instanceof Context) {
			return ((Context) configuration).compose(chain);
		}
		Adapter contextAdapter = EcoreUtil.getRegisteredAdapter(configuration, Context.class);
		if (contextAdapter != null) {
			return ((Context) contextAdapter).compose(chain);
		}
		return new EObjectContext(configuration).compose(chain);
	}

}
