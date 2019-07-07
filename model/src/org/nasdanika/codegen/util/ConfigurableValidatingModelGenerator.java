package org.nasdanika.codegen.util;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

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

	/**
	 * Consumes an additional tick to validate configuration.
	 */
	@Override
	public long size() {		
		return super.size() + 1;
	}
	
	@Override
	public List<T> execute(Context context, ProgressMonitor progressMonitor) throws Exception {
		
		new Work<Context, Object>() {

			@Override
			public long size() {
				return 1;
			}

			@Override
			public String getName() {
				return "Validating configuration of "+ConfigurableValidatingModelGenerator.this.getName();
			}

			@Override
			public Object execute(Context context, ProgressMonitor progressMonitor) throws Exception {
				Diagnostic diagnostic = validateConfiguration(context);
				diagnosticToProgress(progressMonitor, size(), diagnostic);
				if (diagnostic.getSeverity() == Diagnostic.ERROR) {
					throw new IllegalStateException("Generator configuration validation failed");
				}
				return null;
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		}.splitAndExecute(context, progressMonitor);
				
		return super.execute(createConfigurationContext(context), progressMonitor);
	}

}
