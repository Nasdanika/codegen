package org.nasdanika.codegen.util;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;

/**
 * Generator which is constructed with a configuration object. As part of its ``execute()`` method this class validates its configuration, creates a context from the configuration and executes generation.
 * @author Pavel
 *
 * @param <T> Generator result type.
 * @param <C> Configuration type.
 */
public abstract class ConfigurableValidatingModelGenerator<T,C> extends ValidatingModelGenerator<T> {
	
	protected C configuration;

	public ConfigurableValidatingModelGenerator(ResourceSet resourceSet, String platformPluginUri, C configuration) throws Exception {
		super(resourceSet, platformPluginUri);
		this.configuration = configuration;
	}

	public ConfigurableValidatingModelGenerator(ResourceSet resourceSet, URI modelUri, C configuration) throws Exception {
		super(resourceSet, modelUri);
		this.configuration = configuration;
	}

	public ConfigurableValidatingModelGenerator(String platformPluginUri, C configuration) throws Exception {
		super(platformPluginUri);
		this.configuration = configuration;
	}

	public ConfigurableValidatingModelGenerator(URI modelUri, C configuration) throws Exception {
		super(modelUri);
		this.configuration = configuration;
	}
	
	/**
	 * Validates configuration.
	 * @param configuration
	 * @param diagnostics
	 * @param context
	 */
	protected abstract Diagnostic validateConfiguration(Context context);
	
	/**
	 * Wraps/converts configuration into a context in order to pass to the generator. 
	 * @return
	 */
	protected abstract Context createConfigurationContext(Context chain);
	
	@Override
	public Supplier<List<T>> create(Context context) throws Exception {		
		Diagnostic diagnostic = validateConfiguration(context);		
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			throw new DiagnosticException(diagnostic);
		}				
				
		return super.create(createConfigurationContext(context));
	}

}
