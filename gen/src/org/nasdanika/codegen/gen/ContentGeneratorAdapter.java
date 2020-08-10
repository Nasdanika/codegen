package org.nasdanika.codegen.gen;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;

public abstract class ContentGeneratorAdapter<T extends ContentGenerator> extends GeneratorAdapter<T> implements SupplierFactory<InputStream> {
	
	public static Function<List<InputStream>, InputStream> JOIN_STREAMS = new Function<List<InputStream>, InputStream>() {

		@Override
		public double size() {
			return 1;
		}

		@Override
		public String name() {
			return "Joining content";
		}

		@Override
		public InputStream execute(List<InputStream> content, ProgressMonitor progressMonitor) throws Exception {
			if (content.isEmpty()) {
				return null;
			}
			if (content.size() == 1) {
				return content.iterator().next();
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			for (InputStream in: content) {
				try (BufferedInputStream bin = new BufferedInputStream(in)) {
					int b;
					while ((b = bin.read()) != -1) {
						baos.write(b);
					}						
				}
			}
			baos.close();
			return new ByteArrayInputStream(baos.toByteArray());
		}
		
	};
	
	public static FunctionFactory<List<InputStream>, InputStream> JOIN_STREAMS_FACTORY = new FunctionFactory<List<InputStream>, InputStream>() {

		@Override
		public Function<List<InputStream>, InputStream> create(Context context) throws Exception {
			return JOIN_STREAMS;
		}
		
	};
	
	@Override
	public Supplier<InputStream> create(Context context) throws Exception {
		SupplierFactory<Context> contextSupplierFactory = createContextSupplierFactory();
		Collection<Context> iContexts = iterate(context);
		if (iContexts.size() == 1) {
			return configure(iContexts.iterator().next(), contextSupplierFactory, this::createElement);
		}
		
		@SuppressWarnings("resource")
		ListCompoundSupplier<InputStream> ret = new ListCompoundSupplier<>("Content generator iterator " + target.getTitle());
		for (Context iContext: iContexts) {
			ret.add(configure(iContext, contextSupplierFactory, this::createElement));
		}
		return ret.then(JOIN_STREAMS);
	}
	
	protected Supplier<InputStream> configure(Context context, SupplierFactory<Context> contextSupplierFactory, SupplierFactory<InputStream> supplierFactory) throws Exception {
		if (contextSupplierFactory == null) {
			return supplierFactory.create(context);
		}
		
		return supplierFactory.contextify(contextSupplierFactory).create(context);
	}

	/**
	 * Invoked for each iterator element.
	 * @param iContext Iterator element context mapped and injected with configuration entries.
	 * @return
	 * @throws Exception
	 */
	protected abstract Supplier<InputStream> createElement(Context iContext) throws Exception;		
		
	protected ContentGeneratorAdapter(T target) {
		super(target);
	}

}
