/**
 */
package org.nasdanika.codegen.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.nasdanika.codegen.util.CodegenAdapterFactory;
import org.nasdanika.emf.edit.EReferencePredicate;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CodegenItemProviderAdapterFactory extends CodegenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CodegenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(EReferencePredicate.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.NamedGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedGeneratorItemProvider namedGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.NamedGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedGeneratorAdapter() {
		if (namedGeneratorItemProvider == null) {
			namedGeneratorItemProvider = new NamedGeneratorItemProvider(this);
		}

		return namedGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ResourceGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGroupItemProvider resourceGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceGroupAdapter() {
		if (resourceGroupItemProvider == null) {
			resourceGroupItemProvider = new ResourceGroupItemProvider(this);
		}

		return resourceGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.BinaryFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryFileItemProvider binaryFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.BinaryFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryFileAdapter() {
		if (binaryFileItemProvider == null) {
			binaryFileItemProvider = new BinaryFileItemProvider(this);
		}

		return binaryFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.TextFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFileItemProvider textFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.TextFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextFileAdapter() {
		if (textFileItemProvider == null) {
			textFileItemProvider = new TextFileItemProvider(this);
		}

		return textFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.StaticText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticTextItemProvider staticTextItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.StaticText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticTextAdapter() {
		if (staticTextItemProvider == null) {
			staticTextItemProvider = new StaticTextItemProvider(this);
		}

		return staticTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.FreeMarkerGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeMarkerGeneratorItemProvider freeMarkerGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.FreeMarkerGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFreeMarkerGeneratorAdapter() {
		if (freeMarkerGeneratorItemProvider == null) {
			freeMarkerGeneratorItemProvider = new FreeMarkerGeneratorItemProvider(this);
		}

		return freeMarkerGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ECoreModelGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECoreModelGeneratorItemProvider eCoreModelGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ECoreModelGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createECoreModelGeneratorAdapter() {
		if (eCoreModelGeneratorItemProvider == null) {
			eCoreModelGeneratorItemProvider = new ECoreModelGeneratorItemProvider(this);
		}

		return eCoreModelGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.TextToStreamConverter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextToStreamConverterItemProvider textToStreamConverterItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.TextToStreamConverter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextToStreamConverterAdapter() {
		if (textToStreamConverterItemProvider == null) {
			textToStreamConverterItemProvider = new TextToStreamConverterItemProvider(this);
		}

		return textToStreamConverterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.StreamToTextConverter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamToTextConverterItemProvider streamToTextConverterItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.StreamToTextConverter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStreamToTextConverterAdapter() {
		if (streamToTextConverterItemProvider == null) {
			streamToTextConverterItemProvider = new StreamToTextConverterItemProvider(this);
		}

		return streamToTextConverterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.Interpolator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpolatorItemProvider interpolatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.Interpolator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterpolatorAdapter() {
		if (interpolatorItemProvider == null) {
			interpolatorItemProvider = new InterpolatorItemProvider(this);
		}

		return interpolatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.JavaTextFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTextFilterItemProvider javaTextFilterItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.JavaTextFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaTextFilterAdapter() {
		if (javaTextFilterItemProvider == null) {
			javaTextFilterItemProvider = new JavaTextFilterItemProvider(this);
		}

		return javaTextFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.JavaStreamFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStreamFilterItemProvider javaStreamFilterItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.JavaStreamFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaStreamFilterAdapter() {
		if (javaStreamFilterItemProvider == null) {
			javaStreamFilterItemProvider = new JavaStreamFilterItemProvider(this);
		}

		return javaStreamFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.JavaTextGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTextGeneratorItemProvider javaTextGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.JavaTextGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaTextGeneratorAdapter() {
		if (javaTextGeneratorItemProvider == null) {
			javaTextGeneratorItemProvider = new JavaTextGeneratorItemProvider(this);
		}

		return javaTextGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.JavaStreamGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStreamGeneratorItemProvider javaStreamGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.JavaStreamGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaStreamGeneratorAdapter() {
		if (javaStreamGeneratorItemProvider == null) {
			javaStreamGeneratorItemProvider = new JavaStreamGeneratorItemProvider(this);
		}

		return javaStreamGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.JavaResourceGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaResourceGeneratorItemProvider javaResourceGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.JavaResourceGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaResourceGeneratorAdapter() {
		if (javaResourceGeneratorItemProvider == null) {
			javaResourceGeneratorItemProvider = new JavaResourceGeneratorItemProvider(this);
		}

		return javaResourceGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.TextContentReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContentReferenceItemProvider textContentReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.TextContentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextContentReferenceAdapter() {
		if (textContentReferenceItemProvider == null) {
			textContentReferenceItemProvider = new TextContentReferenceItemProvider(this);
		}

		return textContentReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.StreamContentReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamContentReferenceItemProvider streamContentReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.StreamContentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStreamContentReferenceAdapter() {
		if (streamContentReferenceItemProvider == null) {
			streamContentReferenceItemProvider = new StreamContentReferenceItemProvider(this);
		}

		return streamContentReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ZipArchive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipArchiveItemProvider zipArchiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ZipArchive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createZipArchiveAdapter() {
		if (zipArchiveItemProvider == null) {
			zipArchiveItemProvider = new ZipArchiveItemProvider(this);
		}

		return zipArchiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.TextGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextGroupItemProvider textGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.TextGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextGroupAdapter() {
		if (textGroupItemProvider == null) {
			textGroupItemProvider = new TextGroupItemProvider(this);
		}

		return textGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.TextGeneratorReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextGeneratorReferenceItemProvider textGeneratorReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.TextGeneratorReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextGeneratorReferenceAdapter() {
		if (textGeneratorReferenceItemProvider == null) {
			textGeneratorReferenceItemProvider = new TextGeneratorReferenceItemProvider(this);
		}

		return textGeneratorReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.StreamGeneratorReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamGeneratorReferenceItemProvider streamGeneratorReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.StreamGeneratorReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStreamGeneratorReferenceAdapter() {
		if (streamGeneratorReferenceItemProvider == null) {
			streamGeneratorReferenceItemProvider = new StreamGeneratorReferenceItemProvider(this);
		}

		return streamGeneratorReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ResourceGeneratorReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGeneratorReferenceItemProvider resourceGeneratorReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ResourceGeneratorReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceGeneratorReferenceAdapter() {
		if (resourceGeneratorReferenceItemProvider == null) {
			resourceGeneratorReferenceItemProvider = new ResourceGeneratorReferenceItemProvider(this);
		}

		return resourceGeneratorReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.HttpCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpCallItemProvider httpCallItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.HttpCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHttpCallAdapter() {
		if (httpCallItemProvider == null) {
			httpCallItemProvider = new HttpCallItemProvider(this);
		}

		return httpCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.BundleResourceCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleResourceCollectionItemProvider bundleResourceCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.BundleResourceCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBundleResourceCollectionAdapter() {
		if (bundleResourceCollectionItemProvider == null) {
			bundleResourceCollectionItemProvider = new BundleResourceCollectionItemProvider(this);
		}

		return bundleResourceCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ZipResourceCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipResourceCollectionItemProvider zipResourceCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ZipResourceCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createZipResourceCollectionAdapter() {
		if (zipResourceCollectionItemProvider == null) {
			zipResourceCollectionItemProvider = new ZipResourceCollectionItemProvider(this);
		}

		return zipResourceCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.PropertyDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDescriptorItemProvider propertyDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.PropertyDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyDescriptorAdapter() {
		if (propertyDescriptorItemProvider == null) {
			propertyDescriptorItemProvider = new PropertyDescriptorItemProvider(this);
		}

		return propertyDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.ServiceDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptorItemProvider serviceDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.ServiceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceDescriptorAdapter() {
		if (serviceDescriptorItemProvider == null) {
			serviceDescriptorItemProvider = new ServiceDescriptorItemProvider(this);
		}

		return serviceDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.DescriptorSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorSetItemProvider descriptorSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.DescriptorSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptorSetAdapter() {
		if (descriptorSetItemProvider == null) {
			descriptorSetItemProvider = new DescriptorSetItemProvider(this);
		}

		return descriptorSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.Mustache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MustacheItemProvider mustacheItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.Mustache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMustacheAdapter() {
		if (mustacheItemProvider == null) {
			mustacheItemProvider = new MustacheItemProvider(this);
		}

		return mustacheItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.codegen.StaticBytes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticBytesItemProvider staticBytesItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.codegen.StaticBytes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticBytesAdapter() {
		if (staticBytesItemProvider == null) {
			staticBytesItemProvider = new StaticBytesItemProvider(this);
		}

		return staticBytesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (namedGeneratorItemProvider != null) namedGeneratorItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (binaryFileItemProvider != null) binaryFileItemProvider.dispose();
		if (textFileItemProvider != null) textFileItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (resourceGroupItemProvider != null) resourceGroupItemProvider.dispose();
		if (staticTextItemProvider != null) staticTextItemProvider.dispose();
		if (staticBytesItemProvider != null) staticBytesItemProvider.dispose();
		if (freeMarkerGeneratorItemProvider != null) freeMarkerGeneratorItemProvider.dispose();
		if (eCoreModelGeneratorItemProvider != null) eCoreModelGeneratorItemProvider.dispose();
		if (textToStreamConverterItemProvider != null) textToStreamConverterItemProvider.dispose();
		if (streamToTextConverterItemProvider != null) streamToTextConverterItemProvider.dispose();
		if (interpolatorItemProvider != null) interpolatorItemProvider.dispose();
		if (javaTextFilterItemProvider != null) javaTextFilterItemProvider.dispose();
		if (javaStreamFilterItemProvider != null) javaStreamFilterItemProvider.dispose();
		if (javaTextGeneratorItemProvider != null) javaTextGeneratorItemProvider.dispose();
		if (javaStreamGeneratorItemProvider != null) javaStreamGeneratorItemProvider.dispose();
		if (javaResourceGeneratorItemProvider != null) javaResourceGeneratorItemProvider.dispose();
		if (textContentReferenceItemProvider != null) textContentReferenceItemProvider.dispose();
		if (streamContentReferenceItemProvider != null) streamContentReferenceItemProvider.dispose();
		if (mustacheItemProvider != null) mustacheItemProvider.dispose();
		if (zipArchiveItemProvider != null) zipArchiveItemProvider.dispose();
		if (textGroupItemProvider != null) textGroupItemProvider.dispose();
		if (textGeneratorReferenceItemProvider != null) textGeneratorReferenceItemProvider.dispose();
		if (streamGeneratorReferenceItemProvider != null) streamGeneratorReferenceItemProvider.dispose();
		if (resourceGeneratorReferenceItemProvider != null) resourceGeneratorReferenceItemProvider.dispose();
		if (httpCallItemProvider != null) httpCallItemProvider.dispose();
		if (bundleResourceCollectionItemProvider != null) bundleResourceCollectionItemProvider.dispose();
		if (zipResourceCollectionItemProvider != null) zipResourceCollectionItemProvider.dispose();
		if (propertyDescriptorItemProvider != null) propertyDescriptorItemProvider.dispose();
		if (serviceDescriptorItemProvider != null) serviceDescriptorItemProvider.dispose();
		if (descriptorSetItemProvider != null) descriptorSetItemProvider.dispose();
	}

}
