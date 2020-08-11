package org.nasdanika.codegen.java.gen;

import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;
import org.nasdanika.codegen.gen.ContentGeneratorAdapter;
import org.nasdanika.codegen.gen.FileAdapter;
import org.nasdanika.codegen.gen.Merger;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.JDKLevel;
import org.nasdanika.codegen.java.gen.PackageAdapter.PackageInfo;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;

public class CompilationUnitAdapter extends FileAdapter {

	public CompilationUnitAdapter(CompilationUnit target) {
		super(target);
	}
	
	@Override
	protected Merger getNativeMerger(Context context) {
		return new Merger() {
			
			@Override
			public InputStream merge(Context context, BinaryEntity entity, InputStream oldContent, InputStream newContent, ProgressMonitor progressMonitor) throws Exception {
			    JControlModel controlModel = new JControlModel();
				
			    // Obtaining merge rules URI.
				// create model
				GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		
				// create adapter factory
				GeneratorAdapterFactory adapterFactory = GenModelGeneratorAdapterFactory.DESCRIPTOR.createAdapterFactory();
				adapterFactory.setGenerator(new org.eclipse.emf.codegen.ecore.generator.Generator());
				adapterFactory.initialize(genModel);
		
				// get merge rules URI
				String mergeRulesURI = adapterFactory.getGenerator().getOptions().mergeRulesURI;
			    
			    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
			    facadeHelper.setCompilerCompliance(context.get(JDKLevel.class).getLiteral());
				controlModel.initialize(facadeHelper, mergeRulesURI);
			    
				JMerger jMerger = new JMerger(controlModel);												
				
				JCompilationUnit scu = jMerger.createCompilationUnitForContents(ContentGeneratorAdapter.toString(context, newContent));
				jMerger.setSourceCompilationUnit(scu);
				
				JCompilationUnit tcu = jMerger.createCompilationUnitForContents(ContentGeneratorAdapter.toString(context, oldContent));
				jMerger.setTargetCompilationUnit(tcu);
				
				jMerger.merge();
				
				return ContentGeneratorAdapter.toStream(context, jMerger.getTargetCompilationUnitContents());
			}
			
		};
	}
	
	private String formatCompilationUnit(String content) throws BadLocationException {
		if (((CompilationUnit) target).isFormat()) {
			CodeFormatter formatter = ToolFactory.createCodeFormatter(null); // possibly TODO - options from the configuration.
			if (formatter != null) {
				TextEdit formatted = formatter.format(
						CodeFormatter.K_COMPILATION_UNIT, 
						content, 
						0,
						content.length(),
						0, 
						System.lineSeparator());
				
				IDocument document = new Document(content);
				formatted.apply(document);
				return document.get();
			}
		}
		return content;
	}
	
	private static final String JAVA_EXTENSION = ".java";
	
	@Override
	protected String finalName(String name) {
		return name.endsWith(JAVA_EXTENSION) ? name : name + JAVA_EXTENSION;
	}
	
	@Override
	protected SupplierFactory<InputStream> createContentFactory() {
		SupplierFactory<InputStream> headerFactory = new SupplierFactory<InputStream>() {

			@Override
			public Supplier<InputStream> create(Context context) throws Exception {
				return new Supplier<InputStream>() {

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
						
						return ContentGeneratorAdapter.toStream(context, contentBuilder.toString());
					}
					
				};
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
						return ContentGeneratorAdapter.toStream(context, formatCompilationUnit(ContentGeneratorAdapter.toString(context, content)));
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
				return ContentGeneratorAdapter.join(inputs.get(1), inputs.get(0));
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
