package org.nasdanika.codegen.html;

import org.nasdanika.codegen.Generator;
import org.nasdanika.html.emf.EObjectViewAction;

public abstract class GeneratorViewAction<T extends Generator<?>> extends EObjectViewAction<T> {

	public GeneratorViewAction(T value) {
		super(value);
	}
		
}
