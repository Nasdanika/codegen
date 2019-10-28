/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceContainer;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.BinaryResource;
import org.nasdanika.common.resources.EphemeralBinaryEntityContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ZipArchiveImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipArchiveImpl extends GeneratorImpl<InputStream> implements ZipArchive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.ZIP_ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ResourceGenerator<BinaryResource>> getElements() {
		return (EList<ResourceGenerator<BinaryResource>>)eDynamicGet(CodegenPackage.ZIP_ARCHIVE__ELEMENTS, CodegenPackage.Literals.RESOURCE_CONTAINER__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.ZIP_ARCHIVE__ELEMENTS:
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
			case CodegenPackage.ZIP_ARCHIVE__ELEMENTS:
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
			case CodegenPackage.ZIP_ARCHIVE__ELEMENTS:
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
			case CodegenPackage.ZIP_ARCHIVE__ELEMENTS:
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
			case CodegenPackage.ZIP_ARCHIVE__ELEMENTS:
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
				case CodegenPackage.ZIP_ARCHIVE__ELEMENTS: return CodegenPackage.RESOURCE_CONTAINER__ELEMENTS;
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
				case CodegenPackage.RESOURCE_CONTAINER__ELEMENTS: return CodegenPackage.ZIP_ARCHIVE__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	protected Work<InputStream> createWorkItem(Context context) throws Exception {
		
		EphemeralBinaryEntityContainer container = new EphemeralBinaryEntityContainer();
		Context sc = Context.singleton(BinaryEntityContainer.class, container).compose(context);
		
		CompoundWork<InputStream, List<BinaryResource>> ret = new CompoundWork<InputStream, List<BinaryResource>>(getTitle(), getExecutor(context)) {
			
			@Override
			protected InputStream combine(List<List<BinaryResource>> results, ProgressMonitor progressMonitor) throws Exception {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try (ZipOutputStream zos = new ZipOutputStream(baos)) {
					container.store(zos, null, progressMonitor);
				}
				baos.close();
				return new ByteArrayInputStream(baos.toByteArray());
			}
		};
		
		for (ResourceGenerator<BinaryResource> e: getElements()) {
			ret.add(e.create(sc));
		}
		
		return ret;
	}
	

} //ZipArchiveImpl
