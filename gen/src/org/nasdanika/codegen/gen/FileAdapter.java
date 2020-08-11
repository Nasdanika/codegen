package org.nasdanika.codegen.gen;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;

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
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class FileAdapter extends ResourceAdapter<File> {

	public FileAdapter(File target) {
		super(target);
	}
	
	/**
	 * Creates content factory from content reference elements. Override for additional functionality, e.g. adding package and imports declarations into a Java compilation unit.
	 * @return
	 */
	protected SupplierFactory<InputStream> createContentFactory() {
		EList<ContentGenerator> content = target.getContent();
		if (content.size() == 1) {
			return EObjectAdaptable.adaptToSupplierFactoryNonNull(content.iterator().next(), InputStream.class);
		}
		
		ListCompoundSupplierFactory<InputStream> cf = new ListCompoundSupplierFactory<>("File content " + target.getTitle());
		for (Generator e: content) {
			cf.add(EObjectAdaptable.adaptToSupplierFactoryNonNull(e, InputStream.class));
		}
		return cf.then(ContentGeneratorAdapter.JOIN_STREAMS_FACTORY);			
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
				
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
						String name = finalName(context.interpolateToString(target.getName()));
						switch (target.getReconcileAction()) {
						case CANCEL:
							if (input.getFirst().find(name, progressMonitor) != null) {
								throw new CancellationException("Cancelling generation - resource '" + name + "' already exists in " + input.getFirst());
							}
						case OVERWRITE: {
							BinaryEntity file = Objects.requireNonNull(input.getFirst().get(name, progressMonitor), "Cannot create file " + name + " in " + input.getFirst());
							if (input.getSecond() != null) {
								file.setState(input.getSecond(), progressMonitor);
							}
							break;
						}
						case KEEP: {
							if (input.getFirst().find(name, progressMonitor) == null) {
								BinaryEntity file = Objects.requireNonNull(input.getFirst().get(name, progressMonitor), "Cannot create file " + name + " in " + input.getFirst());
								if (input.getSecond() != null) {
									file.setState(input.getSecond(), progressMonitor);
								}
							}
							break;
						}
						case APPEND: {
							BinaryEntity file = Objects.requireNonNull(input.getFirst().get(name, progressMonitor), "Cannot create file " + name + " in " + input.getFirst());
							if (input.getSecond() != null) {
								file.setState(file.exists(progressMonitor) ? ContentGeneratorAdapter.join(file.getState(progressMonitor), input.getSecond()) : input.getSecond(), progressMonitor);
							}
							break;
						}							
						case MERGE: {
							BinaryEntity file = Objects.requireNonNull(input.getFirst().get(name, progressMonitor), "Cannot create file " + name + " in " + input.getFirst());
							if (input.getSecond() != null) {
								if (file.exists(progressMonitor)) {
									file.setState(merge(iContext, file, file.getState(progressMonitor), input.getSecond(), progressMonitor), progressMonitor);
								} else {
									file.setState(input.getSecond(), progressMonitor);
								}
							}
							break;
						}							
						}
					}
					
				};
			}
		};
		
		FunctionFactory<BinaryEntityContainer, BiSupplier<BinaryEntityContainer, InputStream>> contentFunctionFactory = createContentFactory().asFunctionFactory();
		return contentFunctionFactory.then(fileFactory).create(iContext);
	}
	
	protected InputStream merge(Context context, BinaryEntity entity, InputStream oldContent, InputStream newContent, ProgressMonitor progressMonitor) throws Exception {
		if (Util.isBlank(target.getMerger())) {
			Merger merger = getNativeMerger(context);
			if (merger != null) {
				return merger.merge(context, entity, oldContent, newContent, progressMonitor);
			}
		}
		throw new UnsupportedOperationException("Merging is not supported yet");
	}
	
	protected Merger getNativeMerger(Context context) {
		return null;
	}

}
