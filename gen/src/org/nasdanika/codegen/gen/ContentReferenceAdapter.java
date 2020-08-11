package org.nasdanika.codegen.gen;

import java.io.InputStream;
import java.net.URL;

import org.nasdanika.codegen.ContentReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EmfUtil;

public class ContentReferenceAdapter extends ContentGeneratorAdapter<ContentReference> implements SupplierFactory<InputStream> {

	public ContentReferenceAdapter(ContentReference target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		return new Supplier<InputStream>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return target.getTitle();
			}

			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				URL content = EmfUtil.resolveReference(target.eResource(), iContext.interpolateToString(target.getRef()));
				return target.isInterpolate() ? filter(iContext, content.openStream(), iContext::interpolateToString) : content.openStream();
			}
			
		};
	}

}
