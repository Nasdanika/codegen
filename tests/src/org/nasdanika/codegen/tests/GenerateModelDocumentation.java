package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.impl.ProgressReportGenerator;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;
import org.nasdanika.html.ecore.EcoreHelpGenerator;

public class GenerateModelDocumentation extends TestsBase {

	private static final String MODEL_URI = "urn:org.nasdanika.codegen";
	private static final String JAVA_MODEL_URI = "urn:org.nasdanika.codegen.java";
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() throws Exception {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Codegen Model", null, null, false);
		generator.loadGenModel(MODEL_URI);
		generator.loadGenModel(JAVA_MODEL_URI);
		File docDir = new File("target/model-doc");
		System.out.println("Generating HTML model documentation to "+docDir.getAbsolutePath());
		BinaryEntityContainer fsc = new FileSystemContainer(docDir);
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating Codegen Model Documentation", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, ENCODER);
			generator.generate(container, progressMonitor.compose(pe));
			container.put("progress-report.json", pe.toString(), progressMonitor.split("Saving progress report", 1));
			
//			// HTML report
//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
		}
	}

	/**
	 * Generates Ecore model Eclipse help.
	 * @throws Exception
	 */
	@Test
	public void testEcoreHelp() throws Exception {		
		EcoreHelpGenerator generator = new EcoreHelpGenerator("Model", null, null, "Codegen", "../org.nasdanika.codegen.help/toc.xml#Codegen", "doc/model/");
		generator.loadGenModel(MODEL_URI);
		generator.loadGenModel(JAVA_MODEL_URI);
		File docDir = new File("target/help/model");
		System.out.println("Generating Eclipse help model documentation to "+docDir.getAbsolutePath());
		BinaryEntityContainer fsc = new FileSystemContainer(docDir);
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating Codegen Model Documentation", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, ENCODER);
			generator.generate(container, progressMonitor.compose(pe));
			container.put("progress-report.json", pe.toString(), progressMonitor.split("Writing progress-report.json", 1));
		}
	}
	
}
