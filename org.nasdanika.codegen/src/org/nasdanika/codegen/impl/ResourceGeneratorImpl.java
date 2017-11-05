/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceGenerator;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceGeneratorImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceGeneratorImpl<T> extends GeneratorImpl<T> implements ResourceGenerator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return (Boolean)eGet(CodegenPackage.Literals.RESOURCE_GENERATOR__ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		eSet(CodegenPackage.Literals.RESOURCE_GENERATOR__ENABLED, newEnabled);
	}
	
	@Override
	protected Collection<Context> iterate(Context thisContext) throws Exception {
		if (isEnabled()) {
			return super.iterate(thisContext);
		}
		
		return Collections.emptyList();
	}

} //ResourceGeneratorImpl
