package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;

/**
 * Generation adapter factory for Codegen model elements.
 * @author Pavel
 *
 */
public class CodegenGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public CodegenGenerationAdapterFactory() {
		
		// Generator - abstract
		
		// --- Grouping ---
		// Group - abstract
		// ResourceGroup
		// ContentGroup
		
		// --- Resources ---
		// ResourceGenerator - abstract
		// Resource - abstract
		// Container
		// File
		
		// ResourceColleciton - abstract
		// BundleResourceCollection
		// ZipResourceCollection
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, ResourceGroup>(
				CodegenPackage.Literals.RESOURCE_GROUP, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ResourceGroupAdapter::new));
		
		// --- Content ---
		
		
		
//		BundleResourceCollection.java
//		CodegenFactory.java
//		CodegenPackage.java
//		Container.java
//		ContentGenerator.java
//		ContentGeneratorAdapter.java
//		ContentGeneratorReference.java
//		ContentGroup.java
//		ContentReference.java
//		File.java
//		Filter.java
//		FreeMarkerGenerator.java
//		Generator.java
//		GeneratorAdapter.java
//		GeneratorReference.java
//		Group.java
//		HttpCall.java
//		Interpolator.java
//		Mustache.java
//		ReconcileAction.java
//		Resource.java
//		ResourceCollection.java
//		ResourceContainer.java
//		ResourceGenerator.java
//		ResourceGeneratorAdapter.java
//		ResourceGeneratorReference.java
//		ResourceGroup.java
//		Text.java
//		ZipArchive.java
//		ZipResourceCollection.java		
		
	}

}
