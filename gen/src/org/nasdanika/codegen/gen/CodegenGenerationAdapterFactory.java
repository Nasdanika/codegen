package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Container;
import org.nasdanika.codegen.ContentGeneratorReference;
import org.nasdanika.codegen.ContentGroup;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.Text;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.SupplierFactory;
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
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, ResourceGroup>(
				CodegenPackage.Literals.RESOURCE_GROUP, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ResourceGroupAdapter::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, Container>(
				CodegenPackage.Literals.CONTAINER, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ContainerAdapter::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, File>(
				CodegenPackage.Literals.FILE, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				FileAdapter::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, ResourceGeneratorReference>(
				CodegenPackage.Literals.RESOURCE_GENERATOR_REFERENCE, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ResourceGeneratorReferenceAdapter::new));
		
		// --- Content ---
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ContentGroup>(
					CodegenPackage.Literals.CONTENT_GROUP, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentGroupAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Text>(
					CodegenPackage.Literals.TEXT, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					TextAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ContentGeneratorReference>(
					CodegenPackage.Literals.CONTENT_GENERATOR_REFERENCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentGeneratorReferenceAdapter::new));
		
//		BundleResourceCollection.java
//		ContentGeneratorAdapter.java
//		ContentReference.java
//		Filter.java
//		FreeMarkerGenerator.java
//		GeneratorAdapter.java
//		HttpCall.java
//		Interpolator.java
//		Mustache.java
//		ReconcileAction.java
//		ResourceCollection.java
//		ResourceContainer.java
//		ResourceGeneratorAdapter.java
//		ZipArchive.java
//		ZipResourceCollection.java		
// link, res link, cont link		
		
	}

}
