/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Service;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ZipArchive;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ZipArchiveImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ZipArchiveImpl#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipArchiveImpl extends ResourceImpl<IContainer> implements ZipArchive {
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
	public Generator<InputStream> getGenerator() {
		return (Generator<InputStream>)eGet(CodegenPackage.Literals.ZIP_ARCHIVE__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<InputStream> newGenerator) {
		eSet(CodegenPackage.Literals.ZIP_ARCHIVE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getMerger() {
		return (Service)eGet(CodegenPackage.Literals.ZIP_ARCHIVE__MERGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerger(Service newMerger) {
		eSet(CodegenPackage.Literals.ZIP_ARCHIVE__MERGER, newMerger);
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
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
						 new Object [] { this, CodegenPackage.Literals.ZIP_ARCHIVE__GENERATOR }));
				
				result = false;
			}
			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
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
