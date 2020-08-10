package org.nasdanika.codegen.util;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.emf.Palette;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Registers ncore palettes.
 * 
 * @author Pavel
 *
 */
public class Activator implements BundleActivator {

	/**
	 * Resources.
	 */
	public static final Palette RESOURCES_PALETTE = Palette.Registry.INSTANCE.create(
			"org.nasdanika.codegen:resources",
			"Resources",
			"Resources - files, folders, packages, compilation units.");

	/**
	 * Generators of file content. 
	 */
	public static final Palette CONTENT_GENERATORS_PALETTE = Palette.Registry.INSTANCE.create(
			"org.nasdanika.codegen:content-generators",
			"Content",
			"Generators of file content");
	
	@Override
	public void start(BundleContext context) throws Exception {
		RESOURCES_PALETTE.add(
				CodegenPackage.Literals.RESOURCE_GROUP,
				CodegenPackage.Literals.CONTAINER,
				CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION,
				CodegenPackage.Literals.RESOURCE_GENERATOR_REFERENCE,
				CodegenPackage.Literals.RESOURCE_GENERATOR_LINK,
				CodegenPackage.Literals.ZIP_RESOURCE_COLLECTION,
				CodegenPackage.Literals.RESOURCE_GENERATOR_ADAPTER,
				CodegenPackage.Literals.FILE);	
		
		CONTENT_GENERATORS_PALETTE.add(
				CodegenPackage.Literals.CONTENT_GROUP,
				CodegenPackage.Literals.INTERPOLATOR,
				CodegenPackage.Literals.MUSTACHE,
				CodegenPackage.Literals.FREE_MARKER_GENERATOR,
				CodegenPackage.Literals.INTERPOLATOR,
				CodegenPackage.Literals.ZIP_ARCHIVE,
				CodegenPackage.Literals.CONTENT_GENERATOR_REFERENCE,
				CodegenPackage.Literals.CONTENT_GENERATOR_LINK,
				CodegenPackage.Literals.INTERPOLATOR,
				CodegenPackage.Literals.CONTENT_REFERENCE,
				CodegenPackage.Literals.TEXT,
				CodegenPackage.Literals.HTTP_CALL,
				CodegenPackage.Literals.CONTENT_GENERATOR_ADAPTER				
		); 	
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP

	}

}
