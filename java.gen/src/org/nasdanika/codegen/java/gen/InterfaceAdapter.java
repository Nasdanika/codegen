package org.nasdanika.codegen.java.gen;

import java.util.Arrays;
import java.util.Iterator;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;

public class InterfaceAdapter extends MemberAdapter<org.nasdanika.codegen.java.Interface> {

	public InterfaceAdapter(org.nasdanika.codegen.java.Interface target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		// Comment
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		ret.append("interface ").append(context.interpolateToString(target.getName()));
		appendTypeParameters(context, ret);
		
		if (!Util.isBlank(target.getSuperTypes())) {
			ret.append(" extends ");
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
