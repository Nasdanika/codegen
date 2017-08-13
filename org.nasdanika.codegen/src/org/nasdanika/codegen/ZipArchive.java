/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.nasdanika.config.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zip archive extracts its entries into its container. If zip archive name is not empty, it is used as a prefix for entry names. / separator is added at the end of the archive name if it doesn't already end with /
 * Zip archive reconcile action is applied to all entries and merger is applied to all files.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ZipArchive#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ZipArchive#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getZipArchive()
 * @model superTypes="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IContainer&gt;"
 * @generated
 */
public interface ZipArchive extends Resource<IContainer> {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(Generator)
	 * @see org.nasdanika.codegen.CodegenPackage#getZipArchive_Generator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;" containment="true" required="true"
	 * @generated
	 */
	Generator<InputStream> getGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ZipArchive#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator<InputStream> value);

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
	 * @see org.nasdanika.codegen.CodegenPackage#getZipArchive_Merger()
	 * @model containment="true"
	 * @generated
	 */
	Service getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ZipArchive#getMerger <em>Merger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' containment reference.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Service value);

} // ZipArchive
