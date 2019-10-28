/**
 */
package org.nasdanika.codegen.impl;

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
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceContainer;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ContainerImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ResourceImpl<BinaryEntityContainer> implements org.nasdanika.codegen.Container {
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
	public EList<ResourceGenerator<BinaryResource>> getElements() {
		return (EList<ResourceGenerator<BinaryResource>>)eDynamicGet(CodegenPackage.CONTAINER__ELEMENTS, CodegenPackage.Literals.RESOURCE_CONTAINER__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.CONTAINER__ELEMENTS:
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
			case CodegenPackage.CONTAINER__ELEMENTS:
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
			case CodegenPackage.CONTAINER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ResourceGenerator<BinaryResource>>)newValue);
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
			case CodegenPackage.CONTAINER__ELEMENTS:
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
			case CodegenPackage.CONTAINER__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceContainer.class) {
			switch (derivedFeatureID) {
				case CodegenPackage.CONTAINER__ELEMENTS: return CodegenPackage.RESOURCE_CONTAINER__ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceContainer.class) {
			switch (baseFeatureID) {
				case CodegenPackage.RESOURCE_CONTAINER__ELEMENTS: return CodegenPackage.CONTAINER__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	protected Work<BinaryEntityContainer> createWorkItem(Context context) throws Exception {
		String name = finalName(context.interpolate(ContainerImpl.this.getName()));
		
		// This context is used by children. Binary container created by the command shall be registered with this context before executing child commands.
		MutableContext childrenContext = context.fork();
		
		CompoundWork<BinaryEntityContainer, List<BinaryResource>> ret = new CompoundWork<BinaryEntityContainer, List<BinaryResource>>(getTitle(), getExecutor(context)) {
			
			private BinaryEntityContainer container;
			private boolean existedBeforGeneration; // For undo.
			
			@Override
			public BinaryEntityContainer execute(ProgressMonitor progressMonitor) throws Exception {
				BinaryEntityContainer parent = context.get(BinaryEntityContainer.class);
				
				if (parent == null) {
					throw new IllegalArgumentException("Unable to generate container - there is no BinaryEntityContainer service in the context");
				}
				
				container = parent.getContainer(name, progressMonitor.split("Getting container", 1, this));
				boolean existedBeforGeneration = container.exists(progressMonitor.split("Checking container existence", 1, this));
				childrenContext.register(BinaryEntityContainer.class, container);
				
				if (existedBeforGeneration) {
					switch (getReconcileAction()) {
					case APPEND:
					case MERGE:
						// Append new things to existing.
						break;
					case CANCEL:
						throw new OperationCanceledException("Operation cancelled - container already exists: "+name);
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
				
				return super.execute(progressMonitor.split("Generating container children", size(), this));
			}
			
			@Override
			protected BinaryEntityContainer combine(List<List<BinaryResource>> results, ProgressMonitor progressMonitor) throws Exception {
				return container;				
			}
			
			@Override
			public boolean rollback(ProgressMonitor progressMonitor) throws Exception {
				// TODO - delete the container if it did not exist.
				return super.rollback(progressMonitor);
			}
		};
		
		for (ResourceGenerator<BinaryResource> child: getElements()) {
			ret.add(child.create(childrenContext));
		}
		
		return ret;
	}

} //ContainerImpl
