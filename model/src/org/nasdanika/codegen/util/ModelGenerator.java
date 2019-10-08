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
import org.nasdanika.common.Work;
import org.nasdanika.common.WorkFactory;

/**
 * This class loads a generator model and delegates its generation methods to it. 
 * @author Pavel
 *
 */
public class ModelGenerator<T> implements WorkFactory<List<T>>, GenerationParticipant<T, Generator<T>> { 

	protected Generator<T> generator;
	protected Work<List<T>> work;

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
		this(createResourceSet(), modelUri);
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
	 * Creates a new {@link ResourceSet} if it was not passed to a constructor explicitly. This implementation creates a new resource set and configures it to load the model by registering an {@link XMIResourceFactoryImpl}
	 * and putting {@link CodegenPackage} to the package registry. If the model uses model elements from other {@link EPackage}s pass  a resource set constructed by the client to one of the 
	 * constructors which accept resource set. The resource set can be constructed by this method and then additional packages may be registered by the client code before passing the resource
	 * set to a constructor.   
	 * @return
	 */
	public static ResourceSet createResourceSet() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
		return resourceSet;
	}
	
	/**
	 * Creates a generator by loading a generator model from the specified URI into the specified {@link ResourceSet}.
	 * @param resourceSet Resource set to load the model to. 
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public ModelGenerator(ResourceSet resourceSet, URI modelUri) throws Exception {
		Resource modelResource = resourceSet.getResource(modelUri, true);
		generator = (Generator<T>) modelResource.getContents().iterator().next();
	}
	
	@Override
	public Work<List<T>> createWork(Context context) throws Exception {
		return generator.createWork(context);
	}

}
