package org.nasdanika.codegen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntity;

/**
 * Merges new and old content of a file
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface Merger<T> {
	
	T merge(Context context, BinaryEntity entity, T oldContent, T newContent, ProgressMonitor progressMonitor) throws Exception;

//	int getWorkSize();
	
}
