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
import org.nasdanika.codegen.Converter;

import org.nasdanika.codegen.java.JavaFactory;

import org.nasdanika.codegen.maven.MavenFactory;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.Converter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConverterItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConverterItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CodegenPackage.Literals.CONVERTER__GENERATOR);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Converter<?, ?>)object).getBaseURL();
		return label == null || label.length() == 0 ?
			getString("_UI_Converter_type") :
			getString("_UI_Converter_type") + " " + label;
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

		switch (notification.getFeatureID(Converter.class)) {
			case CodegenPackage.CONVERTER__GENERATOR:
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
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createGenericFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createResourceReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createJETEmitter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createScriptedStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createJavaNature()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragmentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createPackageFragment()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createPluginNature()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 JavaFactory.eINSTANCE.createFeatureNature()));

		newChildDescriptors.add
			(createChildParameter
				(CodegenPackage.Literals.CONVERTER__GENERATOR,
				 MavenFactory.eINSTANCE.createMavenNature()));
	}

}
