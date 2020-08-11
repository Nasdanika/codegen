package org.nasdanika.codegen.java.gen;

import org.nasdanika.codegen.java.Field;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;

public class FieldAdapter extends MemberAdapter<Field> {

	public FieldAdapter(Field target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		// Comment
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		ret
			.append(context.interpolateToString(target.getType()))
			.append(" ")
			.append(context.interpolateToString(target.getName()));
		
		if (!Util.isBlank(body)) {
			ret.append(" = ").append(body);
		}
		ret.append(";");
		return ret.toString();
	}

}
