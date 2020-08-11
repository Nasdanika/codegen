package org.nasdanika.codegen.java.gen;

import java.util.Arrays;
import java.util.Iterator;

import org.nasdanika.codegen.java.Operation;
import org.nasdanika.common.Context;
import org.nasdanika.common.Util;

public abstract class OperationAdapter<T extends Operation> extends MemberAdapter<T> {

	protected OperationAdapter(T target) {
		super(target);
	}
	
	protected void appendExceptions(Context context, StringBuilder builder) {
		if (!Util.isBlank(target.getExceptions())) {
			builder.append(" throws ");
			Iterator<String> eit = Arrays.asList(target.getExceptions().split(NEW_LINE_REGEX)).iterator();
			while (eit.hasNext()) {
				builder.append(context.interpolate(eit.next()));
				if (eit.hasNext()) {
					builder.append(", ");
				}
			}					
		}
	}

	protected void appendParameters(Context context, StringBuilder builder) {
		builder.append("(");
		if (!Util.isBlank(target.getParameters())) {
			Iterator<String> pit = Arrays.asList(target.getParameters()).iterator();
			while (pit.hasNext()) {
				builder.append(context.interpolate(pit.next()));
				if (pit.hasNext()) {
					builder.append(", ");
				}
			}
		}
		builder.append(")");
	}
	
}
