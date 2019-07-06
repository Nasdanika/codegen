package org.nasdanika.codegen.util;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.GenerationParticipant;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * This class loads a generator model and delegates its generation methods to it. 
 * @author Pavel
 *
 */
public class ModelGenerator<T> implements Work<Context, List<T>>, GenerationParticipant<T, Generator<T>> { 

	protected Generator<T> generator;
	protected Work<Context, List<T>> work;

	/**
	 * Creates a generator by loading a generator model specified by the platform URI, e.g. ``org.nasdanika.codegen.tests.models/models/static-text/basic.codegen``, into a new {@link ResourceSet}. 
	 * @param platformPluginUri
	 * @throws Exception 
	 */
	public ModelGenerator(String platformPluginUri) throws Exception {
		this(URI.createPlatformPluginURI(platformPluginUri, false));
	}
	
	/**
	 * Creates a generator by loading a generator model from the specified URI into a new {@link ResourceSet}. 
	 * @param modelUri
	 * @throws Exception 
	 */
	public ModelGenerator(URI modelUri) throws Exception {
		this(null, modelUri);
	}	
	
	/**
	 * Creates a generator by loading a generator model specified by the platform URI, e.g. ``org.nasdanika.codegen.tests.models/models/static-text/basic.codegen``, into 
	 * the specified {@link ResourceSet}.
	 * @param resourceSet Resource set to load the model to, see ``ModelGenerator(ResourceSet resourceSet, URI modelUri)`` for details. 
	 * @param platformPluginUri
	 * @throws Exception 
	 */
	public ModelGenerator(ResourceSet resourceSet, String platformPluginUri) throws Exception {
		this(resourceSet, URI.createPlatformPluginURI(platformPluginUri, false));
	}
	
	/**
	 * Creates a generator by loading a generator model from the specified URI into the specified {@link ResourceSet}.
	 * @param resourceSet Resource set to load the model to. If this parameter is null then a new resource set is created and configured to load the model by registering an {@link XMIResourceFactoryImpl}
	 * and putting {@link CodegenPackage} to the package registry. If the model uses model elements from other {@link EPackage}s, a resource set shall be constructed by the client.   
	 * @param modelUri Model URI. The first element of the model resource contents is used as the {@link Generator}, other elements are ignored.
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public ModelGenerator(ResourceSet resourceSet, URI modelUri) throws Exception {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
		}
		
		Resource modelResource = resourceSet.getResource(modelUri, true);
		generator = (Generator<T>) modelResource.getContents().iterator().next();
		work = generator.createWork();
	}

	@Override
	public long size() {
		return work.size();
	}

	@Override
	public String getName() {
		return work.getName();
	}

	@Override
	public List<T> execute(Context context, ProgressMonitor progressMonitor) throws Exception {
		return work.execute(context, progressMonitor);
	}

	@Override
	public boolean undo(ProgressMonitor progressMonitor) throws Exception {
		return work.undo(progressMonitor);
	}

}
