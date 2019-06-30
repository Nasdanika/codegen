package org.nasdanika.codegen;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * Generation participant such as a generator controller or a class provided to JavaGenerator can validate the underlying generator.
 * @author Pavel
 *
 * @param <T>
 * @param <G>
 */
public interface GenerationParticipant<T, G extends Generator<T>> {
	
	/**
	 * Validates the generator.
	 * @param generator
	 * @param diagnostics
	 * @param context
	 * @return
	 */
	default boolean validate(G generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	

}
