package org.nasdanika.codegen;

import java.security.MessageDigest;

/**
 * A context service which tracks whether a particular {@link org.nasdanika.common.resources.Resource} was modified
 * in order to decide how to update resource contents during generation - merge if it was modified (is dirty) or simply overwrite
 * it it hasn't been changed since last generation (is clean).
 * 
 * @author Pavel
 *
 */
public interface ResourceModificationTracker {
	
	/**
	 * Detects whether the resource was modified since last call to ``update()``. For example, an implementation may compute a ``SHA-256`` {@link MessageDigest} and compare with 
	 * a value computed and stored during the previous generation.
	 * @param resource
	 * @return
	 */
	boolean isDirty(org.nasdanika.common.resources.Resource<?> resource);
	
	/**
	 * Updates modification tracking information for a resource. E.g. computes a {@link MessageDigest} and stores it somewhere for later retrieval by ``isDirty()``
	 * @param resource
	 */
	void update(org.nasdanika.common.resources.Resource<?> resource);

}
