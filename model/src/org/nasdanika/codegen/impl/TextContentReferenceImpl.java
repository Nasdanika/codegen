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
import org.nasdanika.common.Work;

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
	protected Work<Context, String> createWorkItem() throws Exception {
		return new Work<Context, String>() {

			@Override
			public long size() {
				return 1;
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
			@Override
			public String getName() {
				return "Loading text from "+getRef();
			}

			@Override
			public String execute(Context context, ProgressMonitor monitor) throws Exception {
				StringWriter sw = new StringWriter();
				try (Reader reader = new BufferedReader(new InputStreamReader(resolveRef(context).openStream()))) {
					int ch;
					while ((ch = reader.read()) != -1) {
						sw.write(ch);
					}
				}
				sw.close();
				return sw.toString();
			}
		};
	}

} //TextContentReferenceImpl
