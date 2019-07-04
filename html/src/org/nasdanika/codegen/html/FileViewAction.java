package org.nasdanika.codegen.html;

import org.nasdanika.codegen.File;

public abstract class FileViewAction<T extends File<?>> extends GeneratorViewAction<T> {

	public FileViewAction(T value) {
		super(value);
	}
		
}
