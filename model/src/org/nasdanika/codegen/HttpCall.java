/**
 */
package org.nasdanika.codegen;

import java.io.InputStream;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Makes an HTTP Call.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getBodyGenerator <em>Body Generator</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link org.nasdanika.codegen.HttpCall#getSuccessCode <em>Success Code</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall()
 * @model superTypes="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;"
 * @generated
 */
public interface HttpCall extends Generator<InputStream> {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The literals are from the enumeration {@link org.nasdanika.codegen.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.nasdanika.codegen.HttpMethod
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
	 * @see org.nasdanika.codegen.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Body Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Generator</em>' containment reference.
	 * @see #setBodyGenerator(Generator)
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_BodyGenerator()
	 * @model type="org.nasdanika.codegen.Generator&lt;org.nasdanika.codegen.InputStream&gt;" containment="true"
	 * @generated
	 */
	Generator<InputStream> getBodyGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.HttpCall#getBodyGenerator <em>Body Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Generator</em>' containment reference.
	 * @see #getBodyGenerator()
	 * @generated
	 */
	void setBodyGenerator(Generator<InputStream> value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.AbstractNamedGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getHttpCall_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNamedGenerator> getHeaders();

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

} // HttpCall
