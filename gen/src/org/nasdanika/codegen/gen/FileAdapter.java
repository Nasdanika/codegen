package org.nasdanika.codegen.gen;

import java.io.InputStream;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class FileAdapter extends ResourceAdapter<File> {

	public FileAdapter(File target) {
		super(target);
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		SupplierFactory<InputStream> contentFactory;
		EList<ContentGenerator> content = target.getContent();
		if (content.size() == 1) {
			contentFactory = EObjectAdaptable.adaptToSupplierFactoryNonNull(content.iterator().next(), InputStream.class);
		} else {
			ListCompoundSupplierFactory<InputStream> cf = new ListCompoundSupplierFactory<>("File content " + target.getTitle());
			for (Generator e: content) {
				cf.add(EObjectAdaptable.adaptToSupplierFactoryNonNull(e, InputStream.class));
			}
			contentFactory = cf.then(ContentGeneratorAdapter.JOIN_STREAMS_FACTORY);			
		}
				
		ConsumerFactory<BiSupplier<BinaryEntityContainer, InputStream>> fileFactory = new ConsumerFactory<BiSupplier<BinaryEntityContainer, InputStream>>() {

			@Override
			public Consumer<BiSupplier<BinaryEntityContainer, InputStream>> create(Context context) throws Exception {
				return new Consumer<BiSupplier<BinaryEntityContainer, InputStream>>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Create file " + target.getTitle();
					}


					@Override
					public void execute(BiSupplier<BinaryEntityContainer, InputStream> input, ProgressMonitor progressMonitor) throws Exception {
						String name = context.interpolateToString(target.getName());
						BinaryEntity file = Objects.requireNonNull(input.getFirst().get(name, progressMonitor), "Cannot create file " + name + " in " + input.getFirst());
						if (input.getSecond() != null) {
							file.setState(input.getSecond(), progressMonitor);
						}
					}
					
				};
			}
		};
		
		FunctionFactory<BinaryEntityContainer, BiSupplier<BinaryEntityContainer, InputStream>> contentFunctionFactory = contentFactory.asFunctionFactory();
		return contentFunctionFactory.then(fileFactory).create(iContext);
	}

}
