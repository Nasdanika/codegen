package org.nasdanika.codegen.html;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONObject;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Action.Role;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.html.app.viewparts.ContentPanelViewPart;
import org.nasdanika.html.app.viewparts.JsTreeNavigationPanelViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Container;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Table.TableBody;
import org.nasdanika.html.bootstrap.Table.TableHeader;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.html.emf.EObjectAdaptable;
import org.nasdanika.html.emf.ViewAction;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeFactory;

public class CodegenDocumentationGenerator {

	class ViewActionImpl extends ActionImpl implements ViewAction, Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Notifier getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == ViewAction.class;
		}
		
	}
	
	private ViewActionImpl principalAction;
	private ResourceSet resourceSet;
	private ActionImpl rootAction;
	
	/**
	 * Generates documentation
	 * @param title
	 * @param description
	 * @param resourceLocator Locator of localized resources for "Package" and "Summary" strings.
	 */
	public CodegenDocumentationGenerator(String title, String description) {
		rootAction = new ActionImpl();
		rootAction.setText(title);
		rootAction.setDescription(description);
		rootAction.setActivator(new NavigationActionActivator() {
			
			@Override
			public String getUrl() {
				return "#content/doc-summary";
			}
			
		});
		
		principalAction = new ViewActionImpl();
		principalAction.setParent(rootAction);
		rootAction.getChildren().add(principalAction);
		
		resourceSet = new ResourceSetImpl();		
		resourceSet.getAdapterFactories().add(new CodegenViewActionAdapterFactory(principalAction));
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
	}
		
	public void generate(org.nasdanika.common.resources.Container<Object> resourceConsumer, ProgressMonitor progressMonitor) {		
		Application app = new CodegenDocumentationApplication(Theme.Litera, true);

		JsTreeFactory.INSTANCE.cdn(app.getHTMLPage());
		FontAwesomeFactory.INSTANCE.cdn(app.getHTMLPage());
		
		MutableContext context = new SimpleMutableContext();
		context.register(org.nasdanika.common.resources.Container.class, resourceConsumer);
		
		MutableContext docContext = new SimpleMutableContext();
		docContext.register(org.nasdanika.common.resources.Container.class, resourceConsumer.getContainer("doc"));
		docContext.put("image-path", "doc/");
		
		ApplicationBuilder  applicationBuilder = new ActionApplicationBuilder(principalAction.getChildren().get(0)) {
			
			@Override
			protected ViewPart getNavigationPanelViewPart() {
				return new JsTreeNavigationPanelViewPart(getNavigationPanelActions(), getActiveAction()) {
					@Override
					protected void configureJsTree(JSONObject jsTree) {
						// TODO State and search plug-ins.
						super.configureJsTree(jsTree);
					}
				};
			}
			
		}; 
		
		applicationBuilder.build(app, progressMonitor);
		
		try (ProgressMonitor im = progressMonitor.split("Generating index.html", 100)) {
			resourceConsumer.getFile("index.html").setContents(app, im);			
		}
		try (ProgressMonitor sm = progressMonitor.split("Generating summary", 100)) {
			resourceConsumer.getFile("doc/doc-summary").setContents(summary(docContext), sm);			
		}
		for (Action action: principalAction.getChildren()) {
			generateActionContent(action, docContext, progressMonitor);
		}
		
	}
	
	/**
	 * Loads a model to generate documentation from.
	 * @param platformPluginUri
	 */
	public void loadModel(String platformPluginUri) {
		loadModel(URI.createPlatformPluginURI(platformPluginUri, false));		
	}
	
	/**
	 * Loads a model to generate documentation from.
	 * @param uri
	 */
	public void loadModel(URI uri) {
		Resource resource = resourceSet.getResource(uri, true);
		for (EObject contents: resource.getContents()) {
			ViewAction viewAction = EObjectAdaptable.adaptTo(contents, ViewAction.class);
			if (viewAction != null) {
				principalAction.getChildren().add(viewAction);
			}
		}
	}
	
	protected Object summary(Context context) {
		StringBuilder contentBuilder = new StringBuilder();
		ViewGenerator viewGenerator = new ViewGeneratorImpl(context, contentBuilder::append, contentBuilder::append);
		
		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);		
		Container contentContainer = bootstrapFactory.fluidContainer();
		contentContainer.text().alignment(Alignment.LEFT);
		contentContainer.row().col("<H2>"+rootAction.getText()+"</H2>");
		String description = rootAction.getDescription();
		if (!Util.isBlank(description)) {
			contentContainer.row().col(description);
		}
				
		Table table = bootstrapFactory.table().bordered();
		TableHeader header = table.header();
//		// TODO - localization.
//		String pkg = "Package";
//		String summary = "Summary";
//		header.headerRow(
//				resourceLocator == null ? pkg : resourceLocator.getString(PropertyKeys.UI_PACKAGE, pkg), 
//				resourceLocator == null ? summary : resourceLocator.getString(PropertyKeys.UI_SUMMARY, summary));
		TableBody body = table.body();
		principalAction.getChildren().forEach(child -> body.row(viewGenerator.link(child), child.getTooltip()));
		contentContainer.row().col(table);				
		
		contentBuilder.append(contentContainer.produce(4));
		return contentBuilder;
	}
	
	protected void generateActionContent(Action action, Context context, ProgressMonitor progressMonitor) {
		try (ProgressMonitor am = progressMonitor.split("Generating action content for "+action.getText(), 100)) {
			StringBuilder contentBuilder = new StringBuilder();
			ViewPart contentPanelViewPart = new ContentPanelViewPart(action, false); // Use adapter?
			ViewGenerator viewGenerator = new ViewGeneratorImpl(context, contentBuilder::append, contentBuilder::append);
			contentBuilder.append(contentPanelViewPart.generate(viewGenerator, progressMonitor));
			@SuppressWarnings("unchecked")
			org.nasdanika.common.resources.Container<Object> container = context.get(org.nasdanika.common.resources.Container.class);
			container.getFile(action.getId()+".html").setContents(contentBuilder, am);
			for (Action child: action.getChildren()) {
				if (child.isInRole(Role.NAVIGATION)) {
					generateActionContent(child, context, am);
				}
			}
		}
	}
		
}

