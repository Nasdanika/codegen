package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.Interpolator;
import org.nasdanika.common.Context;

public class InterpolatorAdapter extends FilterAdapter<Interpolator> {

	public InterpolatorAdapter(Interpolator target) {
		super(target);
	}

	@Override
	protected String filter(Context context, String input) {
		return context.interpolateToString(input);
	}

}
