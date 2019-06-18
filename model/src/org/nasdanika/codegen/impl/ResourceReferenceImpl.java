/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.ResourceReference;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceReferenceImpl extends ResourceImpl<IResource> implements ResourceReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Resource<IResource> getTarget() {
		return (Resource<IResource>)eGet(CodegenPackage.Literals.RESOURCE_REFERENCE__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Resource<IResource> newTarget) {
		eSet(CodegenPackage.Literals.RESOURCE_REFERENCE__TARGET, newTarget);
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = getTarget() != null;
		if (diagnostics != null && !isValid) {
			diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "Reference target is not set",
					 new Object [] { this, CodegenPackage.Literals.RESOURCE_REFERENCE__TARGET }));
		}
		return super.validate(diagnostics, context) && isValid;
	}
	
	@Override
	protected Work<IResource> createWorkItem() throws Exception {
		Resource<IResource> target = getTarget();
		if (target == null) {
			return null;
		}
		Work<List<IResource>> targetWork = target.createWork();
		return new Work<IResource>() {
			
			@Override
			public int size() {
				return targetWork.size();
			}
			
			@Override
			public IResource execute(Context context, SubMonitor monitor) throws Exception {
				List<IResource> result = targetWork.execute(context, monitor);
				
				if (result.size() == 1) {
					return result.get(0);
				}
				
				return null;
			}
		};
	}

} //ResourceReferenceImpl
