package org.nasdanika.codegen.java.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

public class AnnotationAdapter extends MemberAdapter<org.nasdanika.codegen.java.Annotation> {

	public AnnotationAdapter(org.nasdanika.codegen.java.Annotation target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		ret.append("@interface ").append(context.interpolateToString(target.getName()));		
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
