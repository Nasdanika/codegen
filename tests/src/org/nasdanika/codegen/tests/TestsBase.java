package org.nasdanika.codegen.tests;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.function.BiFunction;

import org.nasdanika.codegen.util.ValidatingModelGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ProgressRecorder;
import org.nasdanika.common.Work;
import org.nasdanika.common.resources.BinaryEntity;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.FileSystemContainer;

public class TestsBase {

	public static BiFunction<String, Object, InputStream> encoder = (path, contents) -> {
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
		ValidatingModelGenerator<BinaryEntity> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+path+".codegen");
		GenerationResult result = new GenerationResult();
		result.output = new FileSystemContainer(new File(TEST_OUTPUT_BASE+path));
		MutableContext mc = Context.EMPTY_CONTEXT.compose(context).fork();
		mc.register(BinaryEntityContainer.class, result.output);
		
		Work<List<BinaryEntity>> work = validatingModelGenerator.createWork(mc);
		
		try (ProgressRecorder workDiagnostic = new ProgressRecorder()) {
			if (!work.canExecute(workDiagnostic)) {
				throw new NasdanikaException("Cannot execute generator work", workDiagnostic);
			}
		}
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			try (ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0)) {
				 result.result = work.execute(progressMonitor.split("Generating "+path, work.size()).compose(pe.split("Doc", 1)));	
			
	//			// HTML report
	//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
	//			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
	//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
	//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
			}
		}
		
		return result;
	}	
		
}
