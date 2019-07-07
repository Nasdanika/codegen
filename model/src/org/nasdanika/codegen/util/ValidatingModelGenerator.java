package org.nasdanika.codegen.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * This class loads a generator model, validates it and then executes generation. 
 * @author Pavel
 *
 */
public class ValidatingModelGenerator<T> extends ModelGenerator<T> {

	public ValidatingModelGenerator(ResourceSet resourceSet, URI modelUri) throws Exception {
		super(resourceSet, modelUri);
	}

	public ValidatingModelGenerator(String platformPluginUri) throws Exception {
		super(platformPluginUri);
	}

	public ValidatingModelGenerator(URI modelUri) throws Exception {
		super(modelUri);
	}
	
	public ValidatingModelGenerator(ResourceSet resourceSet, String platformPluginUri) throws Exception {
		super(resourceSet, platformPluginUri);
	}

	@Override
	public long size() {
		return super.size() + 1;
	}
	
	/**
	 * Validates the generator model and then executes generation.
	 */
	@Override
	public List<T> execute(Context context, ProgressMonitor progressMonitor) throws Exception {
		
		new Work<Context, Object>() {

			@Override
			public long size() {
				return 1;
			}

			@Override
			public String getName() {
				return "Validating "+ValidatingModelGenerator.this.getName();
			}

			@Override
			public Object execute(Context context, ProgressMonitor progressMonitor) throws Exception {
				Diagnostician diagnostician = new Diagnostician() {
					
					public Map<Object,Object> createDefaultContext() {
						Map<Object, Object> ctx = super.createDefaultContext();
						ctx.put(Context.class, context);
						ctx.put(Generator.VALIDATE_JAVA_CONTRIBUTORS, Boolean.TRUE);
						return ctx;
					};
					
				};				
				Diagnostic validationResult = diagnostician.validate(generator);
				diagnosticToProgress(progressMonitor, size(), validationResult);
				if (validationResult.getSeverity() == Diagnostic.ERROR) {
					throw new IllegalStateException("Generator model validation failed");
				}
				return null;
			}

			@Override
			public boolean undo(ProgressMonitor progressMonitor) throws Exception {
				return true;
			}
			
		}.splitAndExecute(context, progressMonitor);
				
		return super.execute(context, progressMonitor);
	}
	
	static void diagnosticToProgress(ProgressMonitor progressMonitor, long worked, Diagnostic diagnostic) {
		ProgressMonitor.Status status;
		switch (diagnostic.getSeverity()) {
		case Diagnostic.CANCEL:
			status = ProgressMonitor.Status.CANCEL;
			break;
		case Diagnostic.ERROR:
			status = ProgressMonitor.Status.ERROR;
			break;
		case Diagnostic.WARNING:
			status = ProgressMonitor.Status.WARNING;
			break;
		case Diagnostic.INFO:
			status = ProgressMonitor.Status.INFO;
			break;
		case Diagnostic.OK:
		default:
			status = ProgressMonitor.Status.SUCCESS;
			break;
		}
		progressMonitor.worked(status, worked, diagnostic.getMessage());
		List<Diagnostic> children = diagnostic.getChildren();
		if (children != null) {
			for (Diagnostic child: children) {
				try (ProgressMonitor childMonitor = progressMonitor.split(child.getSource(), 0, child.getData(), child.getException())) {
					diagnosticToProgress(childMonitor, worked, child);
				}
			}
		}
	}	

}
