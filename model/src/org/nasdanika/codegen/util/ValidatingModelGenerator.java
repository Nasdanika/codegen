package org.nasdanika.codegen.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.nasdanika.codegen.Generator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;

/**
 * This class loads a generator model, validates it and then returns work for executing generation. 
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
	public Work<List<T>> createWork(Context context) throws Exception {
		Diagnostician diagnostician = new Diagnostician() {
			
			public Map<Object,Object> createDefaultContext() {
				Map<Object, Object> ctx = super.createDefaultContext();
				ctx.put(Context.class, context);
				ctx.put(Generator.VALIDATE_JAVA_CONTRIBUTORS, Boolean.TRUE);
				return ctx;
			};
			
		};				
		Diagnostic validationResult = diagnostician.validate(generator);
		if (validationResult.getSeverity() == Diagnostic.ERROR) {
			throw new DiagnosticException(validationResult);
		}
		return super.createWork(context);
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
