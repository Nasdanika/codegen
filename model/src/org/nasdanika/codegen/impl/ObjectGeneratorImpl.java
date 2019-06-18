/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ObjectGenerator;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ObjectGeneratorImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectGeneratorImpl<T> extends GeneratorImpl<T> implements ObjectGenerator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.OBJECT_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDelegate() {
		return (Object)eGet(CodegenPackage.Literals.OBJECT_GENERATOR__DELEGATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Object newDelegate) {
		eSet(CodegenPackage.Literals.OBJECT_GENERATOR__DELEGATE, newDelegate);
	}
	
	@SuppressWarnings("unchecked")
	protected Work<T> createWorkItem() throws Exception {
		return (Work<T>) getDelegate();
		
	};

} //ObjectGeneratorImpl
