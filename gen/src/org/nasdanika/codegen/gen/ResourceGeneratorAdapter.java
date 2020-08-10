package org.nasdanika.codegen.gen;

import java.util.Collection;

import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntityContainer;

public abstract class ResourceGeneratorAdapter<T extends ResourceGenerator> extends GeneratorAdapter<T> implements ConsumerFactory<BinaryEntityContainer> {

	protected ResourceGeneratorAdapter(T target) {
		super(target);
	}
	
	@Override
	public Consumer<BinaryEntityContainer> create(Context context) throws Exception {		
		SupplierFactory<Context> contextSupplierFactory = createContextSupplierFactory();
		Collection<Context> iContexts = iterate(context);
		if (iContexts.size() == 1) {
			return configure(iContexts.iterator().next(), contextSupplierFactory, this::createElement);
		}
		CompoundConsumer<BinaryEntityContainer> ret = new CompoundConsumer<>("Resource generator iterator " + target.getTitle());
		for (Context iContext: iContexts) {
			ret.add(configure(iContext, contextSupplierFactory, this::createElement));
		}
		return ret;
	}

	protected Consumer<BinaryEntityContainer> configure(Context context, SupplierFactory<Context> contextSupplierFactory, ConsumerFactory<BinaryEntityContainer> consumerFactory) throws Exception {
		if (contextSupplierFactory == null) {
			return consumerFactory.create(context);
		}
		
		return consumerFactory.contextify(contextSupplierFactory).create(context);
	}
		
	/**
	 * Invoked for each iterator element.
	 */
	protected abstract Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception; 		

}
