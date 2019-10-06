/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.SourceFolder;
import org.nasdanika.codegen.provider.ContainerItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.SourceFolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceFolderItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFolderItemProvider(AdapterFactory adapterFactory) {
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

			addJdkLevelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Jdk Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJdkLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceFolder_jdkLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceFolder_jdkLevel_feature", "_UI_SourceFolder_type"),
				 JavaPackage.Literals.SOURCE_FOLDER__JDK_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SourceFolder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SourceFolder"));
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
		String label = ((SourceFolder)object).getTitle();
		if (isBlank(label)) {
			label = ((SourceFolder)object).getName();
		}
		return label == null || label.length() == 0 ? getString("_UI_SourceFolder_type") : label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
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

		collectEReferenceChildDescriptors(object, newChildDescriptors, CodegenPackage.Literals.RESOURCE_CONTAINER__ELEMENTS);
		
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createSourceFolder()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createPackage()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createCompilationUnit()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createField()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createClass()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createInterface()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createAnnotation()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createEnum()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createConstructor()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.CONTAINER__CHILDREN,
//				 JavaFactory.eINSTANCE.createMethod()));
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
