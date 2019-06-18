/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Filter;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

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
	public Work<T> createWorkItem() throws Exception {
		Work<List<T>> gWork = getGenerator().createWork();
		return new Work<T>() {
			
			@Override
			public int size() {
				return gWork.size() + getFilterWorkSize();
			}
			
			@Override
			public T execute(Context context, SubMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				List<T> wr = gWork.execute(context, subMon);
				T filtered = filter(context, wr, subMon.split(getFilterWorkSize()));
				return filtered;
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
	protected abstract T filter(Context context, List<T> generationResult, SubMonitor subMonitor) throws Exception;

} //FilterImpl
