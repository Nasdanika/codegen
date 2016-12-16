/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
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
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.codegen.java.PackageFragmentRoot;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

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
	public Work<IPackageFragmentRoot> createWorkItem() throws Exception {
		
		List<Work<List<IPackageFragment>>> allPackageFragmentsWork = new ArrayList<>(); 	
		int allPackageFragmentsWorkSize = 0;
		for (PackageFragment pf: getPackagefragments()) {
			Work<List<IPackageFragment>> pfw = pf.createWork();
			allPackageFragmentsWorkSize += pfw.size();
			allPackageFragmentsWork.add(pfw);
		}
				
		int workSize = 2 + allPackageFragmentsWorkSize;
		
		return new Work<IPackageFragmentRoot>() {
			
			@Override
			public int size() {
				return workSize;
			}
			
			@Override
			public IPackageFragmentRoot execute(Context context, SubMonitor monitor) throws Exception {
				String name = context.interpolate(getName());
				IJavaProject javaProject = context.get(IJavaProject.class);
				
				IFolder sourceFolder = javaProject.getProject().getFolder(name);
				if (sourceFolder.exists()) {
					monitor.worked(2);
				} else {
					sourceFolder.create(false, true, monitor.split(1));
					IClasspathEntry[] ercp = javaProject.getRawClasspath();
					IClasspathEntry[] nrcp = new IClasspathEntry[ercp.length+1];
					System.arraycopy(ercp, 0, nrcp, 0, ercp.length);
					nrcp[nrcp.length-1] = JavaCore.newSourceEntry(sourceFolder.getFullPath());
					javaProject.setRawClasspath(nrcp, monitor.split(1));
				}				
				
				IPackageFragmentRoot result = javaProject.getPackageFragmentRoot(sourceFolder);
				MutableContext pfContext = context.createSubContext().set(IPackageFragmentRoot.class, result);
				
				for (Work<List<IPackageFragment>> pfw: allPackageFragmentsWork) {
					pfw.execute(pfContext, monitor);
				}
				return result;
			}
		};
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
	
	@Override
	public boolean isFilterable() {
		return true;
	}

} //PackageFragmentRootImpl
