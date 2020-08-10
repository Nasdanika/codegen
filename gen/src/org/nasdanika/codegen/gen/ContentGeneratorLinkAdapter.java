package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.codegen.ContentGeneratorLink;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;

public class ContentGeneratorLinkAdapter extends ContentGeneratorAdapter<ContentGeneratorLink> implements SupplierFactory<InputStream> {

	public ContentGeneratorLinkAdapter(ContentGeneratorLink target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		return EObjectAdaptable.adaptToSupplierFactory(loadLink(iContext, target.getRef()), InputStream.class).create(iContext);
	}

}
