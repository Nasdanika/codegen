/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ZipArchiveImpl#getResources <em>Resources</em>}</li>
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
	public EList<Resource<org.nasdanika.common.resources.Resource<InputStream>>> getResources() {
		return (EList<Resource<org.nasdanika.common.resources.Resource<InputStream>>>)eDynamicGet(CodegenPackage.ZIP_ARCHIVE__RESOURCES, CodegenPackage.Literals.ZIP_ARCHIVE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.ZIP_ARCHIVE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.ZIP_ARCHIVE__RESOURCES:
				return getResources();
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
			case CodegenPackage.ZIP_ARCHIVE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource<org.nasdanika.common.resources.Resource<InputStream>>>)newValue);
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
			case CodegenPackage.ZIP_ARCHIVE__RESOURCES:
				getResources().clear();
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
			case CodegenPackage.ZIP_ARCHIVE__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected Work<IContainer> createWorkItem() throws Exception {
		Work<List<InputStream>> gWork = getGenerator().createWork();
		return new Work<IContainer>() {

			@Override
			public int size() {
				return gWork.size() + 5;
			}

			@Override
			public IContainer execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				// TODO - interpolate name
				// directories list
				// files list
				
				try (ZipInputStream zis = new ZipInputStream(new SequenceInputStream(Collections.enumeration(gWork.execute(context, monitor))))) {
					
		            ZipEntry inputEntry;
		            while ((inputEntry = zis.getNextEntry()) != null) {
		            	if (monitor.isCanceled()) {
		            		throw new OperationCanceledException();
		            	}
		            	if (inputEntry.isDirectory()) {
		            		// Create Folder model element for directory generation.
		            	} else {
		            		// data to byte array, create file model element for file generation.
		            	}
		        		zis.closeEntry();
		            }
				}
				return container;
			}
			
		};
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getGenerator() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
						 new Object [] { this, CodegenPackage.Literals.ZIP_ARCHIVE__GENERATOR }));
				
				result = false;
			}
			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Reconcile action is 'Merge' and merger is not set",
						 new Object [] { this, CodegenPackage.Literals.ZIP_ARCHIVE__MERGER }));
				
				result = false;
			}
		}
		return result;
	}
	
	@Override
	protected boolean isNonBlankName() {
		return false;
	}

} //ZipArchiveImpl
