/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaPackage;

import org.nasdanika.codegen.maven.MavenFactory;
import org.nasdanika.codegen.provider.CodegenEditPlugin;
import org.nasdanika.codegen.provider.GeneratorItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.CompilationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilationUnitItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMergePropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompilationUnit_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompilationUnit_name_feature", "_UI_CompilationUnit_type"),
				 JavaPackage.Literals.COMPILATION_UNIT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompilationUnit_merge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompilationUnit_merge_feature", "_UI_CompilationUnit_type"),
				 JavaPackage.Literals.COMPILATION_UNIT__MERGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompilationUnit_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompilationUnit_format_feature", "_UI_CompilationUnit_type"),
				 JavaPackage.Literals.COMPILATION_UNIT__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS);
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
	 * This returns CompilationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompilationUnit"));
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompilationUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompilationUnit_type") :
			getString("_UI_CompilationUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CompilationUnit.class)) {
			case JavaPackage.COMPILATION_UNIT__NAME:
			case JavaPackage.COMPILATION_UNIT__MERGE:
			case JavaPackage.COMPILATION_UNIT__FORMAT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JavaPackage.COMPILATION_UNIT__GENERATORS:
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
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createJavaNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createPackageFragmentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createPackageFragment()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 JavaFactory.eINSTANCE.createPluginNature()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createJETEmitter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createScriptedTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createScriptedStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createScriptedTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createScriptedStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.COMPILATION_UNIT__GENERATORS,
				 MavenFactory.eINSTANCE.createMavenNature()));
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
