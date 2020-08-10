package org.nasdanika.codegen.gen;

import java.util.Iterator;

import org.nasdanika.codegen.ResourceGroup;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntityContainer;

public class ResourceGroupAdapter extends GroupAdapter<ResourceGroup> implements ConsumerFactory<BinaryEntityContainer> {

	public ResourceGroupAdapter(ResourceGroup target) {
		super(target);
	}

	@Override
	public Consumer<BinaryEntityContainer> create(Context context) throws Exception {		
		CompoundConsumer<BinaryEntityContainer> ret = new CompoundConsumer<>("Resource group " + target.getTitle());
		Iterator<Context> ctxi = iterate(context);
		while (ctxi.hasNext()) {
			ret.add(createConsumer(ctxi.next()));
		}
		return ret;
	}
	
	/**
	 * Invoked for each element of the context iterator.
	 * @param context
	 * @return
	 */
	private Consumer<BinaryEntityContainer> createConsumer(Context context) throws Exception {
		return new Consumer<BinaryEntityContainer>() {

			@Override
			public double size() {
				// TODO Auto-generated method stub
				return 1;
			}

			@Override
			public String name() {
				// TODO Auto-generated method stub
				return "purum";
			}

			@Override
			public void execute(BinaryEntityContainer container, ProgressMonitor progressMonitor) throws Exception {
				System.out.println("Here I am: " + container);
				
			}
			
		};
	}

}
