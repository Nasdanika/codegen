/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Descriptors are used to specify inputs used by generators. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Descriptor#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Descriptor#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Descriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Descriptor#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface Descriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getDescriptor_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Descriptor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getDescriptor_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Descriptor#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Descriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not blank the predicate shall be a Java expression evaluating to boolean. 
	 * If it evaluates to false then not input is needed from this descriptor. 
	 * 
	 * The predicate expression has access to ``context`` variable. Use ``context.get()`` for retrieval of values from the context.
	 * 
	 * The predicate expression is interpolated with the context, so another way to access context properties is to use tokens. 
	 * For example ``context.get("my-property") > 0`` and ``${my-property} > 0`` are equivalent. 
	 * To safely handle the case ``my-property`` not being set  a property default value may be used in the second option ``${my-property|0} > 0``.
	 * 
	 * For more advanced control over execution use controller.
	 * 
	 * Descriptor predicate is logically AND-ed with the containing generator predicate. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getDescriptor_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Descriptor#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

} // Descriptor
