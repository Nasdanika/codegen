/**
 */
package org.nasdanika.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.File;
import org.nasdanika.codegen.Generator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getMergerArguments <em>Merger Arguments</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.FileImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends ResourceImpl implements File {
	/**
	 * The default value of the '{@link #getMerger() <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Generator> getGenerators() {
		return (EList<Generator>)eDynamicGet(CodegenPackage.FILE__GENERATORS, CodegenPackage.Literals.FILE__GENERATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerger() {
		return (String)eDynamicGet(CodegenPackage.FILE__MERGER, CodegenPackage.Literals.FILE__MERGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerger(String newMerger) {
		eDynamicSet(CodegenPackage.FILE__MERGER, CodegenPackage.Literals.FILE__MERGER, newMerger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getMergerArguments() {
		return (EList<String>)eDynamicGet(CodegenPackage.FILE__MERGER_ARGUMENTS, CodegenPackage.Literals.FILE__MERGER_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return (String)eDynamicGet(CodegenPackage.FILE__ENCODING, CodegenPackage.Literals.FILE__ENCODING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		eDynamicSet(CodegenPackage.FILE__ENCODING, CodegenPackage.Literals.FILE__ENCODING, newEncoding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.FILE__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.FILE__GENERATORS:
				return getGenerators();
			case CodegenPackage.FILE__MERGER:
				return getMerger();
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				return getMergerArguments();
			case CodegenPackage.FILE__ENCODING:
				return getEncoding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.FILE__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator>)newValue);
				return;
			case CodegenPackage.FILE__MERGER:
				setMerger((String)newValue);
				return;
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				getMergerArguments().clear();
				getMergerArguments().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.FILE__ENCODING:
				setEncoding((String)newValue);
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
			case CodegenPackage.FILE__GENERATORS:
				getGenerators().clear();
				return;
			case CodegenPackage.FILE__MERGER:
				setMerger(MERGER_EDEFAULT);
				return;
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				getMergerArguments().clear();
				return;
			case CodegenPackage.FILE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
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
			case CodegenPackage.FILE__GENERATORS:
				return !getGenerators().isEmpty();
			case CodegenPackage.FILE__MERGER:
				return MERGER_EDEFAULT == null ? getMerger() != null : !MERGER_EDEFAULT.equals(getMerger());
			case CodegenPackage.FILE__MERGER_ARGUMENTS:
				return !getMergerArguments().isEmpty();
			case CodegenPackage.FILE__ENCODING:
				return ENCODING_EDEFAULT == null ? getEncoding() != null : !ENCODING_EDEFAULT.equals(getEncoding());
		}
		return super.eIsSet(featureID);
	}

} //FileImpl
