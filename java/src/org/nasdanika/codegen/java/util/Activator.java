package org.nasdanika.codegen.java.util;

import org.nasdanika.codegen.java.JavaPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Registers ncore palettes.
 * 
 * @author Pavel
 *
 */
public class Activator implements BundleActivator {
	
	@Override
	public void start(BundleContext context) throws Exception {
		org.nasdanika.codegen.util.Activator.RESOURCES_PALETTE.add(JavaPackage.Literals.SOURCE_FOLDER);		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP

	}

}
