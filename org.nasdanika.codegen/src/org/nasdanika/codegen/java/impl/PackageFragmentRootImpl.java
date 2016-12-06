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
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.codegen.java.PackageFragmentRoot;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.PackageFragmentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PackageFragmentRootImpl#getPackagefragments <em>Packagefragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageFragmentRootImpl extends GeneratorImpl<IPackageFragmentRoot> implements PackageFragmentRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageFragmentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PACKAGE_FRAGMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(JavaPackage.Literals.PACKAGE_FRAGMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JavaPackage.Literals.PACKAGE_FRAGMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageFragment> getPackagefragments() {
		return (EList<PackageFragment>)eGet(JavaPackage.Literals.PACKAGE_FRAGMENT_ROOT__PACKAGEFRAGMENTS, true);
	}

	@Override
	public Work<IPackageFragmentRoot> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		SubMonitor subMon = SubMonitor.convert(monitor, getWorkFactorySize());
		
		List<Work<List<IPackageFragment>>> allPackageFragmentsWork = new ArrayList<>(); 	
		int allPackageFragmentsWorkSize = 0;
		for (PackageFragment pf: getPackagefragments()) {
			Work<List<IPackageFragment>> pfw = pf.createWork(context, subMon.split(pf.getWorkFactorySize()));
			allPackageFragmentsWorkSize += pfw.size();
			allPackageFragmentsWork.add(pfw);
		}
				
		subMon.worked(1);
		
		int workSize = 2 + allPackageFragmentsWorkSize;
		
		return new Work<IPackageFragmentRoot>() {
			
			@Override
			public int size() {
				return workSize;
			}
			
			@Override
			public IPackageFragmentRoot execute(IProgressMonitor monitor) throws Exception {
				SubMonitor subMon = SubMonitor.convert(monitor, size());
				String name = CodegenUtil.interpolate(getName(), context);
				IJavaProject javaProject = context.get(IJavaProject.class);
				
				IFolder sourceFolder = javaProject.getProject().getFolder(name);
				if (sourceFolder.exists()) {
					subMon.worked(2);
				} else {
					sourceFolder.create(false, true, subMon.split(1));
					IClasspathEntry[] ercp = javaProject.getRawClasspath();
					IClasspathEntry[] nrcp = new IClasspathEntry[ercp.length+1];
					System.arraycopy(ercp, 0, nrcp, 0, ercp.length);
					nrcp[nrcp.length-1] = JavaCore.newSourceEntry(sourceFolder.getFullPath());
					javaProject.setRawClasspath(nrcp, subMon.split(1));
				}				
				
				IPackageFragmentRoot result = javaProject.getPackageFragmentRoot(sourceFolder);
				context.set(IPackageFragmentRoot.class, result);
				
				for (Work<List<IPackageFragment>> pfw: allPackageFragmentsWork) {
					pfw.execute(subMon.split(pfw.size()));
				}
				return result;
			}
		};
	}

	@Override
	public int getWorkFactorySize() {
		int ret = 1;
		for (PackageFragment pf: getPackagefragments()) {
			ret += pf.getWorkFactorySize();
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
						 new Object [] { this, JavaPackage.Literals.PACKAGE_FRAGMENT_ROOT__NAME }));
				
				result = false;
			}
		}
		return result;
	}	

} //PackageFragmentRootImpl
