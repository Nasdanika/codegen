/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.BundleResourceCollection;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Merger;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.BundleResourceCollectionImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleResourceCollectionImpl extends ResourceCollectionImpl implements BundleResourceCollection {
	/**
	 * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleResourceCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBundle() {
		return (String)eDynamicGet(CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE, CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION__BUNDLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(String newBundle) {
		eDynamicSet(CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE, CodegenPackage.Literals.BUNDLE_RESOURCE_COLLECTION__BUNDLE, newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				return getBundle();
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
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				setBundle((String)newValue);
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
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				setBundle(BUNDLE_EDEFAULT);
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
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION__BUNDLE:
				return BUNDLE_EDEFAULT == null ? getBundle() != null : !BUNDLE_EDEFAULT.equals(getBundle());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Work<List<BinaryResource>> createMultiWorkItem(Context context) throws Exception {
		
		return new Work<List<BinaryResource>>() {
			
			@SuppressWarnings("unchecked")
			@Override
			public List<BinaryResource> execute(ProgressMonitor progressMonitor) throws Exception {
				String bundleName = context.interpolate(getBundle());
				Bundle bundle = bundleName == null || bundleName.trim().length() == 0 ? getModelBundle() : getBundle(bundleName);
				if (bundle == null) {
					throw new IllegalArgumentException("Bundle not found: "+bundleName);
				}
				
				BinaryEntityContainer container = context.get(BinaryEntityContainer.class);
				if (container == null) {
					throw new IllegalStateException("BinaryEntityContainer service is not found in context");
				}
				
				List<BinaryResource> ret = new ArrayList<>();
				String path = getPath();
				Enumeration<String> entryPaths = bundle.getEntryPaths(path);
				while (entryPaths.hasMoreElements()) {
					String entryPath = entryPaths.nextElement();
					if (include(entryPath)) {
						URL entry = bundle.getEntry(entryPath);
						if (entry != null) {
							String prefix = getPrefix();
							String targetPath = prefix == null || prefix.trim().length() == 0 ? entryPath : prefix.trim() + entryPath;
							BinaryEntity entity = container.get(targetPath, progressMonitor.split("Getting target entity "+targetPath, 1));
							if (entity == null) {
								throw new IllegalArgumentException("Cannot obtain entity at "+targetPath);
							}

							if (entity.exists(progressMonitor.split("Checking existence of "+targetPath, 1))) {
								switch (getReconcileAction()) {
								case APPEND:
									entity.appendState(interpolate(entryPath, entry.openStream()), progressMonitor.split("Appending state", 1, entity));
									break;
								case MERGE:
									String mergerClass = getMerger();
									Merger<InputStream> merger;
									if (mergerClass == null || mergerClass.trim().length() == 0) {
										throw new IllegalStateException("Merger is not set");
									} else {
										merger = (Merger<InputStream>) instantiate(context, mergerClass, getMergerArguments());
									}
									InputStream oldContent = entity.getState(progressMonitor.split("Getting state", 1, entity));
									InputStream mergedContents = merger.merge(context, entity, oldContent, interpolate(entryPath, entry.openStream()), progressMonitor.split("Merging", 1, entity));
									entity.setState(mergedContents, progressMonitor.split("Setting state", 1, entity));
									break;
								case CANCEL:
									throw new OperationCanceledException("Operation cancelled - entity already exists: "+targetPath);
								case KEEP:
									// Take no action
									break;
								case OVERWRITE:
									entity.setState(interpolate(entryPath, entry.openStream()), progressMonitor.split("Setting state", 1, entity));
									break;
								default:
									throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
								}
							} else {
								entity.setState(entry.openStream(), progressMonitor.split("Setting state", 1, entity));					
							}
							
							ret.add(entity);
						}
					}
					
				}
				return ret;
			}

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
				return true;
			}
			
		};
	}

} //BundleResourceCollectionImpl
