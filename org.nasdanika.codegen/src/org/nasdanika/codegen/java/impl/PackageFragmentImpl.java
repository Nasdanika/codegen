/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.PackageFragmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PackageFragmentImpl#getCompilationunits <em>Compilationunits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageFragmentImpl extends GeneratorImpl<IPackageFragment> implements PackageFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PACKAGE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(JavaPackage.Literals.PACKAGE_FRAGMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JavaPackage.Literals.PACKAGE_FRAGMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompilationUnit> getCompilationunits() {
		return (EList<CompilationUnit>)eGet(JavaPackage.Literals.PACKAGE_FRAGMENT__COMPILATIONUNITS, true);
	}

	@Override
	public Work<IPackageFragment> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		SubMonitor subMon = SubMonitor.convert(monitor, getWorkFactorySize());
		
		List<Work<List<ICompilationUnit>>> allCompilationUnitsWork = new ArrayList<>(); 	
		int allCompilationUnitsWorkSize = 0;
		for (CompilationUnit cu: getCompilationunits()) {
			Work<List<ICompilationUnit>> cuw = cu.createWork(context, subMon.split(cu.getWorkFactorySize()));
			allCompilationUnitsWorkSize += cuw.size();
			allCompilationUnitsWork.add(cuw);
		}
				
		subMon.worked(1);
		
		int workSize = 1 + allCompilationUnitsWorkSize;
		
		return new Work<IPackageFragment>() {
			
			@Override
			public int size() {
				return workSize;
			}
			
			@Override
			public IPackageFragment execute(IProgressMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				String pkgName = CodegenUtil.interpolate(getName(), context);
				IPackageFragment pkg = context.get(IPackageFragmentRoot.class).createPackageFragment(pkgName, false, subMon.split(1));
				context.set(IPackageFragment.class, pkg);
				
				for (Work<List<ICompilationUnit>> cuw: allCompilationUnitsWork) {
					cuw.execute(subMon.split(cuw.size()));
				}
				return pkg;
			}
		};
	}

	@Override
	public int getWorkFactorySize() {
		int ret = 1;
		for (CompilationUnit cu: getCompilationunits()) {
			ret += cu.getWorkFactorySize();
		}
		return ret;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getName() == null || getName().trim().length() == 0) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, JavaPackage.Literals.PACKAGE_FRAGMENT__NAME }));
				
				result = false;
			}
		}
		return result;
	}	

} //PackageFragmentImpl
