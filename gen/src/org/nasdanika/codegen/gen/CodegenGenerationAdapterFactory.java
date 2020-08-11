package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Container;
import org.nasdanika.codegen.ContentGeneratorLink;
import org.nasdanika.codegen.ContentGeneratorReference;
import org.nasdanika.codegen.ContentGroup;
import org.nasdanika.codegen.ContentReference;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.HttpCall;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.Mustache;
import org.nasdanika.codegen.ResourceGeneratorLink;
import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.codegen.Text;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.codegen.ZipResourceCollection;
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
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, ResourceGeneratorLink>(
				CodegenPackage.Literals.RESOURCE_GENERATOR_LINK, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ResourceGeneratorLinkAdapter::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, org.nasdanika.codegen.ResourceGeneratorAdapter>(
				CodegenPackage.Literals.RESOURCE_GENERATOR_ADAPTER, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ResourceGeneratorAdapterAdapter::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, ZipResourceCollection>(
				CodegenPackage.Literals.ZIP_RESOURCE_COLLECTION, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				ZipResourceCollectionAdapter::new));
		
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
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ContentGeneratorLink>(
					CodegenPackage.Literals.CONTENT_GENERATOR_LINK, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentGeneratorLinkAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, org.nasdanika.codegen.ContentGeneratorAdapter>(
					CodegenPackage.Literals.CONTENT_GENERATOR_ADAPTER, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentGeneratorAdapterAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ContentReference>(
					CodegenPackage.Literals.CONTENT_REFERENCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentReferenceAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, HttpCall>(
					CodegenPackage.Literals.HTTP_CALL, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					HttpCallAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Interpolator>(
					CodegenPackage.Literals.INTERPOLATOR, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					InterpolatorAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Mustache>(
					CodegenPackage.Literals.MUSTACHE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					MustacheAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, FreeMarkerGenerator>(
					CodegenPackage.Literals.FREE_MARKER_GENERATOR, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					FreeMarkerGeneratorAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ZipArchive>(
					CodegenPackage.Literals.ZIP_ARCHIVE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ZipArchiveAdapter::new));
		
//		ResourceCollection.java
//		BundleResourceCollection.java
//		ZipResourceCollection.java		
		
	}

}
