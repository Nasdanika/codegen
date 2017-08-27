/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceModificationTracker;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;
import org.nasdanika.config.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileImpl<C> extends ResourceImpl<IFile> implements File<C> {
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
	public Service getMerger() {
		return (Service)eGet(CodegenPackage.Literals.FILE__MERGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerger(Service newMerger) {
		eSet(CodegenPackage.Literals.FILE__MERGER, newMerger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generator<C>> getGenerators() {
		return (EList<Generator<C>>)eGet(CodegenPackage.Literals.FILE__GENERATORS, true);
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
	protected Work<IFile> createWorkItem() throws Exception {
		List<Work<List<C>>> gWork = new ArrayList<>();
		for (Generator<C> g: getGenerators()) {
			gWork.add(g.createWork());
		}
		
		Service mergerService = getMerger();
		
		return new Work<IFile>() {

			@Override
			public int size() {
				int ret = 3;
				for (Work<List<C>> gw: gWork) {
					ret += gw.size();
				}
				if (mergerService != null) {					
					ret += mergerService.getConfigWorkSize() + 1;
				}				
				return ret;
			}

			@Override
			public IFile execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				String name = context.interpolate(getName());
				
				IFile file = container.getFile(new Path(name));
				MutableContext sc = context.createSubContext().set(IFile.class, file);
				
				// Delete unmodified resources 
				ResourceModificationTracker resourceModificationTracker = context.get(ResourceModificationTracker.class);
				if (resourceModificationTracker != null && !resourceModificationTracker.isResourceModified(file)) {
					file.delete(true, true, monitor.split(1));
				}
				
				if (file.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
						List<C> cl = new ArrayList<>();
						cl.add(load(context, file.getContents(), file.getCharset()));
						for (Work<List<C>> gw: gWork) {
							cl.addAll(gw.execute(sc, monitor));
						}
						file.setContents(store(context, join(cl), file.getCharset()), false, true, monitor.split(1));
						return file;
					case MERGE:
						if (mergerService == null) {
							throw new IllegalStateException("Merger is not set");
						}
						List<C> mcl = new ArrayList<>();
						for (Work<List<C>> gw: gWork) {
							mcl.addAll(gw.execute(sc, monitor));
						}
						@SuppressWarnings("unchecked") Merger<C> merger = (Merger<C>) mergerService.get(context, monitor);
						file.setContents(store(context, merger.merge(sc, file, load(context, file.getContents(), file.getCharset()), join(mcl), monitor.split(1)), file.getCharset()), false, true, monitor.split(1));
						return file;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - file already exists: "+name);
					case KEEP:
						// Take no action
						return file;
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
					List<C> cl = new ArrayList<>();
					for (Work<List<C>> gw: gWork) {
						cl.addAll(gw.execute(sc, monitor));
					}
					file = CodegenUtil.createFile(container, name, store(context, join(cl), file.getCharset()), monitor.split(1));
					if (getEncoding() != null && !getEncoding().equals(file.getCharset())) {
						file.setCharset(getEncoding(), monitor.split(1));
					}
					if (resourceModificationTracker != null) {
						resourceModificationTracker.resourceModified(file);
					}
				}
				
				return file;
			}
		};
	}
	
	protected abstract InputStream store(Context context, C content, String charset) throws Exception;
	
	protected abstract C load(Context context, InputStream content, String charset) throws Exception;
	
	protected abstract C join(List<C> content) throws Exception;
	
	/**
	 * Text file overrides.
	 * @return
	 */
	public String getEncoding() {
		return null;
	}
	
} //FileImpl
