/**
 */
package org.nasdanika.codegen.java.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;

import org.nasdanika.codegen.java.JavaFactory;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.Member;

import org.nasdanika.codegen.provider.GeneratorItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.java.Member} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addModifiersPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAnnotationsPropertyDescriptor(object);
			addTypeParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_name_feature", "_UI_Member_type"),
				 JavaPackage.Literals.MEMBER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_modifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_modifiers_feature", "_UI_Member_type"),
				 JavaPackage.Literals.MEMBER__MODIFIERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_comment_feature", "_UI_Member_type"),
				 JavaPackage.Literals.MEMBER__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_annotations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_annotations_feature", "_UI_Member_type"),
				 JavaPackage.Literals.MEMBER__ANNOTATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_typeParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_typeParameters_feature", "_UI_Member_type"),
				 JavaPackage.Literals.MEMBER__TYPE_PARAMETERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS);
			childrenFeatures.add(JavaPackage.Literals.MEMBER__BODY_GENERATORS);
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Member)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Member_type") :
			getString("_UI_Member_type") + " " + label;
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

		switch (notification.getFeatureID(Member.class)) {
			case JavaPackage.MEMBER__NAME:
			case JavaPackage.MEMBER__MODIFIERS:
			case JavaPackage.MEMBER__COMMENT:
			case JavaPackage.MEMBER__ANNOTATIONS:
			case JavaPackage.MEMBER__TYPE_PARAMETERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JavaPackage.MEMBER__COMMENT_GENERATORS:
			case JavaPackage.MEMBER__BODY_GENERATORS:
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
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createSourceFolder()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__COMMENT_GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createSourceFolder()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextGroup()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.MEMBER__BODY_GENERATORS,
				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));
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
			childFeature == JavaPackage.Literals.MEMBER__COMMENT_GENERATORS ||
			childFeature == JavaPackage.Literals.MEMBER__BODY_GENERATORS;

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
