/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.NamedGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common._legacy.CompoundSupplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.NamedGeneratorImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedGeneratorImpl extends AbstractNamedGeneratorImpl implements NamedGenerator {
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<String>> getGenerators() {
		return (EList<Generator<String>>)eDynamicGet(CodegenPackage.NAMED_GENERATOR__GENERATORS, CodegenPackage.Literals.NAMED_GENERATOR__GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
				return getGenerators();
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
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator<String>>)newValue);
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
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
				getGenerators().clear();
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
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
				return !getGenerators().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<String> createWork(Context context) throws Exception {		
		return new CompoundSupplier<String, List<String>>(getName(), context.get(Executor.class)) {
			
			@Override
			protected String combine(List<List<String>> results, ProgressMonitor progressMonitor) throws Exception {
				StringBuilder sb = new StringBuilder();
				results.forEach(list -> list.forEach(sb::append));
				return sb.toString();
			}
			
		};
	}

} //NamedGeneratorImpl
