/**
 */
package org.nasdanika.codegen.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JavaResourceGenerator;
import org.nasdanika.codegen.Resource;
import org.nasdanika.common.resources.BinaryEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Resource Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaResourceGeneratorImpl extends JavaGeneratorImpl<Resource<BinaryEntity>> implements JavaResourceGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaResourceGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_RESOURCE_GENERATOR;
	}

} //JavaResourceGeneratorImpl
