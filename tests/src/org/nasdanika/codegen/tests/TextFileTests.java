package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.codegen.html.CodegenDocumentationGenerator;
import org.nasdanika.codegen.util.ValidatingModelGenerator;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.impl.ProgressReportGenerator;

/**
 * Tests of {@link TextFile}.
 * @author Pavel
 *
 */
public class TextFileTests extends TestsBase {

	/**
	 * Generates a greetings file.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testHelloWorldGeneration() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
		URI modelUri = URI.createPlatformPluginURI(TEST_MODELS_BASE_URI+"text-file/hello-world.codegen", false);
		Resource modelResource = resourceSet.getResource(modelUri, true);
		Generator<org.nasdanika.common.resources.File<InputStream>> generator = (Generator<org.nasdanika.common.resources.File<InputStream>>) modelResource.getContents().iterator().next();
		
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/text-file/hello-world"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("name", "World");
		
		ProgressMonitor pm = new PrintStreamProgressMonitor();
		generator.createWork().execute(mc, pm);		
	}
	
	/**
	 * Generates a greetings file.
	 * @throws Exception
	 */
	@Test
	public void testHelloWorldValidatingGeneration() throws Exception {
		ValidatingModelGenerator<org.nasdanika.common.resources.File<InputStream>> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"text-file/hello-world.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/text-file/hello-world-validated"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("name", "World");
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0);
		validatingModelGenerator.execute(mc, progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
	}	

	@Test
	public void testHelloWorldDocumentationGeneration() throws Exception {
		CodegenDocumentationGenerator generator = new CodegenDocumentationGenerator("Nasdanika Hello World Codegen Model", null);
		generator.loadModel(TEST_MODELS_BASE_URI+"text-file/hello-world.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-model-doc/text-file/hello-world"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0);
		Container<Object> container = fsc.adapt(null, encoder, null);
		generator.generate(container, progressMonitor.compose(pe));
		
		// HTML report
		ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);		
	}
	
}
