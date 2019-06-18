/**
 */
package org.nasdanika.codegen.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ECoreModelGenerator;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

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
	public String getModel() {
		return (String)eGet(CodegenPackage.Literals.ECORE_MODEL_GENERATOR__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(CodegenPackage.Literals.ECORE_MODEL_GENERATOR__MODEL, newModel);
	}


	@Override
	public Work<InputStream> createWorkItem() throws Exception {
		return new Work<InputStream>() {
			
			@Override
			public int size() {
				return 1;
			}
			
			@Override
			public InputStream execute(Context context, SubMonitor monitor) throws Exception {
				try {
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(URI.createURI("http:///irrelevant.xml"));
					resource.getContents().add(EcoreUtil.copy((EObject) context.get(getModel())));
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					resource.save(baos, null);
					baos.close();
					return new ByteArrayInputStream(baos.toByteArray());
				} finally {
					monitor.worked(size());
				}
			}
			
		};
	}

} //ECoreModelGeneratorImpl
