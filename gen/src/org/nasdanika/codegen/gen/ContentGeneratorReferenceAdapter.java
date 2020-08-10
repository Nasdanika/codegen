package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.codegen.ContentGeneratorReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;

public class ContentGeneratorReferenceAdapter extends ContentGeneratorAdapter<ContentGeneratorReference> implements SupplierFactory<InputStream> {

	public ContentGeneratorReferenceAdapter(ContentGeneratorReference target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		return EObjectAdaptable.adaptToSupplierFactory(target.getTarget(), InputStream.class).create(iContext);
	}

}
