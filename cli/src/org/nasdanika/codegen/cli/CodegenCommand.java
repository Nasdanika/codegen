package org.nasdanika.codegen.cli;

import java.io.File;
import java.io.InputStream;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.ModelCommand;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates resources from a codegen model",
		name = "codegen",
		versionProvider = CodegenBundleVersionProvider.class)
public class CodegenCommand extends ModelCommand<Generator> {
	
	@Option(
			names = {"-o", "--output"}, 
			description = "Output directory, defaults to the current directory")
	private File outputDir;	
	
	@Option(
			names = {"-b", "--base-uri"}, 
			description = "Base URI for resolving and relativizing other URI's. "
					+ "Resolved against the output directory URI. "
					+ "Defaults to the output directory URI.")
	private String baseUri;		

	@Override
	protected ConsumerFactory<Generator> getConsumerFactory() {
		return new ConsumerFactory<Generator>() {

			@Override
			public Consumer<Generator> create(Context context) throws Exception {
				return new Consumer<Generator>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Generate " + CodegenCommand.this.getName();
					}

					@Override
					public void execute(Generator generator, ProgressMonitor progressMonitor) throws Exception {
						CodegenCommand.this.execute(generator, context, progressMonitor);
					}
					
				};
			}
		};
	}
	
	protected String getName() {
		return getClass().getAnnotation(Command.class).name();
	}
	
	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
	
	@Override
	protected Context newContext() {
		Context ret = super.newContext();
		URI outputURI = URI.createFileURI(outputDir.getAbsolutePath() + File.separator);
		URI baseURI = Util.isBlank(baseUri) ? outputURI : URI.createURI(baseUri).resolve(outputURI);		
		ret = ret.compose(Context.singleton(URI.class, baseURI));
		ret = ret.compose(Context.singleton(Context.BASE_URI_PROPERTY, baseURI));
		return ret;		
	}
		
	protected void execute(
			Generator generator, 
			Context context, 
			ProgressMonitor monitor) throws Exception {
		
		if (outputDir == null) {
			outputDir = new File(".");
		}
		FileSystemContainer output = new FileSystemContainer(outputDir);		
		ResourceSet resourceSet = generator.eResource().getResourceSet();
		MutableContext generationContext = context.fork();
		generationContext.register(BinaryEntityContainer.class, output);
		generationContext.register(ResourceSet.class, resourceSet);

		EObjectAdaptable.adaptToConsumerFactoryNonNull(generator, BinaryEntityContainer.class).create(generationContext).execute(output, monitor);
	}
	
	/**
	 * Creates a {@link ResourceSet} with all known packages registered and with {@link XMIResourceFactoryImpl}
	 * @return
	 */
	@Override
	protected ResourceSet createEmptyResourceSet() {		
		ResourceSet resourceSet = super.createEmptyResourceSet();
		org.nasdanika.emf.ext.Activator.registerGlobalComposedFactory(resourceSet);
		return resourceSet;
	}		

}
