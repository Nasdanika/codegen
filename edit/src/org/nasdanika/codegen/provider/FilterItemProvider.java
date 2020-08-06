/**
 */
package org.nasdanika.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Filter;

import org.nasdanika.ncore.NcorePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.Filter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CodegenPackage.Literals.FILTER__GENERATORS);
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
		String label = ((Filter)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Filter_type") : getString("_UI_Filter_type") + " " + label;
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

		switch (notification.getFeatureID(Filter.class)) {
			case CodegenPackage.FILTER__GENERATORS:
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
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.FILTER__GENERATORS,
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
			childFeature == CodegenPackage.Literals.FILTER__GENERATORS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
