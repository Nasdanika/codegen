package org.nasdanika.codegen;

import org.eclipse.core.runtime.SubMonitor;

public interface IFilter<T> {

	T filter(Context context, T input, SubMonitor monitor) throws Exception;
	
}
