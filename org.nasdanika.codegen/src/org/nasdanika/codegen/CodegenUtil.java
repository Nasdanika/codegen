package org.nasdanika.codegen;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

public class CodegenUtil {
	
	private CodegenUtil() {
		// Utility class.
	}
		
	private static final Pattern EXPANDER_PATTERN = Pattern.compile("\\{\\{(.+?)\\}\\}");	
	
	/**
	 * Expands tokens in the form of <code>{{token name}}</code> to their values.
	 * If a token is not found expansion is not processed.
	 * @param input
	 * @param env
	 * @return
	 */
	public static String interpolate(String input, Context context) {
		if (context == null || input == null) {
			return input;
		}
		Matcher matcher = EXPANDER_PATTERN.matcher(input);
		StringBuilder output = new StringBuilder();
		int i = 0;
		while (matcher.find()) {
		    String token = matcher.group();
			Object replacement = context.get(token.substring(2, token.length()-2));
		    if (replacement != null) {
			    output.append(input.substring(i, matcher.start())).append(replacement);			    
			    i = matcher.end();
		    }
		}
		output.append(input.substring(i, input.length()));
		return output.toString();
	}
	
	/**
	 * Builds a context by traversing object's containment hierarchy from the top, e.g. from WorkspaceRoot to Project, to ...
	 * @param parent
	 * @param withContainer
	 * @return
	 * @throws Exception
	 */
	static Context hierarchyContext(Generator<?> generator, Context parent, SubMonitor monitor) throws Exception {
		SubMonitor sm = SubMonitor.convert(monitor, 2);
		return generator.eContainer() instanceof Generator ? hierarchyContext(((Generator<?>) generator.eContainer()), parent, sm.split(1)) : generator.createContext(parent, sm.split(1));		
	}

	public static IFolder createFolder(IContainer container, String path, IProgressMonitor monitor) throws CoreException {
		SubMonitor sm = SubMonitor.convert(monitor, 2);
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), sm.split(1));
		}
		
		IFolder ret = container.getFolder(new Path(path.substring(idx+1)));
		if (!ret.exists()) {
			ret.create(false, true, sm.split(1));
		}
		return ret;
	}
	
	public static IFile createFile(IContainer container, String path, InputStream content, IProgressMonitor monitor) throws CoreException {
		SubMonitor sm = SubMonitor.convert(monitor, 2);
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), sm.split(1));
		}
		IFile ret = container.getFile(new Path(path.substring(idx+1)));
		ret.create(content, true, sm.split(1));
		return ret;
	}		

	public static IFile getFile(IContainer container, String path, IProgressMonitor monitor) throws CoreException {
		SubMonitor sm = SubMonitor.convert(monitor, 1);
		int idx = path.lastIndexOf('/');
		if (idx != -1) {
			container = createFolder(container, path.substring(0, idx), sm.split(1));
		}
		return container.getFile(new Path(path.substring(idx+1)));
	}			
	
	public static void createFile(IFile location, InputStream content, IProgressMonitor monitor) throws CoreException {
		SubMonitor sm = SubMonitor.convert(monitor, 2);
		IContainer parent = location.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, sm.split(1));
		}
		location.create(content, false, sm.split(1));		
	}
	
	public static void createContainer(IFolder container, IProgressMonitor monitor) throws CoreException {
		SubMonitor sm = SubMonitor.convert(monitor, 2);
		IContainer parent = container.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, sm.split(1));
		}
		container.create(false, true, sm.split(1));
	}
	

}
