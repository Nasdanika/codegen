/**
 */
package org.nasdanika.codegen.impl;

import java.util.List;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterpolatorImpl extends FilterImpl<String> implements Interpolator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpolatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.INTERPOLATOR;
	}

	@Override
	protected String filter(Context context, List<String> generationResult, SubMonitor subMonitor) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (String str: generationResult) {
			sb.append(str);
		}
		subMonitor.worked(1);
		return CodegenUtil.interpolate(sb.toString(), context);
	}

} //InterpolatorImpl
