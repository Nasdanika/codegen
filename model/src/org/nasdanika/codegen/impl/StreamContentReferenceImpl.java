/**
 */
package org.nasdanika.codegen.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StreamContentReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;

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
	protected Supplier<InputStream> createWorkItem(Context context) throws Exception {

		return new Supplier<InputStream>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public boolean rollback(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
			@Override
			public String name() {
				return "Loading binary content from "+getRef();
			}
			
			@Override
			public InputStream execute(ProgressMonitor monitor) throws Exception {
				return resolveRef(context).openStream();
			}
		};
		
	}

} //StreamContentReferenceImpl
