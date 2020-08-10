package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.ResourceGeneratorLink;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ResourceGeneratorLinkAdapter extends ResourceGeneratorAdapter<ResourceGeneratorLink> implements ConsumerFactory<BinaryEntityContainer> {

	public ResourceGeneratorLinkAdapter(ResourceGeneratorLink target) {
		super(target);
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		return EObjectAdaptable.adaptToConsumerFactory(loadLink(iContext, target.getRef()), BinaryEntityContainer.class).create(iContext);
	}

}
