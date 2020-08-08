package org.nasdanika.codegen.gen;

import java.util.Collection;

import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.common.Context;

/**
 * Selects group elements for execution zero or more times.
 * @author Pavel
 *
 */
public interface GroupSelector {

	/**
	 * Selects group element for execution zero or more times.
	 * @param group Group.
	 * @param element Group element.
	 * @param context Group context.
	 * @return Collection of contexts to execute the selected element with.
	 * @throws Exception
	 */
	Collection<Context> select(Group group, Generator element, Context context) throws Exception;
	
}
