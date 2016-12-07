/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Group;
import org.nasdanika.codegen.SimpleMutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.GroupImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.GroupImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl<T> extends GeneratorImpl<List<T>> implements Group<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return (String)eGet(CodegenPackage.Literals.GROUP__SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		eSet(CodegenPackage.Literals.GROUP__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generator<T>> getElements() {
		return (EList<Generator<T>>)eGet(CodegenPackage.Literals.GROUP__ELEMENTS, true);
	}
		
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null && getSelector() != null && getSelector().trim().length() > 0) {
			try {
				createSelectorEvaluator(new SimpleMutableContext(), Generator.class);						
			} catch (CompileException e) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.CONFIGURATION__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Iterator script has errors: "+e.getMessage(),
					 new Object [] { this, CodegenPackage.Literals.GROUP__SELECTOR }));
			
				result = false;						
			}			
		}
		return result;
	}	

	@Override
	public Work<List<T>> createWorkItem() throws Exception {
		Map<Generator<?>, Work<List<T>>> workMap = new HashMap<>();
		int[] allSize = { 1 };
		for (Generator<T> e: getElements()) {
			Work<List<T>> ew = e.createWork();
			workMap.put(e, ew);
			allSize[0] += ew.size();
		}
		
		return new Work<List<T>>() {

			@Override
			public int size() {
				return allSize[0];
			}

			@Override
			public List<T> execute(Context context, SubMonitor monitor) throws Exception {
				List<T> ret = new ArrayList<>();
				
				for (Entry<Generator<?>, Work<List<T>>> we: workMap.entrySet()) {
					Context elementContext = context;
					
					if (getSelector() != null && getSelector().trim().length() > 0) {
						elementContext = (Context) createSelectorEvaluator(context, we.getKey().getClass()).evaluate(new Object[] { context, this, we.getKey() });
						if (elementContext == null) {
							monitor.worked(we.getValue().size());
							continue;
						}
					}
										
					List<T> r = we.getValue().execute(configureElementContext(elementContext), monitor);
					if (r != null) {
						ret.addAll(r);
					}
				}				
				return configure(context, ret, monitor.split(1));
			}
		};
	}
	
	/**
	 * Subclasses can override to customize elements context.
	 * @param elementContext
	 * @return
	 */
	protected Context configureElementContext(Context elementContext) {
		return elementContext;
	}

	private ScriptEvaluator createSelectorEvaluator(Context context, Class<?> elementClass) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getSelector());
		se.setReturnType(Context.class);
		se.setParameters(new String[] { "context", "group", "element" }, new Class[] { Context.class, this.getClass(), elementClass });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}

} //GroupImpl
