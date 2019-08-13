/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ContainerImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ResourceImpl<org.nasdanika.common.resources.Container<InputStream>> implements org.nasdanika.codegen.Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator<Resource<InputStream>>> getChildren() {
		return (EList<Generator<Resource<InputStream>>>)eDynamicGet(CodegenPackage.CONTAINER__CHILDREN, CodegenPackage.Literals.CONTAINER__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.CONTAINER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.CONTAINER__CHILDREN:
				return getChildren();
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
			case CodegenPackage.CONTAINER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Generator<Resource<InputStream>>>)newValue);
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
			case CodegenPackage.CONTAINER__CHILDREN:
				getChildren().clear();
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
			case CodegenPackage.CONTAINER__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Work<org.nasdanika.common.resources.Container<InputStream>> createWorkItem(Context context) throws Exception {
		@SuppressWarnings("unchecked")
		org.nasdanika.common.resources.Container<InputStream> parent = context.get(org.nasdanika.common.resources.Container.class);
		String name = finalName(context.interpolate(ContainerImpl.this.getName()));
		
		org.nasdanika.common.resources.Container<InputStream> container = parent.getContainer(name);
		boolean existedBeforGeneration = container.exists();
		
		CompoundWork<org.nasdanika.common.resources.Container<InputStream>, List<org.nasdanika.common.resources.Resource<InputStream>>> ret = new CompoundWork<org.nasdanika.common.resources.Container<InputStream>, List<org.nasdanika.common.resources.Resource<InputStream>>>(getTitle(), getExecutor(context)) {
			
			@Override
			public org.nasdanika.common.resources.Container<InputStream> execute(ProgressMonitor progressMonitor) throws Exception {
				
				if (container.exists()) {
					switch (getReconcileAction()) {
					case APPEND:
					case MERGE:
						// Append new things to existing.
						break;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - folder already exists: "+name);
					case KEEP:
						// Take no action
						return container;
					case OVERWRITE:
						@SuppressWarnings("unchecked") Predicate<Object> overwritePredicate = (Predicate<Object>) context.get(ReconcileAction.OVERWRITE_PREDICATE_CONTEXT_PROPERTY_NAME);
						if (overwritePredicate == null || overwritePredicate.test(container)) {
							container.delete(progressMonitor);
						}
						break;
					default:
						throw new IllegalStateException("Unsupported reconcile action: "+getReconcileAction());
					}
				}
				
				return super.execute(progressMonitor);
			}
			
			@Override
			protected org.nasdanika.common.resources.Container<InputStream> combine(List<List<Resource<InputStream>>> results, ProgressMonitor progressMonitor) throws Exception {
				return container;				
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				// TODO - delete the container if it did not exist.
				return super.undo(progressMonitor);
			}
		};
		
		MutableContext sc = context.fork();
		sc.register(org.nasdanika.common.resources.Container.class, container);
		
		for (Generator<Resource<InputStream>> child: getChildren()) {
			ret.add(child.createWork(context));
		}
		
		return ret;
	}

} //ContainerImpl
