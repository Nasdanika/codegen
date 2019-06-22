/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Creates a zip archive from the contained resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ZipArchive#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getZipArchive()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface ZipArchive extends Generator<InputStream> {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Resource}<code>&lt;org.nasdanika.common.resources.Resource&lt;java.io.InputStream&gt;&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Folder can contain other resource generators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getZipArchive_Resources()
	 * @model type="org.nasdanika.codegen.Resource&lt;org.nasdanika.codegen.IResource&lt;org.nasdanika.codegen.InputStream&gt;&gt;" containment="true"
	 * @generated
	 */
	EList<Resource<org.nasdanika.common.resources.Resource<InputStream>>> getResources();

} // ZipArchive
