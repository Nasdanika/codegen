/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.GroupController;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

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
public class GroupImpl<T> extends GeneratorImpl<List<T>> implements Group<T> {
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
	public Work<List<T>> createWorkItem() throws Exception {
		Map<Generator<?>, Work<List<T>>> workMap = new HashMap<>();
		int[] allSize = { 1 };
		for (Generator<T> e: getElements()) {
			Work<List<T>> ew = e.createWork();
			workMap.put(e, ew);
			allSize[0] += ew.size();
		}
		
		return new Work<List<T>>() {

			@Override
			public int size() {
				return allSize[0];
			}

			@Override
			public List<T> execute(Context context, SubMonitor monitor) throws Exception {
				List<T> ret = new ArrayList<>();
				
				for (Entry<Generator<?>, Work<List<T>>> we: workMap.entrySet()) {
					Context elementContext = context;

					if (getController() != null && getController().trim().length() != 0) {
						@SuppressWarnings("unchecked")
						GroupController<T, Group<T>> controller = (GroupController<T, Group<T>>) context.getClassLoader().loadClass(getController().trim()).newInstance();
						elementContext = controller.select(GroupImpl.this, we.getKey(), elementContext);
						if (elementContext == null) {
							monitor.worked(we.getValue().size());
							continue;
						}
					}
										
					List<T> r = we.getValue().execute(configureElementContext(elementContext), monitor);
					if (r != null) {
						ret.addAll(r);
					}
				}				
				return ret;
			}
		};
	}
	
	/**
	 * Subclasses can override to customize elements context.
	 * @param elementContext
	 * @return
	 */
	protected Context configureElementContext(Context elementContext) {
		return elementContext;
	}

} //GroupImpl
