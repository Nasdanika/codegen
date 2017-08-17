/**
 */
package org.nasdanika.codegen.java.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.NatureImpl;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.PluginNature;
import org.nasdanika.config.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getManifestGenerator <em>Manifest Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getBuildPropertiesGenerator <em>Build Properties Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getPluginXmlGenerator <em>Plugin Xml Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.PluginNatureImpl#getFragmentXmlGenerator <em>Fragment Xml Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginNatureImpl extends NatureImpl implements PluginNature {
	private static final String PLUGIN_NATURE_ID = "org.eclipse.pde.PluginNature";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginNatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PLUGIN_NATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getManifestGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__MANIFEST_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestGenerator(Generator<String> newManifestGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__MANIFEST_GENERATOR, newManifestGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getBuildPropertiesGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildPropertiesGenerator(Generator<String> newBuildPropertiesGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__BUILD_PROPERTIES_GENERATOR, newBuildPropertiesGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getPluginXmlGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__PLUGIN_XML_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginXmlGenerator(Generator<String> newPluginXmlGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__PLUGIN_XML_GENERATOR, newPluginXmlGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<String> getFragmentXmlGenerator() {
		return (Generator<String>)eGet(JavaPackage.Literals.PLUGIN_NATURE__FRAGMENT_XML_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragmentXmlGenerator(Generator<String> newFragmentXmlGenerator) {
		eSet(JavaPackage.Literals.PLUGIN_NATURE__FRAGMENT_XML_GENERATOR, newFragmentXmlGenerator);
	}

	@Override
	public Work<IProjectNature> createWorkItem() throws Exception {
		Work<List<String>> manifestWork = getManifestGenerator().createWork();
		Work<List<String>> buildPropertiesWork = getBuildPropertiesGenerator().createWork();
		
		Generator<String> pluginGenerator = getPluginXmlGenerator();
		Work<List<String>> pluginWork = pluginGenerator == null ? Work.noWork() : pluginGenerator.createWork();
		
		Generator<String> fragmentGenerator = pluginGenerator == null ? getPluginXmlGenerator() : null;
		Work<List<String>> fragmentWork = fragmentGenerator == null ? Work.noWork() : fragmentGenerator.createWork();
		
		return new Work<IProjectNature>() {

			@Override
			public int size() {
				return 6 + manifestWork.size() + buildPropertiesWork.size() + pluginWork.size() + fragmentWork.size();
			}

			@Override
			public IProjectNature execute(Context context, SubMonitor monitor) throws Exception {
				IProject project = context.get(IProject.class);
				
				IProjectDescription desc = project.getDescription();
				String[] prevNatures = desc.getNatureIds();
				String[] newNatures = new String[prevNatures.length + 1];
				System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
				newNatures[prevNatures.length] = PLUGIN_NATURE_ID;
				desc.setNatureIds(newNatures);

		        ICommand [] oldBuilders = desc.getBuildSpec();
		        ICommand[] builders = new ICommand [oldBuilders.length + 2];
		        System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);

		        builders[oldBuilders.length-1] = desc.newCommand();
		        builders[oldBuilders.length-1].setBuilderName("org.eclipse.pde.ManifestBuilder");
		        
		        builders[oldBuilders.length] = desc.newCommand();
		        builders[oldBuilders.length].setBuilderName("org.eclipse.pde.SchemaBuilder");
		        
				project.setDescription(desc, monitor.split(1));
				
				// Manifest				
				IFile manifest = project.getFile("META-INF/MANIFEST.MF");
				if (manifest.exists()) {
					monitor.worked(manifestWork.size());
				} else {
					IFolder metaInf = project.getFolder("META-INF");
					if (!metaInf.exists()) {
						metaInf.create(false, true, monitor.split(1));
					}
					
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					Writer writer = new OutputStreamWriter(baos);
					for (String pc: manifestWork.execute(context, monitor.split(manifestWork.size()))) {
						writer.write(pc);	
					}
					writer.close();
					baos.close(); 
					manifest.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
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
								
				// plugin.xml
				if (pluginWork.size() > 0) {
					IFile pluginXml = project.getFile("plugin.xml");
					if (pluginXml.exists()) {
						monitor.worked(pluginWork.size());
					} else {
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						Writer writer = new OutputStreamWriter(baos);
						for (String pc: pluginWork.execute(context, monitor.split(pluginWork.size()))) {
							writer.write(pc);	
						}
						writer.close();
						baos.close(); 
						pluginXml.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
					}
				} else if (fragmentWork.size() > 0) {
					IFile fragmentXml = project.getFile("fragment.xml");
					if (fragmentXml.exists()) {
						monitor.worked(fragmentWork.size());
					} else {
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						Writer writer = new OutputStreamWriter(baos);
						for (String pc: fragmentWork.execute(context, monitor.split(fragmentWork.size()))) {
							writer.write(pc);	
						}
						writer.close();
						baos.close(); 
						fragmentXml.create(new ByteArrayInputStream(baos.toByteArray()), false, monitor.split(1));
					}					
				}
				
				IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
				List<IClasspathEntry> classpathEntries = new ArrayList<>();
				for (IClasspathEntry cpe: javaProject.getRawClasspath()) {
					classpathEntries.add(cpe);
				}
				classpathEntries.add(
						JavaCore.newContainerEntry(
								new Path("org.eclipse.pde.core.requiredPlugins")));

				javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]),	monitor.split(1));
				
				return project.getNature(PLUGIN_NATURE_ID);								
			}
			
		};
	}
	

} //PluginNatureImpl
