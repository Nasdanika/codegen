/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Content Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.TextContentReferenceImpl#isInterpolate <em>Interpolate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextContentReferenceImpl extends ContentReferenceImpl<String> implements TextContentReference {

	/**
	 * The default value of the '{@link #isInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERPOLATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.TEXT_CONTENT_REFERENCE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE, CodegenPackage.Literals.TEXT_CONTENT_REFERENCE__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE, CodegenPackage.Literals.TEXT_CONTENT_REFERENCE__INTERPOLATE, newInterpolate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE:
				return isInterpolate();
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
			case CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE:
				setInterpolate((Boolean)newValue);
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
			case CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
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
			case CodegenPackage.TEXT_CONTENT_REFERENCE__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected Supplier<String> createWorkItem(Context context) throws Exception {

		return new Supplier<String>() {

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
				return "Loading text from "+getRef();
			}

			@Override
			public String execute(ProgressMonitor monitor) throws Exception {
				StringWriter sw = new StringWriter();
				try (Reader reader = new BufferedReader(new InputStreamReader(resolveRef(context).openStream()))) {
					int ch;
					while ((ch = reader.read()) != -1) {
						sw.write(ch);
					}
				}
				sw.close();
				String text = sw.toString();
				return isInterpolate() ? context.interpolate(text) : text;				
			}
		};
	}

} //TextContentReferenceImpl
