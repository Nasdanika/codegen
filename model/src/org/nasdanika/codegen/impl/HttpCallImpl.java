/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.codegen.AbstractNamedGenerator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.HttpCall;
import org.nasdanika.codegen.HttpMethod;
import org.nasdanika.common.Context;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

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
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getBodyGenerator <em>Body Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.HttpCallImpl#getSuccessCode <em>Success Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpCallImpl extends GeneratorImpl<InputStream> implements HttpCall {
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
	@Override
	public Generator<InputStream> getBodyGenerator() {
		return (Generator<InputStream>)eDynamicGet(CodegenPackage.HTTP_CALL__BODY_GENERATOR, CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyGenerator(Generator<InputStream> newBodyGenerator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBodyGenerator, CodegenPackage.HTTP_CALL__BODY_GENERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyGenerator(Generator<InputStream> newBodyGenerator) {
		eDynamicSet(CodegenPackage.HTTP_CALL__BODY_GENERATOR, CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR, newBodyGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractNamedGenerator> getHeaders() {
		return (EList<AbstractNamedGenerator>)eDynamicGet(CodegenPackage.HTTP_CALL__HEADERS, CodegenPackage.Literals.HTTP_CALL__HEADERS, true, true);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
				return basicSetBodyGenerator(null, msgs);
			case CodegenPackage.HTTP_CALL__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
				return getBodyGenerator();
			case CodegenPackage.HTTP_CALL__HEADERS:
				return getHeaders();
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				return getReadTimeout();
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				return getSuccessCode();
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
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
				setBodyGenerator((Generator<InputStream>)newValue);
				return;
			case CodegenPackage.HTTP_CALL__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends AbstractNamedGenerator>)newValue);
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
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
				setBodyGenerator((Generator<InputStream>)null);
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
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
				return getBodyGenerator() != null;
			case CodegenPackage.HTTP_CALL__HEADERS:
				return !getHeaders().isEmpty();
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
				return getConnectTimeout() != CONNECT_TIMEOUT_EDEFAULT;
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
				return getReadTimeout() != READ_TIMEOUT_EDEFAULT;
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				return getSuccessCode() != SUCCESS_CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected Work<InputStream> createWorkItem(Context context) throws Exception {
		
		Map<String,Work<String>> headersWork = new HashMap<>();
		for (AbstractNamedGenerator h: getHeaders()) {
			headersWork.put(h.getName(), h.createWork(context));
		}
		
		Generator<InputStream> bodyGenerator = getBodyGenerator();
		Work<List<InputStream>> bodyWork = bodyGenerator == null ? null : bodyGenerator.createWork(context);
		
		return new Work<InputStream>() {

			@Override
			public long size() {
				long size = 1 + headersWork.values().stream().mapToLong(Work::size).sum();
				if (bodyWork != null) {
					size += bodyWork.size();
				}
				return size;
			}

			@Override
			public String getName() {
				return getTitle();
			}

			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				URL url = new URL(context.interpolate(getUrl()));
				URLConnection connection = url.openConnection();
				if (!(connection instanceof HttpURLConnection)) {
					throw new IllegalArgumentException("Not an HTTP(s) url: "+url);
				}
				
				HttpURLConnection httpConnection = (HttpURLConnection) connection;
				httpConnection.setRequestMethod(getMethod().getLiteral());
				httpConnection.setDoOutput(bodyWork != null);
				for (Entry<String, Work<String>> hwe: headersWork.entrySet()) {
					httpConnection.setRequestProperty(context.interpolate(hwe.getKey()), hwe.getValue().execute(progressMonitor.split("Generating header "+hwe.getKey(), hwe.getValue().size(), this)));
				}
				httpConnection.setConnectTimeout(getConnectTimeout() * 1000); 
				httpConnection.setReadTimeout(getReadTimeout() * 1000); 
				
				if (bodyWork != null) {
					try (OutputStream bout = new BufferedOutputStream(connection.getOutputStream())) {
						for (InputStream in: bodyWork.execute(progressMonitor.split("Generating request body", bodyWork.size(), this))) {
							try (InputStream bin = new BufferedInputStream(in)) {
								int b;
								while ((b = bin.read()) != -1) {
									bout.write(b);
								}
							}
						}
					}
				}
				
				int responseCode = httpConnection.getResponseCode();
				if (responseCode == getSuccessCode()) { 
					return httpConnection.getInputStream();
				}
				
				throw new NasdanikaException("HTTP Call to "+url+" has failed with response: "+responseCode+" "+httpConnection.getResponseMessage());
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true; // Assuming no side effects.
			}
			
		};
	}	

} //HttpCallImpl
