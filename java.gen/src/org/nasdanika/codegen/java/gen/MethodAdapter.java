package org.nasdanika.codegen.java.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;

public class MethodAdapter extends OperationAdapter<org.nasdanika.codegen.java.Method> {

	public MethodAdapter(org.nasdanika.codegen.java.Method target) {
		super(target);
	}

	@Override
	protected String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception {
		StringBuilder ret = new StringBuilder();
		// Comment
		ret.append(comment);
		appendAnnotations(context, ret);
		appendModifiers(context, ret);
		appendTypeParameters(context, ret);
		
		// Return type
		String returnType = target.getReturnType();
		if (Util.isBlank(returnType)) {
			returnType = "void";
		} else {
			returnType= context.interpolateToString(returnType);
		}
		ret.append(returnType).append(" ");
		
		// Name
		ret.append(context.interpolateToString(target.getName()));
		
		appendParameters(context, ret);
		appendExceptions(context, ret);
		
		if (Util.isBlank(body)) { // Empty body - abstract or interface method. 
			ret.append(";").append(System.lineSeparator());
		} else {
			ret
				.append(" {")
				.append(System.lineSeparator())
				.append(body)
				.append(System.lineSeparator())
				.append("}")
				.append(System.lineSeparator());
		}
		return ret.toString();
	}
		
}
