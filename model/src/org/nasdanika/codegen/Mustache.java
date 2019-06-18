/**
 */
package org.nasdanika.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mustache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluates template using Mustache for Java (https://github.com/spullara/mustache.java) with contexts bridged to Map scope.
 * 
 * Import manager and Java Expression Evaluator are functions and as such 
 * can be invoked using {{#func}}...{{/func}} syntax, e.g. {{#import}}java.io.InputStream{{/import}}.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.codegen.CodegenPackage#getMustache()
 * @model superTypes="org.nasdanika.codegen.Filter&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface Mustache extends Filter<String> {
} // Mustache
