/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ResourceCollection;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.ResourceCollection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceCollectionItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCollectionItemProvider(AdapterFactory adapterFactory) {
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

			addPathPropertyDescriptor(object);
			addPrefixPropertyDescriptor(object);
			addIncludesPropertyDescriptor(object);
			addExcludesPropertyDescriptor(object);
			addInterpolationIncludesPropertyDescriptor(object);
			addInterpolationExcludesPropertyDescriptor(object);
			addInterpolationCharsetPropertyDescriptor(object);
			addReconcileActionPropertyDescriptor(object);
			addMergerPropertyDescriptor(object);
			addMergerArgumentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_path_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_prefix_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_includes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_includes_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__INCLUDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Excludes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_excludes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_excludes_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__EXCLUDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interpolation Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolationIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_interpolationIncludes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_interpolationIncludes_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interpolation Excludes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolationExcludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_interpolationExcludes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_interpolationExcludes_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interpolation Charset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolationCharsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_interpolationCharset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_interpolationCharset_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_CHARSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reconcile Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReconcileActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_reconcileAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_reconcileAction_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__RECONCILE_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_merger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_merger_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merger Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergerArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceCollection_mergerArguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceCollection_mergerArguments_feature", "_UI_ResourceCollection_type"),
				 CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER_ARGUMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
		String label = ((ResourceCollection)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceCollection_type") :
			getString("_UI_ResourceCollection_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceCollection.class)) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
			case CodegenPackage.RESOURCE_COLLECTION__MERGER:
			case CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
