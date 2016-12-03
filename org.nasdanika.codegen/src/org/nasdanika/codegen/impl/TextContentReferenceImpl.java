/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Content Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextContentReferenceImpl extends ContentReferenceImpl<String> implements TextContentReference {
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

	@Override
	protected Work<String> doCreateWork(Context iterationContext, IProgressMonitor monitor) throws Exception {
		return new Work<String>() {

			@Override
			public int size() {
				return 1;
			}

			@Override
			public String execute(IProgressMonitor monitor) throws Exception {
				URL url = new URL(resolveBaseURL(), getRef());
				monitor.setTaskName("Loading text from: "+url);
				StringWriter sw = new StringWriter();
				try (Reader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
					int ch;
					while ((ch = reader.read()) != -1) {
						sw.write(ch);
					}
				}
				sw.close();
				monitor.worked(1);
				return sw.toString();
			}
		};
	}

} //TextContentReferenceImpl
