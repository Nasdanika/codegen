/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Nature;
import org.nasdanika.codegen.Project;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ProjectImpl#getNatures <em>Natures</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ProjectImpl#getReconcileAction <em>Reconcile Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends ResourceGeneratorImpl<IProject> implements Project {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CodegenPackage.Literals.PROJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CodegenPackage.Literals.PROJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Nature> getNatures() {
		return (EList<Nature>)eGet(CodegenPackage.Literals.PROJECT__NATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource<IResource>> getResources() {
		return (EList<Resource<IResource>>)eGet(CodegenPackage.Literals.PROJECT__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconcileAction getReconcileAction() {
		return (ReconcileAction)eGet(CodegenPackage.Literals.PROJECT__RECONCILE_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcileAction(ReconcileAction newReconcileAction) {
		eSet(CodegenPackage.Literals.PROJECT__RECONCILE_ACTION, newReconcileAction);
	}
	
//	@Override
//	public IProject generate(Context context, IProgressMonitor monitor) throws Exception {
//		IProject project = null; // TODO
//		SubContext pctx = context.createSubContext().set(IProject.class, project);
//		SubMonitor sm = SubMonitor.convert(monitor, getTotalWork());
//		for (Resource<?> res: getResources()) {
//			res.generate(pctx, sm.split(res.getTotalWork()));
//		}
//		for (Nature nature: getNatures()) {
//			nature.generate(pctx, sm.split(nature.getTotalWork()));
//		}
//		return project;
//	}
//
//	@Override
//	public int getTotalWork() {
//		int ret = 1;
//		for (Resource<?> res: getResources()) {
//			ret += res.getTotalWork();
//		}
//		for (Nature nature: getNatures()) {
//			ret += nature.getTotalWork();
//		}
//		return ret;
//	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getName() == null || getName().trim().length() == 0) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, CodegenPackage.Literals.PROJECT__NAME }));
				
				result = false;
			}
		}
		return result;
	}

	@Override
	protected Work<IProject> createWorkItem() throws Exception {
		
		List<Work<List<IProjectNature>>> allNaturesWork = new ArrayList<>(); 	
		int allNaturesWorkSize = 0;
		for (Nature nature: getNatures()) {
			Work<List<IProjectNature>> nw = nature.createWork();
			allNaturesWorkSize += nw.size();
			allNaturesWork.add(nw);
		}
				
		List<Work<List<IResource>>> allResourcesWork = new ArrayList<>(); 
		int allResourcesWorkSize = 0;
		for (Resource<IResource> res: getResources()) {
			Work<List<IResource>> rw = res.createWork();
			allResourcesWorkSize += rw.size();
			allResourcesWork.add(rw);
		}		

		int workSize = 4 + allNaturesWorkSize + allResourcesWorkSize;
		
		return new Work<IProject>() {

			@Override
			public int size() {
				return workSize;
			}

			@Override
			public IProject execute(Context context, SubMonitor monitor) throws Exception {
				
				IWorkspace workspace = context.get(IWorkspace.class);
				String projectName = context.interpolate(getName());
				IProject project = workspace.getRoot().getProject(projectName);
				
				if (project.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
					case MERGE:
						// Append new things to existing.
						break;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - project already exists: "+projectName);
					case KEEP:
						// Take no action
						return project;
					case OVERWRITE:
						@SuppressWarnings("unchecked") Predicate<Object> overwritePredicate = (Predicate<Object>) context.get(ReconcileAction.OVERWRITE_PREDICATE_CONTEXT_PROPERTY_NAME);
						if (overwritePredicate == null || overwritePredicate.test(project)) {
							project.delete(true, true, monitor.split(1));
						}
						break;
					default:
						throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
					}
				}
				
				if (!project.exists()) {
					IProjectDescription description = workspace.newProjectDescription(projectName);
					project.create(description, monitor.split(1));
				}
				
				project.open(monitor.split(1));

				project = configure(context, project, monitor.split(1));
				MutableContext sc = context.createSubContext().set(IProject.class, project).set(IContainer.class, project);

				for (Work<List<IProjectNature>> nw: allNaturesWork) {
					nw.execute(sc, monitor);
				}
				
				for (Work<List<IResource>> rw: allResourcesWork) {
					rw.execute(sc, monitor);
				}
				
				return project;
			}
		};
		
	}	

} //ProjectImpl
