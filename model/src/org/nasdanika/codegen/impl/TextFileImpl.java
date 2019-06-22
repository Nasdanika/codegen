/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.TextFileImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFileImpl extends FileImpl<String> implements TextFile {
	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.TEXT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return (String)eDynamicGet(CodegenPackage.TEXT_FILE__ENCODING, CodegenPackage.Literals.TEXT_FILE__ENCODING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		eDynamicSet(CodegenPackage.TEXT_FILE__ENCODING, CodegenPackage.Literals.TEXT_FILE__ENCODING, newEncoding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.TEXT_FILE__ENCODING:
				return getEncoding();
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
			case CodegenPackage.TEXT_FILE__ENCODING:
				setEncoding((String)newValue);
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
			case CodegenPackage.TEXT_FILE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
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
			case CodegenPackage.TEXT_FILE__ENCODING:
				return ENCODING_EDEFAULT == null ? getEncoding() != null : !ENCODING_EDEFAULT.equals(getEncoding());
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected InputStream store(Context context, String content, String charset) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String charsetName = context.interpolate(getEncoding());
		baos.write(content.getBytes(charsetName == null || charsetName.trim().length() == 0 ? charset : charsetName));
		baos.close(); 
		return new ByteArrayInputStream(baos.toByteArray());
	}

	@Override
	protected String load(Context context, InputStream content, String charset) throws Exception {
		StringWriter w = new StringWriter();
		String charsetName = context.interpolate(getEncoding());		
		try (Reader r = new BufferedReader(new InputStreamReader(content, charsetName == null || charsetName.trim().length() == 0 ? charset : charsetName))) {
			int ch; 
			while ((ch = r.read()) != -1) {
				w.write(ch);
			}
		}
		w.close();
		return w.toString();
	}

	@Override
	protected String join(List<String> content) throws Exception {
		if (content.size() == 1) {
			return content.get(0);
		}
		StringBuilder sb = new StringBuilder();
		for (String str: content) {
			sb.append(str);
		}
		return sb.toString();
	}

} //TextFileImpl
