package org.nasdanika.codegen;

import org.eclipse.core.runtime.SubMonitor;
import org.nasdanika.config.Context;

public interface IFilter<T> {

	T filter(Context context, T input, SubMonitor monitor) throws Exception;
	
}
