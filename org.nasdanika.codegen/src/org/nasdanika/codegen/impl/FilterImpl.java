/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FilterImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FilterImpl<T> extends GeneratorImpl<T> implements Filter<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<T> getGenerator() {
		return (Generator<T>)eGet(CodegenPackage.Literals.FILTER__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<T> newGenerator) {
		eSet(CodegenPackage.Literals.FILTER__GENERATOR, newGenerator);
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
					 new Object [] { this, CodegenPackage.Literals.FILTER__GENERATOR }));
			
				result = false;						
			}
			
		}
		return result;
	}
	
	@Override
	public Work<T> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		SubMonitor submon = SubMonitor.convert(monitor, getWorkFactorySize());
		Work<List<T>> gWork = getGenerator().createWork(context, submon.split(getGenerator().getWorkFactorySize()));
		submon.worked(1);
		return new Work<T>() {
			
			@Override
			public int size() {
				return gWork.size() + 2;
			}
			
			@Override
			public T execute(IProgressMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				List<T> wr = gWork.execute(subMon.split(gWork.size()));
				T filtered = filter(context, wr, subMon.split(1));
				return configure(context, filtered, subMon.split(1));
			}
			
		};
	}

	@Override
	public int getWorkFactorySize() {
		return 1 + getGenerator().getWorkFactorySize();
	}

	/**
	 * Combines and filters generation results
	 * @param generatorResult
	 * @return
	 * @throws Exception
	 */
	protected abstract T filter(MutableContext context, List<T> generationResult, SubMonitor subMonitor) throws Exception;

} //FilterImpl
