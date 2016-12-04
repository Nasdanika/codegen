/**
 */
package org.nasdanika.codegen.java.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
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
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.impl.GeneratorImpl;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.util.CodegenValidator;

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
 * </ul>
 *
 * @generated
 */
public abstract class CompilationUnitImpl extends GeneratorImpl<ICompilationUnit> implements CompilationUnit {
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
	
	protected ICompilationUnit generateCompilationUnit(MutableContext context, String content, IProgressMonitor monitor) throws Exception {		
		SubMonitor subMon = SubMonitor.convert(monitor, 3);
		String interpolatedName = CodegenUtil.interpolate(getName(), context);
		if (!interpolatedName.endsWith(JAVA_EXTENSION)) {
			interpolatedName += JAVA_EXTENSION;
		}
		IPackageFragment packageFragment = context.get(IPackageFragment.class);		
		ICompilationUnit compilationUnit = packageFragment.getCompilationUnit(interpolatedName);
		if (compilationUnit.exists()) {						
			ICompilationUnit workingCopy = compilationUnit.getWorkingCopy(subMon.split(1));
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
				workingCopy.commitWorkingCopy(false, subMon.split(1));
			} finally {
				workingCopy.discardWorkingCopy();
			}				
		} else {
			compilationUnit = packageFragment.createCompilationUnit(interpolatedName, formatCompilationUnit(packageFragment.getJavaProject(), content), false, subMon.split(2)); 
		}
		
		return configure(context, compilationUnit, subMon.split(1));		
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
						 CodegenValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, JavaPackage.Literals.COMPILATION_UNIT__NAME }));
				
				result = false;
			}
		}
		return result;
	}	
	
} //CompilationUnitImpl


