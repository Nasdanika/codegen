/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.provider.TextFileItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.CompilationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilationUnitItemProvider extends TextFileItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitItemProvider(AdapterFactory adapterFactory) {
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

			addFormatPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompilationUnit_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompilationUnit_format_feature", "_UI_CompilationUnit_type"),
				 JavaPackage.Literals.COMPILATION_UNIT__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CompilationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompilationUnit"));
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
		String label = ((CompilationUnit)object).getTitle();
		if (isBlank(label)) {
			label = ((CompilationUnit)object).getName();
		}
		return label == null || label.length() == 0 ?
			getString("_UI_CompilationUnit_type") : label;
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

		switch (notification.getFeatureID(CompilationUnit.class)) {
			case JavaPackage.COMPILATION_UNIT__FORMAT:
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
		
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createSourceFolder()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createPackage()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createCompilationUnit()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createField()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createClass()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createInterface()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createAnnotation()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createEnum()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
//				 JavaFactory.eINSTANCE.createConstructor()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.FILE__GENERATORS,
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
	
	@Override
	public boolean accept(EObject source, EReference eReference, EObject target, boolean direct) {
		return source instanceof org.nasdanika.codegen.java.Package && eReference == CodegenPackage.Literals.RESOURCE_CONTAINER__ELEMENTS;
	}

}
