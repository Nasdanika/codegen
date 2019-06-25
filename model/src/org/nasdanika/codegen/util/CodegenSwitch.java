/**
 */
package org.nasdanika.codegen.util;

import java.io.InputStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.codegen.*;

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
			case CodegenPackage.WORK_FACTORY: {
				WorkFactory<?> workFactory = (WorkFactory<?>)theEObject;
				T1 result = caseWorkFactory(workFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GENERATOR: {
				Generator<?> generator = (Generator<?>)theEObject;
				T1 result = caseGenerator(generator);
				if (result == null) result = caseWorkFactory(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.NAMED_GENERATOR: {
				NamedGenerator namedGenerator = (NamedGenerator)theEObject;
				T1 result = caseNamedGenerator(namedGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.GROUP: {
				Group<?> group = (Group<?>)theEObject;
				T1 result = caseGroup(group);
				if (result == null) result = caseGenerator(group);
				if (result == null) result = caseWorkFactory(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE: {
				Resource<?> resource = (Resource<?>)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = caseGenerator(resource);
				if (result == null) result = caseWorkFactory(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FILE: {
				File<?> file = (File<?>)theEObject;
				T1 result = caseFile(file);
				if (result == null) result = caseResource(file);
				if (result == null) result = caseGenerator(file);
				if (result == null) result = caseWorkFactory(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.BINARY_FILE: {
				BinaryFile binaryFile = (BinaryFile)theEObject;
				T1 result = caseBinaryFile(binaryFile);
				if (result == null) result = caseFile(binaryFile);
				if (result == null) result = caseResource(binaryFile);
				if (result == null) result = caseGenerator(binaryFile);
				if (result == null) result = caseWorkFactory(binaryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.TEXT_FILE: {
				TextFile textFile = (TextFile)theEObject;
				T1 result = caseTextFile(textFile);
				if (result == null) result = caseFile(textFile);
				if (result == null) result = caseResource(textFile);
				if (result == null) result = caseGenerator(textFile);
				if (result == null) result = caseWorkFactory(textFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = caseResource(container);
				if (result == null) result = caseGenerator(container);
				if (result == null) result = caseWorkFactory(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.RESOURCE_GROUP: {
				ResourceGroup resourceGroup = (ResourceGroup)theEObject;
				T1 result = caseResourceGroup(resourceGroup);
				if (result == null) result = caseGroup(resourceGroup);
				if (result == null) result = caseGenerator(resourceGroup);
				if (result == null) result = caseWorkFactory(resourceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.STATIC_TEXT: {
				StaticText staticText = (StaticText)theEObject;
				T1 result = caseStaticText(staticText);
				if (result == null) result = caseGenerator(staticText);
				if (result == null) result = caseWorkFactory(staticText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.STATIC_BYTES: {
				StaticBytes staticBytes = (StaticBytes)theEObject;
				T1 result = caseStaticBytes(staticBytes);
				if (result == null) result = caseGenerator(staticBytes);
				if (result == null) result = caseWorkFactory(staticBytes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FREE_MARKER_GENERATOR: {
				FreeMarkerGenerator freeMarkerGenerator = (FreeMarkerGenerator)theEObject;
				T1 result = caseFreeMarkerGenerator(freeMarkerGenerator);
				if (result == null) result = caseGenerator(freeMarkerGenerator);
				if (result == null) result = caseWorkFactory(freeMarkerGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.ECORE_MODEL_GENERATOR: {
				ECoreModelGenerator eCoreModelGenerator = (ECoreModelGenerator)theEObject;
				T1 result = caseECoreModelGenerator(eCoreModelGenerator);
				if (result == null) result = caseGenerator(eCoreModelGenerator);
				if (result == null) result = caseWorkFactory(eCoreModelGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONTENT_REFERENCE: {
				ContentReference<?> contentReference = (ContentReference<?>)theEObject;
				T1 result = caseContentReference(contentReference);
				if (result == null) result = caseGenerator(contentReference);
				if (result == null) result = caseWorkFactory(contentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.CONVERTER: {
				Converter<?, ?> converter = (Converter<?, ?>)theEObject;
				T1 result = caseConverter(converter);
				if (result == null) result = caseGenerator(converter);
				if (result == null) result = caseWorkFactory(converter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.FILTER: {
				Filter<?> filter = (Filter<?>)theEObject;
				T1 result = caseFilter(filter);
				if (result == null) result = caseConverter(filter);
				if (result == null) result = caseGenerator(filter);
				if (result == null) result = caseWorkFactory(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_GENERATOR: {
				JavaGenerator<?> javaGenerator = (JavaGenerator<?>)theEObject;
				T1 result = caseJavaGenerator(javaGenerator);
				if (result == null) result = caseGenerator(javaGenerator);
				if (result == null) result = caseWorkFactory(javaGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.INTERPOLATOR: {
				Interpolator interpolator = (Interpolator)theEObject;
				T1 result = caseInterpolator(interpolator);
				if (result == null) result = caseFilter(interpolator);
				if (result == null) result = caseConverter(interpolator);
				if (result == null) result = caseGenerator(interpolator);
				if (result == null) result = caseWorkFactory(interpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_FILTER: {
				JavaFilter<?> javaFilter = (JavaFilter<?>)theEObject;
				T1 result = caseJavaFilter(javaFilter);
				if (result == null) result = caseFilter(javaFilter);
				if (result == null) result = caseConverter(javaFilter);
				if (result == null) result = caseGenerator(javaFilter);
				if (result == null) result = caseWorkFactory(javaFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_TEXT_FILTER: {
				JavaTextFilter javaTextFilter = (JavaTextFilter)theEObject;
				T1 result = caseJavaTextFilter(javaTextFilter);
				if (result == null) result = caseJavaFilter(javaTextFilter);
				if (result == null) result = caseFilter(javaTextFilter);
				if (result == null) result = caseConverter(javaTextFilter);
				if (result == null) result = caseGenerator(javaTextFilter);
				if (result == null) result = caseWorkFactory(javaTextFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_STREAM_FILTER: {
				JavaStreamFilter javaStreamFilter = (JavaStreamFilter)theEObject;
				T1 result = caseJavaStreamFilter(javaStreamFilter);
				if (result == null) result = caseJavaFilter(javaStreamFilter);
				if (result == null) result = caseFilter(javaStreamFilter);
				if (result == null) result = caseConverter(javaStreamFilter);
				if (result == null) result = caseGenerator(javaStreamFilter);
				if (result == null) result = caseWorkFactory(javaStreamFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_TEXT_GENERATOR: {
				JavaTextGenerator javaTextGenerator = (JavaTextGenerator)theEObject;
				T1 result = caseJavaTextGenerator(javaTextGenerator);
				if (result == null) result = caseJavaGenerator(javaTextGenerator);
				if (result == null) result = caseGenerator(javaTextGenerator);
				if (result == null) result = caseWorkFactory(javaTextGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_STREAM_GENERATOR: {
				JavaStreamGenerator javaStreamGenerator = (JavaStreamGenerator)theEObject;
				T1 result = caseJavaStreamGenerator(javaStreamGenerator);
				if (result == null) result = caseJavaGenerator(javaStreamGenerator);
				if (result == null) result = caseGenerator(javaStreamGenerator);
				if (result == null) result = caseWorkFactory(javaStreamGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.JAVA_RESOURCE_GENERATOR: {
				JavaResourceGenerator javaResourceGenerator = (JavaResourceGenerator)theEObject;
				T1 result = caseJavaResourceGenerator(javaResourceGenerator);
				if (result == null) result = caseJavaGenerator(javaResourceGenerator);
				if (result == null) result = caseGenerator(javaResourceGenerator);
				if (result == null) result = caseWorkFactory(javaResourceGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.TEXT_CONTENT_REFERENCE: {
				TextContentReference textContentReference = (TextContentReference)theEObject;
				T1 result = caseTextContentReference(textContentReference);
				if (result == null) result = caseContentReference(textContentReference);
				if (result == null) result = caseGenerator(textContentReference);
				if (result == null) result = caseWorkFactory(textContentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.STREAM_CONTENT_REFERENCE: {
				StreamContentReference streamContentReference = (StreamContentReference)theEObject;
				T1 result = caseStreamContentReference(streamContentReference);
				if (result == null) result = caseContentReference(streamContentReference);
				if (result == null) result = caseGenerator(streamContentReference);
				if (result == null) result = caseWorkFactory(streamContentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.MUSTACHE: {
				Mustache mustache = (Mustache)theEObject;
				T1 result = caseMustache(mustache);
				if (result == null) result = caseFilter(mustache);
				if (result == null) result = caseConverter(mustache);
				if (result == null) result = caseGenerator(mustache);
				if (result == null) result = caseWorkFactory(mustache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodegenPackage.ZIP_ARCHIVE: {
				ZipArchive zipArchive = (ZipArchive)theEObject;
				T1 result = caseZipArchive(zipArchive);
				if (result == null) result = caseGenerator(zipArchive);
				if (result == null) result = caseWorkFactory(zipArchive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWorkFactory(WorkFactory<T> object) {
		return null;
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
	public <T> T1 caseGenerator(Generator<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedGenerator(NamedGenerator object) {
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
	public <T> T1 caseGroup(Group<T> object) {
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
	public <C> T1 caseFile(File<C> object) {
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
	public <T extends org.nasdanika.common.resources.Resource<InputStream>> T1 caseResource(Resource<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryFile(BinaryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextFile(TextFile object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Static Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStaticText(StaticText object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ECore Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECore Model Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseECoreModelGenerator(ECoreModelGenerator object) {
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
	public <T> T1 caseContentReference(ContentReference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseConverter(Converter<S, T> object) {
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
	public <T> T1 caseFilter(Filter<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseJavaGenerator(JavaGenerator<T> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Java Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseJavaFilter(JavaFilter<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Text Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Text Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaTextFilter(JavaTextFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Stream Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Stream Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaStreamFilter(JavaStreamFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Text Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Text Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaTextGenerator(JavaTextGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Stream Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Stream Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaStreamGenerator(JavaStreamGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Resource Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Resource Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaResourceGenerator(JavaResourceGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextContentReference(TextContentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Content Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStreamContentReference(StreamContentReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Static Bytes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Bytes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStaticBytes(StaticBytes object) {
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