package org.nasdanika.codegen;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.nasdanika.config.Context;

/**
 * Generators use controllers for iteration. 
 * @author Pavel
 *
 */
public interface GeneratorController<T, G extends Generator<T>> {
	
	default boolean validate(G generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	
	/**
	 * May produce zero or more contexts to execute the generator zero or more times.
	 * @param context
	 * @return
	 */
	default Collection<Context> iterate(Context context, G generator) throws Exception {
		return Collections.singleton(context);
	};
	
	/**
	 * This method is typically invoked after the generator has created the generation result, but before invocation of child generators.
	 * This method can modify and replace the result.
	 * @throws Exception
	 */
	default T configure(G generator, Context context, T result, SubMonitor monitor) throws Exception {
		monitor.worked(1);
		return result;
	}

}
