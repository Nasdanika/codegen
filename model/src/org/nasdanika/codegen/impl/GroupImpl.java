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
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.GroupController;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GroupImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GroupImpl<T> extends GeneratorImpl<T> implements Group<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<T>> getElements() {
		return (EList<Generator<T>>)eDynamicGet(CodegenPackage.GROUP__ELEMENTS, CodegenPackage.Literals.GROUP__ELEMENTS, true, true);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GROUP__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.GROUP__ELEMENTS:
				return getElements();
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
			case CodegenPackage.GROUP__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Generator<T>>)newValue);
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
			case CodegenPackage.GROUP__ELEMENTS:
				getElements().clear();
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
			case CodegenPackage.GROUP__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Work<T> createWorkItem(Context context) throws Exception {
		
		CompoundWork<T, List<T>> ret = new CompoundWork<T, List<T>>(getTitle(), getExecutor(context)) {
			
			@Override
			protected T combine(List<List<T>> results, ProgressMonitor monitor) {
				List<T> all = results.stream().reduce(new ArrayList<T>(), (i, r) -> {
					i.addAll(r);
					return i;
				});
				
				return GroupImpl.this.join(all);
			}
			
		};
		
		@SuppressWarnings("unchecked")
		GroupController<T, Group<T>> controller = (GroupController<T, Group<T>>) instantiate(context, getController());
		
		for (Generator<T> e: getElements()) {
			Context elementContext = controller == null ? context : controller.select(GroupImpl.this, e, context);
			if (elementContext != null) {
				ret.add(e.createWork(elementContext));
			}
		}

		return ret;
	}

	/**
	 * Joins content producing elements.
	 * @param ret
	 * @return
	 */
	protected abstract T join(List<T> elementResults);

	/**
	 * Subclasses can override to customize elements context.
	 * @param elementContext
	 * @return
	 */
	protected Context configureElementContext(Context elementContext) {
		return elementContext;
	}

} //GroupImpl
