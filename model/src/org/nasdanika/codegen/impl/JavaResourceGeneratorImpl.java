/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JavaResourceGenerator;
import org.nasdanika.codegen.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Resource Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaResourceGeneratorImpl extends JavaGeneratorImpl<Resource<InputStream>> implements JavaResourceGenerator {
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
