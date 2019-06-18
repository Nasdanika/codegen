package org.nasdanika.codegen.impl;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.nasdanika.codegen.ResourceModificationTracker;

public class PropertiesResourceModificationTracker implements ResourceModificationTracker {
	
	private Properties properties;

	public PropertiesResourceModificationTracker(Properties properties) {
		this.properties = properties;
	}

	@Override
	public void resourceModified(IResource resource) throws Exception {
		properties.setProperty(resource.getProjectRelativePath().toString(), getResourceStamp(resource));
	}

	@Override
	public boolean isResourceModified(IResource resource) throws Exception {
		if (!resource.exists()) {
			return false; // Not existent means that all modifications are gone -> not modified.
		}
		String resStamp = properties.getProperty(resource.getProjectRelativePath().toString());
		if (resStamp == null) {
			// Not tracked same as modified
			return true;
		}
		
		return !resStamp.equals(getResourceStamp(resource));
	}
	
	/**
	 * Returns resource stamp which can be a timestamp or, say SHA digest
	 * @param resource
	 * @return
	 */
	protected String getResourceStamp(IResource resource) throws Exception {
		if (resource instanceof IFile) {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			try (InputStream in = new BufferedInputStream(((IFile) resource).getContents())) {
				int b;
				while ((b = in.read()) != -1) {
					messageDigest.update((byte) b);
				}
			}
			return Base64.getEncoder().encodeToString(messageDigest.digest());
		}
		return String.valueOf(resource.getModificationStamp());
	}

}
