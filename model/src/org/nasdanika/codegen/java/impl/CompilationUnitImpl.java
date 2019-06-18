/**
 */
package org.nasdanika.codegen.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#isMerge <em>Merge</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#isFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends GeneratorImpl<ICompilationUnit> implements CompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(JavaPackage.Literals.COMPILATION_UNIT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JavaPackage.Literals.COMPILATION_UNIT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerge() {
		return (Boolean)eGet(JavaPackage.Literals.COMPILATION_UNIT__MERGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerge(boolean newMerge) {
		eSet(JavaPackage.Literals.COMPILATION_UNIT__MERGE, newMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormat() {
		return (Boolean)eGet(JavaPackage.Literals.COMPILATION_UNIT__FORMAT, true);
	}
	
	private static final String JAVA_EXTENSION = ".java";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(boolean newFormat) {
		eSet(JavaPackage.Literals.COMPILATION_UNIT__FORMAT, newFormat);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generator<String>> getGenerators() {
		return (EList<Generator<String>>)eGet(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS, true);
	}

	protected ICompilationUnit generateCompilationUnit(Context context, String content, SubMonitor monitor) throws Exception {		
		String interpolatedName = context.interpolate(getName());
		if (!interpolatedName.endsWith(JAVA_EXTENSION)) {
			interpolatedName += JAVA_EXTENSION;
		}
		IPackageFragment packageFragment = context.get(IPackageFragment.class);		
		ICompilationUnit compilationUnit = packageFragment.getCompilationUnit(interpolatedName);
		if (compilationUnit.exists()) {						
			ICompilationUnit workingCopy = compilationUnit.getWorkingCopy(monitor.split(1));
			try {
				if (isMerge()) {
				    JControlModel controlModel = new JControlModel();
			
				    // Obtaining merge rules URI.
					// create model
					GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
			
					// create adapter factory
					GeneratorAdapterFactory adapterFactory = GenModelGeneratorAdapterFactory.DESCRIPTOR.createAdapterFactory();
					adapterFactory.setGenerator(new org.eclipse.emf.codegen.ecore.generator.Generator());
					adapterFactory.initialize(genModel);
			
					// get merge rules URI
					String mergeRulesURI = adapterFactory.getGenerator().getOptions().mergeRulesURI;
				    
				    controlModel.initialize(CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName()), mergeRulesURI);
				    
					JMerger jMerger = new JMerger(controlModel);												
					
					JCompilationUnit scu = jMerger.createCompilationUnitForContents(content);
					jMerger.setSourceCompilationUnit(scu);
					
					JCompilationUnit tcu = jMerger.createCompilationUnitForContents(workingCopy.getSource());
					jMerger.setTargetCompilationUnit(tcu);
					
					jMerger.merge();
					
					content = jMerger.getTargetCompilationUnitContents();
				}
				workingCopy.getBuffer().setContents(formatCompilationUnit(packageFragment.getJavaProject(), content));
				workingCopy.commitWorkingCopy(false, monitor.split(1));
			} catch (Exception e) {
				throw new InvocationTargetException(e, "A problem merging "+compilationUnit.getResource().getProjectRelativePath());
			} finally {
				workingCopy.discardWorkingCopy();
			}				
		} else {
			compilationUnit = packageFragment.createCompilationUnit(interpolatedName, formatCompilationUnit(packageFragment.getJavaProject(), content), false, monitor.split(2)); 
		}
		
		return compilationUnit;		
	}
	
	private String formatCompilationUnit(IJavaProject javaProject, String content) throws BadLocationException {
		if (isFormat()) {
			CodeFormatter formatter = ToolFactory.createCodeFormatter(javaProject.getOptions(true));
			if (formatter != null) {
				TextEdit formatted = formatter.format(
						CodeFormatter.K_COMPILATION_UNIT, 
						content, 
						0,
						content.length(),
						0, 
						System.lineSeparator());
				
				IDocument document = new Document(content);
				formatted.apply(document);
				return document.get();
			}
		}
		return content;
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
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, JavaPackage.Literals.COMPILATION_UNIT__NAME }));
				
				result = false;
			}
		}
		return result;
	}
	
	@Override
	public boolean isFilterable() {
		return true;
	}
	
	
	@Override
	protected Work<ICompilationUnit> createWorkItem() throws Exception {		
		List<Work<List<String>>> gWorkList = new ArrayList<>();
		for (Generator<String> g: getGenerators()) {
			gWorkList.add(g.createWork());
		}
		
		return new Work<ICompilationUnit>() {

			@Override
			public int size() {
				int ret = 3; // 3 is generateCompilationUnit work size
				for (Work<List<String>> w: gWorkList) {
					ret += w.size();
				}
				return ret; 
			}
			
			@Override
			public ICompilationUnit execute(Context context, SubMonitor monitor) throws Exception {
				IPackageFragment packageFragment = context.get(IPackageFragment.class);
				Object pTypesObj = context.get("package-types"); // List of short names of types defined in the containing package.
				Set<String> implicitImports = new HashSet<>();
				if (pTypesObj instanceof Iterable) {
					for (Object pType: (Iterable<?>) pTypesObj) {
						implicitImports.add(packageFragment.getElementName()+"."+pType);
					}
				}
				ImportManager importManager = new SimpleImportManager(implicitImports);
				MutableContext gContext = context.createSubContext();
				gContext.set(ImportManager.class, importManager);
				gContext.set("import", importManager);
				
				StringBuilder bodyBuilder = new StringBuilder();
				for (Work<List<String>> gWork: gWorkList) {
					for (String e: gWork.execute(gContext, monitor)) {
						if (bodyBuilder.length() > 0) {
							bodyBuilder.append(System.lineSeparator());
						}
						bodyBuilder.append(e);
					}
				}
				
				StringBuilder contentBuilder = new StringBuilder();
				contentBuilder.append("package ").append(packageFragment.getElementName()).append(";").append(System.lineSeparator()).append(System.lineSeparator());
				
				String lastFirstPackageSegment = null;
				for (String ie: importManager.getImports()) {
					int dotIdx = ie.indexOf('.');
					String fps = ie.substring(0, dotIdx);
					if (lastFirstPackageSegment != null && !lastFirstPackageSegment.equals(fps)) {
						contentBuilder.append(System.lineSeparator());
					}
					contentBuilder.append("import ").append(ie).append(";").append(System.lineSeparator());
				}
				contentBuilder.append(System.lineSeparator());
				contentBuilder.append(bodyBuilder);
				
				return generateCompilationUnit(gContext, contentBuilder.toString(), monitor);
			}
			
		};
	}	
	

	
} //CompilationUnitImpl


