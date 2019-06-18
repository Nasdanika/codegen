/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.codegen.Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Member#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getCommentGenerators <em>Comment Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getBodyGenerators <em>Body Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getMember()
 * @model abstract="true" superTypes="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface Member extends Generator<String> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Member name, not applicable to constructors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifiers, e.g. public final. Interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Modifiers()
	 * @model
	 * @generated
	 */
	EList<String> getModifiers();

	/**
	 * Returns the value of the '<em><b>Comment Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment generators in addition to comment attribute content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_CommentGenerators()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true"
	 * @generated
	 */
	EList<Generator<String>> getCommentGenerators();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment. Interpolated. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Member#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotations are output between the comment and the member declaration starting with modifiers, if any. Interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Annotations()
	 * @model
	 * @generated
	 */
	EList<String> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Body Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Generator}<code>&lt;java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators which generate member body. For Field field initializer is considered as body.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_BodyGenerators()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.eclipse.emf.ecore.EString&gt;" containment="true"
	 * @generated
	 */
	EList<Generator<String>> getBodyGenerators();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type parameters, interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Parameters</em>' attribute list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_TypeParameters()
	 * @model
	 * @generated
	 */
	EList<String> getTypeParameters();

} // Member
