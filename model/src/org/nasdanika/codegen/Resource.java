/**
 */
package org.nasdanika.codegen;

import org.nasdanika.ncore.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates a resource - file or container. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Resource#getReconcileAction <em>Reconcile Action</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Resource#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends ResourceGenerator, NamedElement {
	/**
	 * Returns the value of the '<em><b>Reconcile Action</b></em>' attribute.
	 * The default value is <code>"Overwrite"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ReconcileAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take if resource with given name already exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconcile Action</em>' attribute.
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see #setReconcileAction(ReconcileAction)
	 * @see org.nasdanika.codegen.CodegenPackage#getResource_ReconcileAction()
	 * @model default="Overwrite"
	 * @generated
	 */
	ReconcileAction getReconcileAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Resource#getReconcileAction <em>Reconcile Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Action</em>' attribute.
	 * @see org.nasdanika.codegen.ReconcileAction
	 * @see #getReconcileAction()
	 * @generated
	 */
	void setReconcileAction(ReconcileAction value);

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context property for a merger if reconcile action is Merge. 
	 * The property shall be either of type ${javadoc/org.nasdanika.codegen.gen.Merger} or ${javadoc/org.eclipse.emf.common.notify.AdapterFactory}. 
	 * In the latter case the factory shall be for ${javadoc/org.nasdanika.codegen.gen.Merger} type.
	 * Some resource types may have a default merger. E.g. ${ecore-doc/codegen-java/CompilationUnit} or [Container](Container.html). 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merger</em>' attribute.
	 * @see #setMerger(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getResource_Merger()
	 * @model
	 * @generated
	 */
	String getMerger();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Resource#getMerger <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' attribute.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(String value);

} // Resource
