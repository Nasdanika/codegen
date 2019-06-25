/**
 */
package org.nasdanika.codegen.impl;

import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.FreeMarkerGenerator;
import org.nasdanika.codegen.FreeMarkerTemplateLoaderType;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.osgi.framework.Bundle;

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
	 * The default value of the '{@link #getTemplateLoaderType() <em>Template Loader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateLoaderType()
	 * @generated
	 * @ordered
	 */
	protected static final FreeMarkerTemplateLoaderType TEMPLATE_LOADER_TYPE_EDEFAULT = FreeMarkerTemplateLoaderType.URL;
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

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
	@Override
	public FreeMarkerTemplateLoaderType getTemplateLoaderType() {
		return (FreeMarkerTemplateLoaderType)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateLoaderType(FreeMarkerTemplateLoaderType newTemplateLoaderType) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE, newTemplateLoaderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__BASE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__BASE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplate() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(String newTemplate) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE, CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(CodegenPackage.FREE_MARKER_GENERATOR__MODEL, CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(CodegenPackage.FREE_MARKER_GENERATOR__MODEL, CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL, newModel);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE:
				return getTemplateLoaderType();
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				return getBase();
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				return getTemplate();
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				return getModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE:
				setTemplateLoaderType((FreeMarkerTemplateLoaderType)newValue);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				setBase((String)newValue);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				setModel((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE:
				setTemplateLoaderType(TEMPLATE_LOADER_TYPE_EDEFAULT);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE:
				return getTemplateLoaderType() != TEMPLATE_LOADER_TYPE_EDEFAULT;
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
				return BASE_EDEFAULT == null ? getBase() != null : !BASE_EDEFAULT.equals(getBase());
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? getTemplate() != null : !TEMPLATE_EDEFAULT.equals(getTemplate());
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Work<Context, String> createWorkItem() throws Exception {
		return new Work<Context, String>() {
			
			@Override
			public long size() {
				return 1;
			}
			
			@Override
			public String getName() {
				return getTitle();
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return false;
			}
			
			@Override
			public String execute(Context context, ProgressMonitor monitor) throws Exception {
				Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
				String base = context.interpolate(getBase());
				if (base == null || base.trim().length() == 0) {
					cfg.setLocalizedLookup(false);
					cfg.setTemplateLoader(new URLTemplateLoader() {
						
						@Override
						protected URL getURL(String name) {
							try {
								// Resolving relative to the resource URI, will it work?
								return new URL(new URL(eResource().getURI().toString()), name);
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
					case URL:
						cfg.setLocalizedLookup(false);
						URL url = new URL(new URL(eResource().getURI().toString()), base);
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
			}
			
		};
	}

} //FreeMarkerGeneratorImpl
