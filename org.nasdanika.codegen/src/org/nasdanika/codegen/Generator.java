/**
 */
package org.nasdanika.codegen;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.config.Configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generator is the base class for model element performing code generation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Generator#getController <em>Controller</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getNamedGenerators <em>Named Generators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGenerator()
 * @model abstract="true" superTypes="org.nasdanika.config.Configuration org.nasdanika.codegen.WorkFactory<org.nasdanika.codegen.List<T>>"
 * @generated
 */
public interface Generator<T> extends Configuration, WorkFactory<List<T>> {

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator controller class. Must implement org.nasdanika.codegen.GeneratorController
	 * for generators and org.nasdanika.codegen.GroupController for groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Controller()
	 * @model annotation="org.nasdanika.ui.java-class root-type='org.nasdanika.codegen.GeneratorController' super-interfaces='org.nasdanika.codegen.GeneratorController'"
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Named Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.NamedGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Generators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_NamedGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedGenerator> getNamedGenerators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource generators shall return true from this method, e.g.:
	 * 
	 * * Project, 
	 * * File, 
	 * * Folder, 
	 * * Package fragment (root)
	 * * Compilation unit.
	 * * Zip Archive
	 * 
	 * Generators which do not create workspace resources but rather contribute to their creation shall return false.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFilterable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Generator
