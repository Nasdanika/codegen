package org.nasdanika.codegen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * Merges new and old content of a file
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface Merger<T> {
	
	T merge(Context context, File<T> file, T oldContent, T newContent, ProgressMonitor progressMonitor) throws Exception;

	int getWorkSize();
	
}
