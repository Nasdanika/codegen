package org.nasdanika.codegen.java.gen;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.StringReader;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.gen.ContentGeneratorAdapter;
import org.nasdanika.codegen.java.Member;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.exec.java.ImportManager;

public abstract class MemberAdapter<T extends Member> extends ContentGeneratorAdapter<T> {

	protected MemberAdapter(T target) {
		super(target);
	}
	
	public static final String NEW_LINE_REGEX = "\\s";	
		
	/**
	 * Creates comment factory from comments reference elements. 
	 * @return
	 */
	protected SupplierFactory<InputStream> createCommentFactory() {
		EList<ContentGenerator> comments = target.getComments();
		ListCompoundSupplierFactory<InputStream> commentFactory = new ListCompoundSupplierFactory<>("Member comments " + target.getTitle());
		if (!Util.isBlank(target.getComment())) {
			SupplierFactory<InputStream> markdownCommentFactory = context -> new Supplier<InputStream>() {

				@Override
				public double size() {
					return 1;
				}

				@Override
				public String name() {
					return target.getTitle() + " markdown comment";
				}

				@Override
				public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
					return Util.toStream(context, context.interpolateToString(MarkdownHelper.INSTANCE.markdownToHtml(target.getComment())));
				}
				
			};
			
			commentFactory.add(markdownCommentFactory);
		}
		for (ContentGenerator e: comments) {
			commentFactory.add(EObjectAdaptable.adaptToSupplierFactoryNonNull(e, InputStream.class));
		}
		return commentFactory.then(Util.JOIN_STREAMS_FACTORY);			
	}
		
	/**
	 * Creates body factory from body reference elements. 
	 * @return
	 */
	protected SupplierFactory<InputStream> createBodyFactory() {
		EList<ContentGenerator> body = target.getBody();
		if (body.size() == 1) {
			return EObjectAdaptable.adaptToSupplierFactoryNonNull(body.iterator().next(), InputStream.class);
		}
		
		ListCompoundSupplierFactory<InputStream> bodyFactory = new ListCompoundSupplierFactory<>("Member body " + target.getTitle());
		for (ContentGenerator e: body) {
			bodyFactory.add(EObjectAdaptable.adaptToSupplierFactoryNonNull(e, InputStream.class));
		}
		return bodyFactory.then(Util.JOIN_STREAMS_FACTORY);			
	}
	
	private FunctionFactory<BiSupplier<InputStream, InputStream>,InputStream> memberFactory = context -> new Function<BiSupplier<InputStream, InputStream>,InputStream>() {

		@Override
		public double size() {
			return 1;
		}

		@Override
		public String name() {
			return target.getTitle();
		}

		@Override
		public InputStream execute(BiSupplier<InputStream, InputStream> commentAndBody, ProgressMonitor progressMonitor) throws Exception {
			String comment = Util.toString(context, commentAndBody.getFirst());				
			StringBuilder commentBuilder = new StringBuilder(System.lineSeparator())
					.append(System.lineSeparator())
					.append("/**")
					.append(System.lineSeparator());
			
			if (comment != null) {
				try (BufferedReader br = new BufferedReader(new StringReader(comment))) {
					String line;
					while ((line = br.readLine()) != null) {
						commentBuilder.append(" * ").append(line).append(System.lineSeparator());						
					}
				}
			}
			commentBuilder.append(" * @generated").append(System.lineSeparator());
			commentBuilder.append(" */").append(System.lineSeparator());
			
			return Util.toStream(
					context, 
					generate(
							context, 
							commentBuilder.toString(), 
							Util.toString(context, commentAndBody.getSecond()), 
							progressMonitor));
		}
		
	};
			
	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {		
		ImportManager importManager = iContext.get(ImportManager.class);				
		return createCommentFactory().then(createBodyFactory().asFunctionFactory()).then(memberFactory).create(Context.singleton("import", importManager).compose(iContext));
	}
	
	protected abstract String generate(Context context, String comment, String body, ProgressMonitor progressMonitor) throws Exception;

	protected void appendModifiers(Context context, StringBuilder builder) {
		if (!Util.isBlank(target.getModifiers())) {
			builder.append(context.interpolateToString(target.getModifiers())).append(" ");
		}
	}

	protected void appendAnnotations(Context context, StringBuilder builder) {
		// Annotations
		if (!Util.isBlank(target.getAnnotations())) {
			for (String ann: target.getAnnotations().split(NEW_LINE_REGEX)) {
				builder.append("@").append(context.interpolateToString(ann)).append(System.lineSeparator());
			}
		}
	}
	
	protected void appendTypeParameters(Context context, StringBuilder builder) {
		if (!Util.isBlank(target.getTypeParameters())) {
			builder.append("<");
			boolean isFirst = true;
			for (String tp: target.getTypeParameters().split(NEW_LINE_REGEX)) {
				if (!isFirst) {
					builder.append(",");
				}
				builder.append(context.interpolateToString(tp));
				isFirst = false;
			}
			builder.append(">");
		}
	}
	
}
