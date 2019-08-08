/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ECoreModelGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECore Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ECoreModelGeneratorImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECoreModelGeneratorImpl extends GeneratorImpl<InputStream> implements ECoreModelGenerator {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECoreModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.ECORE_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(CodegenPackage.ECORE_MODEL_GENERATOR__MODEL, CodegenPackage.Literals.ECORE_MODEL_GENERATOR__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(CodegenPackage.ECORE_MODEL_GENERATOR__MODEL, CodegenPackage.Literals.ECORE_MODEL_GENERATOR__MODEL, newModel);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.ECORE_MODEL_GENERATOR__MODEL:
				return getModel();
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
			case CodegenPackage.ECORE_MODEL_GENERATOR__MODEL:
				setModel((String)newValue);
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
			case CodegenPackage.ECORE_MODEL_GENERATOR__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case CodegenPackage.ECORE_MODEL_GENERATOR__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Work<InputStream> createWorkItem(Context context) throws Exception {

		return new Work<InputStream>() {
			
			@Override
			public long size() {
				return 1;
			}
			
			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
			@Override
			public String getName() {
				return "Ecore model generator "+getTitle();
			}
			
			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(URI.createURI("http:///irrelevant.xml"));
				resource.getContents().add(EcoreUtil.copy((EObject) context.get(getModel())));
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				resource.save(baos, null);
				baos.close();
				return new ByteArrayInputStream(baos.toByteArray());
			}
			
		};
		
	}

} //ECoreModelGeneratorImpl
