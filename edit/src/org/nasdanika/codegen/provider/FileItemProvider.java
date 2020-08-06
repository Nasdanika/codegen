/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.File;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.NcorePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.File} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileItemProvider(AdapterFactory adapterFactory) {
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

			addCharsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Charset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCharsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_File_charset_feature"),
				 CodegenPackage.Literals.FILE__CHARSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CodegenPackage.Literals.FILE__GENERATORS);
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((File)object).getTitle();
		if (Util.isBlank(label)) {
			label = ((File)object).getName();
		}
		return label == null || label.length() == 0 ? getString("_UI_File_type") : label;
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

		switch (notification.getFeatureID(File.class)) {
			case CodegenPackage.FILE__CHARSET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodegenPackage.FILE__GENERATORS:
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
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILE__GENERATORS,
				 CodegenFactory.eINSTANCE.createZipResourceCollection()));
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
			childFeature == CodegenPackage.Literals.FILE__GENERATORS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
