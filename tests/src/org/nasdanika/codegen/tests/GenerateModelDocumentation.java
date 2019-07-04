package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.impl.ProgressReportGenerator;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;

public class GenerateModelDocumentation extends TestsBase {

	private static final String MODEL_URI = "urn:org.nasdanika.codegen";
	
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
		ProgressEntry pe = new ProgressEntry("Generating Codegen Model Documentation", 0);
		Container<Object> container = fsc.adapt(null, encoder, null);
		generator.generate(container, progressMonitor.compose(pe));
		org.nasdanika.common.resources.File<Object> progressFile = container.getFile("progress-report.json");
		if (progressFile == null) {
			System.out.println(pe);
		} else {
			progressFile.setContents(pe.toString(), progressMonitor);
		}
		
		// HTML report
		ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);		
	}
	
}
