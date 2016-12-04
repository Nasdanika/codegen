/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.NatureImpl;
import org.nasdanika.codegen.java.JavaNature;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PackageFragmentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.JavaNatureImpl#getPackagefragmentroots <em>Packagefragmentroots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaNatureImpl extends NatureImpl implements JavaNature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaNatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JAVA_NATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageFragmentRoot> getPackagefragmentroots() {
		return (EList<PackageFragmentRoot>)eGet(JavaPackage.Literals.JAVA_NATURE__PACKAGEFRAGMENTROOTS, true);
	}

	@Override
	public Work<IProjectNature> doCreateWork(MutableContext context, IProgressMonitor monitor) throws Exception {
		List<Work<List<IPackageFragmentRoot>>> pfrWork = new ArrayList<>();
		int pfrWorkSize = 0;
		SubMonitor subMon = SubMonitor.convert(monitor, getWorkFactorySize());
		for (PackageFragmentRoot pfr: getPackagefragmentroots()) {
			Work<List<IPackageFragmentRoot>> w = pfr.createWork(context, subMon.split(pfr.getWorkFactorySize()));
			pfrWork.add(w);
			pfrWorkSize += w.size();
		}
		
		int workSize = pfrWorkSize + 2;
		
		return new Work<IProjectNature>() {

			@Override
			public int size() {
				return workSize;
			}

			@Override
			public IProjectNature execute(IProgressMonitor monitor) throws Exception {
				IProject project = context.get(IProject.class);
				IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
				if (javaProject == null) {
					javaProject = JavaCore.create(project);
					IProjectDescription description = project.getDescription();
					description.setNatureIds(new String[] { JavaCore.NATURE_ID });
					final ICommand java = description.newCommand();
					java.setBuilderName(JavaCore.BUILDER_ID);
					
					// TODO - invoke protected method to allow additional configuration by sub-classes.
//					final ICommand manifest = description.newCommand();
//					manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");
//
//					final ICommand schema = description.newCommand();
//					schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

					description.setBuildSpec(new ICommand[] { java /*, manifest, schema */});							
					project.setDescription(description, subMon.split(1));
				}

				javaProject = (IJavaProject) configure(context, (IProjectNature) javaProject, subMon.split(1));

				for (Work<List<IPackageFragmentRoot>> pfrw: pfrWork) {
					pfrw.execute(subMon.split(pfrw.size()));
				}
				
				return (IProjectNature) javaProject;
			}
			
		};
	}

	@Override
	public int getWorkFactorySize() {
		int ret = 1;
		for (PackageFragmentRoot pfr: getPackagefragmentroots()) {
			ret += pfr.getWorkFactorySize();
		}
		return ret;
	}

} //JavaNatureImpl
