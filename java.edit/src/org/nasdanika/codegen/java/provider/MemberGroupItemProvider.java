/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.MemberGroup;
import org.nasdanika.codegen.provider.ContentGroupItemProvider;
import org.nasdanika.ncore.NcorePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.MemberGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberGroupItemProvider extends ContentGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberGroupItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns MemberGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MemberGroup"));
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
		String label = ((MemberGroup)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_MemberGroup_type") :
			getString("_UI_MemberGroup_type") + " " + label;
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
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createAnnotation()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createClass()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createEnum()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createInterface()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createField()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createConstructor()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
				 JavaFactory.eINSTANCE.createMethod()));
		
		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.GROUP__ELEMENTS,
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
			childFeature == CodegenPackage.Literals.GROUP__ELEMENTS;

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
		return JavaEditPlugin.INSTANCE;
	}

}
