/**
 */
package org.nasdanika.codegen;

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
 *   <li>{@link org.nasdanika.codegen.ZipResourceCollection#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getZipResourceCollection()
 * @model
 * @generated
 */
public interface ZipResourceCollection extends ResourceCollection {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators of zip input streams providing collection elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getZipResourceCollection_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContentGenerator> getContent();

} // ZipResourceCollection
