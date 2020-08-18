package org.nasdanika.codegen.java.gen;

import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.nasdanika.codegen.gen.FileAdapter;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.gen.PackageAdapter.PackageInfo;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Merger;
import org.nasdanika.exec.java.ImportManager;
import org.nasdanika.exec.java.JavaMerger;
import org.nasdanika.exec.java.SimpleImportManager;

public class CompilationUnitAdapter extends FileAdapter {

	public CompilationUnitAdapter(CompilationUnit target) {
		super(target);
	}
	
	@Override
	protected Merger getNativeMerger(Context context) {
		return JavaMerger.INSTANCE;
	}
	
	private static final String JAVA_EXTENSION = ".java";
	
	@Override
	protected String finalName(String name) {
		return name.endsWith(JAVA_EXTENSION) ? name : name + JAVA_EXTENSION;
	}
	
	@Override
	protected SupplierFactory<InputStream> createContentFactory() {
		SupplierFactory<InputStream> headerFactory = context -> new Supplier<InputStream>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Package and imports declarations";
			}

			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				StringBuilder contentBuilder = new StringBuilder();
				contentBuilder
					.append("package ")
					.append(context.get(PackageInfo.class).getName())
					.append(";")
					.append(System.lineSeparator())
					.append(System.lineSeparator());
				
				String lastFirstPackageSegment = null;
				for (String ie: context.get(ImportManager.class).getImports()) {
					int dotIdx = ie.indexOf('.');
					String fps = ie.substring(0, dotIdx);
					if (lastFirstPackageSegment != null && !lastFirstPackageSegment.equals(fps)) {
						contentBuilder.append(System.lineSeparator());
					}
					contentBuilder.append("import ").append(ie).append(";").append(System.lineSeparator());
				}
				contentBuilder.append(System.lineSeparator());
				
				return Util.toStream(context, contentBuilder.toString());
			}
			
		};
		
		ListCompoundSupplierFactory<InputStream> bodyAndHeaderFactory = new ListCompoundSupplierFactory<InputStream>("Body and Header", super.createContentFactory(), headerFactory);
		
		FunctionFactory<InputStream, InputStream> formatFactory = new FunctionFactory<InputStream, InputStream>() {

			@Override
			public Function<InputStream, InputStream> create(Context context) throws Exception {
				return new Function<InputStream, InputStream>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Compilation unit formatter";
					}

					@Override
					public InputStream execute(InputStream content, ProgressMonitor progressMonitor) throws Exception {						
						String text = Util.toString(context, content);
						if (((CompilationUnit) target).isFormat()) {
							text = org.nasdanika.exec.java.CompilationUnit.format(text);
						}
						return Util.toStream(context, text);
					}
				};
			}
			
		};
		
		FunctionFactory<List<InputStream>, InputStream> reverseJoinFactory = context -> new Function<List<InputStream>,InputStream>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Reverse join";
			}

			@Override
			public InputStream execute(List<InputStream> inputs, ProgressMonitor progressMonitor) throws Exception {
				return Util.join(inputs.get(1), inputs.get(0));
			}
			
		};
		
		return bodyAndHeaderFactory.then(reverseJoinFactory).then(formatFactory);
	}
	
	@Override
	protected Consumer<BinaryEntityContainer> createElement(Context iContext) throws Exception {
		PackageInfo packageInfo = iContext.get(PackageInfo.class);
		List<String> pTypesObj = packageInfo.getTypes(); // List of short names of types defined in the containing package. TODO - fill out by types.
		Set<String> implicitImports = new HashSet<>();
		for (Object pType: (Iterable<?>) pTypesObj) {
			implicitImports.add(packageInfo.getName()+"."+pType);
		}

		ImportManager importManager = new SimpleImportManager(implicitImports);
		Context ctx = Context.singleton("import", importManager)
				.compose(Context.singleton(ImportManager.class, importManager))
				.compose(iContext);
		
		return super.createElement(ctx);
	}

}
