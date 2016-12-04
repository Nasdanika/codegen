package org.nasdanika.codegen;

/**
 * Generation context.
 * @author Pavel Vlasov
 *
 */
public interface Context { // TODO - Autocloseable
	
	/**
	 * @param name
	 * @return Context property by name.
	 */
	Object get(String name);
	
	/**
	 * @param type
	 * @return Context service by type.
	 */
	<T> T get(Class<T> type); 
	
	/**
	 * @return {@link ClassLoader} to use for reflective operations. 
	 */
	ClassLoader getClassLoader();
	
	/**
	 * Creates a new sub-context for this context.
	 * @return
	 */
	default MutableContext createSubContext() {
		return this instanceof MutableContext ? ((MutableContext) this).createSubContext() : new SimpleMutableContext(this);
	}	
	
	/**
	 * Interpolates input using this context properties.
	 * @param input
	 * @return Interpolated value.
	 */
	default String interpolate(String input) {
		return CodegenUtil.interpolate(input, this);
	}
	
}
