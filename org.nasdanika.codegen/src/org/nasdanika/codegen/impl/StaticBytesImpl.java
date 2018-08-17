/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StaticBytes;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Bytes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.StaticBytesImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticBytesImpl extends GeneratorImpl<InputStream> implements StaticBytes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticBytesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STATIC_BYTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getContent() {
		return (byte[])eGet(CodegenPackage.Literals.STATIC_BYTES__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(byte[] newContent) {
		eSet(CodegenPackage.Literals.STATIC_BYTES__CONTENT, newContent);
	}
	
	@Override
	public Work<InputStream> createWorkItem() throws Exception {
		return new Work<InputStream>() {
			
			@Override
			public int size() {
				return 1;
			}
			
			@Override
			public InputStream execute(Context context, SubMonitor monitor) throws Exception {
				try {
					byte[] content = getContent();
					return content == null ? null : new ByteArrayInputStream(content);
				} finally {
					monitor.worked(size());
				}
			}
			
		};
	}	

} //StaticBytesImpl
