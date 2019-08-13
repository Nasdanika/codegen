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
import org.nasdanika.common.CompoundWork;
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
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMergerArguments <em>Merger Arguments</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getMergerArguments() {
		return (EList<String>)eDynamicGet(CodegenPackage.FILE__MERGER_ARGUMENTS, CodegenPackage.Literals.FILE__MERGER_ARGUMENTS, true, true);
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
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				return getMergerArguments();
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
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				getMergerArguments().clear();
				getMergerArguments().addAll((Collection<? extends String>)newValue);
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
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				getMergerArguments().clear();
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
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				return !getMergerArguments().isEmpty();
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
	
	@SuppressWarnings("unchecked")
	@Override
	protected Work<org.nasdanika.common.resources.File<InputStream>> createWorkItem(Context context) throws Exception {		
		org.nasdanika.common.resources.Container<InputStream> container = context.get(org.nasdanika.common.resources.Container.class);
		String name = finalName(context.interpolate(FileImpl.this.getName()));
		
		org.nasdanika.common.resources.File<InputStream> file = container.getFile(name);
		MutableContext sc = context.fork();
		sc.register(org.nasdanika.common.resources.File.class, file);
								
		CompoundWork<org.nasdanika.common.resources.File<InputStream>, List<C>> ret = new CompoundWork<org.nasdanika.common.resources.File<InputStream>, List<C>>(context.interpolate(getName()), getExecutor(context)) {

			@Override
			protected org.nasdanika.common.resources.File<InputStream> combine(List<List<C>> results, ProgressMonitor monitor) throws Exception {
				List<C> all = results.stream().reduce(new ArrayList<C>(), (i, r) -> {
					i.addAll(r);
					return i;
				});
				
				C contents = join(all);
				
				// Delete unmodified resources 
				// TODO - support of modification tracking - use digests.
//				ResourceModificationTracker resourceModificationTracker = context.get(ResourceModificationTracker.class);
//				if (resourceModificationTracker != null && !resourceModificationTracker.isResourceModified(file)) {
//					file.delete(true, true, monitor.split(1));
//				}
				
				
				if (file.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
						file.appendContents(store(context, contents), monitor);
						break;
					case MERGE:
						String mergerClass = getMerger();
						Merger<C> merger;
						if (mergerClass == null || mergerClass.trim().length() == 0) {
							merger = getNativeMerger(context);
							if (merger == null) {
								throw new IllegalStateException("Merger is not set");
							}
						} else {
							merger = (Merger<C>) instantiate(context, mergerClass, getMergerArguments());
						}
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
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				// TODO Implement - copy the original content somewhere, e.g. in-memory, restore. Split progress monitor.
				return super.undo(progressMonitor);
			}
			
		};
		
		for (Generator<C> g: getGenerators()) {
			ret.add(g.createWork(sc));
		}
		
		return ret;
	}
	
	/**
	 * Subclasses may override this method to return format-specific merger, e.g. Java merger for Java files.
	 * @param context
	 * @return Format-specific merger, e.g. Java merger for Java files.
	 */
	protected Merger<C> getNativeMerger(Context context) {
		return null;
	}
	
	protected abstract InputStream store(Context context, C content) throws Exception;
	
	protected abstract C load(Context context, InputStream content) throws Exception;
	
	protected abstract C join(List<C> content) throws Exception;
	
} //FileImpl
