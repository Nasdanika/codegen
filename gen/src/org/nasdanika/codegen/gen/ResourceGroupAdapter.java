package org.nasdanika.codegen.gen;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ResourceGroupAdapter extends ResourceGeneratorAdapter<ResourceGroup> {

	public ResourceGroupAdapter(ResourceGroup target) {
		super(target);
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context context) throws Exception {		
		EList<Generator> elements = target.getElements();
		if (elements.size() == 1) {
			return EObjectAdaptable.adaptToConsumerFactoryNonNull(elements.iterator().next(), BinaryEntityContainer.class).create(context);
		}
		CompoundConsumer<BinaryEntityContainer> ret = new CompoundConsumer<>("Resource group " + target.getTitle());
		for (Generator e: elements) {
			ConsumerFactory<BinaryEntityContainer> eAdapter = EObjectAdaptable.adaptToConsumerFactoryNonNull(e, BinaryEntityContainer.class);
			ret.add(eAdapter.create(context));
		}
		return ret;
	}

}
