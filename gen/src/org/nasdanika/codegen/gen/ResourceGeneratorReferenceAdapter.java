package org.nasdanika.codegen.gen;

import org.nasdanika.codegen.ResourceGeneratorReference;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ResourceGeneratorReferenceAdapter extends ResourceGeneratorAdapter<ResourceGeneratorReference> implements ConsumerFactory<BinaryEntityContainer> {

	public ResourceGeneratorReferenceAdapter(ResourceGeneratorReference target) {
		super(target);
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		return EObjectAdaptable.adaptToConsumerFactory(target.getTarget(), BinaryEntityContainer.class).create(iContext);
	}

}
