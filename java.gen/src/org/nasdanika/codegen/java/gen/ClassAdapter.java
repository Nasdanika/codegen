package org.nasdanika.codegen.java.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;

public class ClassAdapter extends MemberAdapter<org.nasdanika.codegen.java.Class> {

	public ClassAdapter(org.nasdanika.codegen.java.Class target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		// Comment
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		ret.append("class ").append(context.interpolateToString(target.getName()));
		appendTypeParameters(context, ret);
		
		if (!Util.isBlank(target.getSuperTypes())) {
			int idx = 0;
			for (String st: target.getSuperTypes().split(NEW_LINE_REGEX)) {
				String superTypeName = context.interpolateToString(st);
				if (superTypeName.trim().length() > 0) {
					if (idx == 0) {
						if (Object.class.getName().equals(superTypeName)) {
							++idx;
							continue; 
						}
						ret.append(" extends ");
					} else {
						if (idx == 1) {
							ret.append(" implements ");
						} else {
							ret.append(", ");
						}
					}
					ret.append(superTypeName);
					++idx;
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
