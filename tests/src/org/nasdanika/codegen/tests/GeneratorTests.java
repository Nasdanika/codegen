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
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;

/**
 * Tests of generators.
 * @author Pavel
 *
 */
public class GeneratorTests {

	
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
		URI bankUri = URI.createPlatformPluginURI("org.nasdanika.codegen.tests/generator-models/hello-world.codegen", false);
		Resource bankResource = resourceSet.getResource(bankUri, true);
		Generator<org.nasdanika.common.resources.File<InputStream>> generator = (Generator<org.nasdanika.common.resources.File<InputStream>>) bankResource.getContents().iterator().next();
		
		// TODO - validate				
		Container<InputStream> fsc = new FileSystemContainer(new File("target/generator-tests/hello-world"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("name", "World");
		
		ProgressMonitor pm = new PrintStreamProgressMonitor();
		generator.createWork().execute(mc, pm);		
	}
	
}
