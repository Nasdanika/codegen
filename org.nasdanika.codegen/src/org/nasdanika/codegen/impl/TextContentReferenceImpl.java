/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.TextContentReference;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Content Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextContentReferenceImpl extends ContentReferenceImpl<String> implements TextContentReference {
	private static final String BUNDLE_PROTOCOL = "bundle://";

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
	protected Work<String> createWorkItem() throws Exception {
		return new Work<String>() {

			@Override
			public int size() {
				return 1;
			}

			@Override
			public String execute(Context context, SubMonitor monitor) throws Exception {
				URL url;
				if (getRef().startsWith(BUNDLE_PROTOCOL)) {
					String bp = getRef().substring(BUNDLE_PROTOCOL.length());
					int slashIdx = bp.indexOf("/");
					Bundle bundle = Platform.getBundle(bp.substring(0, slashIdx));
					url = bundle.getEntry(bp.substring(slashIdx));
				} else {
					url = new URL((URL) context.get(BASE_URL_PROPERTY), getRef());
				}
				monitor.subTask("Loading text from: "+url);
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
