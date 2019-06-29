package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;
import java.util.function.BiFunction;

import org.junit.Test;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;

public class GenerateModelDocumentation {

	private static final String MODEL_URI = "urn:org.nasdanika.codegen";
	private static BiFunction<org.nasdanika.common.resources.File<InputStream>, Object, InputStream> encoder = (file, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Codegen Model", null, null);
		generator.loadGenModel(MODEL_URI);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/model-doc"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		generator.generate(fsc.adapt(null, encoder, null), progressMonitor);		
	}
	
}