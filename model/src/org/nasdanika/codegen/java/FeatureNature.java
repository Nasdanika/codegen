/**
 */
package org.nasdanika.codegen.java;

import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Nature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Nature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feature nature. Generates feature.xml and build.properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.FeatureNature#getFeatureXmlGenerator <em>Feature Xml Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.FeatureNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getFeatureNature()
 * @model
 * @generated
 */
public interface FeatureNature extends Nature {
	/**
	 * Returns the value of the '<em><b>Feature Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates MANIFEST.MF file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Xml Generator</em>' containment reference.
	 * @see #setFeatureXmlGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getFeatureNature_FeatureXmlGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true" required="true"
	 * @generated
	 */
	Generator<String> getFeatureXmlGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.FeatureNature#getFeatureXmlGenerator <em>Feature Xml Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Xml Generator</em>' containment reference.
	 * @see #getFeatureXmlGenerator()
	 * @generated
	 */
	void setFeatureXmlGenerator(Generator<String> value);

	/**
	 * Returns the value of the '<em><b>Build Properties Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates build.properties file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build Properties Generator</em>' containment reference.
	 * @see #setBuildPropertiesGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getFeatureNature_BuildPropertiesGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true" required="true"
	 * @generated
	 */
	Generator<String> getBuildPropertiesGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.FeatureNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Properties Generator</em>' containment reference.
	 * @see #getBuildPropertiesGenerator()
	 * @generated
	 */
	void setBuildPropertiesGenerator(Generator<String> value);

} // FeatureNature
