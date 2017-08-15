/**
 */
package org.nasdanika.codegen.maven.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.NatureImpl;
import org.nasdanika.codegen.maven.MavenNature;
import org.nasdanika.codegen.maven.MavenPackage;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.maven.impl.MavenNatureImpl#getPomGenerator <em>Pom Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MavenNatureImpl extends NatureImpl implements MavenNature {
	
	protected static final String MAVEN_2_BUILDER = "org.eclipse.m2e.core.maven2Builder";
	protected static final String MAVEN_2_NATURE_ID = "org.eclipse.m2e.core.maven2Nature";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenNatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.MAVEN_NATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getPomGenerator() {
		return (Generator<String>)eGet(MavenPackage.Literals.MAVEN_NATURE__POM_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPomGenerator(Generator<String> newPomGenerator) {
		eSet(MavenPackage.Literals.MAVEN_NATURE__POM_GENERATOR, newPomGenerator);
	}


	@Override
	public Work<IProjectNature> createWorkItem() throws Exception {
		Work<List<String>> pomWork = getPomGenerator().createWork();
		return new Work<IProjectNature>() {

			@Override
			public int size() {
				return 2 + pomWork.size();
			}

			@Override
			public IProjectNature execute(Context context, SubMonitor monitor) throws Exception {
				IProject project = context.get(IProject.class);
				
				IProjectDescription desc = project.getDescription();
				String[] prevNatures = desc.getNatureIds();
				String[] newNatures = new String[prevNatures.length + 1];
				System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
				newNatures[prevNatures.length] = MAVEN_2_NATURE_ID;
				desc.setNatureIds(newNatures);

		        ICommand [] oldBuilders = desc.getBuildSpec();
		        ICommand[] builders = new ICommand [oldBuilders.length + 1];
		        System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);
		        builders[oldBuilders.length] = desc.newCommand();
		        builders[oldBuilders.length].setBuilderName(MAVEN_2_BUILDER);
		        
				project.setDescription(desc, monitor.split(1));
				
				// pom.xml
				
				IFile pom = project.getFile("pom.xml");
				if (pom.exists()) {
					monitor.worked(pomWork.size());
				} else {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					Writer writer = new OutputStreamWriter(baos);
					for (String pc: pomWork.execute(context, monitor.split(pomWork.size()))) {
						writer.write(pc);	
					}
					writer.close();
					baos.close(); 
					pom.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
				}
				
				return project.getNature(MAVEN_2_NATURE_ID);								
			}
			
		};
	}
	
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT 
//	 */
//	@Override
//	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
//		boolean result = super.validate(diagnostics, context);
//		if (diagnostics != null) {
//			if (getPomGenerator() == null) {
//				diagnostics.add
//					(new BasicDiagnostic
//						(Diagnostic.WARNING,
//						 CodegenValidator.DIAGNOSTIC_SOURCE,
//						 CodegenValidator.GENERATOR__VALIDATE,
//						 "["+EObjectValidator.getObjectLabel(this, context)+"] No pom generator",
//						 new Object [] { this, MavenPackage.Literals.MAVEN_NATURE__POM_GENERATOR }));
//				
//				result = false;
//			}
//		}
//		return result;
//	}	

} //MavenNatureImpl
