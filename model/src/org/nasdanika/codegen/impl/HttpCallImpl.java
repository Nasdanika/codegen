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
import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.HttpCall;

import org.nasdanika.ncore.Entry;
import org.nasdanika.ncore.HttpMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getSuccessCode <em>Success Code</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpCallImpl extends GeneratorImpl implements HttpCall {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The default value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECT_TIMEOUT_EDEFAULT = 60;

	/**
	 * The default value of the '{@link #getReadTimeout() <em>Read Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_TIMEOUT_EDEFAULT = 60;

	/**
	 * The default value of the '{@link #getSuccessCode() <em>Success Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCode()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCESS_CODE_EDEFAULT = 200;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.HTTP_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(CodegenPackage.HTTP_CALL__URL, CodegenPackage.Literals.HTTP_CALL__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(CodegenPackage.HTTP_CALL__URL, CodegenPackage.Literals.HTTP_CALL__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpMethod getMethod() {
		return (HttpMethod)eDynamicGet(CodegenPackage.HTTP_CALL__METHOD, CodegenPackage.Literals.HTTP_CALL__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(HttpMethod newMethod) {
		eDynamicSet(CodegenPackage.HTTP_CALL__METHOD, CodegenPackage.Literals.HTTP_CALL__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entry> getHeaders() {
		return (EList<Entry>)eDynamicGet(CodegenPackage.HTTP_CALL__HEADERS, CodegenPackage.Literals.HTTP_CALL__HEADERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectTimeout() {
		return (Integer)eDynamicGet(CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT, CodegenPackage.Literals.HTTP_CALL__CONNECT_TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(int newConnectTimeout) {
		eDynamicSet(CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT, CodegenPackage.Literals.HTTP_CALL__CONNECT_TIMEOUT, newConnectTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReadTimeout() {
		return (Integer)eDynamicGet(CodegenPackage.HTTP_CALL__READ_TIMEOUT, CodegenPackage.Literals.HTTP_CALL__READ_TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadTimeout(int newReadTimeout) {
		eDynamicSet(CodegenPackage.HTTP_CALL__READ_TIMEOUT, CodegenPackage.Literals.HTTP_CALL__READ_TIMEOUT, newReadTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSuccessCode() {
		return (Integer)eDynamicGet(CodegenPackage.HTTP_CALL__SUCCESS_CODE, CodegenPackage.Literals.HTTP_CALL__SUCCESS_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessCode(int newSuccessCode) {
		eDynamicSet(CodegenPackage.HTTP_CALL__SUCCESS_CODE, CodegenPackage.Literals.HTTP_CALL__SUCCESS_CODE, newSuccessCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ContentGenerator> getBody() {
		return (EList<ContentGenerator>)eDynamicGet(CodegenPackage.HTTP_CALL__BODY, CodegenPackage.Literals.HTTP_CALL__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.HTTP_CALL__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case CodegenPackage.HTTP_CALL__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.HTTP_CALL__URL:
				return getUrl();
			case CodegenPackage.HTTP_CALL__METHOD:
				return getMethod();
			case CodegenPackage.HTTP_CALL__HEADERS:
				return getHeaders();
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				return getReadTimeout();
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				return getSuccessCode();
			case CodegenPackage.HTTP_CALL__BODY:
				return getBody();
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
			case CodegenPackage.HTTP_CALL__URL:
				setUrl((String)newValue);
				return;
			case CodegenPackage.HTTP_CALL__METHOD:
				setMethod((HttpMethod)newValue);
				return;
			case CodegenPackage.HTTP_CALL__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Entry>)newValue);
				return;
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				setConnectTimeout((Integer)newValue);
				return;
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				setReadTimeout((Integer)newValue);
				return;
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				setSuccessCode((Integer)newValue);
				return;
			case CodegenPackage.HTTP_CALL__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ContentGenerator>)newValue);
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
			case CodegenPackage.HTTP_CALL__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CodegenPackage.HTTP_CALL__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case CodegenPackage.HTTP_CALL__HEADERS:
				getHeaders().clear();
				return;
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
				return;
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				setReadTimeout(READ_TIMEOUT_EDEFAULT);
				return;
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				setSuccessCode(SUCCESS_CODE_EDEFAULT);
				return;
			case CodegenPackage.HTTP_CALL__BODY:
				getBody().clear();
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
			case CodegenPackage.HTTP_CALL__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case CodegenPackage.HTTP_CALL__METHOD:
				return getMethod() != METHOD_EDEFAULT;
			case CodegenPackage.HTTP_CALL__HEADERS:
				return !getHeaders().isEmpty();
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				return getConnectTimeout() != CONNECT_TIMEOUT_EDEFAULT;
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				return getReadTimeout() != READ_TIMEOUT_EDEFAULT;
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				return getSuccessCode() != SUCCESS_CODE_EDEFAULT;
			case CodegenPackage.HTTP_CALL__BODY:
				return !getBody().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HttpCallImpl
