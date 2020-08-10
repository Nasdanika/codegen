/**
 */
package org.nasdanika.codegen;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.HttpMethod;
import org.nasdanika.ncore.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Makes an HTTP Call. Converts result to Map/List for ``application/json`` content type, to text for ``text/...`` content types. Returns a byte array otherwise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getSuccessCode <em>Success Code</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#isInterpolate <em>Interpolate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall()
 * @model
 * @generated
 */
public interface HttpCall extends ContentGenerator {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL resolved relative to the model resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.ncore.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.ncore.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Method()
	 * @model default="GET"
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.ncore.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ncore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHeaders();

	/**
	 * Returns the value of the '<em><b>Connect Timeout</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connect timeout in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connect Timeout</em>' attribute.
	 * @see #setConnectTimeout(int)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_ConnectTimeout()
	 * @model default="60"
	 * @generated
	 */
	int getConnectTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getConnectTimeout <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Timeout</em>' attribute.
	 * @see #getConnectTimeout()
	 * @generated
	 */
	void setConnectTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Read Timeout</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read timeout in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Timeout</em>' attribute.
	 * @see #setReadTimeout(int)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_ReadTimeout()
	 * @model default="60"
	 * @generated
	 */
	int getReadTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getReadTimeout <em>Read Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Timeout</em>' attribute.
	 * @see #getReadTimeout()
	 * @generated
	 */
	void setReadTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Success Code</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP response code indicating success.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Success Code</em>' attribute.
	 * @see #setSuccessCode(int)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_SuccessCode()
	 * @model default="200"
	 * @generated
	 */
	int getSuccessCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getSuccessCode <em>Success Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Code</em>' attribute.
	 * @see #getSuccessCode()
	 * @generated
	 */
	void setSuccessCode(int value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ContentGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentGenerator> getBody();

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If ``true`` response body is converted to String using the context charset (defaults to UTF-8), interpolated, and then converted to input stream using the same charset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Interpolate()
	 * @model default="false"
	 * @generated
	 */
	boolean isInterpolate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#isInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #isInterpolate()
	 * @generated
	 */
	void setInterpolate(boolean value);

} // HttpCall
