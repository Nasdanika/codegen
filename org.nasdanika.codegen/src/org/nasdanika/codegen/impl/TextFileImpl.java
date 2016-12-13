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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text File</b></em>'.
 * <!-- end-user-doc -->
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

	@Override
	protected InputStream store(String content) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (Writer writer = new OutputStreamWriter(baos)) {
			writer.write(content);
		}
		baos.close(); // Already closed by the writer?
		return new ByteArrayInputStream(baos.toByteArray());
	}

	@Override
	protected String load(InputStream content) throws Exception {
		StringWriter w = new StringWriter();
		try (Reader r = new BufferedReader(new InputStreamReader(content))) {
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
