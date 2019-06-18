/**
 */
package org.nasdanika.codegen.impl;

import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JETEmitter;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JET Emitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.JETEmitterImpl#getTemplateURI <em>Template URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JETEmitterImpl extends GeneratorImpl<String> implements JETEmitter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JETEmitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JET_EMITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateURI() {
		return (String)eGet(CodegenPackage.Literals.JET_EMITTER__TEMPLATE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateURI(String newTemplateURI) {
		eSet(CodegenPackage.Literals.JET_EMITTER__TEMPLATE_URI, newTemplateURI);
	}
		
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getTemplateURI() == null || getTemplateURI().trim().length() == 0) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Template URI is not set",
					 new Object [] { this, CodegenPackage.Literals.JET_EMITTER__TEMPLATE_URI }));
			
				result = false;						
			}			
		}
		return result;
	}		

	@Override
	protected Work<String> createWorkItem() throws Exception {
		return new Work<String>() {

			@Override
			public int size() {
				return 1;
			}

			@Override
			public String execute(Context context, SubMonitor monitor) throws Exception {
				URL tu = new URL((URL) context.get(BASE_URL_PROPERTY), getTemplateURI());
				org.eclipse.emf.codegen.jet.JETEmitter jetEmitter = new org.eclipse.emf.codegen.jet.JETEmitter(tu.toString(), context.getClassLoader());
				return jetEmitter.generate(SubMonitor.convert(monitor,  size()), new Object[] { context });
			}
			
		};
	}

} //JETEmitterImpl
