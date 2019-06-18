/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.NamedGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#isExecuteWork <em>Execute Work</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedGeneratorImpl extends CDOObjectImpl implements NamedGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.NAMED_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CodegenPackage.Literals.NAMED_GENERATOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CodegenPackage.Literals.NAMED_GENERATOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getGenerator() {
		return (Generator<String>)eGet(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<String> newGenerator) {
		eSet(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecuteWork() {
		return (Boolean)eGet(CodegenPackage.Literals.NAMED_GENERATOR__EXECUTE_WORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteWork(boolean newExecuteWork) {
		eSet(CodegenPackage.Literals.NAMED_GENERATOR__EXECUTE_WORK, newExecuteWork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(CodegenPackage.Literals.NAMED_GENERATOR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(CodegenPackage.Literals.NAMED_GENERATOR__DESCRIPTION, newDescription);
	}

} //NamedGeneratorImpl
