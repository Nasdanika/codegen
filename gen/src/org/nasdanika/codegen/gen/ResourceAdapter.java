package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.Resource;

public abstract class ResourceAdapter<T extends Resource> extends ResourceGeneratorAdapter<T> {

	protected ResourceAdapter(T target) {
		super(target);
	}
	
	// reconcileAction
	// merge

}
