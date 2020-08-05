package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ProgressRecorder;
import org.nasdanika.common.Status;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.FileSystemContainer;

public class TestsBase {

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
			
	protected static final String TEST_MODELS_BASE_URI = "org.nasdanika.codegen.tests.models/models/";
	protected static final String TEST_OUTPUT_BASE = "target/generator-tests/";
	
	protected class GenerationResult {
		
		Object result;
		BinaryEntityContainer output;
		
	}
	
	/**
	 * Performs validation and generation.
	 * @param path Path to the test to execute relative to the model base URI. The model is loaded from the path concatenated with .codegen extension and results are stored to
	 * the path relative to the test output base. 
	 * @throws Exception
	 */
	public GenerationResult validateAndGenerate(String path, Context context) throws Exception {
		throw new UnsupportedOperationException();
//		try {
//			ValidatingModelGenerator<BinaryEntity> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+path+".codegen");
//			GenerationResult result = new GenerationResult();
//			result.output = new FileSystemContainer(new File(TEST_OUTPUT_BASE+path));
//			MutableContext mc = Context.EMPTY_CONTEXT.compose(context).fork();
//			mc.register(BinaryEntityContainer.class, result.output);
//			
//			Supplier<List<BinaryEntity>> work = validatingModelGenerator.create(mc);
//			
//			try (ProgressRecorder workDiagnostic = new ProgressRecorder()) {
//				org.nasdanika.common.Diagnostic diagnostic = work.diagnose(workDiagnostic);
//				if (diagnostic.getStatus() == Status.ERROR) {
//					dumpDiagnostic(diagnostic, 0);
//					System.out.println(workDiagnostic.toJSON().toString(4));
//					throw new org.nasdanika.common.DiagnosticException("Cannot execute generator supplier", diagnostic);
//				}
//			}
//			
//			try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
//				try (ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0)) {
//					 result.result = work.execute(progressMonitor.split("Generating "+path, work.size()).compose(pe.split("Doc", 1)));	
//				
//		//			// HTML report
//		//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
//		//			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
//		//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
//		//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
//				}
//			}
//			
//			return result;
//		} catch (DiagnosticException e) {
//			dumpDiagnostic(e.getDiagnostic(), 0);
//			throw e;
//		}
	}			
	
	static void dumpDiagnostic(Diagnostic d, int indent) {
		for (int i=0; i < indent; ++i) {
			System.out.print("    ");
		}
		System.out.println(toString(d));
	    if (d.getChildren() != null) {
	    	d.getChildren().forEach(c -> dumpDiagnostic(c, indent + 1));
	    }
		
	}
	
	static String toString(Diagnostic d) {
		StringBuilder result = new StringBuilder();
		switch (d.getSeverity()) {
		case Diagnostic.OK:
			result.append("OK");
			break;
		case Diagnostic.INFO:
			result.append("INFO");
			break;
		case Diagnostic.WARNING:
			result.append("WARNING");
			break;
		case Diagnostic.ERROR:
			result.append("ERROR");
			break;
		case Diagnostic.CANCEL:
			result.append("CANCEL");
			break;
		default:
			result.append(Integer.toHexString(d.getSeverity()));
			break;
		}

		result.append(" source=");
		result.append(d.getSource());

		result.append(" code=");
		result.append(d.getCode());

		result.append(' ');
		result.append(d.getMessage());

		if (d.getData() != null) {
			result.append(" data=");
			result.append(d.getData());
		}

		return result.toString();
	}	
	
	static void dumpDiagnostic(org.nasdanika.common.Diagnostic d, int indent) {
		for (int i=0; i < indent; ++i) {
			System.out.print("    ");
		}
		System.out.println(toString(d));
	    if (d.getChildren() != null) {
	    	d.getChildren().forEach(c -> dumpDiagnostic(c, indent + 1));
	    }
		
	}
	
	static String toString(org.nasdanika.common.Diagnostic d) {
		StringBuilder result = new StringBuilder();
		Status status = d.getStatus();
		if (status != null) {
			result.append(status.name());
		}

		result.append(' ');
		result.append(d.getMessage());

		if (d.getData() != null) {
			result.append(" data=");
			result.append(d.getData());
		}

		return result.toString();
	}	
		
}
