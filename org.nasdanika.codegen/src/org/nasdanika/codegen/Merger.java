package org.nasdanika.codegen;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.nasdanika.config.Context;

/**
 * Merges new and old content of a file
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface Merger<T> {
	
	T merge(Context context, IFile file, T oldContent, T newContent, IProgressMonitor progressMonitor) throws Exception;

	int getWorkSize();
	
}
