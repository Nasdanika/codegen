/**
 */
package org.nasdanika.codegen.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.impl.ContainerImpl;
import org.nasdanika.codegen.java.JDKLevel;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.SourceFolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.java.impl.SourceFolderImpl#getJdkLevel <em>Jdk Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFolderImpl extends ContainerImpl implements SourceFolder {
	/**
	 * The default value of the '{@link #getJdkLevel() <em>Jdk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdkLevel()
	 * @generated
	 * @ordered
	 */
	protected static final JDKLevel JDK_LEVEL_EDEFAULT = JDKLevel.JDK_8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.SOURCE_FOLDER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JDKLevel getJdkLevel() {
		return (JDKLevel)eDynamicGet(JavaPackage.SOURCE_FOLDER__JDK_LEVEL, JavaPackage.Literals.SOURCE_FOLDER__JDK_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdkLevel(JDKLevel newJdkLevel) {
		eDynamicSet(JavaPackage.SOURCE_FOLDER__JDK_LEVEL, JavaPackage.Literals.SOURCE_FOLDER__JDK_LEVEL, newJdkLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.SOURCE_FOLDER__JDK_LEVEL:
				return getJdkLevel();
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
			case JavaPackage.SOURCE_FOLDER__JDK_LEVEL:
				setJdkLevel((JDKLevel)newValue);
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
			case JavaPackage.SOURCE_FOLDER__JDK_LEVEL:
				setJdkLevel(JDK_LEVEL_EDEFAULT);
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
			case JavaPackage.SOURCE_FOLDER__JDK_LEVEL:
				return getJdkLevel() != JDK_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PackageFragmentRootImpl
