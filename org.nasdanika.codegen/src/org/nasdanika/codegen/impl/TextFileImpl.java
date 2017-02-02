/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
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
	public String getEncoding() {
		return (String)eGet(CodegenPackage.Literals.TEXT_FILE__ENCODING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		eSet(CodegenPackage.Literals.TEXT_FILE__ENCODING, newEncoding);
	}

	@Override
	protected InputStream store(Context context, String content) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String charsetName = context.interpolate(getEncoding());
		System.out.println(charsetName);
		baos.write(charsetName == null || charsetName.trim().length() == 0 ? content.getBytes() : content.getBytes(charsetName));
		baos.close(); 
		return new ByteArrayInputStream(baos.toByteArray());
	}

	@Override
	protected String load(Context context, InputStream content) throws Exception {
		StringWriter w = new StringWriter();
		String charsetName = context.interpolate(getEncoding());		
		try (Reader r = new BufferedReader(charsetName == null || charsetName.trim().length() == 0 ? new InputStreamReader(content) : new InputStreamReader(content, charsetName))) {
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
