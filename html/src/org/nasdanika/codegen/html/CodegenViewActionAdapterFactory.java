package org.nasdanika.codegen.html;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.TextFile;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.emf.ViewAction;

/**
 * Provides adapters for the Codegen types - {@link Generator}, {@link StaticText}, ...
 * @author Pavel
 *
 */
public class CodegenViewActionAdapterFactory extends ComposedAdapterFactory {
	
	private ViewAction principalAction;

	public CodegenViewActionAdapterFactory(ViewAction principalAction) {
		this.principalAction = principalAction;
		
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, StaticText>(
				CodegenPackage.Literals.STATIC_TEXT, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				StaticTextViewAction::new));		
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ViewAction, TextFile>(
					CodegenPackage.Literals.TEXT_FILE, 
					ViewAction.class, 
					this.getClass().getClassLoader(), 
					TextFileViewAction::new));		
	}
	
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		if (target instanceof Resource && type == ViewAction.class) {
			return (Adapter) principalAction;
		}
		return super.adaptNew(target, type);		
	}

}
