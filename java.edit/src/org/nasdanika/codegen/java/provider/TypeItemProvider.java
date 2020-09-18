/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Type;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.Type} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeItemProvider extends MemberItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeItemProvider(AdapterFactory adapterFactory) {
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

			addSuperTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Super Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSuperTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Type_superTypes_feature"),
				 JavaPackage.Literals.TYPE__SUPER_TYPES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Type)object).getTitle();
		if (Util.isBlank(label)) {
			label = ((Type)object).getName();
		}
		return label == null || label.length() == 0 ? getString("_UI_Type_type") : label;
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

		switch (notification.getFeatureID(Type.class)) {
			case JavaPackage.TYPE__SUPER_TYPES:
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createAnnotation()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createClass()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createEnum()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createInterface()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createField()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createConstructor()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createMethod()));
		
		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY,
				 JavaFactory.eINSTANCE.createMemberGroup()));
		
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
			childFeature == JavaPackage.Literals.MEMBER__COMMENTS ||
			childFeature == JavaPackage.Literals.MEMBER__BODY ||
			childFeature == EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
