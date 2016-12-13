/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.StaticTextImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticTextImpl extends GeneratorImpl<String> implements StaticText {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STATIC_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eGet(CodegenPackage.Literals.STATIC_TEXT__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eSet(CodegenPackage.Literals.STATIC_TEXT__CONTENT, newContent);
	}

	@Override
	public Work<String> createWorkItem() throws Exception {
		return new Work<String>() {
			
			@Override
			public int size() {
				return 1;
			}
			
			@Override
			public String execute(Context context, SubMonitor monitor) throws Exception {
				return getContent();
			}
			
		};
	}

} //StaticTextImpl
