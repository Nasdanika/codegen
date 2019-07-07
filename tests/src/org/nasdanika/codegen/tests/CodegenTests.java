package org.nasdanika.codegen.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	GenerateModelDocumentation.class,
	TextFileTests.class,
	StaticTextTests.class
})
public class CodegenTests {
	
}
