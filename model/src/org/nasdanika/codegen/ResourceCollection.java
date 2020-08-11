/**
 */
package org.nasdanika.codegen;

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
 *   <li>{@link org.nasdanika.codegen.ResourceCollection#getReconcileAction <em>Reconcile Action</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection()
 * @model abstract="true"
 * @generated
 */
public interface ResourceCollection extends ResourceGenerator {
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
	 * Returns the value of the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying resources to include into the collection.
	 * Each pattern on a new line.
	 * All resources are included if the includes list is empty.
	 * 
	 * ## Matching rules
	 * 
	 * * `?` matches one character
	 * * `*` matches zero or more characters
	 * * `**` matches zero or more **directories** in a path
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' attribute.
	 * @see #setIncludes(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Includes()
	 * @model
	 * @generated
	 */
	String getIncludes();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getIncludes <em>Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes</em>' attribute.
	 * @see #getIncludes()
	 * @generated
	 */
	void setIncludes(String value);

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying resources to exclude from the collection. 
	 * Each pattern on a new line.
	 * Nothing is excluded if this list is empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excludes</em>' attribute.
	 * @see #setExcludes(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_Excludes()
	 * @model
	 * @generated
	 */
	String getExcludes();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getExcludes <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excludes</em>' attribute.
	 * @see #getExcludes()
	 * @generated
	 */
	void setExcludes(String value);

	/**
	 * Returns the value of the '<em><b>Interpolation Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying which included resources shall be interpolated. 
	 * Each pattern on a new line.
	 * E.g. if ``includes`` contains ``*.bin`` and ``*.txt`` and ``interpolationIncludes`` contains ``*.txt`` then only text files will be interpolated. 
	 * Unlike ``includes``, if this list is empty then nothing gets interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Includes</em>' attribute.
	 * @see #setInterpolationIncludes(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_InterpolationIncludes()
	 * @model
	 * @generated
	 */
	String getInterpolationIncludes();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationIncludes <em>Interpolation Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation Includes</em>' attribute.
	 * @see #getInterpolationIncludes()
	 * @generated
	 */
	void setInterpolationIncludes(String value);

	/**
	 * Returns the value of the '<em><b>Interpolation Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of [Ant path patterns](https://ant.apache.org/manual/dirtasks.html) specifying which resources shall be excluded from interpolation.
	 * Each pattern on a new line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Excludes</em>' attribute.
	 * @see #setInterpolationExcludes(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceCollection_InterpolationExcludes()
	 * @model
	 * @generated
	 */
	String getInterpolationExcludes();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceCollection#getInterpolationExcludes <em>Interpolation Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation Excludes</em>' attribute.
	 * @see #getInterpolationExcludes()
	 * @generated
	 */
	void setInterpolationExcludes(String value);

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

} // ResourceCollection
