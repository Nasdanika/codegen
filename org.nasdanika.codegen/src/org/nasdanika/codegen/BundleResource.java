/**
 */
package org.nasdanika.codegen;

import org.eclipse.core.resources.IContainer;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.config.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bundle resource copies entries matching the paths into its container. If bundle resource name is not empty, it is used as a prefix for entry names. / separator is added at the end of the bundle resource name if it doesn't already end with /
 * Bundle resource reconcile action is applied to all entries and merger is applied to all files.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.BundleResource#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.BundleResource#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.nasdanika.codegen.BundleResource#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getBundleResource()
 * @model superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IContainer&gt;"
 * @generated
 */
public interface BundleResource extends Resource<IContainer> {
	/**
	 * Returns the value of the '<em><b>Merger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If reconcile action is ``Merge`` then merger gets instantiated to merge existing and new
	 * content file entries. The merger class shall implement ``org.nasdanika.codegen.Merger<InputStream>``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger</em>' containment reference.
	 * @see #setMerger(Service)
	 * @see org.nasdanika.codegen.CodegenPackage#getBundleResource_Merger()
	 * @model containment="true"
	 * @generated
	 */
	Service getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.BundleResource#getMerger <em>Merger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' containment reference.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Service value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source bundle symbolic name, interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' attribute.
	 * @see #setBundle(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getBundleResource_Bundle()
	 * @model required="true"
	 * @generated
	 */
	String getBundle();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.BundleResource#getBundle <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' attribute.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paths to match, interpolated. If path ends with / it means a directory and all resources from that directory match.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getBundleResource_Paths()
	 * @model
	 * @generated
	 */
	EList<String> getPaths();

} // BundleResource
