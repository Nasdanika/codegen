/**
 */
package org.nasdanika.codegen.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.ZipResourceCollection;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ZipResourceCollectionImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipResourceCollectionImpl extends ResourceCollectionImpl implements ZipResourceCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipResourceCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.ZIP_RESOURCE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<InputStream>> getGenerators() {
		return (EList<Generator<InputStream>>)eDynamicGet(CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS, CodegenPackage.Literals.ZIP_RESOURCE_COLLECTION__GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS:
				return getGenerators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator<InputStream>>)newValue);
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
			case CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS:
				getGenerators().clear();
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
			case CodegenPackage.ZIP_RESOURCE_COLLECTION__GENERATORS:
				return !getGenerators().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	@Override
	protected Work<List<BinaryResource>> createMultiWorkItem(Context context) throws Exception {
		
		CompoundWork<List<BinaryResource>, List<InputStream>> work = new CompoundWork<List<BinaryResource>, List<InputStream>>(getTitle(), getExecutor(context)) {
			
			@SuppressWarnings({ "unchecked", "resource" })
			@Override
			protected List<BinaryResource> combine(List<List<InputStream>> results, ProgressMonitor progressMonitor) throws Exception {
				BinaryEntityContainer container = context.get(BinaryEntityContainer.class);
				if (container == null) {
					throw new IllegalStateException("BinaryEntityContainer service is not found in context");
				}
				
				List<BinaryResource> ret = new ArrayList<>();
				String path = context.interpolate(getPath()); 
				String prefix = context.interpolate(getPrefix()); 
				
				for (List<InputStream> inl: results) {
					for (InputStream in: inl) {
						try (ZipInputStream zipInputStream = new ZipInputStream(in)) {
							ZipEntry zipEntry;
							while ((zipEntry = zipInputStream.getNextEntry()) != null) {
								String entryName = zipEntry.getName();
								if (path == null || path.trim().length() == 0 || entryName.startsWith(path.trim())) {
									try (ProgressMonitor entryMonitor = progressMonitor.split("Entry "+zipEntry.getName(), 1, zipEntry)) {
										String entryRelativePath = path == null || path.trim().length() == 0 ? entryName : entryName.substring(path.trim().length());
										String targetPath = prefix == null || prefix.trim().length() == 0 ? entryRelativePath : prefix.trim()+entryRelativePath;										
										if (entryName.endsWith("/")) {
											if (container.getContainer(targetPath.substring(0, targetPath.length() - 1), entryMonitor.split("Getting container "+targetPath, 1)) == null) {
												throw new IOException("Container with path "+targetPath+" cannot be created");
											}
										} else {
											BinaryEntity entity = container.get(targetPath, progressMonitor.split("Getting target entity "+targetPath, 1));
											if (entity == null) {
												throw new IllegalArgumentException("Cannot obtain entity at "+targetPath);
											}
											
											
											// Overriding close because set state closes the source stream when it is drained.
											InputStream entryStream = new FilterInputStream(zipInputStream) { 

												public void close() {
													
												}
												
											};
											
											if (entity.exists(progressMonitor.split("Checking existence of "+targetPath, 1))) {
												switch (getReconcileAction()) {
												case APPEND:
													entity.appendState(interpolate(context, entryRelativePath, entryStream, progressMonitor), progressMonitor.split("Appending state", 1, entity));
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
													InputStream mergedContents = merger.merge(context, entity, oldContent, interpolate(context, entryRelativePath, entryStream, progressMonitor), progressMonitor.split("Merging", 1, entity));
													entity.setState(mergedContents, progressMonitor.split("Setting state", 1, entity));
													break;
												case CANCEL:
													throw new OperationCanceledException("Operation cancelled - entity already exists: "+targetPath);
												case KEEP:
													// Take no action
													break;
												case OVERWRITE:
													entity.setState(interpolate(context, entryRelativePath, entryStream, progressMonitor), progressMonitor.split("Setting state", 1, entity));
													break;
												default:
													throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
												}
											} else {
												entity.setState(interpolate(context, entryRelativePath, entryStream, progressMonitor), progressMonitor.split("Setting state", 1, entity));					
											}
											
											ret.add(entity);
										}
										zipInputStream.closeEntry();
									}
								}
							}						
						}
					}
				}
				
				return ret;
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				// TODO - record original state in execute, restore. Delete any created entities and containers.
				return super.undo(progressMonitor);
			}
			
		};
		
		for (Generator<InputStream> g: getGenerators()) {
			work.add(g.createWork(context));
		}
		
		return work;
	}
	

} //ZipResourceCollectionImpl
