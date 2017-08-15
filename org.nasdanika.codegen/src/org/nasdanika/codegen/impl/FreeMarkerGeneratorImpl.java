/**
 */
package org.nasdanika.codegen.impl;

import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.FreeMarkerTemplateLoaderType;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;
import org.osgi.framework.Bundle;

import freemarker.cache.ClassTemplateLoader;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Marker Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getTemplateLoaderType <em>Template Loader Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FreeMarkerGeneratorImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeMarkerGeneratorImpl extends GeneratorImpl<String> implements FreeMarkerGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeMarkerGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FREE_MARKER_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeMarkerTemplateLoaderType getTemplateLoaderType() {
		return (FreeMarkerTemplateLoaderType)eGet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateLoaderType(FreeMarkerTemplateLoaderType newTemplateLoaderType) {
		eSet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, newTemplateLoaderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return (String)eGet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		eSet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate() {
		return (String)eGet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		eSet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return (String)eGet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, newModel);
	}
	
	@Override
	public Work<String> createWorkItem() throws Exception {
		return new Work<String>() {
			
			@Override
			public int size() {
				return 1;
			}
			
			@Override
			public String execute(Context context, SubMonitor monitor) throws Exception {
				try {
					Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
					String base = context.interpolate(getBase());
					if (base == null || base.trim().length() == 0) {
						cfg.setLocalizedLookup(false);
						cfg.setTemplateLoader(new URLTemplateLoader() {
							
							@Override
							protected URL getURL(String name) {
								try {
									return new URL((URL) context.get(BASE_URL_PROPERTY), name);
								} catch (MalformedURLException e) {
									throw new IllegalArgumentException("Malformed name", e);
								}
							}
						});						
					} else {
						switch (getTemplateLoaderType()) {
						case BUNDLE:
							int idx = base.indexOf('/');
							String bundleName = idx == -1 ? base : base.substring(0, idx);
							Bundle bundle = Platform.getBundle(bundleName);
							if (bundle == null) {
								throw new IllegalArgumentException("Bundle not found: "+bundleName);
							}
							cfg.setTemplateLoader(new URLTemplateLoader() {
								
								@Override
								protected URL getURL(String name) {
									String entryName = idx == -1 ? "/"+name : base.substring(idx)+"/"+name;
									Enumeration<String> paths = bundle.getEntryPaths(idx == -1 ? "/" : base.substring(idx));
									while (paths.hasMoreElements()) {
										String path = paths.nextElement();
										if (path.equals(entryName)) {
											return bundle.getEntry(path);
										}
									}
									return null;
								}
							});
							break;
						case PACKAGE:
							cfg.setTemplateLoader(new ClassTemplateLoader(context.getClassLoader(), base));
							break;
						case URL:
							cfg.setLocalizedLookup(false);
							URL url = new URL((URL) context.get(BASE_URL_PROPERTY), base);
							cfg.setTemplateLoader(new URLTemplateLoader() {
								
								@Override
								protected URL getURL(String name) {
									try {
										return new URL(url, name);
									} catch (MalformedURLException e) {
										throw new IllegalArgumentException("Malformed name", e);
									}
								}
							});
							break;
						default:
							throw new IllegalArgumentException("Unexpected template loader type: "+getTemplateLoaderType());
						}
					}

					cfg.setDefaultEncoding("UTF-8");
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
					
					Template temp = cfg.getTemplate(context.interpolate(getTemplate()));
					Writer out = new StringWriter();
					Object modelValue = context;
					String modelKey = getModel();
					if (modelKey != null && modelKey.trim().length() > 0) {
						modelValue = context.get(modelKey);
					}
					temp.process(modelValue, out);
					out.close();
					return out.toString();
				} finally {
					monitor.worked(size());
				}
			}
			
		};
	}

} //FreeMarkerGeneratorImpl
