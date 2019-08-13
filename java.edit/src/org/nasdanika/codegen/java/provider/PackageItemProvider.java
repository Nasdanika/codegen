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
import org.nasdanika.codegen.provider.ContainerItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
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
		String label = ((org.nasdanika.codegen.java.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		collectEReferenceChildDescriptors(newChildDescriptors, CodegenPackage.Literals.CONTAINER__CHILDREN);
		
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
