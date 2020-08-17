package org.nasdanika.codegen.gen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Map.Entry;

import org.nasdanika.codegen.ContentGenerator;
import org.nasdanika.codegen.HttpCall;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.ncore.AbstractEntry;

public class HttpCallAdapter extends ContentGeneratorAdapter<HttpCall> implements SupplierFactory<InputStream> {

	public HttpCallAdapter(HttpCall target) {
		super(target);
	}

	@Override
	protected Supplier<InputStream> createElement(Context iContext) throws Exception {
		// Headers - Map		
		MapCompoundSupplierFactory<String,Object> headersSupplierFactory = new MapCompoundSupplierFactory<>("Headers");
		
		for (AbstractEntry e: target.getHeaders()) {
			if (e.isEnabled()) {
				headersSupplierFactory.put(e.getName(), EObjectAdaptable.adaptToSupplierFactory(e, Object.class));
			}
		}		
		
		// Body - List - join
		ListCompoundSupplierFactory<InputStream> bodySupplierFactory = new ListCompoundSupplierFactory<>("Body");
		for (ContentGenerator be: target.getBody()) {
			bodySupplierFactory.add(EObjectAdaptable.adaptToSupplierFactory(be, InputStream.class));			
		}	
						
		FunctionFactory<BiSupplier<Map<String, Object>, InputStream>,InputStream> httpCallFactory = new FunctionFactory<BiSupplier<Map<String,Object>,InputStream>, InputStream>() {

			@Override
			public Function<BiSupplier<Map<String, Object>, InputStream>, InputStream> create(Context context) throws Exception {
				return new Function<BiSupplier<Map<String, Object>, InputStream>, InputStream>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return target.getTitle();
					}

					@Override
					public InputStream execute(BiSupplier<Map<String, Object>, InputStream> headersAndBody, ProgressMonitor progressMonitor) throws Exception {
						return call(context, headersAndBody.getFirst(), headersAndBody.getSecond(), progressMonitor);
					}
					
				};
			}
			
		};
		return headersSupplierFactory.then(bodySupplierFactory.then(Util.JOIN_STREAMS_FACTORY).asFunctionFactory()).then(httpCallFactory).create(iContext);
	}
	
	protected InputStream call(Context context, Map<String, Object> headers, InputStream body, ProgressMonitor progressMonitor) throws Exception {				
		URL url = EmfUtil.resolveReference(target.eResource(), context.interpolateToString(target.getUrl()));
		URLConnection connection = url.openConnection();
		if (!(connection instanceof HttpURLConnection)) {
			throw new IllegalArgumentException("Not an HTTP(s) url: "+url);
		}
		
		HttpURLConnection httpConnection = (HttpURLConnection) connection;
		httpConnection.setRequestMethod(target.getMethod().getLiteral());
		httpConnection.setDoOutput(!target.getBody().isEmpty());
		for (Entry<String, Object> hwe: headers.entrySet()) {
			httpConnection.setRequestProperty(hwe.getKey(), String.valueOf(hwe.getValue()));
		}
		httpConnection.setConnectTimeout(target.getConnectTimeout() * 1000); 
		httpConnection.setReadTimeout(target.getReadTimeout() * 1000); 
		
		if (!target.getBody().isEmpty()) {
			try (OutputStream bout = new BufferedOutputStream(connection.getOutputStream())) {
				try (InputStream bin = new BufferedInputStream(body)) {
					int b;
					while ((b = bin.read()) != -1) {
						bout.write(b);
					}
				}
			}
		}
		
		int responseCode = httpConnection.getResponseCode();
		if (responseCode == target.getSuccessCode()) { 
			return target.isInterpolate() ? Util.filter(context, httpConnection.getInputStream(), context::interpolateToString) : httpConnection.getInputStream();
		}
		
		throw new NasdanikaException("HTTP Call to "+url+" has failed with response: "+responseCode+" "+httpConnection.getResponseMessage());
	}

}
