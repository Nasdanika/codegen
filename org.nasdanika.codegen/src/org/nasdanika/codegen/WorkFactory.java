package org.nasdanika.codegen;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Creates work to be executed.
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface WorkFactory<T> {
		
	/**
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	Work<T> createWork() throws Exception;
	
}
