/**
 */
package org.nasdanika.codegen.impl;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Mustache;
import org.nasdanika.config.Context;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.MustacheFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mustache</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MustacheImpl extends FilterImpl<String> implements Mustache {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MustacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.MUSTACHE;
	}

	@Override
	protected String filter(Context context, List<String> generationResult, SubMonitor subMonitor) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (String str: generationResult) {
			sb.append(str);
		}
		
		/*
		 * Context -> Map adapter. Breaks the map contract, but works with Mustache.
		 * Shall it break, a customized ObjectHandler would be required which would support Context
		 * in addition to Map.
		 */
		@SuppressWarnings("serial")
		Map<String, Object> map = new HashMap<String, Object>() {
			
			@Override
			public boolean containsKey(Object key) {
				return context.get((String) key) != null;
			}
			
			@Override
			public Object get(Object key) {
				return context.get((String) key);
			}
			
		};

		Writer writer = new StringWriter();
		MustacheFactory mf = new DefaultMustacheFactory();

		com.github.mustachejava.Mustache mustache = mf.compile(new StringReader(sb.toString()), "Mustache Evaluator");
		mustache.execute(writer, map);
		writer.close();
		subMonitor.worked(1);
		return writer.toString();
	}
	
	@Override
	protected int getFilterWorkSize() {
		return 1;
	}

} //MustacheImpl
