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
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.NamedGenerator;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.NamedGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedGeneratorItemProvider 
	extends AbstractNamedGeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedGeneratorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CodegenPackage.Literals.NAMED_GENERATOR__GENERATORS);
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
	 * This returns NamedGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedGenerator"));
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
		String label = ((NamedGenerator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NamedGenerator_type") :
			getString("_UI_NamedGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(NamedGenerator.class)) {
			case CodegenPackage.NAMED_GENERATOR__GENERATORS:
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

		collectEReferenceChildDescriptors(newChildDescriptors, CodegenPackage.Literals.NAMED_GENERATOR__GENERATORS);
		
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createBinaryFile()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createTextFile()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createContainer()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createResourceGroup()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createStaticText()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createStaticBytes()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createInterpolator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createJavaTextFilter()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createTextContentReference()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createStreamContentReference()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createMustache()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createZipArchive()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createTextGroup()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(CodegenPackage.Literals.NAMED_GENERATOR__GENERATOR,
//				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));
	}
		
}
