package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.Resource;

public abstract class ResourceAdapter<T extends Resource> extends ResourceGeneratorAdapter<T> {

	protected ResourceAdapter(T target) {
		super(target);
	}
	
	/** 
	 * Allows subclasses to customize container name.
	 * @param name
	 * @return
	 */
	protected String finalName(String name) {
		return name;
	}

}
