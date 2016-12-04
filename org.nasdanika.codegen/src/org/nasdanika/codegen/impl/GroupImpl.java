/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.nasdanika.codegen.MutableContext;
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
					 new Object [] { this }));
			
				result = false;						
			}			
		}
		return result;
	}	

	@Override
	public Work<List<T>> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		SubMonitor submon = SubMonitor.convert(monitor, getWorkFactorySize());
		List<Work<List<T>>> allWork = new ArrayList<>();
		int[] allSize = { 2 };
		for (Generator<T> e: getElements()) {
			Context elementContext = context;
			
			if (getSelector() != null && getSelector().trim().length() > 0) {
				elementContext = (Context) createSelectorEvaluator(context, e.getClass()).evaluate(new Object[] { context, this, e });
				if (elementContext == null) {
					submon.worked(1);
					continue;
				}
			}
			
			Work<List<T>> ew = e.createWork(context, submon.split(1));
			if (ew != null) {
				allWork.add(ew);
				allSize[0]+=ew.size();
			}
		}
		
		return new Work<List<T>>() {

			@Override
			public int size() {
				return allSize[0];
			}

			@Override
			public List<T> execute(IProgressMonitor monitor) throws Exception {
				SubMonitor submon = SubMonitor.convert(monitor, size());
				List<T> ret = new ArrayList<>();
				for (Work<List<T>> w: allWork) {
					List<T> r = w.execute(submon.split(w.size()));
					if (r != null) {
						ret.addAll(r);
					}
				}				
				submon.worked(1);
				return configure(context, ret, submon.split(1));
			}
		};
	}

	private ScriptEvaluator createSelectorEvaluator(Context context, Class<?> elementClass) throws CompileException {
		ScriptEvaluator se = new ScriptEvaluator(getSelector());
		se.setReturnType(Context.class);
		se.setParameters(new String[] { "context", "generator", "element" }, new Class[] { Context.class, this.getClass(), elementClass });
		se.setThrownExceptions(new Class[] { Exception.class });
		se.setParentClassLoader(context.getClassLoader());
		return se;
	}

	@Override
	public int getWorkFactorySize() {
		return getElements().size() + 1;
	}

} //GroupImpl
