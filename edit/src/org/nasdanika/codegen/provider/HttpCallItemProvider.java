/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.HttpCall;
import org.nasdanika.common.Util;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.NcorePackage;

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
			addInterpolatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_url_feature"),
				 CodegenPackage.Literals.HTTP_CALL__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_method_feature"),
				 CodegenPackage.Literals.HTTP_CALL__METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addConnectTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_connectTimeout_feature"),
				 CodegenPackage.Literals.HTTP_CALL__CONNECT_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addReadTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_readTimeout_feature"),
				 CodegenPackage.Literals.HTTP_CALL__READ_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Success Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSuccessCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_successCode_feature"),
				 CodegenPackage.Literals.HTTP_CALL__SUCCESS_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interpolate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInterpolatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_HttpCall_interpolate_feature"),
				 CodegenPackage.Literals.HTTP_CALL__INTERPOLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
//			childrenFeatures.add(CodegenPackage.Literals.HTTP_CALL__HEADERS);
//			childrenFeatures.add(CodegenPackage.Literals.HTTP_CALL__BODY);
		}
		return childrenFeatures;
	}
	
	@Override
	protected void addEReferenceItemProviders(Object object, Collection<EReferenceItemProvider> children) {
		super.addEReferenceItemProviders(object, children);
		children.add(new EReferenceItemProvider(this, (EObject) object, CodegenPackage.Literals.HTTP_CALL__HEADERS)); 		
		children.add(new EReferenceItemProvider(this, (EObject) object, CodegenPackage.Literals.HTTP_CALL__BODY)); 		
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
		if (Util.isBlank(label)) {
			label = ((HttpCall)object).getUrl();
		}
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
			case CodegenPackage.HTTP_CALL__INTERPOLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodegenPackage.HTTP_CALL__HEADERS:
			case CodegenPackage.HTTP_CALL__BODY:
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		// --- Headers ---		
		newChildDescriptors.add(createChildParameter(CodegenPackage.Literals.HTTP_CALL__HEADERS, NcoreFactory.eINSTANCE.createProperty()));						
		
		// --- Body ---		
		for (EObject content: org.nasdanika.codegen.util.Activator.CONTENT_GENERATORS_PALETTE.getElements()) {
			newChildDescriptors.add(createChildParameter(CodegenPackage.Literals.HTTP_CALL__BODY, content));						
		}
		
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
			childFeature == NcorePackage.Literals.CONFIGURABLE__CONFIGURATION ||
			childFeature == CodegenPackage.Literals.HTTP_CALL__BODY ||
			childFeature == CodegenPackage.Literals.HTTP_CALL__HEADERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
