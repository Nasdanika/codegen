package org.nasdanika.codegen;

import org.eclipse.core.runtime.SubMonitor;
import org.nasdanika.config.Context;

/**
 * @author Pavel Vlasov
 *
 */
public interface Work<T> {
	
	Work<Object> NO_WORK = new Work<Object>() {

		@Override
		public int size() {
			return 0;
		}

		@Override
		public Object execute(Context context, SubMonitor monitor) throws Exception {
			return null;
		}
		
	};
	
	@SuppressWarnings("unchecked")
	static <T> Work<T> noWork() {
		return (Work<T>) NO_WORK;
	}
	
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
