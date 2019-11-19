/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StaticBytes;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Bytes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.StaticBytesImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticBytesImpl extends GeneratorImpl<InputStream> implements StaticBytes {
	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTENTS_EDEFAULT = null;
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
	@Override
	public byte[] getContents() {
		return (byte[])eDynamicGet(CodegenPackage.STATIC_BYTES__CONTENTS, CodegenPackage.Literals.STATIC_BYTES__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(byte[] newContents) {
		eDynamicSet(CodegenPackage.STATIC_BYTES__CONTENTS, CodegenPackage.Literals.STATIC_BYTES__CONTENTS, newContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.STATIC_BYTES__CONTENTS:
				return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.STATIC_BYTES__CONTENTS:
				setContents((byte[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.STATIC_BYTES__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.STATIC_BYTES__CONTENTS:
				return CONTENTS_EDEFAULT == null ? getContents() != null : !CONTENTS_EDEFAULT.equals(getContents());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Supplier<InputStream> createWorkItem(Context context) throws Exception {
		
		return new Supplier<InputStream>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public InputStream execute(ProgressMonitor monitor) throws Exception {
				byte[] contents = getContents();
				return contents == null ? null : new ByteArrayInputStream(contents);
			}

			@Override
			public String name() {
				return getTitle();
			}

			@Override
			public boolean rollback(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		};
	}	

} //StaticBytesImpl
