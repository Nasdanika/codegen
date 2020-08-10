package org.nasdanika.codegen.gen;

import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ResourceGeneratorAdapterAdapter extends ResourceGeneratorAdapter<org.nasdanika.codegen.ResourceGeneratorAdapter> implements ConsumerFactory<BinaryEntityContainer> {

	public ResourceGeneratorAdapterAdapter(org.nasdanika.codegen.ResourceGeneratorAdapter target) {
		super(target);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		ConsumerFactory<BinaryEntityContainer> adapter = EObjectAdaptable.adaptTo(target, ConsumerFactory.class, target.getFactory());
		return adapter.create(iContext);
	}

}
