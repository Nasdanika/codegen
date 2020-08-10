package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;

public class ContentGeneratorAdapterAdapter extends ContentGeneratorAdapter<org.nasdanika.codegen.ContentGeneratorAdapter> implements SupplierFactory<InputStream> {

	public ContentGeneratorAdapterAdapter(org.nasdanika.codegen.ContentGeneratorAdapter target) {
		super(target);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		SupplierFactory<InputStream> adapter = EObjectAdaptable.adaptTo(target, SupplierFactory.class, target.getFactory());
		return adapter.create(iContext);
	}

}
