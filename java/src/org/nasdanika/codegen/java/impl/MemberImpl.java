/**
 */
package org.nasdanika.codegen.java.impl;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;
import org.nasdanika.config.Context;

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
public abstract class MemberImpl extends GeneratorImpl<String> implements Member {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;
	/**
	 * The cached value of the '{@link #getCommentGenerators() <em>Comment Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator<String>> commentGenerators;
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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> annotations;
	/**
	 * The cached value of the '{@link #getBodyGenerators() <em>Body Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator<String>> bodyGenerators;
	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeParameters;

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
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList<String>(String.class, this, JavaPackage.MEMBER__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Generator<String>> getCommentGenerators() {
		if (commentGenerators == null) {
			commentGenerators = new EObjectContainmentEList<Generator<String>>(Generator.class, this, JavaPackage.MEMBER__COMMENT_GENERATORS);
		}
		return commentGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.MEMBER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<String>(String.class, this, JavaPackage.MEMBER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Generator<String>> getBodyGenerators() {
		if (bodyGenerators == null) {
			bodyGenerators = new EObjectContainmentEList<Generator<String>>(Generator.class, this, JavaPackage.MEMBER__BODY_GENERATORS);
		}
		return bodyGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<String> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EDataTypeUniqueEList<String>(String.class, this, JavaPackage.MEMBER__TYPE_PARAMETERS);
		}
		return typeParameters;
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
				getCommentGenerators().addAll((Collection<? extends Generator<String>>)newValue);
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
				getBodyGenerators().addAll((Collection<? extends Generator<String>>)newValue);
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
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.MEMBER__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
				return commentGenerators != null && !commentGenerators.isEmpty();
			case JavaPackage.MEMBER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case JavaPackage.MEMBER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JavaPackage.MEMBER__BODY_GENERATORS:
				return bodyGenerators != null && !bodyGenerators.isEmpty();
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", modifiers: ");
		result.append(modifiers);
		result.append(", comment: ");
		result.append(comment);
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", typeParameters: ");
		result.append(typeParameters);
		result.append(')');
		return result.toString();
	}

	@Override
	protected Work<String> createWorkItem() throws Exception {
		List<Work<List<String>>> commentsWorkList = new ArrayList<>();
		for (Generator<String> cg: getCommentGenerators()) {
			commentsWorkList.add(cg.createWork());
		}
		
		List<Work<List<String>>> bodyWorkList = new ArrayList<>();
		for (Generator<String> bg: getBodyGenerators()) {
			bodyWorkList.add(bg.createWork());
		}
		
		return new Work<String>() {

			@Override
			public int size() {
				int ret = 1; 
				for (Work<List<String>> cw: commentsWorkList) {
					ret += cw.size();
				}
				for (Work<List<String>> bw: bodyWorkList) {
					ret += bw.size();
				}
				return ret; 
			}
			
			@Override
			public String execute(Context context, SubMonitor monitor) throws Exception {				
				// Comments
				StringBuilder commentBuilder = new StringBuilder("/**").append(System.lineSeparator());
				if (getComment() != null) {
					BufferedReader br = new BufferedReader(new StringReader(getComment()));
					String line;
					while ((line = br.readLine()) != null) {
						commentBuilder.append(" * ").append(line).append(System.lineSeparator());						
					}
				}
				
				for (Work<List<String>> cWork: commentsWorkList) {
					for (String e: cWork.execute(context, monitor)) {
						if (e != null) {
							BufferedReader br = new BufferedReader(new StringReader(e));
							String line;
							while ((line = br.readLine()) != null) {
								commentBuilder.append(" * ").append(line).append(System.lineSeparator());						
							}
						}
					}
				}				
				
				commentBuilder.append(" * @generated").append(System.lineSeparator());
				commentBuilder.append(" */").append(System.lineSeparator());
								
				// Annotations
				
				// Header
				
				// Body
				StringBuilder bodyBuilder = new StringBuilder();
				for (Work<List<String>> bWork: bodyWorkList) {
					for (String e: bWork.execute(context, monitor)) {
						if (e != null) {
							bodyBuilder.append(e).append(System.lineSeparator());
						}
					}
				}								
				
				return generate(context, monitor, commentBuilder.toString(), bodyBuilder.toString());
			}
			
		};
	}
	
	protected abstract String generate(Context context, SubMonitor monitor, String comment, String body) throws Exception;

} //MemberImpl
