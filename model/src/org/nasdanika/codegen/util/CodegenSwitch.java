/**
 */
package org.nasdanika.codegen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.codegen.*;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.Entity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.CodegenPackage
 * @generated
 */
public class CodegenSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodegenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenSwitch() {
		if (modelPackage == null) {
			modelPackage = CodegenPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CodegenPackage.GENERATOR: {
				Generator generator = (Generator)theEObject;
				T1 result = caseGenerator(generator);
				if (result == null) result = caseEntity(generator);
				if (result == null) result = caseConfigurable(generator);
				if (result == null) result = caseModelElement(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GROUP: {
				Group group = (Group)theEObject;
				T1 result = caseGroup(group);
				if (result == null) result = caseGenerator(group);
				if (result == null) result = caseEntity(group);
				if (result == null) result = caseConfigurable(group);
				if (result == null) result = caseModelElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GENERATOR: {
				ResourceGenerator resourceGenerator = (ResourceGenerator)theEObject;
				T1 result = caseResourceGenerator(resourceGenerator);
				if (result == null) result = caseGenerator(resourceGenerator);
				if (result == null) result = caseEntity(resourceGenerator);
				if (result == null) result = caseConfigurable(resourceGenerator);
				if (result == null) result = caseModelElement(resourceGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_GENERATOR: {
				ContentGenerator contentGenerator = (ContentGenerator)theEObject;
				T1 result = caseContentGenerator(contentGenerator);
				if (result == null) result = caseGenerator(contentGenerator);
				if (result == null) result = caseEntity(contentGenerator);
				if (result == null) result = caseConfigurable(contentGenerator);
				if (result == null) result = caseModelElement(contentGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_CONTAINER: {
				ResourceContainer resourceContainer = (ResourceContainer)theEObject;
				T1 result = caseResourceContainer(resourceContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = caseResourceGenerator(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = caseGenerator(resource);
				if (result == null) result = caseEntity(resource);
				if (result == null) result = caseConfigurable(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FILE: {
				File file = (File)theEObject;
				T1 result = caseFile(file);
				if (result == null) result = caseResource(file);
				if (result == null) result = caseResourceGenerator(file);
				if (result == null) result = caseNamedElement(file);
				if (result == null) result = caseGenerator(file);
				if (result == null) result = caseEntity(file);
				if (result == null) result = caseConfigurable(file);
				if (result == null) result = caseModelElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = caseResource(container);
				if (result == null) result = caseResourceContainer(container);
				if (result == null) result = caseResourceGenerator(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseGenerator(container);
				if (result == null) result = caseEntity(container);
				if (result == null) result = caseConfigurable(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GROUP: {
				ResourceGroup resourceGroup = (ResourceGroup)theEObject;
				T1 result = caseResourceGroup(resourceGroup);
				if (result == null) result = caseGroup(resourceGroup);
				if (result == null) result = caseResourceGenerator(resourceGroup);
				if (result == null) result = caseGenerator(resourceGroup);
				if (result == null) result = caseEntity(resourceGroup);
				if (result == null) result = caseConfigurable(resourceGroup);
				if (result == null) result = caseModelElement(resourceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_GROUP: {
				ContentGroup contentGroup = (ContentGroup)theEObject;
				T1 result = caseContentGroup(contentGroup);
				if (result == null) result = caseGroup(contentGroup);
				if (result == null) result = caseContentGenerator(contentGroup);
				if (result == null) result = caseGenerator(contentGroup);
				if (result == null) result = caseEntity(contentGroup);
				if (result == null) result = caseConfigurable(contentGroup);
				if (result == null) result = caseModelElement(contentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FREE_MARKER_GENERATOR: {
				FreeMarkerGenerator freeMarkerGenerator = (FreeMarkerGenerator)theEObject;
				T1 result = caseFreeMarkerGenerator(freeMarkerGenerator);
				if (result == null) result = caseContentGenerator(freeMarkerGenerator);
				if (result == null) result = caseGenerator(freeMarkerGenerator);
				if (result == null) result = caseEntity(freeMarkerGenerator);
				if (result == null) result = caseConfigurable(freeMarkerGenerator);
				if (result == null) result = caseModelElement(freeMarkerGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_REFERENCE: {
				ContentReference contentReference = (ContentReference)theEObject;
				T1 result = caseContentReference(contentReference);
				if (result == null) result = caseContentGenerator(contentReference);
				if (result == null) result = caseGenerator(contentReference);
				if (result == null) result = caseEntity(contentReference);
				if (result == null) result = caseConfigurable(contentReference);
				if (result == null) result = caseModelElement(contentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T1 result = caseFilter(filter);
				if (result == null) result = caseContentGenerator(filter);
				if (result == null) result = caseGenerator(filter);
				if (result == null) result = caseEntity(filter);
				if (result == null) result = caseConfigurable(filter);
				if (result == null) result = caseModelElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.INTERPOLATOR: {
				Interpolator interpolator = (Interpolator)theEObject;
				T1 result = caseInterpolator(interpolator);
				if (result == null) result = caseFilter(interpolator);
				if (result == null) result = caseContentGenerator(interpolator);
				if (result == null) result = caseGenerator(interpolator);
				if (result == null) result = caseEntity(interpolator);
				if (result == null) result = caseConfigurable(interpolator);
				if (result == null) result = caseModelElement(interpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.MUSTACHE: {
				Mustache mustache = (Mustache)theEObject;
				T1 result = caseMustache(mustache);
				if (result == null) result = caseFilter(mustache);
				if (result == null) result = caseContentGenerator(mustache);
				if (result == null) result = caseGenerator(mustache);
				if (result == null) result = caseEntity(mustache);
				if (result == null) result = caseConfigurable(mustache);
				if (result == null) result = caseModelElement(mustache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.ZIP_ARCHIVE: {
				ZipArchive zipArchive = (ZipArchive)theEObject;
				T1 result = caseZipArchive(zipArchive);
				if (result == null) result = caseContentGenerator(zipArchive);
				if (result == null) result = caseResourceContainer(zipArchive);
				if (result == null) result = caseGenerator(zipArchive);
				if (result == null) result = caseEntity(zipArchive);
				if (result == null) result = caseConfigurable(zipArchive);
				if (result == null) result = caseModelElement(zipArchive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GENERATOR_REFERENCE: {
				GeneratorReference<?> generatorReference = (GeneratorReference<?>)theEObject;
				T1 result = caseGeneratorReference(generatorReference);
				if (result == null) result = caseGenerator(generatorReference);
				if (result == null) result = caseEntity(generatorReference);
				if (result == null) result = caseConfigurable(generatorReference);
				if (result == null) result = caseModelElement(generatorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GENERATOR_REFERENCE: {
				ResourceGeneratorReference resourceGeneratorReference = (ResourceGeneratorReference)theEObject;
				T1 result = caseResourceGeneratorReference(resourceGeneratorReference);
				if (result == null) result = caseGeneratorReference(resourceGeneratorReference);
				if (result == null) result = caseResourceGenerator(resourceGeneratorReference);
				if (result == null) result = caseGenerator(resourceGeneratorReference);
				if (result == null) result = caseEntity(resourceGeneratorReference);
				if (result == null) result = caseConfigurable(resourceGeneratorReference);
				if (result == null) result = caseModelElement(resourceGeneratorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_GENERATOR_REFERENCE: {
				ContentGeneratorReference contentGeneratorReference = (ContentGeneratorReference)theEObject;
				T1 result = caseContentGeneratorReference(contentGeneratorReference);
				if (result == null) result = caseGeneratorReference(contentGeneratorReference);
				if (result == null) result = caseContentGenerator(contentGeneratorReference);
				if (result == null) result = caseGenerator(contentGeneratorReference);
				if (result == null) result = caseEntity(contentGeneratorReference);
				if (result == null) result = caseConfigurable(contentGeneratorReference);
				if (result == null) result = caseModelElement(contentGeneratorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_COLLECTION: {
				ResourceCollection resourceCollection = (ResourceCollection)theEObject;
				T1 result = caseResourceCollection(resourceCollection);
				if (result == null) result = caseResourceGenerator(resourceCollection);
				if (result == null) result = caseGenerator(resourceCollection);
				if (result == null) result = caseEntity(resourceCollection);
				if (result == null) result = caseConfigurable(resourceCollection);
				if (result == null) result = caseModelElement(resourceCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.BUNDLE_RESOURCE_COLLECTION: {
				BundleResourceCollection bundleResourceCollection = (BundleResourceCollection)theEObject;
				T1 result = caseBundleResourceCollection(bundleResourceCollection);
				if (result == null) result = caseResourceCollection(bundleResourceCollection);
				if (result == null) result = caseResourceGenerator(bundleResourceCollection);
				if (result == null) result = caseGenerator(bundleResourceCollection);
				if (result == null) result = caseEntity(bundleResourceCollection);
				if (result == null) result = caseConfigurable(bundleResourceCollection);
				if (result == null) result = caseModelElement(bundleResourceCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.ZIP_RESOURCE_COLLECTION: {
				ZipResourceCollection zipResourceCollection = (ZipResourceCollection)theEObject;
				T1 result = caseZipResourceCollection(zipResourceCollection);
				if (result == null) result = caseResourceCollection(zipResourceCollection);
				if (result == null) result = caseResourceGenerator(zipResourceCollection);
				if (result == null) result = caseGenerator(zipResourceCollection);
				if (result == null) result = caseEntity(zipResourceCollection);
				if (result == null) result = caseConfigurable(zipResourceCollection);
				if (result == null) result = caseModelElement(zipResourceCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.HTTP_CALL: {
				HttpCall httpCall = (HttpCall)theEObject;
				T1 result = caseHttpCall(httpCall);
				if (result == null) result = caseContentGenerator(httpCall);
				if (result == null) result = caseGenerator(httpCall);
				if (result == null) result = caseEntity(httpCall);
				if (result == null) result = caseConfigurable(httpCall);
				if (result == null) result = caseModelElement(httpCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.TEXT: {
				Text text = (Text)theEObject;
				T1 result = caseText(text);
				if (result == null) result = caseContentGenerator(text);
				if (result == null) result = caseGenerator(text);
				if (result == null) result = caseEntity(text);
				if (result == null) result = caseConfigurable(text);
				if (result == null) result = caseModelElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GENERATOR_ADAPTER: {
				GeneratorAdapter generatorAdapter = (GeneratorAdapter)theEObject;
				T1 result = caseGeneratorAdapter(generatorAdapter);
				if (result == null) result = caseGenerator(generatorAdapter);
				if (result == null) result = caseEntity(generatorAdapter);
				if (result == null) result = caseConfigurable(generatorAdapter);
				if (result == null) result = caseModelElement(generatorAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GENERATOR_ADAPTER: {
				ResourceGeneratorAdapter resourceGeneratorAdapter = (ResourceGeneratorAdapter)theEObject;
				T1 result = caseResourceGeneratorAdapter(resourceGeneratorAdapter);
				if (result == null) result = caseGeneratorAdapter(resourceGeneratorAdapter);
				if (result == null) result = caseResourceGenerator(resourceGeneratorAdapter);
				if (result == null) result = caseGenerator(resourceGeneratorAdapter);
				if (result == null) result = caseEntity(resourceGeneratorAdapter);
				if (result == null) result = caseConfigurable(resourceGeneratorAdapter);
				if (result == null) result = caseModelElement(resourceGeneratorAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_GENERATOR_ADAPTER: {
				ContentGeneratorAdapter contentGeneratorAdapter = (ContentGeneratorAdapter)theEObject;
				T1 result = caseContentGeneratorAdapter(contentGeneratorAdapter);
				if (result == null) result = caseGeneratorAdapter(contentGeneratorAdapter);
				if (result == null) result = caseContentGenerator(contentGeneratorAdapter);
				if (result == null) result = caseGenerator(contentGeneratorAdapter);
				if (result == null) result = caseEntity(contentGeneratorAdapter);
				if (result == null) result = caseConfigurable(contentGeneratorAdapter);
				if (result == null) result = caseModelElement(contentGeneratorAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GENERATOR_LINK: {
				GeneratorLink generatorLink = (GeneratorLink)theEObject;
				T1 result = caseGeneratorLink(generatorLink);
				if (result == null) result = caseGenerator(generatorLink);
				if (result == null) result = caseEntity(generatorLink);
				if (result == null) result = caseConfigurable(generatorLink);
				if (result == null) result = caseModelElement(generatorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GENERATOR_LINK: {
				ResourceGeneratorLink resourceGeneratorLink = (ResourceGeneratorLink)theEObject;
				T1 result = caseResourceGeneratorLink(resourceGeneratorLink);
				if (result == null) result = caseGeneratorLink(resourceGeneratorLink);
				if (result == null) result = caseResourceGenerator(resourceGeneratorLink);
				if (result == null) result = caseGenerator(resourceGeneratorLink);
				if (result == null) result = caseEntity(resourceGeneratorLink);
				if (result == null) result = caseConfigurable(resourceGeneratorLink);
				if (result == null) result = caseModelElement(resourceGeneratorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_GENERATOR_LINK: {
				ContentGeneratorLink contentGeneratorLink = (ContentGeneratorLink)theEObject;
				T1 result = caseContentGeneratorLink(contentGeneratorLink);
				if (result == null) result = caseGeneratorLink(contentGeneratorLink);
				if (result == null) result = caseContentGenerator(contentGeneratorLink);
				if (result == null) result = caseGenerator(contentGeneratorLink);
				if (result == null) result = caseEntity(contentGeneratorLink);
				if (result == null) result = caseConfigurable(contentGeneratorLink);
				if (result == null) result = caseModelElement(contentGeneratorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceGenerator(ResourceGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentGenerator(ContentGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceContainer(ResourceContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceGroup(ResourceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentGroup(ContentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Marker Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Marker Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFreeMarkerGenerator(FreeMarkerGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentReference(ContentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpolator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterpolator(Interpolator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zip Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zip Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseZipArchive(ZipArchive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Generator> T1 caseGeneratorReference(GeneratorReference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Generator Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceGeneratorReference(ResourceGeneratorReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Generator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Generator Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentGeneratorReference(ContentGeneratorReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceCollection(ResourceCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Resource Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBundleResourceCollection(BundleResourceCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zip Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zip Resource Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseZipResourceCollection(ZipResourceCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHttpCall(HttpCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeneratorAdapter(GeneratorAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Generator Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Generator Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceGeneratorAdapter(ResourceGeneratorAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Generator Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Generator Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentGeneratorAdapter(ContentGeneratorAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeneratorLink(GeneratorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Generator Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Generator Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceGeneratorLink(ResourceGeneratorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Generator Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Generator Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentGeneratorLink(ContentGeneratorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConfigurable(Configurable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mustache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mustache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMustache(Mustache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //CodegenSwitch
