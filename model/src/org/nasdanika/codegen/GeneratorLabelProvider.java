package org.nasdanika.codegen;

/**
 * Provides a label for generators to report progress.
 * @author Pavel
 *
 */
public interface GeneratorLabelProvider {
	
	String getLabel(Generator<?> generator);

}
