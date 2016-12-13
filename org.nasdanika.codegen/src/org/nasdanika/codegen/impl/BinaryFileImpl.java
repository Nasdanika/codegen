/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.BinaryFile;
import org.nasdanika.codegen.CodegenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary File</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BinaryFileImpl extends FileImpl<InputStream> implements BinaryFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.BINARY_FILE;
	}

	@Override
	protected InputStream store(InputStream content) throws Exception {
		return content;
	}

	@Override
	protected InputStream load(InputStream content) throws Exception {
		return content;
	}

	@Override
	protected InputStream join(List<InputStream> content) throws Exception {
		if (content.size() == 1) {
			return content.get(0);
		}
		return new SequenceInputStream(Collections.enumeration(content));
	}

} //BinaryFileImpl
