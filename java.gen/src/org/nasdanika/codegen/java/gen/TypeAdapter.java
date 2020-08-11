package org.nasdanika.codegen.java.gen;

import org.nasdanika.codegen.java.Type;

public abstract class TypeAdapter<T extends Type> extends MemberAdapter<T> {

	protected TypeAdapter(T target) {
		super(target);
	}

}
