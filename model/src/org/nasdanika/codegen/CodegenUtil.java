package org.nasdanika.codegen;

import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.nasdanika.config.Context;

public class CodegenUtil {
	
	private CodegenUtil() {
		// Utility class.
	}
			
	/**
	 * Builds a context by traversing object's containment hierarchy from the top, e.g. from WorkspaceRoot to Project, to ...
	 * @param parent
	 * @param withContainer
	 * @return
	 * @throws Exception
	 */
	static Context hierarchyContext(Generator<?> generator, Context parent, SubMonitor monitor) throws Exception {
		monitor.setWorkRemaining(2);
		return generator.eContainer() instanceof Generator ? hierarchyContext(((Generator<?>) generator.eContainer()), parent, monitor.split(1)) : generator.createContext(parent, monitor.split(1));		
	}

	public static IFolder createFolder(IContainer container, String path, SubMonitor monitor) throws CoreException {
		monitor.setWorkRemaining(2);
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), monitor.split(1));
		}
		
		IFolder ret = container.getFolder(new Path(path.substring(idx+1)));
		if (!ret.exists()) {
			ret.create(false, true, monitor.split(1));
		}
		return ret;
	}
	
	public static IFile createFile(IContainer container, String path, InputStream content, SubMonitor monitor) throws CoreException {
		monitor.setWorkRemaining(2);
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), monitor.split(1));
		}
		IFile ret = container.getFile(new Path(path.substring(idx+1)));
		ret.create(content, true, monitor.split(1));
		return ret;
	}		

	public static IFile getFile(IContainer container, String path, SubMonitor monitor) throws CoreException {
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), monitor);
		}
		return container.getFile(new Path(path.substring(idx+1)));
	}			
	
	public static void createFile(IFile location, InputStream content, SubMonitor monitor) throws CoreException {
		monitor.setWorkRemaining(2);
		IContainer parent = location.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, monitor.split(1));
		}
		location.create(content, false, monitor.split(1));		
	}
	
	public static void createContainer(IFolder container, SubMonitor monitor) throws CoreException {
		monitor.setWorkRemaining(2);
		IContainer parent = container.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, monitor.split(1));
		}
		container.create(false, true, monitor.split(1));
	}

	public static <T> Work<T> emptyWork(T result) {
		return new Work<T>() {

			@Override
			public int size() {
				return 0;
			}

			@Override
			public T execute(Context context, SubMonitor monitor) throws Exception {
				return result;
			}
			
		};
	}
	
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0; 								 
	}

}
