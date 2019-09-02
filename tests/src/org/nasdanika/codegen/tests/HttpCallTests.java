package org.nasdanika.codegen.tests;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.function.BiFunction;

import org.junit.Test;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.resources.BinaryEntityContainer;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class HttpCallTests extends TestsBase {

	
	@Test
	public void testHelloWorld() throws Exception {
		BinaryEntityContainer container = validateAndGenerate("http-call/hello-world", null);
		
		BiFunction<String,InputStream,String> decoder = (path, state) -> DefaultConverter.INSTANCE.convert(state, String.class);
		String sd = container.stateAdapter().adapt(decoder, null).get("hello-world.txt", new PrintStreamProgressMonitor());
		assertEquals("Hello World!", sd);
		
	}
	
}
