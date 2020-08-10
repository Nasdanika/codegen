package org.nasdanika.codegen.gen;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.Container;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.common.CompoundConsumerFactory;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.emf.EObjectAdaptable;

public class ContainerAdapter extends ResourceAdapter<Container> {

	public ContainerAdapter(Container target) {
		super(target);
	}

	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		EList<ResourceGenerator> elements = target.getElements();
		ConsumerFactory<BinaryEntityContainer> elementsFactory;
		if (elements.size() == 1) {
			elementsFactory = EObjectAdaptable.adaptToConsumerFactoryNonNull(elements.iterator().next(), BinaryEntityContainer.class);
		} else {
			CompoundConsumerFactory<BinaryEntityContainer> cc = new CompoundConsumerFactory<>("Container " + target.getTitle());
			for (Generator e: elements) {
				ConsumerFactory<BinaryEntityContainer> eAdapter = EObjectAdaptable.adaptToConsumerFactoryNonNull(e, BinaryEntityContainer.class);
				cc.add(eAdapter);
			}
			elementsFactory = cc;
		}
		FunctionFactory<BinaryEntityContainer, BinaryEntityContainer> containerFactory = new FunctionFactory<BinaryEntityContainer, BinaryEntityContainer>() {

			@Override
			public Function<BinaryEntityContainer, BinaryEntityContainer> create(Context context) throws Exception {
				return new Function<BinaryEntityContainer, BinaryEntityContainer>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Create container " + target.getTitle();
					}

					@Override
					public BinaryEntityContainer execute(BinaryEntityContainer container, ProgressMonitor progressMonitor) throws Exception {
						String name = context.interpolateToString(target.getName());
						BinaryEntityContainer ret = Objects.requireNonNull(container.getContainer(name, progressMonitor), "Cannot create container " + name + " in " + container);
						switch (target.getReconcileAction()) {
						case OVERWRITE:
							if (ret.exists(progressMonitor)) {
								ret.delete(progressMonitor);
							}
						case MERGE:
						case APPEND:
							return ret;
						case CANCEL:
							if (ret.exists(progressMonitor)) {
								throw new NasdanikaException("Cancelling generation - container '" + name + "' already exists in " + container);
							}
							return ret;
						case KEEP:
							if (ret.exists(progressMonitor)) {
								return null; // Indicates that elements factory shall not do anything.
							}
							return ret;
						}
						return ret;
					}
					
				};
			}
		};
		
		ConsumerFactory<BinaryEntityContainer> conditionalFactory = new ConsumerFactory<BinaryEntityContainer>() {

			@Override
			public Consumer<BinaryEntityContainer> create(Context context) throws Exception {
				Consumer<BinaryEntityContainer> elementsConsumer = elementsFactory.create(context);
				return new Consumer<BinaryEntityContainer>() {
					
					@Override
					public double size() {
						return elementsConsumer.size();
					}
					
					@Override
					public String name() {
						return elementsConsumer.name();
					}
					
					@Override
					public void execute(BinaryEntityContainer container, ProgressMonitor progressMonitor) throws Exception {
						if (container != null) {
							elementsConsumer.execute(container, progressMonitor);
						}						
					}
				};
			}
			
		};
		return containerFactory.then(conditionalFactory).create(iContext);
	}

}
