package org.nasdanika.codegen.presentation;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.Context;

public class GenerateAction extends Action implements ISelectionChangedListener {

	private ISelectionProvider selectionProvider;
	private ArrayList<Generator<Object>> selectedGenerators;

	public GenerateAction(String name) {
		super(name);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
	    selectionProvider = event.getSelectionProvider();
	    if (event.getSelection() instanceof IStructuredSelection) {
	      setEnabled(updateSelection((IStructuredSelection)event.getSelection()));
	    } else {
	      setEnabled(false);
	    }
	}
	
	@SuppressWarnings("unchecked")
	public boolean updateSelection(IStructuredSelection selection) {
		selectedGenerators = new ArrayList<>();
		for (Iterator<?> objects = selection.iterator(); objects.hasNext();) {
			Object object = AdapterFactoryEditingDomain.unwrap(objects.next());
			if (object instanceof Generator) {
				selectedGenerators.add((Generator<Object>) object);
			} else if (object instanceof Resource) {
				for (EObject c: ((Resource) object).getContents()) {
					if (c instanceof Generator) {
						selectedGenerators.add((Generator<Object>) c);						
					}
				}
			} else {
				return false;
			}
		}
		return !selectedGenerators.isEmpty();
	}	
	
	@Override
	public void run() {
		if (!selectedGenerators.isEmpty()) {
			IWorkbench workbench = PlatformUI.getWorkbench();
			Shell shell = workbench.getModalDialogShellProvider().getShell();
			try {							
				URI resourceURI = selectedGenerators.get(0).eResource().getURI();
				URL[] baseURL = { null };			
				try {
					baseURL[0] = new URL(resourceURI.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				ClassLoader[] classLoader = { getClass().getClassLoader() }; 
				
				IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
				if (modelFile.exists()) {
					IProject project = modelFile.getProject();
					IProjectNature javaNature = project.getNature(JavaCore.NATURE_ID);
					if (javaNature instanceof IJavaProject) {
						classLoader[0] = new JavaProjectClassLoader(classLoader[0], (IJavaProject) javaNature);
					}					
				}
				
				Context rootContext = new Context() {
					
					private Map<String, Object> properties = new HashMap<>();
	
					@Override
					public Object get(String name) {
						if (Configuration.BASE_URL_PROPERTY.equals(name)) {
							return baseURL[0];
						}
						// TODO - base url
						if (properties.containsKey(name)) {
							return properties.get(name);
						}
						
						String[] result = { null };					
						shell.getDisplay().syncExec(() -> {						
						    InputDialog id = new InputDialog(shell, "Property value",  "Provide value for property '"+name+"'", null, null);
					        if (id.open() == Window.OK) {
					        	result[0] = id.getValue();
					        }																		
						});
						properties.put(name, result[0]);
						return result[0];
					}
	
					@Override
					public <T> T get(Class<T> type) {
						return null;
					}
	
					@Override
					public ClassLoader getClassLoader() {
						return classLoader[0];
					}
					
				};
				
				WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
					
					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {	
						try {
							List<Work<List<Object>>> allWork = new ArrayList<>();
							int totalWork = 0;
							for (Generator<Object> g: selectedGenerators) {
								Work<List<Object>> work = g.createWork();
								totalWork += work.size();
								allWork.add(work);
							}
							SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);
							for (Work<List<Object>> work: allWork) {
								work.execute(rootContext, subMonitor);
							}
						} catch (CoreException | InvocationTargetException | InterruptedException e) {
							throw e;
						} catch (Exception e) {
							throw new InvocationTargetException(e);
						} finally {
							monitor.done();
						}					
					}
					
				};
	
				new ProgressMonitorDialog(shell).run(true, true, operation);
			} catch (Exception exception) {
	            MultiStatus status = createMultiStatus(exception.toString(), exception);
	            ErrorDialog.openError(shell, "Generation error", exception.toString(), status);
				CodegenEditorPlugin.getPlugin().getLog().log(status);
				exception.printStackTrace();
			}
		}
	}
	
	private static MultiStatus createMultiStatus(String msg, Throwable t) {
		List<Status> childStatuses = new ArrayList<>();

		for (StackTraceElement stackTrace : t.getStackTrace()) {
			childStatuses.add(new Status(IStatus.ERROR, "org.nasdanika.codegen.editor", stackTrace.toString()));
		}

		if (t.getCause() != null) {
			childStatuses.add(createMultiStatus("Caused by: " + t.getCause(), t.getCause()));
		}

		for (Throwable s : t.getSuppressed()) {
			childStatuses.add(createMultiStatus("Supressed: " + s, s.getCause()));
		}

		MultiStatus ms = new MultiStatus("org.nasdanika.codegen.editor", IStatus.ERROR,	childStatuses.toArray(new Status[childStatuses.size()]), msg, t);

		return ms;
	}	

}
