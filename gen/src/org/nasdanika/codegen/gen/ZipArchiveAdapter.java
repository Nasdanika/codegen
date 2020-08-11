package org.nasdanika.codegen.gen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.common.CompoundConsumerFactory;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.EphemeralBinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ZipArchiveAdapter extends ContentGeneratorAdapter<ZipArchive> {

	public ZipArchiveAdapter(ZipArchive target) {
		super(target);
	}
	
	protected ConsumerFactory<BinaryEntityContainer> createElementsConsumerFactory() {		
		EList<ResourceGenerator> elements = target.getElements();
		if (elements.size() == 1) {
			return EObjectAdaptable.adaptToConsumerFactoryNonNull(elements.iterator().next(), BinaryEntityContainer.class);
		}
		CompoundConsumerFactory<BinaryEntityContainer> ret = new CompoundConsumerFactory<>("Zip arhive elements " + target.getTitle());
		for (Generator e: elements) {
			ConsumerFactory<BinaryEntityContainer> eAdapter = EObjectAdaptable.adaptToConsumerFactoryNonNull(e, BinaryEntityContainer.class);
			ret.add(eAdapter);
		}
		return ret;
	}	

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {		
		SupplierFactory<BinaryEntityContainer> containerFactory = new SupplierFactory<BinaryEntityContainer>() {

			@Override
			public Supplier<BinaryEntityContainer> create(Context arg) throws Exception {
				return Supplier.from(new EphemeralBinaryEntityContainer(), "Constructor");
			}
			
		};
				
		FunctionFactory<BinaryEntityContainer,InputStream> streamFactory = new FunctionFactory<BinaryEntityContainer, InputStream>() {

			@Override
			public Function<BinaryEntityContainer, InputStream> create(Context context) throws Exception {
				return new Function<BinaryEntityContainer, InputStream>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return target.getTitle() + " - archiving";
					}

					@Override
					public InputStream execute(BinaryEntityContainer container, ProgressMonitor progressMonitor) throws Exception {
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						try (ZipOutputStream zos = new ZipOutputStream(baos)) {
							container.store(zos, null, progressMonitor);
						}
						baos.close();
						return new ByteArrayInputStream(baos.toByteArray());
					}
					
				};
			}
			
		};
		
		return containerFactory.then(createElementsConsumerFactory().asFunctionFactory()).then(streamFactory).create(iContext);
	}

}
