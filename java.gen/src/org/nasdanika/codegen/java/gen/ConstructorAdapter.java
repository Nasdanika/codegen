package org.nasdanika.codegen.java.gen;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

public class ConstructorAdapter extends OperationAdapter<org.nasdanika.codegen.java.Constructor> {

	public ConstructorAdapter(org.nasdanika.codegen.java.Constructor target) {
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
		
		// Name
		for (EObject c = target.eContainer(); c != null; c = c.eContainer()) {
			if (c instanceof Type) {
				ret.append(context.interpolateToString(((Type) c).getName()));
				break;
			}			
		}
		
		appendParameters(context, ret);
		appendExceptions(context, ret);
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
