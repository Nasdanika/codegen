/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.GenericFile;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic File</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenericFileImpl extends ResourceImpl<IFile> implements GenericFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GENERIC_FILE;
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (isNonBlankName() && (getName() == null || getName().trim().length() == 0)) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Generic File requires a controller",
						 new Object [] { this, CodegenPackage.Literals.RESOURCE__NAME }));
				
				result = false;
			}
		}
		return result;
	}
	

	@Override
	protected Work<IFile> createWorkItem() throws Exception {
		
		return new Work<IFile>() {

			@Override
			public int size() {
				return 1;
			}

			@Override
			public IFile execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				String name = context.interpolate(getName());				
				return container.getFile(new Path(name));
			}
		};
	}
	

} //GenericFileImpl
