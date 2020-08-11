package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntity;

/**
 * Merges new and old content of a file
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface Merger {
	
	InputStream merge(Context context, BinaryEntity entity, InputStream oldContent, InputStream newContent, ProgressMonitor progressMonitor) throws Exception;
	
}
