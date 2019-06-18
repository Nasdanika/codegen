/**
 */
package org.nasdanika.codegen.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Converter;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.util.CodegenValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ConverterImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConverterImpl<S, T> extends GeneratorImpl<T> implements Converter<S, T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<S> getGenerator() {
		return (Generator<S>)eGet(CodegenPackage.Literals.CONVERTER__GENERATOR, true);
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getGenerator() == null) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 CodegenValidator.DIAGNOSTIC_SOURCE,
					 CodegenValidator.GENERATOR__VALIDATE,
					 "["+EObjectValidator.getObjectLabel(this, context)+"] Generator is not set",
					 new Object [] { this, CodegenPackage.Literals.CONVERTER__GENERATOR }));
			
				result = false;						
			}
			
		}
		return result;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator<S> newGenerator) {
		eSet(CodegenPackage.Literals.CONVERTER__GENERATOR, newGenerator);
	}

} //ConverterImpl
