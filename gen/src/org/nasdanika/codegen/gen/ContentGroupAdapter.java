package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.ContentGroup;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;

public class ContentGroupAdapter extends ContentGeneratorAdapter<ContentGroup> implements SupplierFactory<InputStream> {

	public ContentGroupAdapter(ContentGroup target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {		
		EList<Generator> elements = target.getElements();
		if (elements.size() == 1) {
			return EObjectAdaptable.adaptToSupplierFactoryNonNull(elements.iterator().next(), InputStream.class).create(iContext);
		}
		@SuppressWarnings("resource")
		ListCompoundSupplier<InputStream> ret = new ListCompoundSupplier<>("Content group " + target.getTitle());
		for (Generator e: elements) {
			SupplierFactory<InputStream> eAdapter = EObjectAdaptable.adaptToSupplierFactoryNonNull(e, InputStream.class);
			ret.add(eAdapter.create(iContext));
		}
		return ret.then(JOIN_STREAMS);
	}

}
