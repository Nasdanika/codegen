/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.StreamToTextConverter;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream To Text Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.StreamToTextConverterImpl#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamToTextConverterImpl extends ConverterImpl<InputStream, String> implements StreamToTextConverter {
	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = "";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamToTextConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.STREAM_TO_TEXT_CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharset() {
		return (String)eDynamicGet(CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET, CodegenPackage.Literals.STREAM_TO_TEXT_CONVERTER__CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharset(String newCharset) {
		eDynamicSet(CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET, CodegenPackage.Literals.STREAM_TO_TEXT_CONVERTER__CHARSET, newCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET:
				return getCharset();
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
			case CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET:
				setCharset((String)newValue);
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
			case CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET:
				setCharset(CHARSET_EDEFAULT);
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
			case CodegenPackage.STREAM_TO_TEXT_CONVERTER__CHARSET:
				return CHARSET_EDEFAULT == null ? getCharset() != null : !CHARSET_EDEFAULT.equals(getCharset());
		}
		return super.eIsSet(featureID);
	}
		
	@Override
	protected String convert(Context context, List<InputStream> generationResult, ProgressMonitor subMonitor) throws Exception {
		StringWriter sw = new StringWriter();
		String charset = getCharset();
		for (InputStream in: generationResult) {
			try (Reader reader = new BufferedReader(charset==null || charset.trim().length()==0 ? new InputStreamReader(in) : new InputStreamReader(in, charset))) {
				int ch;
				while ((ch = reader.read()) != -1) {
					sw.write(ch);
				}
			}
		}
		sw.close();
		return sw.toString();
	}

	@Override
	protected int getConverterWorkSize() {
		return 1;
	}
	
	

} //StreamToTextConverterImpl
