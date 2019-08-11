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
import org.nasdanika.html.ecore.EcoreHelpGenerator;

public class GenerateModelDocumentation extends TestsBase {

	private static final String MODEL_URI = "urn:org.nasdanika.codegen";
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() throws Exception {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Codegen Model", null, null, false);
		generator.loadGenModel(MODEL_URI);
		File docDir = new File("target/model-doc");
		System.out.println("Generating HTML model documentation to "+docDir.getAbsolutePath());
		Container<InputStream> fsc = new FileSystemContainer(docDir);
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

	/**
	 * Generates Ecore model Eclipse help.
	 * @throws Exception
	 */
	@Test
	public void testEcoreHelp() throws Exception {		
		EcoreHelpGenerator generator = new EcoreHelpGenerator("Model", null, null, "Codegen", "../org.nasdanika.codegen.help/toc.xml#Codegen", "doc/model/");
		generator.loadGenModel(MODEL_URI);
		File docDir = new File("../help/doc/model");
		System.out.println("Generating Eclipse help model documentation to "+docDir.getAbsolutePath());
		Container<InputStream> fsc = new FileSystemContainer(docDir);
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
	}
	
}
