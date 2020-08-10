package org.nasdanika.codegen.gen;

import java.util.Collections;
import java.util.Iterator;

import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.Util;

public abstract class GeneratorAdapter<T extends Generator> {
	
	protected T target;
	
	protected GeneratorAdapter(T target) {
		this.target = target;
	}
	
	// enabled
	// iterator
	
	/**
	 * If enabled is false returns an empty iterator. 
	 * If iterator is blank returns an iterator with a single element - the parameter context.
	 * Otherwise calls processes the iterator as explained in the model documentation.   
	 * @param context
	 * @return
	 */
	protected Iterator<Context> iterate(Context context) {
		if (!target.isEnabled()) {
			return Collections.emptyIterator();
		}
		String iterator = target.getIterator();
		if (Util.isBlank(iterator)) {
			return Collections.singleton(context).iterator();
		}
		throw new UnsupportedOperationException();		
	}

}
