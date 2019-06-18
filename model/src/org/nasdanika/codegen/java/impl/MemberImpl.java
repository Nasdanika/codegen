/**
 */
package org.nasdanika.codegen.java.impl;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
	public String getName() {
		return (String)eGet(JavaPackage.Literals.MEMBER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JavaPackage.Literals.MEMBER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getModifiers() {
		return (EList<String>)eGet(JavaPackage.Literals.MEMBER__MODIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generator<String>> getCommentGenerators() {
		return (EList<Generator<String>>)eGet(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eGet(JavaPackage.Literals.MEMBER__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eSet(JavaPackage.Literals.MEMBER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getAnnotations() {
		return (EList<String>)eGet(JavaPackage.Literals.MEMBER__ANNOTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generator<String>> getBodyGenerators() {
		return (EList<Generator<String>>)eGet(JavaPackage.Literals.MEMBER__BODY_GENERATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTypeParameters() {
		return (EList<String>)eGet(JavaPackage.Literals.MEMBER__TYPE_PARAMETERS, true);
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
