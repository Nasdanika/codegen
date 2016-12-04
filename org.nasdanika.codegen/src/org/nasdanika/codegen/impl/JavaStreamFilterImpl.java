/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.JavaStreamFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Stream Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaStreamFilterImpl extends JavaFilterImpl<InputStream> implements JavaStreamFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStreamFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.JAVA_STREAM_FILTER;
	}

	@Override
	protected InputStream combine(List<InputStream> generationResult) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (InputStream in: generationResult) {
			try (InputStream bin = new BufferedInputStream(in)) {
				int b;
				while ((b = bin.read()) != -1) {
					baos.write(b);
				}
			}
			in.close();
		}
		baos.close();
		return new ByteArrayInputStream(baos.toByteArray());
	}

} //JavaStreamFilterImpl
