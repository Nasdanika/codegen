/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.IGenerator;
import org.nasdanika.codegen.JavaGenerator;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Provider;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.JavaGeneratorImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaGeneratorImpl<T> extends GeneratorImpl<T> implements JavaGenerator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return (String)eGet(CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		eSet(CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME, newClassName);
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
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator class name is not set",
					 new Object [] { this, CodegenPackage.Literals.JAVA_GENERATOR__CLASS_NAME }));
			
				result = false;						
			}			
		}
		return result;
	}	
		
	@Override
	public Work<T> doCreateWork(Context context, IProgressMonitor monitor) throws Exception {
		SubMonitor.convert(monitor, getWorkFactorySize()).worked(getWorkFactorySize());;
		return new Work<T>() {
			
			@Override
			public int size() {
				return 2;
			}
			
			@Override
			public T execute(IProgressMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				Object obj = context.getClassLoader().loadClass(getClassName()).newInstance();
				@SuppressWarnings({ "unchecked", "rawtypes" })
				IGenerator<T> generator = (IGenerator<T>) (obj instanceof Provider ? ((Provider<IGenerator>) obj).get(context) : obj);
				T result = generator.generate(context, subMon.split(1));
				return configure(context, result, subMon.split(1));
			}
			
		};
	}

	@Override
	public int getWorkFactorySize() {
		return 1;
	}
	
} //JavaGeneratorImpl
