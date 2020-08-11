package org.nasdanika.codegen.gen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;

import freemarker.cache.URLTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.ObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.WrappingTemplateModel;

public class FreeMarkerGeneratorAdapter extends ContentGeneratorAdapter<FreeMarkerGenerator> {

	public FreeMarkerGeneratorAdapter(FreeMarkerGenerator target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		return new Supplier<InputStream>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return target.getTitle();
			}

			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try (OutputStreamWriter writer = new OutputStreamWriter(baos, iContext.get(Charset.class, StandardCharsets.UTF_8))) {
					writer.write(evaluate(iContext));
				}
				baos.close();
				return new ByteArrayInputStream(baos.toByteArray());
			}
			
		};
	}
	
	protected String evaluate(Context context) throws Exception {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
		String base = context.interpolateToString(target.getBase());
		if (Util.isBlank(base)) {
			cfg.setLocalizedLookup(false);
			cfg.setTemplateLoader(new URLTemplateLoader() {
				
				@Override
				protected URL getURL(String name) {
					try {
						// Resolving relative to the resource URI, will it supplier?
						return new URL(new URL(target.eResource().getURI().toString()), name);
					} catch (MalformedURLException e) {
						throw new IllegalArgumentException("Malformed name: " + name, e);
					}
				}
			});						
		} else {
			cfg.setLocalizedLookup(false);
			URL url = new URL(new URL(target.eResource().getURI().toString()), base);
			cfg.setTemplateLoader(new URLTemplateLoader() {
				
				@Override
				protected URL getURL(String name) {
					try {
						return new URL(url, name);
					} catch (MalformedURLException e) {
						throw new IllegalArgumentException("Malformed name: " + name, e);
					}
				}
			});
		}

		cfg.setDefaultEncoding(context.get(Charset.class, StandardCharsets.UTF_8).name());
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
		
		class ContextWrapper extends WrappingTemplateModel implements TemplateHashModel {
			
			private Context context;

			ContextWrapper(Context context, ObjectWrapper ow) {
				super(ow);
				this.context = context;
			}

			@Override
			public TemplateModel get(String key) throws TemplateModelException {
				return wrap(context.get(key));
			}

			@Override
			public boolean isEmpty() throws TemplateModelException {
				return false;
			}
			
		}
		
		cfg.setObjectWrapper(new DefaultObjectWrapper(cfg.getIncompatibleImprovements()) {
			
			@Override
			protected TemplateModel handleUnknownType(Object obj) throws TemplateModelException {
				if (obj instanceof Context) {
					return new ContextWrapper((Context) obj, this);
				}
				return super.handleUnknownType(obj);
			}
			
		});					
		
		Template temp = cfg.getTemplate(context.interpolateToString(target.getTemplate()));
		Writer out = new StringWriter();
		Object modelValue = context;
		String modelKey = target.getModel();
		if (!Util.isBlank(modelKey)) {
			modelValue = context.get(modelKey);
		}
		temp.process(modelValue, out);
		out.close();
		return out.toString();		
	}

}
