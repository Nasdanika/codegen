package org.nasdanika.codegen.tests.models;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.codegen.StaticText;
import org.nasdanika.common.Context;

public class ControllerUtil {

	private String prefix;

	public ControllerUtil(String prefix) {
		this.prefix = prefix;
	}

	public Collection<Context> instanceTextController(Context context, StaticText generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		for (int i=0; i < 3; ++i) {
			ret.add(context.compose(Context.singleton("surname", prefix+"-"+i)));
		}
		return ret;
	}
	
	public static Collection<Context> staticTextController(Context context, StaticText generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		for (int i=0; i < 3; ++i) {
			ret.add(context.compose(Context.singleton("surname", "Static-"+i)));
		}
		return ret;
	}

}
