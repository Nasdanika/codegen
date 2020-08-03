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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;

import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.Generator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addEnabledPropertyDescriptor(object);
			addContextPathPropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_enabled_feature", "_UI_Generator_type"),
				 CodegenPackage.Literals.GENERATOR__ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_contextPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_contextPath_feature", "_UI_Generator_type"),
				 CodegenPackage.Literals.GENERATOR__CONTEXT_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_condition_feature", "_UI_Generator_type"),
				 CodegenPackage.Literals.GENERATOR__CONDITION,
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
			childrenFeatures.add(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Generator)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Generator_type") :
			getString("_UI_Generator_type") + " " + label;
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

		switch (notification.getFeatureID(Generator.class)) {
			case CodegenPackage.GENERATOR__ENABLED:
			case CodegenPackage.GENERATOR__CONTEXT_PATH:
			case CodegenPackage.GENERATOR__CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodegenPackage.GENERATOR__CONFIGURATION:
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
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 CodegenFactory.eINSTANCE.createZipResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createNull()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createTypedEntry()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createSupplierEntry()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createRestOperation()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createRestFunction()));

		newChildDescriptors.add
			(createChildParameter
				(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION,
				 NcoreFactory.eINSTANCE.createHtml()));
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
