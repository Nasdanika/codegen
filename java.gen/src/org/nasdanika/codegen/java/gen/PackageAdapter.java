package org.nasdanika.codegen.java.gen;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.codegen.gen.ContainerAdapter;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.resources.BinaryEntityContainer;

public class PackageAdapter extends ContainerAdapter {
	
	/**
	 * Serivce interface to pass through generation contexts.
	 * @author Pavel
	 *
	 */
	public interface PackageInfo {
		
		String getName();
		
		List<String> getTypes();
		
	}

	public PackageAdapter(org.nasdanika.codegen.java.Package target) {
		super(target);
	}
	
	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		PackageInfo parentInfo = iContext.get(PackageInfo.class);
		String packageName = iContext.interpolateToString(target.getName());
		String fullyQualifiedName = parentInfo == null ? packageName : parentInfo.getName() + "." + packageName;
		
		PackageInfo info = new PackageInfo() {
			
			private List<String> types = new ArrayList<>();
			
			@Override
			public List<String> getTypes() {
				return types;
			}
			
			@Override
			public String getName() {
				return fullyQualifiedName;
			}
			
		};
		
		Context ctx = Context.singleton(PackageInfo.class, info).compose(iContext);
		return super.createElement(ctx);
	}
	
	@Override
	protected String finalName(String name) {
		return name.replace('.',  '/');
	}

}
