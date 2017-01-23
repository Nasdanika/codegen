package org.nasdanika.codegen;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Generators user controllers for iteration. 
 * @author Pavel
 *
 */
public interface GeneratorController<T, G extends Generator<T>> {
	
	boolean validate(G generator, DiagnosticChain diagnostics, Map<Object, Object> context);
	
	/**
	 * May produce zero or more contexts to execute the generator zero or more times.
	 * @param context
	 * @return
	 */
	Collection<Context> iterate(Context context, G generator) throws Exception;
	
	/**
	 * This method is typically invoked after the generator has created the generation result, but before invocation of child generators.
	 * This method can modify and replace the result.
	 * @throws Exception
	 */
	T configure(G generator, Context context, T result, SubMonitor monitor) throws Exception;

}
