package org.nasdanika.codegen.tests.models;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.common.Context;

public class StaticTextController implements GeneratorController<String, StaticText> {
	
	private String prefix;

	public StaticTextController() {
		this("Element");
	}
	
	public StaticTextController(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public Collection<Context> iterate(Context context, StaticText generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		for (int i=0; i < 3; ++i) {
			ret.add(context.compose(Context.singleton("surname", prefix+"-"+i)));
		}
		return ret;
	}

}
