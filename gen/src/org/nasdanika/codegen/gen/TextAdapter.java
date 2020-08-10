package org.nasdanika.codegen.gen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.nasdanika.codegen.Text;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;

public class TextAdapter extends ContentGeneratorAdapter<Text> {

	public TextAdapter(Text target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		return new Supplier<InputStream>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return target.getTitle();
			}

			@Override
			public InputStream execute(ProgressMonitor progressMonitor) throws Exception {
				String text = target.getText();
				if (text == null || text.length() == 0) {
					return null;
				}
				if (target.isInterpolate()) {
					text = iContext.interpolateToString(text);
				}
				
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try (OutputStreamWriter osw = new OutputStreamWriter(baos, iContext.get(Charset.class, StandardCharsets.UTF_8))) {
					osw.write(text);
				}
				baos.close();
				return new ByteArrayInputStream(baos.toByteArray());
			}
			
		};
	}

}
