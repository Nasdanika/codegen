/**
 */
package org.nasdanika.codegen;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.SupplierFactory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generator is the base class for model element performing code generation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.Generator#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getConfigurationReference <em>Configuration Reference</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getController <em>Controller</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getControllerArguments <em>Controller Arguments</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getNamedGenerators <em>Named Generators</em>}</li>
 *   <li>{@link org.nasdanika.codegen.Generator#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getGenerator()
 * @model abstract="true" superTypes="org.nasdanika.codegen.WorkFactory&lt;org.nasdanika.codegen.List&lt;T&gt;&gt;"
 * @generated
 */
public interface Generator<T> extends EObject, SupplierFactory<List<T>> {
	
	/**
	 * If diagnostic context with has this key with value ``true`` then java contributors such as controllers, mergers, java generators
	 * shall be instantiated and their validate() methods shall be invoked where applicable. This flag shall be set to true at runtime, 
	 * before generation and typically wouldn't be set to true at design time when java contributors may not be available for loading.
	 */
	String VALIDATE_JAVA_CONTRIBUTORS = GeneratorController.class.getName()+":validate-java-contributors";
	

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator descriptive name to display in the editor, reports and progress monitors .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator controller class. Must implement org.nasdanika.codegen.GeneratorController
	 * for generators and org.nasdanika.codegen.GroupController for groups.
	 * 
	 * It is also possible to pass method reference using ``::`` notation, e.g. ``com.mycompany.MyUtil::codeGenerationController``. 
	 * The referenced method shall take the same paramters as ``GeneratorController::iterate`` - context and generator.
	 * The method can be static. In this case the list of controller arguments must be empty.
	 * 
	 * Note that controller classes can validate the generator, but controller methods can only iterate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Controller()
	 * @model annotation="org.nasdanika.ui.java-class root-type='org.nasdanika.codegen.GeneratorController' super-interfaces='org.nasdanika.codegen.GeneratorController'"
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Controller Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controller constructor arguments. Codegen uses the first constructor with the matching number of parameters.
	 * 
	 * String argument values are interpolated by the context and then are converted to 
	 * the constructor parameter types using ``Converter`` service obtained from the context
	 * or ``DefaultConverter.INSTANCE`` if there is no converter service. 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Arguments</em>' attribute list.
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_ControllerArguments()
	 * @model
	 * @generated
	 */
	EList<String> getControllerArguments();

	/**
	 * Returns the value of the '<em><b>Named Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.AbstractNamedGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Generators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This class allows to mount generators to the parent generator context as property providers
	 * accessible by name. It can be used for conditional invocation of named
	 * generators by the containing generator. context.get(generatorName) returns Supplier created by contained generator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Generators</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_NamedGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNamedGenerator> getNamedGenerators();

	/**
	 * Returns the value of the '<em><b>Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.Descriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors</em>' containment reference list.
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Descriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Descriptor> getDescriptors();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator creates supplier  only if this attribute is true. 
	 * The purpose of this attribute is to help with generator model development 
	 * by disabling model parts which are still supplier in progress and would fail the generation
	 * process, or, on the opposite, already working parts which would create delay and distraction
	 * in testing and troubleshooting. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generator description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Custom generator configuration in YAML format.
	 * Configuration is merged into a context passed to the supplier created by the generator.
	 * Configuration values may contain interpolation tokens referencing other properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interpolated URL of generator configuration in YAML, JSON, or properties formats. Format is determined by extension - ``.yml``, ``.json``, or ``.properties``.
	 * The URL is resolved relative to the model. If both inline configuration and configurationReference are defined the configuration reference entries shadow the configuration entries.
	 * 
	 * As with the inline configuration, referenced configuration is merged into a context passed to the supplier created by the generator.
	 * Configuration values may contain interpolation tokens referencing other properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Reference</em>' attribute.
	 * @see #setConfigurationReference(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_ConfigurationReference()
	 * @model
	 * @generated
	 */
	String getConfigurationReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getConfigurationReference <em>Configuration Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Reference</em>' attribute.
	 * @see #getConfigurationReference()
	 * @generated
	 */
	void setConfigurationReference(String value);

	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If contextPath is not null and not empty/blank then the given path used as a prefix 
	 * prepended to the propety names when getting property values from the context. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_ContextPath()
	 * @model
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not blank the predicate shall be a Java expression evaluating to boolean. 
	 * If it evaluates to true then generation supplier gets executed. 
	 * The predicate expression has access to ``context`` variable. Use ``context.get()`` for retrieval of values from the context.
	 * 
	 * The predicate expression is interpolated with the context, so another way to access context properties is to use tokens. 
	 * For example ``context.get("my-property") > 0`` and ``${my-property} > 0`` are equivalent. 
	 * To safely handle the case ``my-property`` not being set  a property default value may be used in the second option ``${my-property|0} > 0``.
	 * 
	 * For more advanced control over execution use controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see org.nasdanika.codegen.CodegenPackage#getGenerator_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.Generator#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource generators shall return true from this method, e.g.:
	 * 
	 * * Project, 
	 * * File, 
	 * * Folder, 
	 * * Package fragment (root)
	 * * Compilation unit.
	 * * Zip Archive
	 * 
	 * Generators which do not create workspace resources but rather contribute to their creation shall return false.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFilterable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Generator
