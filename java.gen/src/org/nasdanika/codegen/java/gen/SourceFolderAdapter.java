package org.nasdanika.codegen.java.gen;

import org.nasdanika.codegen.gen.ContainerAdapter;
import org.nasdanika.codegen.java.JDKLevel;
import org.nasdanika.codegen.java.SourceFolder;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;

public class SourceFolderAdapter extends ContainerAdapter {

	public SourceFolderAdapter(SourceFolder target) {
		super(target);
	}
	
	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {		
		return super.createElement(Context.singleton(JDKLevel.class, ((SourceFolder) target).getJdkLevel()).compose(iContext));
	}

}
