/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileImpl<C> extends ResourceImpl<org.nasdanika.common.resources.File<InputStream>> implements File<C> {
	/**
	 * The default value of the '{@link #getMerger() <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerger() {
		return (String)eDynamicGet(CodegenPackage.FILE__MERGER, CodegenPackage.Literals.FILE__MERGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerger(String newMerger) {
		eDynamicSet(CodegenPackage.FILE__MERGER, CodegenPackage.Literals.FILE__MERGER, newMerger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.FILE__GENERATORS:
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
			case CodegenPackage.FILE__GENERATORS:
				return getGenerators();
			case CodegenPackage.FILE__MERGER:
				return getMerger();
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
			case CodegenPackage.FILE__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator<C>>)newValue);
				return;
			case CodegenPackage.FILE__MERGER:
				setMerger((String)newValue);
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
			case CodegenPackage.FILE__GENERATORS:
				getGenerators().clear();
				return;
			case CodegenPackage.FILE__MERGER:
				setMerger(MERGER_EDEFAULT);
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
			case CodegenPackage.FILE__GENERATORS:
				return !getGenerators().isEmpty();
			case CodegenPackage.FILE__MERGER:
				return MERGER_EDEFAULT == null ? getMerger() != null : !MERGER_EDEFAULT.equals(getMerger());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<C>> getGenerators() {
		return (EList<Generator<C>>)eDynamicGet(CodegenPackage.FILE__GENERATORS, CodegenPackage.Literals.FILE__GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			// Redundant.
			if (getGenerators().isEmpty()) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
						 new Object [] { this, CodegenPackage.Literals.FILE__GENERATORS }));
				
				result = false;
			}
			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Reconcile action is 'Merge' and merger is not set",
						 new Object [] { this, CodegenPackage.Literals.FILE__MERGER }));
				
				result = false;
			}
		}
		return result;
	}	
	
	@Override
	protected Work<Context, org.nasdanika.common.resources.File<InputStream>> createWorkItem() throws Exception {
		List<Work<Context, List<C>>> gWork = new ArrayList<>();
		for (Generator<C> g: getGenerators()) {
			gWork.add(g.createWork());
		}
		
		String mergerClass = getMerger();
		
		return new Work<Context, org.nasdanika.common.resources.File<InputStream>>() {

			@Override
			public long size() {
				long ret = 3;
				for (Work<Context, List<C>> gw: gWork) {
					ret += gw.size();
				}
				if (mergerClass != null) {					
					++ret;
				}				
				return ret;
			}

			@SuppressWarnings("unchecked")
			@Override
			public org.nasdanika.common.resources.File<InputStream> execute(Context context, ProgressMonitor monitor) throws Exception {
				org.nasdanika.common.resources.Container<InputStream> container = context.get(org.nasdanika.common.resources.Container.class);
				String name = context.interpolate(FileImpl.this.getName());
				
				org.nasdanika.common.resources.File<InputStream> file = container.getFile(name);
				MutableContext sc = context.fork();
				sc.register(org.nasdanika.common.resources.File.class, file);
				
				// Delete unmodified resources 
				// TODO - support of modification tracking - use digests.
//				ResourceModificationTracker resourceModificationTracker = context.get(ResourceModificationTracker.class);
//				if (resourceModificationTracker != null && !resourceModificationTracker.isResourceModified(file)) {
//					file.delete(true, true, monitor.split(1));
//				}
				
				List<C> cl = new ArrayList<>();
				for (Work<Context, List<C>> gw: gWork) {
					cl.addAll(gw.execute(sc, monitor));
				}
				C contents = join(cl);
				
				if (file.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
						file.appendContents(store(context, contents), monitor);
						break;
					case MERGE:
						if (mergerClass == null || mergerClass.trim().length() == 0) {
							throw new IllegalStateException("Merger is not set");
						}
						Merger<C> merger = (Merger<C>) loadClass(mergerClass).getConstructor().newInstance();
						C oldContent = load(context, file.getContents(monitor));
						C mergedContents = merger.merge(context, file, oldContent, contents, monitor);
						file.setContents(store(context, mergedContents), monitor);
						break;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - file already exists: "+name);
					case KEEP:
						// Take no action
						return file;
					case OVERWRITE:
						file.setContents(store(context, contents), monitor);
						break;
					default:
						throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
					}
				} else {
					file.setContents(store(context, contents), monitor);					
				}
				
				// TODO - modification tracking - compute new digest, perhaps part of store().
				
				return file;
			}

			@Override
			public String getName() {
				return "File "+FileImpl.this.getName();
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				// TODO Implement - copy the original content somewhere, e.g. in-memory, restore.
				return false;
			}
		};
	}
	
	protected abstract InputStream store(Context context, C content) throws Exception;
	
	protected abstract C load(Context context, InputStream content) throws Exception;
	
	protected abstract C join(List<C> content) throws Exception;
	
} //FileImpl
