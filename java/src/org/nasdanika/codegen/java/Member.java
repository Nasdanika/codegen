/**
 */
package org.nasdanika.codegen.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for fields, operations, and types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.Member#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getComments <em>Comments</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.Member#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.java.JavaPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member extends ContentGenerator, NamedElement {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifiers, e.g. public final. Interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute.
	 * @see #setModifiers(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Modifiers()
	 * @model
	 * @generated
	 */
	String getModifiers();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Member#getModifiers <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiers</em>' attribute.
	 * @see #getModifiers()
	 * @generated
	 */
	void setModifiers(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment generators in addition to comment attribute content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentGenerator> getComments();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment in markdown. Interpolated and converted to HTML.
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
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotations are output between the comment and the member declaration starting with modifiers, if any. Interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Annotations()
	 * @model
	 * @generated
	 */
	String getAnnotations();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Member#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators which generate member body. For Field field initializer is considered as body.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentGenerator> getBody();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type parameters, interpolated. Can be separated with either commas or new lines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Parameters</em>' attribute.
	 * @see #setTypeParameters(String)
	 * @see org.nasdanika.codegen.java.JavaPackage#getMember_TypeParameters()
	 * @model
	 * @generated
	 */
	String getTypeParameters();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.java.Member#getTypeParameters <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' attribute.
	 * @see #getTypeParameters()
	 * @generated
	 */
	void setTypeParameters(String value);

} // Member
