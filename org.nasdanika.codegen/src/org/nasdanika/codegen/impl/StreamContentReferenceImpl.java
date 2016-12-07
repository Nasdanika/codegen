/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.StreamContentReference;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Content Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StreamContentReferenceImpl extends ContentReferenceImpl<InputStream> implements StreamContentReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamContentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STREAM_CONTENT_REFERENCE;
	}

	@Override
	protected Work<InputStream> createWorkItem() throws Exception {
		return new Work<InputStream>() {
			
			@Override
			public int size() {
				return 1;
			}
			
			@Override
			public InputStream execute(Context context, SubMonitor monitor) throws Exception {
				URL url = new URL(resolveBaseURL(), getRef());
				monitor.setTaskName("Opening URL stream: "+url);
				try {
					return url.openStream();
				} finally {
					monitor.worked(1);
				}
			}
		};
	}

} //StreamContentReferenceImpl
