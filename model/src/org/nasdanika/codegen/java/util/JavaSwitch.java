/**
 */
package org.nasdanika.codegen.java.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Nature;
import org.nasdanika.codegen.WorkFactory;
import org.nasdanika.codegen.java.Annotation;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.Constructor;
import org.nasdanika.codegen.java.FeatureNature;
import org.nasdanika.codegen.java.Field;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.codegen.java.JavaNature;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.codegen.java.Operation;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.codegen.java.PackageFragmentRoot;
import org.nasdanika.codegen.java.PluginNature;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.config.Configuration;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaPackage.JAVA_NATURE: {
				JavaNature javaNature = (JavaNature)theEObject;
				T1 result = caseJavaNature(javaNature);
				if (result == null) result = caseNature(javaNature);
				if (result == null) result = caseGenerator(javaNature);
				if (result == null) result = caseConfiguration(javaNature);
				if (result == null) result = caseWorkFactory(javaNature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE_FRAGMENT_ROOT: {
				PackageFragmentRoot packageFragmentRoot = (PackageFragmentRoot)theEObject;
				T1 result = casePackageFragmentRoot(packageFragmentRoot);
				if (result == null) result = caseGenerator(packageFragmentRoot);
				if (result == null) result = caseConfiguration(packageFragmentRoot);
				if (result == null) result = caseWorkFactory(packageFragmentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE_FRAGMENT: {
				PackageFragment packageFragment = (PackageFragment)theEObject;
				T1 result = casePackageFragment(packageFragment);
				if (result == null) result = caseGenerator(packageFragment);
				if (result == null) result = caseConfiguration(packageFragment);
				if (result == null) result = caseWorkFactory(packageFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T1 result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseGenerator(compilationUnit);
				if (result == null) result = caseConfiguration(compilationUnit);
				if (result == null) result = caseWorkFactory(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MEMBER: {
				Member member = (Member)theEObject;
				T1 result = caseMember(member);
				if (result == null) result = caseGenerator(member);
				if (result == null) result = caseConfiguration(member);
				if (result == null) result = caseWorkFactory(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE: {
				Type type = (Type)theEObject;
				T1 result = caseType(type);
				if (result == null) result = caseMember(type);
				if (result == null) result = caseGenerator(type);
				if (result == null) result = caseConfiguration(type);
				if (result == null) result = caseWorkFactory(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FIELD: {
				Field field = (Field)theEObject;
				T1 result = caseField(field);
				if (result == null) result = caseMember(field);
				if (result == null) result = caseGenerator(field);
				if (result == null) result = caseConfiguration(field);
				if (result == null) result = caseWorkFactory(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T1 result = caseOperation(operation);
				if (result == null) result = caseMember(operation);
				if (result == null) result = caseGenerator(operation);
				if (result == null) result = caseConfiguration(operation);
				if (result == null) result = caseWorkFactory(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASS: {
				org.nasdanika.codegen.java.Class class_ = (org.nasdanika.codegen.java.Class)theEObject;
				T1 result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseMember(class_);
				if (result == null) result = caseGenerator(class_);
				if (result == null) result = caseConfiguration(class_);
				if (result == null) result = caseWorkFactory(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T1 result = caseInterface(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseMember(interface_);
				if (result == null) result = caseGenerator(interface_);
				if (result == null) result = caseConfiguration(interface_);
				if (result == null) result = caseWorkFactory(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T1 result = caseAnnotation(annotation);
				if (result == null) result = caseType(annotation);
				if (result == null) result = caseMember(annotation);
				if (result == null) result = caseGenerator(annotation);
				if (result == null) result = caseConfiguration(annotation);
				if (result == null) result = caseWorkFactory(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ENUM: {
				org.nasdanika.codegen.java.Enum enum_ = (org.nasdanika.codegen.java.Enum)theEObject;
				T1 result = caseEnum(enum_);
				if (result == null) result = caseType(enum_);
				if (result == null) result = caseMember(enum_);
				if (result == null) result = caseGenerator(enum_);
				if (result == null) result = caseConfiguration(enum_);
				if (result == null) result = caseWorkFactory(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T1 result = caseConstructor(constructor);
				if (result == null) result = caseOperation(constructor);
				if (result == null) result = caseMember(constructor);
				if (result == null) result = caseGenerator(constructor);
				if (result == null) result = caseConfiguration(constructor);
				if (result == null) result = caseWorkFactory(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.METHOD: {
				Method method = (Method)theEObject;
				T1 result = caseMethod(method);
				if (result == null) result = caseOperation(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseGenerator(method);
				if (result == null) result = caseConfiguration(method);
				if (result == null) result = caseWorkFactory(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PLUGIN_NATURE: {
				PluginNature pluginNature = (PluginNature)theEObject;
				T1 result = casePluginNature(pluginNature);
				if (result == null) result = caseNature(pluginNature);
				if (result == null) result = caseGenerator(pluginNature);
				if (result == null) result = caseConfiguration(pluginNature);
				if (result == null) result = caseWorkFactory(pluginNature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FEATURE_NATURE: {
				FeatureNature featureNature = (FeatureNature)theEObject;
				T1 result = caseFeatureNature(featureNature);
				if (result == null) result = caseNature(featureNature);
				if (result == null) result = caseGenerator(featureNature);
				if (result == null) result = caseConfiguration(featureNature);
				if (result == null) result = caseWorkFactory(featureNature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaNature(JavaNature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Fragment Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Fragment Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePackageFragmentRoot(PackageFragmentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePackageFragment(PackageFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClass(org.nasdanika.codegen.java.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnum(org.nasdanika.codegen.java.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Nature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Nature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePluginNature(PluginNature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Nature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Nature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeatureNature(FeatureNature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWorkFactory(WorkFactory<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseGenerator(Generator<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNature(Nature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //JavaSwitch
