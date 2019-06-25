/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Filter;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FilterImpl<T> extends ConverterImpl<T, T> implements Filter<T> {
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
	
	@Override
	public Work<Context, T> createWorkItem() throws Exception {
		Work<Context, List<T>> gWork = getGenerator().createWork();
		return new Work<Context, T>() {
			
			@Override
			public long size() {
				return gWork.size() + getFilterWorkSize();
			}
			
			@Override
			public T execute(Context context, ProgressMonitor monitor) throws Exception {
				List<T> wr = gWork.splitAndExecute(context, monitor);
				T filtered = filter(context, wr, monitor);
				return filtered;
			}

			@Override
			public String getName() {
				return "Filter "+getTitle();
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return gWork.undo(progressMonitor);
			}
			
		};
	}
	
	protected abstract int getFilterWorkSize();
		
	/**
	 * Combines and filters generation results
	 * @param generatorResult
	 * @return
	 * @throws Exception
	 */
	protected abstract T filter(Context context, List<T> generationResult, ProgressMonitor subMonitor) throws Exception;

} //FilterImpl
