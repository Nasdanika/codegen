/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.IFilter;
import org.nasdanika.codegen.JavaFilter;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.JavaFilterImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaFilterImpl<T> extends FilterImpl<T> implements JavaFilter<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return (String)eGet(CodegenPackage.Literals.JAVA_FILTER__CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		eSet(CodegenPackage.Literals.JAVA_FILTER__CLASS_NAME, newClassName);
	}
		
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getClassName() == null || getClassName().trim().length() == 0) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.CONFIGURATION__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Filter class name is not set",
					 new Object [] { this, CodegenPackage.Literals.JAVA_FILTER__CLASS_NAME }));
			
				result = false;						
			}			
		}
		return result;
	}	
	
	@Override
	protected int getFilterWorkSize() {
		return 1;
	}
	
	@Override
	protected T filter(Context context, List<T> generationResult, SubMonitor subMonitor) throws Exception {
		Object obj = context.getClassLoader().loadClass(getClassName()).newInstance();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		IFilter<T> filter = (IFilter<T>) (obj instanceof Provider ? ((Provider<IFilter>) obj).get(context, subMonitor.split(getFilterWorkSize())) : obj);
		return filter.filter(context, join(generationResult), subMonitor);
	}
	
	protected abstract T join(List<T> generationResult) throws Exception;

} //JavaFilterImpl
