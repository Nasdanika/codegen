/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource collection adds zero or more resources to the containing resource container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes <em>Interpolation Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes <em>Interpolation Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getInterpolationCharset <em>Interpolation Charset</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getReconcileAction <em>Reconcile Action</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getMergerArguments <em>Merger Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection()
 * @model abstract="true" superTypes="org.nasdanika.codegen.ResourceGenerator&lt;org.nasdanika.codegen.BinaryResource&gt;"
 * @generated
 */
public interface ResourceCollection extends ResourceGenerator<BinaryResource> {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path in the underlying container to use as a source of collection elements. Path prefix is removed from element name. E.g. if path is ``images`` and there is a resource named ``images/logo.png`` then there will be a collection element ``logo.png``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix to add to resource paths. E.g. if the prefix is ``gen_`` then ``logo.png`` will be added to the resource container as ``gen_logo.png``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Ant path patterns specifying resources to include into the collection.
	 * All resources are includes if the includes list is empty.
	 * 
	 * ## Matching rules
	 * 
	 * * `?` matches one character
	 * * `*` matches zero or more characters
	 * * `**` matches zero or more **directories** in a path
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Includes()
	 * @model
	 * @generated
	 */
	EList<String> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Ant path patterns specifying resources to exclude from the collection. Nothing is excluded if this list is empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excludes</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Excludes()
	 * @model
	 * @generated
	 */
	EList<String> getExcludes();

	/**
	 * Returns the value of the '<em><b>Interpolation Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Ant patterns specifying which included resources shall be interpolated. E.g. if ``includes`` contains ``*.bin`` and ``*.txt`` and ``interpolationIncludes`` contains ``*.txt`` then only text files will be interpolated. Unlike ``includes``, if this list is empty then nothing gets interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Includes</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_InterpolationIncludes()
	 * @model
	 * @generated
	 */
	EList<String> getInterpolationIncludes();

	/**
	 * Returns the value of the '<em><b>Interpolation Excludes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Ant path patterns specifying which resources shall be excluded from interpolation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Excludes</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_InterpolationExcludes()
	 * @model
	 * @generated
	 */
	EList<String> getInterpolationExcludes();

	/**
	 * Returns the value of the '<em><b>Interpolation Charset</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Charset to use when reading/writing resources for interpolation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Charset</em>' attribute.
	 * @see #setInterpolationCharset(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_InterpolationCharset()
	 * @model default=""
	 * @generated
	 */
	String getInterpolationCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationCharset <em>Interpolation Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation Charset</em>' attribute.
	 * @see #getInterpolationCharset()
	 * @generated
	 */
	void setInterpolationCharset(String value);

	/**
	 * Returns the value of the '<em><b>Reconcile Action</b></em>' attribute.
	 * The default value is <code>"Overwrite"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ReconcileAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take if resources (entities) contributed by the collection already exist in the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconcile Action</em>' attribute.
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see #setReconcileAction(ReconcileAction)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_ReconcileAction()
	 * @model default="Overwrite"
	 * @generated
	 */
	ReconcileAction getReconcileAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getReconcileAction <em>Reconcile Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Action</em>' attribute.
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see #getReconcileAction()
	 * @generated
	 */
	void setReconcileAction(ReconcileAction value);

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If reconcile action is ``Merge`` then merger gets instantiated to merge existing and new
	 * content of the file. The merger class shall implement ``org.nasdanika.codegen.Merger<T>`` 
	 * where ``T`` is ``String`` for text files and ``InputStream`` for binary files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger</em>' attribute.
	 * @see #setMerger(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Merger()
	 * @model annotation="org.nasdanika.ui.java-class root-type='org.nasdanika.codegen.Merger' super-interfaces='org.nasdanika.codegen.Merger'"
	 * @generated
	 */
	String getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getMerger <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' attribute.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(String value);

	/**
	 * Returns the value of the '<em><b>Merger Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Merger constructor arguments. Codegen uses the first constructor with the matching number of parameters.
	 * 
	 * String argument values are interpolated by the context and then are converted to 
	 * the constructor parameter types using ``Converter`` service obtained from the context
	 * or ``DefaultConverter.INSTANCE`` if there is no converter service. 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger Arguments</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_MergerArguments()
	 * @model
	 * @generated
	 */
	EList<String> getMergerArguments();

} // ResourceCollection
