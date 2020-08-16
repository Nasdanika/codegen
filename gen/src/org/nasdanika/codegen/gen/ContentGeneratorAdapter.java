package org.nasdanika.codegen.gen;

import java.io.InputStream;
import java.util.Collection;

import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;

public abstract class ContentGeneratorAdapter<T extends ContentGenerator> extends GeneratorAdapter<T> implements SupplierFactory<InputStream> {
		
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
		return ret.then(Util.JOIN_STREAMS);
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
