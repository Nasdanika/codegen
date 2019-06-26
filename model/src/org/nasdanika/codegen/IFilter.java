package org.nasdanika.codegen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

public interface IFilter<T> {

	T filter(Context context, T input, ProgressMonitor monitor) throws Exception;
	
}
