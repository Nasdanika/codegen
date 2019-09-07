package org.nasdanika.codegen;

import java.util.Collection;

import org.nasdanika.common.Context;

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
	Collection<Context> iterate(Context context, G generator) throws Exception;

}
