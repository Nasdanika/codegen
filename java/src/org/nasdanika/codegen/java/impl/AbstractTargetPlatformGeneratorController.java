package org.nasdanika.codegen.java.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.pde.core.target.ITargetDefinition;
import org.eclipse.pde.core.target.ITargetLocation;
import org.eclipse.pde.core.target.ITargetPlatformService;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.target.IUBundleContainer;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.GenericFile;
import org.nasdanika.config.Context;

/**
 * Creates target definition using result IFile handler passed by the generic file generator.
 * @author Pavel Vlasov
 *
 */
public abstract class AbstractTargetPlatformGeneratorController implements GeneratorController<IFile, GenericFile> {
	
	@Override
	public IFile configure(GenericFile generator, Context context, IFile targetFile, SubMonitor monitor) throws Exception {				
		ITargetPlatformService service = (ITargetPlatformService) PDECore.getDefault().acquireService(ITargetPlatformService.class);
		
		ITargetDefinition targetDefinition = service.getTarget(targetFile).getTargetDefinition();
		targetDefinition.setName(getTargetName(targetFile));		
		configureTargetDefinition(service, targetDefinition);
		service.saveTargetDefinition(targetDefinition);
		targetDefinition.resolve(monitor.split(1));
		return targetFile;
	}
	
	/**
	 * Configures target definition. This implementation sets target locations.
	 * @param service
	 * @param targetDefinition
	 * @throws Exception
	 */
	protected void configureTargetDefinition(ITargetPlatformService service, ITargetDefinition targetDefinition) throws Exception {
		TargetLocation[] targetLocations = getTargetLocations();
		ITargetLocation[] iTargetLocations = new ITargetLocation[targetLocations.length];
		for (int i=0; i < targetLocations.length; ++i) {
			iTargetLocations[i] = targetLocations[i].getITargetLocation(service);
		}
		
		targetDefinition.setTargetLocations(iTargetLocations);
	}
	
	protected String getTargetName(IFile targetFile) {
		return targetFile.getName();
	}

	protected static abstract class TargetLocation {
		
		protected abstract java.net.URI[] getRepositories() throws Exception;
		
		protected class InstallableUnit {
			
			private String id;
			private String version;

			public InstallableUnit() {
			}
			
			public InstallableUnit(String id, String version) {
				this.id = id;
				this.version = version;
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getVersion() {
				return version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
			
		}
		
		protected abstract InstallableUnit[] getInstallableUnits();
		
		protected ITargetLocation getITargetLocation(ITargetPlatformService targetPlatformService) throws Exception {
			InstallableUnit[] installableUnits = getInstallableUnits();
			String[] unitIds = new String[installableUnits.length];
			String[] versions = new String[installableUnits.length];
			for (int i=0; i < installableUnits.length; ++i) {
				unitIds[i] = installableUnits[i].getId();
				versions[i] = installableUnits[i].getVersion();
			}
			return targetPlatformService.newIULocation(unitIds, versions, getRepositories(), getResolutionFlags());			
		}
		
		protected int getResolutionFlags() {
			return IUBundleContainer.INCLUDE_SOURCE; // | IUBundleContainer.INCLUDE_REQUIRED;					
		}
		
	}
	
	protected abstract TargetLocation[] getTargetLocations();

}
