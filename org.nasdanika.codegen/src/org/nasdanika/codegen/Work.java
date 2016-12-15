package org.nasdanika.codegen;

import org.eclipse.core.runtime.SubMonitor;
import org.nasdanika.config.Context;

/**
 * @author Pavel Vlasov
 *
 */
public interface Work<T> {
	
	/**
	 * @return Total number of work units in this item.
	 */
	int size();
	
	/**
	 * 
	 * @param context
	 * @param monitor Parent monitor to use. The work is responsible for invoking monitor.split(size()).
	 * @return
	 * @throws Exception
	 */
	T execute(Context context, SubMonitor monitor) throws Exception;

}
