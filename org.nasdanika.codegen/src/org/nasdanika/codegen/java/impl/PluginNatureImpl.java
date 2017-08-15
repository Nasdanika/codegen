/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.core.resources.IProjectNature;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.NatureImpl;

import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PluginNature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getManifestGenerator <em>Manifest Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getBuildPropertiesGenerator <em>Build Properties Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getPluginXmlGenerator <em>Plugin Xml Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getFragmentXmlGenerator <em>Fragment Xml Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginNatureImpl extends NatureImpl implements PluginNature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginNatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PLUGIN_NATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getManifestGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__MANIFEST_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestGenerator(Generator<String> newManifestGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__MANIFEST_GENERATOR, newManifestGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getBuildPropertiesGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildPropertiesGenerator(Generator<String> newBuildPropertiesGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR, newBuildPropertiesGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getPluginXmlGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__PLUGIN_XML_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginXmlGenerator(Generator<String> newPluginXmlGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__PLUGIN_XML_GENERATOR, newPluginXmlGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getFragmentXmlGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__FRAGMENT_XML_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragmentXmlGenerator(Generator<String> newFragmentXmlGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__FRAGMENT_XML_GENERATOR, newFragmentXmlGenerator);
	}

	@Override
	protected Work<IProjectNature> createWorkItem() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

} //PluginNatureImpl
