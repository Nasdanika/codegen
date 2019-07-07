package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.junit.Assert;
import org.junit.Test;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.html.CodegenDocumentationGenerator;
import org.nasdanika.codegen.util.ConfigurableValidatingModelGenerator;
import org.nasdanika.codegen.util.ValidatingModelGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.impl.ProgressReportGenerator;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class StaticTextTests extends TestsBase {

	
	private static final String TEST_MODELS_BASE_URI = "org.nasdanika.codegen.tests.models/models/";
	
	// --- Basic ---
	
	/**
	 * Generates a greeting without interpolation.
	 * @throws Exception
	 */
	@Test
	public void testBasicValidatingGeneration() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/basic.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/basic"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("name", "World");
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating basic text", 0);
		List<String> result = validatingModelGenerator.execute(mc, progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, ${name}!", result.get(0));
	}
		
	@Test
	public void testBasicDocumentationGeneration() throws Exception {
		CodegenDocumentationGenerator generator = new CodegenDocumentationGenerator("Nasdanika Basic Codegen Model", null);
		generator.loadModel(TEST_MODELS_BASE_URI+"static-text/basic.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-model-doc/static-text/basic"));
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating static text", 0);
		Container<Object> container = fsc.adapt(null, encoder, null);
		generator.generate(container, progressMonitor.compose(pe));
		
		// HTML report
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);		
	}
	
	// TODO - implement proper report generation.
	
	// --- Interpolation ---
	
	/**
	 * Generates a greeting with interpolation.
	 * @throws Exception
	 */
	@Test
	public void testInterpolation() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("greetings/name", "World");
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating interpolated static text", 0);
		List<String> result = validatingModelGenerator.execute(mc, progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, World!", result.get(0));
	}
	
	/**
	 * Generates a greeting with interpolation and a property hierarchy.
	 * @throws Exception
	 */
	@Test
	public void testHierarchicalInterpolation() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-hierarchical"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("greetings", Collections.singletonMap("name", "World"));
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
		List<String> result = validatingModelGenerator.execute(mc, progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, World!", result.get(0));
	}
	
	/**
	 * Generates a greeting with interpolation and a property hierarchy retrieved from a map wrapped into a context.
	 * @throws Exception
	 */
	@Test
	public void testMapToContextInterpolation() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetings", Collections.singletonMap("name", "World"));		
		
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-hierarchical"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
		Context context = mc.compose(Context.wrap(config::get));
		List<String> result = validatingModelGenerator.execute(context, progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, World!", result.get(0));
	}
	
	class MapConfigurableValidatingModelStringGenerator extends ConfigurableValidatingModelGenerator<String, Map<String,Object>> {

		public MapConfigurableValidatingModelStringGenerator(String platformPluginUri, Map<String, Object> configuration) throws Exception {
			super(platformPluginUri, configuration);
		}

		@Override
		protected Diagnostic validateConfiguration(Context context) {
			if (configuration.containsKey("greetings")) {
				return new BasicDiagnostic(Diagnostic.OK, "Validating configuration", 0, "OK", new Object[] {configuration});
			}
			return new BasicDiagnostic(Diagnostic.ERROR, "Validating configuration", 0, "Configuration must contain key 'greetings'", new Object[] {configuration});
		}

		@Override
		protected Context createConfigurationContext(Context chain) {
			return Context.wrap(configuration::get).compose(chain);
		}
		
	}
	
	/**
	 * Generates a greeting with interpolation and configuration loaded from a map.
	 * @throws Exception
	 */
	@Test
	public void testInterpolationWithConfiguration() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetings", Collections.singletonMap("name", "World"));
		
		MapConfigurableValidatingModelStringGenerator generator = new MapConfigurableValidatingModelStringGenerator(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen", config);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-with-configuration"));
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
		List<String> result = generator.bindContext(Context.EMPTY_CONTEXT).execute(progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, World!", result.get(0));
	}		
		
	/**
	 * Generates a greeting with interpolation and an invalid configuration loaded from a map.
	 * @throws Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInterpolationWithInvalidConfiguration() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetngs", Collections.singletonMap("name", "World"));
		
		MapConfigurableValidatingModelStringGenerator generator = new MapConfigurableValidatingModelStringGenerator(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen", config);
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-with-invalid-configuration"));
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
		List<String> result = generator.bindContext(Context.EMPTY_CONTEXT).execute(progressMonitor.compose(pe));	
		
		// HTML report
		Container<Object> container = fsc.adapt(null, encoder, null);
		ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
		prg.generate(container.getContainer("progress-report"), progressMonitor);				
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("Hello, World!", result.get(0));
	}		

//	interpolation-configuration-invalid.yml
//	interpolation-configuration.yml
//	interpolation.codegen documentation
	
	
	
	
//	arguments-no-controller-disabled.codegen
//	arguments-no-controller.codegen
//	cannot-convert-arguments.codegen
//	configuration-bad.codegen
//	configuration-list.codegen
//	configuration-reference.codegen
//	configuration-reference.json
//	configuration-reference.properties
//	configuration-reference.yml
//	configuration.codegen
//	context-path.codegen
//	controller-with-arguments.codegen
//	controller.codegen
//	disabled.codegen
//	wrong-controller-class.codegen
//	wrong-number-of-controller-arguments.codegen	
	
}
