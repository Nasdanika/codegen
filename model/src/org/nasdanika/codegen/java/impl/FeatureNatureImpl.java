/**
 */
package org.nasdanika.codegen.java.impl;

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
import org.nasdanika.codegen.java.FeatureNature;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.FeatureNatureImpl#getFeatureXmlGenerator <em>Feature Xml Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.FeatureNatureImpl#getBuildPropertiesGenerator <em>Build Properties Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureNatureImpl extends NatureImpl implements FeatureNature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureNatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.FEATURE_NATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getFeatureXmlGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureXmlGenerator(Generator<String> newFeatureXmlGenerator) {
		eSet(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR, newFeatureXmlGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getBuildPropertiesGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildPropertiesGenerator(Generator<String> newBuildPropertiesGenerator) {
		eSet(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR, newBuildPropertiesGenerator);
	}
	
	private static final String FEATURE_NATURE_ID = "org.eclipse.pde.FeatureNature";

	@Override
	public Work<IProjectNature> createWorkItem() throws Exception {
		Work<List<String>> featureXmlWork = getFeatureXmlGenerator().createWork();
		Work<List<String>> buildPropertiesWork = getBuildPropertiesGenerator().createWork();
		
		return new Work<IProjectNature>() {

			@Override
			public int size() {
				return 5 + featureXmlWork.size() + buildPropertiesWork.size();
			}

			@Override
			public IProjectNature execute(Context context, SubMonitor monitor) throws Exception {
				IProject project = context.get(IProject.class);
				
				IProjectDescription desc = project.getDescription();
				String[] prevNatures = desc.getNatureIds();
				String[] newNatures = new String[prevNatures.length + 1];
				System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
				newNatures[prevNatures.length] = FEATURE_NATURE_ID;
				desc.setNatureIds(newNatures);

		        ICommand [] oldBuilders = desc.getBuildSpec();
		        ICommand[] builders = new ICommand [oldBuilders.length + 2];
		        System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);

		        builders[oldBuilders.length-1] = desc.newCommand();
		        builders[oldBuilders.length-1].setBuilderName("org.eclipse.pde.FeatureBuilder");
		        
				project.setDescription(desc, monitor.split(1));
				
				// Manifest				
				IFile featureXml = project.getFile("feature.xml");
				if (featureXml.exists()) {
					monitor.worked(featureXmlWork.size());
				} else {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					Writer writer = new OutputStreamWriter(baos);
					for (String pc: featureXmlWork.execute(context, monitor.split(featureXmlWork.size()))) {
						writer.write(pc);	
					}
					writer.close();
					baos.close(); 
					featureXml.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
				}
				
				// Build properties				
				IFile buildProperties = project.getFile("build.properties");
				if (buildProperties.exists()) {
					monitor.worked(buildPropertiesWork.size());
				} else {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					Writer writer = new OutputStreamWriter(baos);
					for (String pc: buildPropertiesWork.execute(context, monitor.split(buildPropertiesWork.size()))) {
						writer.write(pc);	
					}
					writer.close();
					baos.close(); 
					buildProperties.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
				}
				
				return project.getNature(FEATURE_NATURE_ID);								
			}
			
		};
	}
	

} //FeatureNatureImpl
