/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.FreeMarkerGenerator;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.FreeMarkerGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeMarkerGeneratorItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeMarkerGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addTemplateLoaderTypePropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addTemplatePropertyDescriptor(object);
			addModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Template Loader Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateLoaderTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeMarkerGenerator_templateLoaderType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeMarkerGenerator_templateLoaderType_feature", "_UI_FreeMarkerGenerator_type"),
				 CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeMarkerGenerator_base_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeMarkerGenerator_base_feature", "_UI_FreeMarkerGenerator_type"),
				 CodegenPackage.Literals.FREE_MARKER_GENERATOR__BASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeMarkerGenerator_template_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeMarkerGenerator_template_feature", "_UI_FreeMarkerGenerator_type"),
				 CodegenPackage.Literals.FREE_MARKER_GENERATOR__TEMPLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FreeMarkerGenerator_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FreeMarkerGenerator_model_feature", "_UI_FreeMarkerGenerator_type"),
				 CodegenPackage.Literals.FREE_MARKER_GENERATOR__MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FreeMarkerGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FreeMarkerGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FreeMarkerGenerator freeMarker = (FreeMarkerGenerator) object;
		
		EObject container = freeMarker.eContainer();
		if (container != null) {
			AdapterFactory af = getAdapterFactory();
			if (af instanceof ComposeableAdapterFactory) {
				af = ((ComposeableAdapterFactory) af).getRootAdapterFactory();
			}
			Object provider = af.adapt(container, IItemPropertySource.class);
			if (provider instanceof CreateChildCommand.Helper) {
				return ((CreateChildCommand.Helper) provider).getCreateChildText(container, freeMarker.eContainmentFeature(), freeMarker, Collections.singleton(container))+" "+freeMarker.getTemplate();
			}
		}
		
		String label = freeMarker.getTemplate();
		return label == null || label.length() == 0 ?
			getString("_UI_FreeMarkerGenerator_type") :
			getString("_UI_FreeMarkerGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(FreeMarkerGenerator.class)) {
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE_LOADER_TYPE:
			case CodegenPackage.FREE_MARKER_GENERATOR__BASE:
			case CodegenPackage.FREE_MARKER_GENERATOR__TEMPLATE:
			case CodegenPackage.FREE_MARKER_GENERATOR__MODEL:
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
