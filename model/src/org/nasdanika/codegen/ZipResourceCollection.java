/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coolection of resources from Zip input streams.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ZipResourceCollection#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getZipResourceCollection()
 * @model
 * @generated
 */
public interface ZipResourceCollection extends ResourceCollection {
	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;java.io.InputStream&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators of zip input streams providing collection elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getZipResourceCollection_Generators()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;" containment="true" required="true"
	 * @generated
	 */
	EList<Generator<InputStream>> getGenerators();

} // ZipResourceCollection
