package org.nasdanika.codegen;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

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
	static Context hierarchyContext(Generator<?> generator, Context parent) throws Exception {
		return generator.eContainer() instanceof Generator ? hierarchyContext(((Generator<?>) generator.eContainer()), parent) : generator.createContext(parent);		
	}

	public static IResource createResource(IProject project, String path, InputStream content, IProgressMonitor progressMonitor) throws CoreException {
		while (path.endsWith("/")) {
			path = path.substring(0, path.length()-1);
		}
		int idx = path.lastIndexOf('/');
		IContainer container = idx==-1 ? project : (IContainer) createResource(project, path.substring(0, idx), null, progressMonitor);
		if (content==null) {
			IFolder ret = container.getFolder(new Path(path.substring(idx+1)));
			if (!ret.exists()) {
				ret.create(false, true, progressMonitor);
			}
			return ret;
		}
		IFile ret = container.getFile(new Path(path.substring(idx+1)));
		ret.create(content, true, progressMonitor);
		return ret;
	}
	
	public static void createFile(IFile location, InputStream content, IProgressMonitor progressMonitor) throws CoreException {
		IContainer parent = location.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, progressMonitor);
		}
		location.create(content, false, progressMonitor);		
	}
	
	public static void createContainer(IFolder container, IProgressMonitor progressMonitor) throws CoreException {
		IContainer parent = container.getParent();
		if (!parent.exists() && parent instanceof IFolder) {
			createContainer((IFolder) parent, progressMonitor);
		}
		container.create(false, true, progressMonitor);
	}
	

}
