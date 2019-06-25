package org.nasdanika.codegen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Work;

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
	Work<Context, T> createWork() throws Exception;
	
}
