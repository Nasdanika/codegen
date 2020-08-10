package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.Group;

public abstract class GroupAdapter<T extends Group> extends GeneratorAdapter<T> {

	protected GroupAdapter(T target) {
		super(target);
	}

}
