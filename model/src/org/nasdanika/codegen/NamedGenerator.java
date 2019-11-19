/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class allows to mount generators to the parent generator context as property computers accessible by name. It can be used for conditional invocation of named
 * generators by the containing generator. context.get(generatorName) returns results of executing Supplier created by the generator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.NamedGenerator#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator()
 * @model
 * @generated
 */
public interface NamedGenerator extends AbstractNamedGenerator {
	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;java.lang.String&gt;</code>.
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
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getNamedGenerator_Generators()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true" required="true"
	 * @generated
	 */
	EList<Generator<String>> getGenerators();

} // NamedGenerator
