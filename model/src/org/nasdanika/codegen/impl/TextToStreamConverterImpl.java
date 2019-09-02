/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.TextToStreamConverter;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text To Stream Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.TextToStreamConverterImpl#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextToStreamConverterImpl extends ConverterImpl<String, InputStream> implements TextToStreamConverter {
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
	protected TextToStreamConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.TEXT_TO_STREAM_CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharset() {
		return (String)eDynamicGet(CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET, CodegenPackage.Literals.TEXT_TO_STREAM_CONVERTER__CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharset(String newCharset) {
		eDynamicSet(CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET, CodegenPackage.Literals.TEXT_TO_STREAM_CONVERTER__CHARSET, newCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET:
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
			case CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET:
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
			case CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET:
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
			case CodegenPackage.TEXT_TO_STREAM_CONVERTER__CHARSET:
				return CHARSET_EDEFAULT == null ? getCharset() != null : !CHARSET_EDEFAULT.equals(getCharset());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected InputStream convert(Context context, List<String> generationResult, ProgressMonitor subMonitor) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String charset = getCharset();
		try (Writer writer = charset==null || charset.trim().length()==0 ? new OutputStreamWriter(baos) : new OutputStreamWriter(baos, charset)) {
			for (String str: generationResult) {
				writer.write(str);
			}
		}
		baos.close();
		return new ByteArrayInputStream(baos.toByteArray());
	}

	@Override
	protected int getConverterWorkSize() {
		return 1;
	}	

} //TextToStreamConverterImpl
