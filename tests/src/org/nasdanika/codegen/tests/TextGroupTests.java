package org.nasdanika.codegen.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.common.Context;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class TextGroupTests extends TestsBase {
	
	@Test
	public void testPredicateRussianLocale() throws Exception {
		Context context = Context.singleton("locale", "ru");
		GenerationResult result = validateAndGenerate("text-group/predicate", context);
		System.out.println(result.result);
		assertEquals(Collections.singletonList("Всем привет!"), result.result);		
	}
	
	@Test
	public void testPredicateEnglishLocale() throws Exception {
		Context context = Context.singleton("locale", "en");
		GenerationResult result = validateAndGenerate("text-group/predicate", context);
		System.out.println(result.result);
		assertEquals(Collections.singletonList("Hello everybody!"), result.result);		
	}
	
	
	@Test
	public void testPredicateNoLocale() throws Exception {
		Context context = Context.EMPTY_CONTEXT;
		GenerationResult result = validateAndGenerate("text-group/predicate", context);
		System.out.println(result.result);
		assertEquals(Collections.singletonList("Hello everybody!"), result.result);		
	}
	
}
