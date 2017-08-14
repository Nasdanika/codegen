package org.nasdanika.codegen.presentation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.wizard.IWizardPage;
import org.nasdanika.codegen.wizard.Wizard;
import org.nasdanika.codegen.wizard.WizardPage;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.Context;
import org.nasdanika.config.Provider;

public class AbstractModelCodegenWizard extends AbstractCodegenWizard {

	@Override
	protected Context createContext() {
		return new Context() {

			@SuppressWarnings("unchecked")
			@Override
			public Object get(String name) {
				// Wizard property - for wizard which might want to save configurations for later re-use.
				if ("wizard".equals(name)) {
					return wizard;
				}
				if (Configuration.BASE_URL_PROPERTY.equals(name)) {
					return getBaseURL();
				}
				
				String[] path = name.split("\\.");
				Object obj = getPage(path[0]);				
				if (obj == null) {
					return null;
				}
				
				if (obj instanceof ModelWizardPage) {
					obj = ((ModelWizardPage) obj).getData();
				}
				
				for (int i=1; i < path.length; ++i) {
					if (obj instanceof Context) {
						StringBuilder subNameBuilder = new StringBuilder(path[i]);
						for (int j=i+1; j<path.length; ++j) {
							subNameBuilder.append(".").append(path[j]);
						}
						return ((Context) obj).get(subNameBuilder.toString());
					} else if (obj instanceof EObject) {
						EObject eObj = (EObject) obj;
						EStructuralFeature feature = eObj.eClass().getEStructuralFeature(path[i]);
						if (feature == null) {
							return null;
						}
						obj = eObj.eGet(feature);
						if (feature.isMany() && ++i < path.length) {
							obj = ((List<Object>) obj).get(Integer.parseInt(path[i]));
						}
					} else { 
						return null;
					}					
				}
				
				return obj;
			}

			@Override
			public <T> T get(Class<T> type) {
				// No services
				return null;
			}

			@Override
			public ClassLoader getClassLoader() {
				return getClass().getClassLoader();
			}
			
		};
	}
	
	/**
	 * @return Base URL for loading generator resources. This implementation returns wizard's model URL.
	 * @throws MalformedURLException 
	 */
	protected URL getBaseURL() {
		try {
//			URL classURL = getClass().getClassLoader().getResource(getClass().getName().replace('.', '/')+".class");
			URI resourceURI = getWizard().eResource().getURI();
			return new URL(resourceURI.toString());
		} catch (MalformedURLException e) {
			throw new RuntimeException(e); // TODO - better handling?
		}
	}

	@Override
	public void addPages() {
		for (WizardPage wizardPage: getWizard().getPages()) {
			addPage(new ModelWizardPage(wizardPage));
		}
	}
	
	protected Wizard wizard;	
	
	/**
	 * @return Wizard model.
	 */
	protected Wizard getWizard() {
		if (wizard == null) {
			ResourceSet resourceSet = editingDomain.getResourceSet();
			URI modelURI = getWizardModelLocation();
			Resource resource = resourceSet.getResource(modelURI, true);
			editingDomain.getResourceToReadOnlyMap().put(resource, Boolean.FALSE); // Resource is editable although we are not going to save it.
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof Wizard) {
					wizard = (Wizard) eObject;
					return wizard;
				}
			}
			
			throw new IllegalStateException("No wizard is found in "+modelURI);
		}
		return wizard;
	}
	
	/**
	 * @return URI's of the wizard model. 
	 * URI's for models stored in plugins/bundles can be creates as follows: <code>URI uri = URI.createPlatformPluginURI("/&lt;plugin id&gt;/&lt;resource in the plugin&gt;", false);</code>, 
	 * e.g. <code>URI uri = URI.createPlatformPluginURI("/org.nasdanika.codegen.ecore.web.ui/web-ui.nsdgen", false);</code> 
	 */
	protected URI getWizardModelLocation() {
		throw new UnsupportedOperationException("Subclasses shall override getWizardModelLocation() method or getWizard() method");
	}
	
}
