/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Converter;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ConverterImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConverterImpl<S, T> extends GeneratorImpl<T> implements Converter<S, T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<S>> getGenerators() {
		return (EList<Generator<S>>)eDynamicGet(CodegenPackage.CONVERTER__GENERATORS, CodegenPackage.Literals.CONVERTER__GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.CONVERTER__GENERATORS:
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
			case CodegenPackage.CONVERTER__GENERATORS:
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
			case CodegenPackage.CONVERTER__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator<S>>)newValue);
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
			case CodegenPackage.CONVERTER__GENERATORS:
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
			case CodegenPackage.CONVERTER__GENERATORS:
				return !getGenerators().isEmpty();
		}
		return super.eIsSet(featureID);
	}
		
	@Override
	protected Work<T> createWorkItem(Context context) throws Exception {
		
		CompoundWork<T, List<S>> ret = new CompoundWork<T, List<S>>("Converter "+getTitle(), getExecutor(context)) {

			@Override
			protected T combine(List<List<S>> results, ProgressMonitor progressMonitor) throws Exception {
				List<S> wr = results.stream().reduce(new ArrayList<S>(), (a, c) -> {a.addAll(c); return a; });
				T converted = convert(context, wr, progressMonitor.split("Combining", getConverterWorkSize(), ConverterImpl.this));
				return converted;
			}
			
		};

		for (Generator<S> g: getGenerators()) {
			ret.add(g.create(context));
		}
		
		return ret;
		
	}
	
	protected abstract int getConverterWorkSize();
		
	/**
	 * Combines and filters generation results
	 * @param generatorResult
	 * @return
	 * @throws Exception
	 */
	protected abstract T convert(Context context, List<S> generationResult, ProgressMonitor subMonitor) throws Exception;


} //ConverterImpl
