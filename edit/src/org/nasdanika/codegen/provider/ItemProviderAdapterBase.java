package org.nasdanika.codegen.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * Base class for item providers.
 * @author Pavel
 *
 */
public class ItemProviderAdapterBase extends ItemProviderAdapter {

	protected ItemProviderAdapterBase(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}
	
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	/**
	 * Collects child descriptors from registered ecore packages compatible with the ereference type.
	 * @param newChildDescriptors
	 * @param eReference
	 */
	protected void collectEReferenceChildDescriptors(Collection<Object> newChildDescriptors, EReference eReference) {
		for (EObject child: collectTypes(eReference.getEReferenceType())) {
			newChildDescriptors.add(createChildParameter(eReference, child));			
		}		
	}
	
	/**
	 * Iterates over registered ecore packages. Collects and instantiates concrete subclasses. 
	 * @return
	 */
	public List<EObject> collectTypes(EClass type) {
		AdapterFactory rootAdapterFactory = getRootAdapterFactory();
		List<EObject> ret = new ArrayList<>();
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		if (registry != null) {
			IConfigurationElement[] configElems = registry.getConfigurationElementsFor("org.eclipse.emf.ecore.generated_package");
			for (IConfigurationElement elem : configElems) {
				String uri = elem.getAttribute("uri");
				if (!isBlank(uri)) {
					EPackage epkg = EPackage.Registry.INSTANCE.getEPackage(uri);
					if (epkg != null) {
						for (EClassifier eClassifier: epkg.getEClassifiers()) {
							if (eClassifier instanceof EClass 
									&& !((EClass) eClassifier).isAbstract() 
									&& type.isSuperTypeOf((EClass) eClassifier)
									&& rootAdapterFactory.isFactoryForType(eClassifier)) {
								
								EFactory eFactory = epkg.getEFactoryInstance();
								ret.add(eFactory.create((EClass) eClassifier));						
							}
						}
					}
				}
			}
		}
		return ret;
	}	

}
