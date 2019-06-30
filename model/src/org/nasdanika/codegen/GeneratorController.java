package org.nasdanika.codegen;

import java.util.Collection;
import java.util.Collections;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * Generators use controllers for iteration. 
 * @author Pavel
 *
 */
public interface GeneratorController<T, G extends Generator<T>> extends GenerationParticipant<T,G> {
			
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
	default T configure(G generator, Context context, T result, ProgressMonitor monitor) throws Exception {
		return result;
	}

}
