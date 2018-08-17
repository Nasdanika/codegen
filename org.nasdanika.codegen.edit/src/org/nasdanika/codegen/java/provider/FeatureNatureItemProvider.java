/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;

import org.nasdanika.codegen.java.FeatureNature;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaPackage;

import org.nasdanika.codegen.maven.MavenFactory;

import org.nasdanika.codegen.provider.CodegenEditPlugin;
import org.nasdanika.codegen.provider.NatureItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.FeatureNature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureNatureItemProvider extends NatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureNatureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR);
			childrenFeatures.add(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureNature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureNature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureNature)object).getBaseURL();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureNature_type") :
			getString("_UI_FeatureNature_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureNature.class)) {
			case JavaPackage.FEATURE_NATURE__FEATURE_XML_GENERATOR:
			case JavaPackage.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createJavaNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragmentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragment()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createPluginNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 JavaFactory.eINSTANCE.createFeatureNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createGenericFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createJETEmitter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createBundleResource()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createObjectTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 CodegenFactory.eINSTANCE.createObjectStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR,
				 MavenFactory.eINSTANCE.createMavenNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createJavaNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragmentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragment()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createPluginNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 JavaFactory.eINSTANCE.createFeatureNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createGenericFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createJETEmitter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createBundleResource()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createObjectTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 CodegenFactory.eINSTANCE.createObjectStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR,
				 MavenFactory.eINSTANCE.createMavenNature()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == JavaPackage.Literals.FEATURE_NATURE__FEATURE_XML_GENERATOR ||
			childFeature == JavaPackage.Literals.FEATURE_NATURE__BUILD_PROPERTIES_GENERATOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CodegenEditPlugin.INSTANCE;
	}

}
