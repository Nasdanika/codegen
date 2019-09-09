package org.nasdanika.codegen.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.nasdanika.codegen.BundleResourceCollection;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntity;

/**
 * Tests of {@link BundleResourceCollection}.
 * @author Pavel
 *
 */
public class BundleResourceCollectionTests extends TestsBase {
		
	@Test
	public void testBasic() throws Exception {
		Context context = Context.EMPTY_CONTEXT;
		GenerationResult result = validateAndGenerate("bundle-resource-collection/basic", context);
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			BinaryEntity entity = result.output.get("test.txt", progressMonitor.split("Getting test.txt", 1));
			assertNotNull(entity);
			assertTrue(entity.exists(progressMonitor.split("Checking existence", 1, entity)));
			assertEquals("Hello ${name}!!!", DefaultConverter.INSTANCE.convert(entity.getState(progressMonitor.split("Getting state", 1, entity)), String.class));
		}
		
	}
	
	@Test
	public void testInterpolation() throws Exception {
		Context context = Context.singleton("name", "World");
		GenerationResult result = validateAndGenerate("bundle-resource-collection/interpolation", context);
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			BinaryEntity entity = result.output.get("test.txt", progressMonitor.split("Getting test.txt", 1));
			assertNotNull(entity);
			assertTrue(entity.exists(progressMonitor.split("Checking existence", 1, entity)));
			assertEquals("Hello World!!!", DefaultConverter.INSTANCE.convert(entity.getState(progressMonitor.split("Getting state", 1, entity)), String.class));
		}
	}
	
}
