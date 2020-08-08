package org.nasdanika.codegen.gen;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.ncore.Array;
import org.nasdanika.ncore.Function;
import org.nasdanika.ncore.Html;
import org.nasdanika.ncore.HttpCall;
import org.nasdanika.ncore.List;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Null;
import org.nasdanika.ncore.Operation;
import org.nasdanika.ncore.Reference;
import org.nasdanika.ncore.Resource;
import org.nasdanika.ncore.SupplierEntry;
import org.nasdanika.ncore.TypedElement;
import org.nasdanika.ncore.TypedEntry;
import org.nasdanika.ncore.Value;

/**
 * Generation adapter factory for Codegen model elements.
 * @author Pavel
 *
 */
public class CodegenGenerationAdapterFactory extends ComposedAdapterFactory {
	
//	@SuppressWarnings("rawtypes")
	public CodegenGenerationAdapterFactory() {
		// Registering adapter factories.
//		registerAdapterFactory(
//			new FunctionAdapterFactory<SupplierFactory, Array>(
//				NcorePackage.Literals.ARRAY, 
//				SupplierFactory.class, 
//				this.getClass().getClassLoader(),
//				ArraySupplierFactory::new));
		
	}

}
