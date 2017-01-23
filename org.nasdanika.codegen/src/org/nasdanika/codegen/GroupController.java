package org.nasdanika.codegen;

import java.util.List;

import org.nasdanika.config.Context;

public interface GroupController<T, G extends Group<T>> extends GeneratorController<List<T>,G> {

	/**
	 * Selects group element for execution
	 * @param group Group.
	 * @param element Group element.
	 * @param context Group context.
	 * @return Null if element shall not be invoked, element context otherwise.
	 * @throws Exception
	 */
	Context select(G group, Generator<?> element, Context context) throws Exception;
	
}
