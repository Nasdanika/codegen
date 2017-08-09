package org.nasdanika.codegen.presentation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.WorkFactory;
import org.nasdanika.config.Context;

/**
 * Abstract base class for wizards which perform code generation with a code generator model.
 */

public abstract class AbstractCodegenWizard extends Wizard {

	protected AbstractCodegenWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Creates generators. This implementation invokes <code>getGeneratorModels()</code>, loads them and 
	 * returns a list of root elements which are instances of {@link Generator}.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Iterable<WorkFactory<Object>> getWorkFactories() {
		List<WorkFactory<Object>> workFactories = new ArrayList<>();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().putAll(EPackage.Registry.INSTANCE);

		for (URI generatorModelURI : getGeneratorModels()) {
			Resource resource = resourceSet.getResource(generatorModelURI, true);
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof WorkFactory) {
					workFactories.add((WorkFactory<Object>) eObject);
				}
			}
		}
		return workFactories;
	};
	
	/**
	 * @return URI's of generator models. 
	 * URI's for models stored in plugins/bundles can be creates as follows: <code>URI uri = URI.createPlatformPluginURI("/&lt;plugin id&gt;/&lt;resource in the plugin&gt;", false);</code>, 
	 * e.g. <code>URI uri = URI.createPlatformPluginURI("/org.nasdanika.codegen.ecore.web.ui/web-ui.nsdgen", false);</code> 
	 */
	protected Iterable<URI> getGeneratorModels() {
		throw new UnsupportedOperationException("Subclasses shall override getGeneratorModels() method or getGenerators() method");
	}
	
	/**
	 * Creates generation context.
	 * @return
	 */
	protected abstract Context createContext();
	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				try {
					List<Work<Object>> allWork = new ArrayList<>();
					int totalWork = 0;
					for (WorkFactory<Object> workFactories: getWorkFactories()) {
						Work<Object> work = workFactories.createWork();
						totalWork += work.size();
						allWork.add(work);
					}
					SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);
					Context context = createContext();
					for (Work<Object> work: allWork) {
						work.execute(context, subMonitor);
					}
				} catch (InvocationTargetException | InterruptedException e) {
					throw e;
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}					
			}

		};
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable exception = e.getCause();
            MultiStatus status = createMultiStatus(exception.toString(), exception);
            ErrorDialog.openError(getShell(), "Generation error", exception.toString(), status);
            CodegenEditorPlugin.getPlugin().getLog().log(status);
			exception.printStackTrace();			
			return false;
		}
		return true;
	}
		
	/**
	 * Creates multi-status from throwable.
	 * @param msg
	 * @param t
	 * @return
	 */
	public static MultiStatus createMultiStatus(String msg, Throwable t) {
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