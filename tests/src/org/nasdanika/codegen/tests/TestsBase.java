package org.nasdanika.codegen.tests;

import java.io.InputStream;
import java.util.function.BiFunction;

import org.nasdanika.common.DefaultConverter;

public class TestsBase {

	public static BiFunction<String, Object, InputStream> encoder = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
	
		
	public static final String TEST_MODELS_BASE_URI = "org.nasdanika.codegen.tests.models/models/";

}
