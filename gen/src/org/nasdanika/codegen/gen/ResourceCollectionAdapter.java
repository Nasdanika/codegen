package org.nasdanika.codegen.gen;

import java.io.InputStream;

import org.nasdanika.codegen.ResourceCollection;
import org.nasdanika.common.Context;
import org.nasdanika.common.Util;

import io.github.azagniotov.matcher.AntPathMatcher;

public abstract class ResourceCollectionAdapter<T extends ResourceCollection> extends ResourceGeneratorAdapter<T> {

	private static final String NEW_LINE_REGEX = "\\s";

	protected ResourceCollectionAdapter(T target) {
		super(target);
	}
	
	/**
	 * @param path
	 * @return true if this path shall be included into the resource collection.
	 */
	protected boolean include(String path) {
		AntPathMatcher.Builder builder = new AntPathMatcher.Builder();
		AntPathMatcher matcher = builder.build();		
		boolean included = Util.isBlank(target.getIncludes());
		if (!included) {
			for (String pattern: target.getIncludes().split(NEW_LINE_REGEX)) {
				if (!Util.isBlank(pattern) && matcher.isMatch(pattern, path)) {
					included = true;
					break;
				}
			}
		}
		if (included && !Util.isBlank(target.getExcludes())) {
			for (String pattern: target.getExcludes().split(NEW_LINE_REGEX)) {
				if (!Util.isBlank(pattern) && matcher.isMatch(pattern, path)) {
					return false;
				}
			}
		}
		return included;
	}
	
	/**
	 * @param path
	 * @return true if the resource shall be interpolated.
	 */
	protected boolean shouldInterpolate(String path) {
		AntPathMatcher.Builder builder = new AntPathMatcher.Builder();
		AntPathMatcher matcher = builder.build();
		boolean interpolate = false; 
		if (!Util.isBlank(target.getInterpolationExcludes())) {
			for (String pattern: target.getInterpolationIncludes().split(NEW_LINE_REGEX)) {
				if (!Util.isBlank(pattern) && matcher.isMatch(pattern, path)) {
					interpolate = true;
					break;
				}
			}
		}
		if (interpolate && !Util.isBlank(target.getInterpolationExcludes())) {
			for (String pattern: target.getInterpolationExcludes().split(NEW_LINE_REGEX)) {
				if (!Util.isBlank(pattern) && matcher.isMatch(pattern, path)) {
					return false;
				}
			}
		}
		return interpolate;		
	}
	
	/**
	 * Interpolates input stream if path matches interpolation includes and does not match interpolation exculdes.
	 * @param path
	 * @param contents
	 * @return
	 */
	protected InputStream interpolate(Context context, String path, InputStream in) throws Exception {
		return shouldInterpolate(path) ? ContentGeneratorAdapter.filter(context, in, context::interpolateToString) : in;
	}

}
