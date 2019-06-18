/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.BundleResource;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceModificationTracker;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.Service;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleResourceImpl extends ResourceImpl<IContainer> implements BundleResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.BUNDLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getMerger() {
		return (Service)eGet(CodegenPackage.Literals.BUNDLE_RESOURCE__MERGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerger(Service newMerger) {
		eSet(CodegenPackage.Literals.BUNDLE_RESOURCE__MERGER, newMerger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundle() {
		return (String)eGet(CodegenPackage.Literals.BUNDLE_RESOURCE__BUNDLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(String newBundle) {
		eSet(CodegenPackage.Literals.BUNDLE_RESOURCE__BUNDLE, newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return (String)eGet(CodegenPackage.Literals.BUNDLE_RESOURCE__BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		eSet(CodegenPackage.Literals.BUNDLE_RESOURCE__BASE_PATH, newBasePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getPaths() {
		return (EList<String>)eGet(CodegenPackage.Literals.BUNDLE_RESOURCE__PATHS, true);
	}
	
	@Override
	protected Work<IContainer> createWorkItem() throws Exception {
		
		Service mergerService = getMerger();
		
		return new Work<IContainer>() {

			@Override
			public int size() {
				return mergerService == null ? 1 : 1 + mergerService.getConfigWorkSize();
			}

			@Override
			public IContainer execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				
				String symbolicName = context.interpolate(getBundle());
				Bundle bundle = Platform.getBundle(symbolicName);
				if (bundle == null) {
					throw new IllegalArgumentException("Bundle not found: "+symbolicName);
				}
				List<String> resourcePaths = new ArrayList<String>();
				
				String basePath = context.interpolate(getBasePath());
				if (!CodegenUtil.isBlank(basePath) && !basePath.startsWith("/")) {
					basePath = "/" + basePath;
				}
				
				if (getPaths().isEmpty()) {
					collectResources(bundle, CodegenUtil.isBlank(basePath) ? "/" : basePath, resourcePaths);										
				} else {
					for (String path: getPaths()) {
						if (!CodegenUtil.isBlank(path)) {
							String iPath = context.interpolate(path);
							if (!iPath.startsWith("/")) {
								iPath = "/" + iPath;
							}
							if (!CodegenUtil.isBlank(basePath)) {
								iPath = basePath + path;
							}
							collectResources(bundle, iPath, resourcePaths);
						}														
					}
				}
				
				String prefix = context.interpolate(getName());
				
				SubMonitor rMonitor = SubMonitor.convert(monitor, resourcePaths.size());
				rMonitor.setTaskName("Copying bundle resources - "+symbolicName);
				for (String path: resourcePaths) {
	            	if (monitor.isCanceled()) {
	            		throw new OperationCanceledException();
	            	}					
					rMonitor.subTask(path);					
					String targetPath = CodegenUtil.isBlank(basePath) ? path : path.substring(basePath.length());
					if (!CodegenUtil.isBlank(prefix)) {
						targetPath = prefix + "/" + path;
					}

					// TODO - add character encoding to BundleResources?
					IFile file = container.getFile(new Path(targetPath));
//					MutableContext sc = context.createSubContext().set(IFile.class, file);
					
					// Delete unmodified resources 
					ResourceModificationTracker resourceModificationTracker = context.get(ResourceModificationTracker.class);
					if (resourceModificationTracker != null && !resourceModificationTracker.isResourceModified(file)) {
						file.delete(true, true, monitor.split(1));
					}
					
					if (file.exists()) {
						switch (getReconcileAction()) {
						case APPEND:
							// TODO - implement when needed.
//							List<C> cl = new ArrayList<>();
//							cl.add(load(context, file.getContents(), file.getCharset()));
//							for (Work<List<C>> gw: gWork) {
//								cl.addAll(gw.execute(sc, monitor));
//							}
//							file.setContents(store(context, join(cl), file.getCharset()), false, true, monitor.split(1));
							throw new UnsupportedOperationException("Not implemented"); // continue;
						case MERGE:
							if (mergerService == null) {
								throw new IllegalStateException("Merger is not set");
							}
							// TODO - implement when needed.
//							List<C> mcl = new ArrayList<>();
//							for (Work<List<C>> gw: gWork) {
//								mcl.addAll(gw.execute(sc, monitor));
//							}
//							@SuppressWarnings("unchecked") Merger<C> merger = (Merger<C>) mergerService.get(context, monitor);
//							file.setContents(store(context, merger.merge(sc, file, load(context, file.getContents(), file.getCharset()), join(mcl), monitor.split(1)), file.getCharset()), false, true, monitor.split(1));
							throw new UnsupportedOperationException("Not implemented"); // continue;
						case CANCEL:
							throw new OperationCanceledException("Operation cancelled - file already exists: "+targetPath);
						case KEEP:
							// Take no action
							continue;
						case CONFIRM_OVERWRITE:
							@SuppressWarnings("unchecked") Predicate<Object> overwritePredicate = (Predicate<Object>) context.get(ReconcileAction.OVERWRITE_PREDICATE_CONTEXT_PROPERTY_NAME);
							if (overwritePredicate == null || overwritePredicate.test(file)) {
								file.delete(true, true, monitor.split(1));
							}
							break;
						case OVERWRITE:
							file.delete(true, true, monitor.split(1));
							break;
						default:
							throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
						}
					}
									
					if (!file.exists()) {
						CodegenUtil.createFile(container, targetPath, bundle.getEntry(path).openStream(), rMonitor.split(1));										
					}
				}
								
				return container;
			}
			
		};
	}
	
	private static void collectResources(Bundle bundle, String path, List<String> paths) {
		if (path.endsWith("/")) {												
			Enumeration<String> renum = bundle.getEntryPaths(path);
			while (renum != null && renum.hasMoreElements()) {
				String nextElement = renum.nextElement();
				if (nextElement.endsWith("/")) {
					collectResources(bundle, nextElement, paths);
				} else {
					paths.add(nextElement);
				}
			}
		} else if (bundle.getEntry(path) != null) {
			paths.add(path);
		}
	}	
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getBundle() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Bundle name is not set",
						 new Object [] { this, CodegenPackage.Literals.BUNDLE_RESOURCE__BUNDLE }));
				
				result = false;
			}
			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Reconcile action is 'Merge' and merger is not set",
						 new Object [] { this, CodegenPackage.Literals.BUNDLE_RESOURCE__MERGER }));
				
				result = false;
			}
		}
		return result;
	}
	
	@Override
	protected boolean isNonBlankName() {
		return false;
	}
	

} //BundleResourceImpl
