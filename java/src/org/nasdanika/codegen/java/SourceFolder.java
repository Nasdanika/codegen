/**
 */
package org.nasdanika.codegen.java;

import org.nasdanika.codegen.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source folder contains packages.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.SourceFolder#getJdkLevel <em>Jdk Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getSourceFolder()
 * @model
 * @generated
 */
public interface SourceFolder extends Container {

	/**
	 * Returns the value of the '<em><b>Jdk Level</b></em>' attribute.
	 * The default value is <code>"1.8"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.java.JDKLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdk Level</em>' attribute.
	 * @see org.nasdanika.codegen.java.JDKLevel
	 * @see #setJdkLevel(JDKLevel)
	 * @see org.nasdanika.codegen.java.JavaPackage#getSourceFolder_JdkLevel()
	 * @model default="1.8"
	 * @generated
	 */
	JDKLevel getJdkLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.SourceFolder#getJdkLevel <em>Jdk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdk Level</em>' attribute.
	 * @see org.nasdanika.codegen.java.JDKLevel
	 * @see #getJdkLevel()
	 * @generated
	 */
	void setJdkLevel(JDKLevel value);

} // PackageFragmentRoot
