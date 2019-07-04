package org.nasdanika.codegen.tests;

import java.io.InputStream;
import java.util.function.BiFunction;

import org.nasdanika.common.DefaultConverter;

public class TestsBase {

	static BiFunction<org.nasdanika.common.resources.File<InputStream>, Object, InputStream> encoder = (file, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	


}
