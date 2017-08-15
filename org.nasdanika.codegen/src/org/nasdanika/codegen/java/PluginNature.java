/**
 */
package org.nasdanika.codegen.java;

import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Nature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Nature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Java nature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.PluginNature#getManifestGenerator <em>Manifest Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.PluginNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.PluginNature#getPluginXmlGenerator <em>Plugin Xml Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.PluginNature#getFragmentXmlGenerator <em>Fragment Xml Generator</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getPluginNature()
 * @model
 * @generated
 */
public interface PluginNature extends Nature {
	/**
	 * Returns the value of the '<em><b>Manifest Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates MANIFEST.MF file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Generator</em>' containment reference.
	 * @see #setManifestGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getPluginNature_ManifestGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true" required="true"
	 * @generated
	 */
	Generator<String> getManifestGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.PluginNature#getManifestGenerator <em>Manifest Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Generator</em>' containment reference.
	 * @see #getManifestGenerator()
	 * @generated
	 */
	void setManifestGenerator(Generator<String> value);

	/**
	 * Returns the value of the '<em><b>Build Properties Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates build.properties file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build Properties Generator</em>' containment reference.
	 * @see #setBuildPropertiesGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getPluginNature_BuildPropertiesGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true" required="true"
	 * @generated
	 */
	Generator<String> getBuildPropertiesGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.PluginNature#getBuildPropertiesGenerator <em>Build Properties Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Properties Generator</em>' containment reference.
	 * @see #getBuildPropertiesGenerator()
	 * @generated
	 */
	void setBuildPropertiesGenerator(Generator<String> value);

	/**
	 * Returns the value of the '<em><b>Plugin Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional generator of ``plugin.xml`` file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugin Xml Generator</em>' containment reference.
	 * @see #setPluginXmlGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getPluginNature_PluginXmlGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true"
	 * @generated
	 */
	Generator<String> getPluginXmlGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.PluginNature#getPluginXmlGenerator <em>Plugin Xml Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Xml Generator</em>' containment reference.
	 * @see #getPluginXmlGenerator()
	 * @generated
	 */
	void setPluginXmlGenerator(Generator<String> value);

	/**
	 * Returns the value of the '<em><b>Fragment Xml Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional generator of ``fragment.xml`` file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment Xml Generator</em>' containment reference.
	 * @see #setFragmentXmlGenerator(Generator)
	 * @see org.nasdanika.codegen.java.JavaPackage#getPluginNature_FragmentXmlGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true"
	 * @generated
	 */
	Generator<String> getFragmentXmlGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.PluginNature#getFragmentXmlGenerator <em>Fragment Xml Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Xml Generator</em>' containment reference.
	 * @see #getFragmentXmlGenerator()
	 * @generated
	 */
	void setFragmentXmlGenerator(Generator<String> value);

} // PluginNature
