package org.nasdanika.codegen.java.gen;

import java.util.Arrays;
import java.util.Iterator;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;

public class EnumAdapter extends MemberAdapter<org.nasdanika.codegen.java.Enum> {

	public EnumAdapter(org.nasdanika.codegen.java.Enum target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		ret.append("enum ").append(context.interpolateToString(target.getName()));
		
		if (!Util.isBlank(target.getSuperTypes())) {
			ret.append(" implements ");
			Iterator<String> stit = Arrays.asList(target.getSuperTypes().split(NEW_LINE_REGEX)).iterator();
			while (stit.hasNext()) {
				ret.append(context.interpolate(stit.next()));
				if (stit.hasNext()) {
					ret.append(", ");
				}
			}
		}
		ret
			.append(" {")
			.append(System.lineSeparator())
			.append(body)
			.append(System.lineSeparator())
			.append("}")
			.append(System.lineSeparator());
		
		return ret.toString();
	}

}
