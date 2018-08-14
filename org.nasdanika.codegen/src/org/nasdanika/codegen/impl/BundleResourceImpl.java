/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IContainer;
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
	@SuppressWarnings("unchecked")
	public EList<String> getPaths() {
		return (EList<String>)eGet(CodegenPackage.Literals.BUNDLE_RESOURCE__PATHS, true);
	}
	
	@Override
	protected Work<IContainer> createWorkItem() throws Exception {
		return new Work<IContainer>() {

			@Override
			public int size() {
				return 1;
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
				
				if (getPaths().isEmpty()) {
					collectResources(bundle, "/", resourcePaths);
				} else {
					for (String path: getPaths()) {
						if (path != null && path.trim().length() != 0) {
							String iPath = context.interpolate(path);
							if (!iPath.startsWith("/")) {
								iPath = "/" + iPath;
							}
							collectResources(bundle, iPath, resourcePaths);
						}														
					}
				}
				
				String prefix = context.interpolate(getName());
				
				SubMonitor rMonitor = SubMonitor.convert(monitor, resourcePaths.size());
				rMonitor.setTaskName("Copying bundle resources - "+symbolicName);
				for (String path: resourcePaths) {
					rMonitor.subTask(path);
					String targetPath = prefix == null || prefix.trim().length() == 0 ? path.substring(1) : prefix + path;
					CodegenUtil.createFile(container, targetPath, bundle.getEntry(path).openStream(), rMonitor.split(1));										
				}
								
				return container;
			}
			
		};
	}
	
	private static void collectResources(Bundle bundle, String path, List<String> paths) {
		Enumeration<String> renum = bundle.getEntryPaths(path);
		while (renum != null && renum.hasMoreElements()) {
			String nextElement = renum.nextElement();
			if (nextElement.endsWith("/")) {
				collectResources(bundle, nextElement, paths);
			} else {
				paths.add(nextElement);
			}
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
