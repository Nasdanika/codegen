package org.nasdanika.codegen;

import org.eclipse.core.resources.IResource;

/**
 * Services of this type track resource modifications.
 * @author Pavel
 *
 */
public interface ResourceModificationTracker {
	
	/**
	 * Updates resource modification timestamp.
	 * @param resource
	 */
	void resourceModified(IResource resource) throws Exception;
	
	/**
	 * Returns true if the resource was modified since last generation run.
	 * @param resource
	 * @return
	 */
	boolean isResourceModified(IResource resource) throws Exception;

}
