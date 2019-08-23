/**
 */
package org.nasdanika.codegen.java.impl;

import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.impl.TextFileImpl;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.codegen.java.JDKLevel;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#isFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends TextFileImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #isFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORMAT_EDEFAULT = true;
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
	@Override
	public boolean isFormat() {
		return (Boolean)eDynamicGet(JavaPackage.COMPILATION_UNIT__FORMAT, JavaPackage.Literals.COMPILATION_UNIT__FORMAT, true, true);
	}
	
	private static final String JAVA_EXTENSION = ".java";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(boolean newFormat) {
		eDynamicSet(JavaPackage.COMPILATION_UNIT__FORMAT, JavaPackage.Literals.COMPILATION_UNIT__FORMAT, newFormat);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				return isFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				setFormat((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				return isFormat() != FORMAT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected Merger<String> getNativeMerger(Context context) {
		return new Merger<String>() {
			
			@Override
			public String merge(Context context, File<InputStream> file, String oldContent, String newContent, ProgressMonitor progressMonitor) throws Exception {
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
			    
			    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
			    facadeHelper.setCompilerCompliance(context.get(JDKLevel.class).getLiteral());
				controlModel.initialize(facadeHelper, mergeRulesURI);
			    
				JMerger jMerger = new JMerger(controlModel);												
				
				JCompilationUnit scu = jMerger.createCompilationUnitForContents(newContent);
				jMerger.setSourceCompilationUnit(scu);
				
				JCompilationUnit tcu = jMerger.createCompilationUnitForContents(oldContent);
				jMerger.setTargetCompilationUnit(tcu);
				
				jMerger.merge();
				
				return jMerger.getTargetCompilationUnitContents();
			}
		};
	}
	
	@Override
	protected boolean hasNativeMerger() {
		return true;
	}
	
	@Override
	protected String join(Context context, List<String> content) throws Exception {
		StringBuilder contentBuilder = new StringBuilder();
		contentBuilder.append("package ").append(context.getString(PackageImpl.PACKAGE_NAME_KEY)).append(";").append(System.lineSeparator()).append(System.lineSeparator());
		
		String lastFirstPackageSegment = null;
		for (String ie: context.get(ImportManager.class).getImports()) {
			int dotIdx = ie.indexOf('.');
			String fps = ie.substring(0, dotIdx);
			if (lastFirstPackageSegment != null && !lastFirstPackageSegment.equals(fps)) {
				contentBuilder.append(System.lineSeparator());
			}
			contentBuilder.append("import ").append(ie).append(";").append(System.lineSeparator());
		}
		contentBuilder.append(System.lineSeparator());
		contentBuilder.append(super.join(context, content));
		
		return formatCompilationUnit(contentBuilder.toString());
	}
	
	private String formatCompilationUnit(String content) throws BadLocationException {
		if (isFormat()) {
			CodeFormatter formatter = ToolFactory.createCodeFormatter(null); // possibly TODO - options from the configuration.
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
	
	@Override
	public boolean isFilterable() {
		return true;
	}
	
	@Override
	protected String finalName(String name) {
		return name.endsWith(JAVA_EXTENSION) ? name : name + ".java";
	}
	
	@Override
	protected Context createContext(Context parent) {
		Object pTypesObj = parent.get(PackageImpl.PACKAGE_TYPES_KEY); // List of short names of types defined in the containing package. TODO - fill out by types.
		Set<String> implicitImports = new HashSet<>();
		if (pTypesObj instanceof Iterable) {
			for (Object pType: (Iterable<?>) pTypesObj) {
				implicitImports.add(parent.getString(PackageImpl.PACKAGE_NAME_KEY)+"."+pType);
			}
		}

		ImportManager importManager = new SimpleImportManager(implicitImports);
		return Context.singleton("import", importManager)
				.compose(Context.singleton(ImportManager.class, importManager))
				.compose(super.createContext(parent));
	}
		
} //CompilationUnitImpl


