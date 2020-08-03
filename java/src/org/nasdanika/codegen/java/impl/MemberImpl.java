/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getCommentGenerators <em>Comment Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getBodyGenerators <em>Body Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.MemberImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends GeneratorImpl implements Member {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(JavaPackage.MEMBER__NAME, JavaPackage.Literals.MEMBER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(JavaPackage.MEMBER__NAME, JavaPackage.Literals.MEMBER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getModifiers() {
		return (EList<String>)eDynamicGet(JavaPackage.MEMBER__MODIFIERS, JavaPackage.Literals.MEMBER__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Generator> getCommentGenerators() {
		return (EList<Generator>)eDynamicGet(JavaPackage.MEMBER__COMMENT_GENERATORS, JavaPackage.Literals.MEMBER__COMMENT_GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(JavaPackage.MEMBER__COMMENT, JavaPackage.Literals.MEMBER__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(JavaPackage.MEMBER__COMMENT, JavaPackage.Literals.MEMBER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getAnnotations() {
		return (EList<String>)eDynamicGet(JavaPackage.MEMBER__ANNOTATIONS, JavaPackage.Literals.MEMBER__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Generator> getBodyGenerators() {
		return (EList<Generator>)eDynamicGet(JavaPackage.MEMBER__BODY_GENERATORS, JavaPackage.Literals.MEMBER__BODY_GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getTypeParameters() {
		return (EList<String>)eDynamicGet(JavaPackage.MEMBER__TYPE_PARAMETERS, JavaPackage.Literals.MEMBER__TYPE_PARAMETERS, true, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				return ((InternalEList<?>)getCommentGenerators()).basicRemove(otherEnd, msgs);
			case JavaPackage.MEMBER__BODY_GENERATORS:
				return ((InternalEList<?>)getBodyGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.MEMBER__NAME:
				return getName();
			case JavaPackage.MEMBER__MODIFIERS:
				return getModifiers();
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				return getCommentGenerators();
			case JavaPackage.MEMBER__COMMENT:
				return getComment();
			case JavaPackage.MEMBER__ANNOTATIONS:
				return getAnnotations();
			case JavaPackage.MEMBER__BODY_GENERATORS:
				return getBodyGenerators();
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				return getTypeParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.MEMBER__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				getCommentGenerators().clear();
				getCommentGenerators().addAll((Collection<? extends Generator>)newValue);
				return;
			case JavaPackage.MEMBER__COMMENT:
				setComment((String)newValue);
				return;
			case JavaPackage.MEMBER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.MEMBER__BODY_GENERATORS:
				getBodyGenerators().clear();
				getBodyGenerators().addAll((Collection<? extends Generator>)newValue);
				return;
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				return;
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				getCommentGenerators().clear();
				return;
			case JavaPackage.MEMBER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JavaPackage.MEMBER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JavaPackage.MEMBER__BODY_GENERATORS:
				getBodyGenerators().clear();
				return;
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.MEMBER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JavaPackage.MEMBER__MODIFIERS:
				return !getModifiers().isEmpty();
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				return !getCommentGenerators().isEmpty();
			case JavaPackage.MEMBER__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case JavaPackage.MEMBER__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case JavaPackage.MEMBER__BODY_GENERATORS:
				return !getBodyGenerators().isEmpty();
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
