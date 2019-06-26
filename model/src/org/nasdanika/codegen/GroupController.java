package org.nasdanika.codegen;

import org.nasdanika.common.Context;

public interface GroupController<T, G extends Group<T>> extends GeneratorController<T,G> {

	/**
	 * Selects group element for execution
	 * @param group Group.
	 * @param element Group element.
	 * @param context Group context.
	 * @return Null if element shall not be invoked, element context otherwise.
	 * @throws Exception
	 */
	Context select(G group, Generator<T> element, Context context) throws Exception;
	
}
