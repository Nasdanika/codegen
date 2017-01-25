/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class allows to mount generators to the parent generator context as property providers
 * accessible by name. It can be used for conditional invocation of named
 * generators by the containing generator. context.get(generatorName) returns Work created by contained generator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.NamedGenerator#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.NamedGenerator#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.NamedGenerator#isExecuteWork <em>Execute Work</em>}</li>
 *   <li>{@link org.nasdanika.codegen.NamedGenerator#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface NamedGenerator extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.NamedGenerator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The generator addressed by name.
	 * 
	 * The generator shall be parameterized with EJavaObject, but due to a bug - https://bugs.eclipse.org/bugs/show_bug.cgi?id=510914 - it is now restricted to String generators.
	 * The generic parameter shall be changed to EObject once the bug is fixed.
	 * 	
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(Generator)
	 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator_Generator()
	 * @model type="org.nasdanika.codegen.Generator<org.eclipse.emf.ecore.EString>" containment="true" required="true"
	 * @generated
	 */
	Generator<String> getGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.NamedGenerator#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator<String> value);

	/**
	 * Returns the value of the '<em><b>Execute Work</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true (default), then the work created by contained generator is executed and 
	 * the work execution result is injected into the container context. If false, then the
	 * work per-se is injected into the container generator context and it is up to the container
	 * generator to execute it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execute Work</em>' attribute.
	 * @see #setExecuteWork(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator_ExecuteWork()
	 * @model default="true"
	 * @generated
	 */
	boolean isExecuteWork();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.NamedGenerator#isExecuteWork <em>Execute Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Work</em>' attribute.
	 * @see #isExecuteWork()
	 * @generated
	 */
	void setExecuteWork(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.NamedGenerator#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // NamedGenerator
