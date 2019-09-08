/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.HttpCall;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.HttpCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpCallItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpCallItemProvider(AdapterFactory adapterFactory) {
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

			addUrlPropertyDescriptor(object);
			addMethodPropertyDescriptor(object);
			addConnectTimeoutPropertyDescriptor(object);
			addReadTimeoutPropertyDescriptor(object);
			addSuccessCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HttpCall_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HttpCall_url_feature", "_UI_HttpCall_type"),
				 CodegenPackage.Literals.HTTP_CALL__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HttpCall_method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HttpCall_method_feature", "_UI_HttpCall_type"),
				 CodegenPackage.Literals.HTTP_CALL__METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HttpCall_connectTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HttpCall_connectTimeout_feature", "_UI_HttpCall_type"),
				 CodegenPackage.Literals.HTTP_CALL__CONNECT_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HttpCall_readTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HttpCall_readTimeout_feature", "_UI_HttpCall_type"),
				 CodegenPackage.Literals.HTTP_CALL__READ_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Success Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuccessCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HttpCall_successCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HttpCall_successCode_feature", "_UI_HttpCall_type"),
				 CodegenPackage.Literals.HTTP_CALL__SUCCESS_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR);
			childrenFeatures.add(CodegenPackage.Literals.HTTP_CALL__HEADERS);
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
	 * This returns HttpCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HttpCall.png"));
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((HttpCall)object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_HttpCall_type") : label;
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

		switch (notification.getFeatureID(HttpCall.class)) {
			case CodegenPackage.HTTP_CALL__URL:
			case CodegenPackage.HTTP_CALL__METHOD:
			case CodegenPackage.HTTP_CALL__CONNECT_TIMEOUT:
			case CodegenPackage.HTTP_CALL__READ_TIMEOUT:
			case CodegenPackage.HTTP_CALL__SUCCESS_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodegenPackage.HTTP_CALL__BODY_GENERATOR:
			case CodegenPackage.HTTP_CALL__HEADERS:
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
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextToStreamConverter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamToTextConverter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__BODY_GENERATOR,
				 CodegenFactory.eINSTANCE.createZipResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__HEADERS,
				 CodegenFactory.eINSTANCE.createNamedGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.HTTP_CALL__HEADERS,
				 CodegenFactory.eINSTANCE.createProperty()));
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
			childFeature == CodegenPackage.Literals.GENERATOR__NAMED_GENERATORS ||
			childFeature == CodegenPackage.Literals.HTTP_CALL__HEADERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
