/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.NamedGenerator;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.NamedGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedGeneratorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedGeneratorItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_NamedGenerator_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedGenerator_name_feature", "_UI_NamedGenerator_type"),
				 CodegenPackage.Literals.NAMED_GENERATOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedGenerator_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedGenerator_description_feature", "_UI_NamedGenerator_type"),
				 CodegenPackage.Literals.NAMED_GENERATOR__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR);
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
	 * This returns NamedGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NamedGenerator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NamedGenerator_type") :
			getString("_UI_NamedGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(NamedGenerator.class)) {
			case CodegenPackage.NAMED_GENERATOR__NAME:
			case CodegenPackage.NAMED_GENERATOR__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodegenPackage.NAMED_GENERATOR__GENERATOR:
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
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
				 CodegenFactory.eINSTANCE.createZipArchive()));
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