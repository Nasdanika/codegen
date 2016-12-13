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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Service;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getGenerator <em>Generator</em>}</li>
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
	public Generator<C> getGenerator() {
		return (Generator<C>)eGet(CodegenPackage.Literals.FILE__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<C> newGenerator) {
		eSet(CodegenPackage.Literals.FILE__GENERATOR, newGenerator);
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
			if (getGenerator() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
						 new Object [] { this, CodegenPackage.Literals.FILE__GENERATOR }));
				
				result = false;
			}
			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Reconcile action is 'Merge' and merger is not set",
						 new Object [] { this, CodegenPackage.Literals.FILE__MERGER }));
				
				result = false;
			}
		}
		return result;
	}			

	@Override
	public Work<IFile> createWorkItem() throws Exception {
		Work<List<C>> gWork = getGenerator().createWork();
		@SuppressWarnings("unchecked")
		Merger<C> merger = (Merger<C>) getMerger();
		
		return new Work<IFile>() {

			@Override
			public int size() {
				int ret = gWork.size() + 2;
				if (merger != null) {
					ret += merger.getWorkSize();
				}				
				return ret;
			}

			@Override
			public IFile execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				String name = context.interpolate(getName());
				
				IFile file = container.getFile(new Path(name));
				MutableContext sc = context.createSubContext().set(IFile.class, file);
				
				if (file.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
						List<C> cl = new ArrayList<>();
						cl.add(load(file.getContents()));
						cl.addAll(gWork.execute(sc, monitor));
						file.setContents(store(join(cl)), false, true, monitor.split(1));
						return file;
					case MERGE:
						if (merger == null) {
							throw new IllegalStateException("Merger is not set");
						}
						List<C> mcl = new ArrayList<>();
						mcl.addAll(gWork.execute(sc, monitor));
						file.setContents(store(merger.merge(sc, load(file.getContents()), join(mcl), monitor)), false, true, monitor.split(1));
						return file;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - file already exists: "+name);
					case KEEP:
						// Take no action
						return file;
					case OVERWRITE:
						@SuppressWarnings("unchecked") Predicate<Object> overwritePredicate = (Predicate<Object>) context.get(ReconcileAction.OVERWRITE_PREDICATE_CONTEXT_PROPERTY_NAME);
						if (overwritePredicate == null || overwritePredicate.test(file)) {
							file.delete(true, true, monitor.split(1));
						}
						break;
					default:
						throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
					}
				}
								
				if (!file.exists()) {
					List<C> cl = new ArrayList<>();
					cl.addAll(gWork.execute(sc, monitor));
					file = CodegenUtil.createFile(container, name, store(join(cl)), monitor.split(1));
				}
				return file;
			}
		};
	}
	
	protected abstract InputStream store(C content) throws Exception;
	
	protected abstract C load(InputStream content) throws Exception;
	
	protected abstract C join(List<C> content) throws Exception;
	
} //FileImpl
