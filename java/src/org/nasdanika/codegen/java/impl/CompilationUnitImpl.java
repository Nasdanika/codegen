/**
 */
package org.nasdanika.codegen.java.impl;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;
import org.nasdanika.codegen.Merger;
import org.nasdanika.codegen.impl.TextFileImpl;
import org.nasdanika.codegen.java.CompilationUnit;
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
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#isMerge <em>Merge</em>}</li>
 *   <li>{@link org.nasdanika.codegen.java.impl.CompilationUnitImpl#isFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends TextFileImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #isMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerge()
	 * @generated
	 * @ordered
	 */
	protected boolean merge = MERGE_EDEFAULT;
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
	 * The cached value of the '{@link #isFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormat()
	 * @generated
	 * @ordered
	 */
	protected boolean format = FORMAT_EDEFAULT;

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
	public boolean isMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerge(boolean newMerge) {
		boolean oldMerge = merge;
		merge = newMerge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__MERGE, oldMerge, merge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFormat() {
		return format;
	}
	
	private static final String JAVA_EXTENSION = ".java";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(boolean newFormat) {
		boolean oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__FORMAT, oldFormat, format));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__MERGE:
				return isMerge();
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
			case JavaPackage.COMPILATION_UNIT__MERGE:
				setMerge((Boolean)newValue);
				return;
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
			case JavaPackage.COMPILATION_UNIT__MERGE:
				setMerge(MERGE_EDEFAULT);
				return;
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
			case JavaPackage.COMPILATION_UNIT__MERGE:
				return merge != MERGE_EDEFAULT;
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				return format != FORMAT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (merge: ");
		result.append(merge);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
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
			    
			    controlModel.initialize(CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName()), mergeRulesURI);
			    
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
	protected String join(List<String> content) throws Exception {
		String joinedContent = super.join(content);
		return isFormat() ? formatCompilationUnit(joinedContent) : joinedContent;
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
		
} //CompilationUnitImpl


