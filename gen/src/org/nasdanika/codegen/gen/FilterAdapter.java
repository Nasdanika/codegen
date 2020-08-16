package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.Filter;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;

public abstract class FilterAdapter<T extends Filter> extends ContentGeneratorAdapter<T> {

	protected FilterAdapter(T target) {
		super(target);
	}
	

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		// Generators - List - join
		ListCompoundSupplierFactory<InputStream> bodySupplierFactory = new ListCompoundSupplierFactory<>("Body");
		for (ContentGenerator be: target.getGenerators()) {
			bodySupplierFactory.add(EObjectAdaptable.adaptToSupplierFactory(be, InputStream.class));			
		}	
						
		FunctionFactory<InputStream,InputStream> filterFactory = new FunctionFactory<InputStream, InputStream>() {

			@Override
			public Function<InputStream, InputStream> create(Context context) throws Exception {
				return new Function<InputStream, InputStream>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return target.getTitle();
					}

					@Override
					public InputStream execute(InputStream input, ProgressMonitor progressMonitor) throws Exception {
						return Util.filter(context, input, str -> FilterAdapter.this.filter(context, str));
					}
					
				};
			}
			
		};
		return bodySupplierFactory.then(Util.JOIN_STREAMS_FACTORY).then(filterFactory).create(iContext);
	}
	
	protected abstract String filter(Context context, String input); 

}
