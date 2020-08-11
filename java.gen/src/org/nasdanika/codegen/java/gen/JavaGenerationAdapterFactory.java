package org.nasdanika.codegen.java.gen;

import org.nasdanika.codegen.gen.ContentGroupAdapter;
import org.nasdanika.codegen.java.Annotation;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.codegen.java.Constructor;
import org.nasdanika.codegen.java.Field;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.codegen.java.JavaPackage;
import org.nasdanika.codegen.java.MemberGroup;
import org.nasdanika.codegen.java.Method;
import org.nasdanika.codegen.java.SourceFolder;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;

/**
 * Generation adapter factory for Java model elements.
 * @author Pavel
 *
 */
public class JavaGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public JavaGenerationAdapterFactory() {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ConsumerFactory, SourceFolder>(
				JavaPackage.Literals.SOURCE_FOLDER, 
				ConsumerFactory.class, 
				this.getClass().getClassLoader(),
				SourceFolderAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory, org.nasdanika.codegen.java.Package>(
					JavaPackage.Literals.PACKAGE, 
					ConsumerFactory.class, 
					this.getClass().getClassLoader(),
					PackageAdapter::new));
			
		registerAdapterFactory(
				new FunctionAdapterFactory<ConsumerFactory, CompilationUnit>(
					JavaPackage.Literals.COMPILATION_UNIT, 
					ConsumerFactory.class, 
					this.getClass().getClassLoader(),
					CompilationUnitAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Field>(
					JavaPackage.Literals.FIELD, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					FieldAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Constructor>(
					JavaPackage.Literals.CONSTRUCTOR, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ConstructorAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, org.nasdanika.codegen.java.Class>(
					JavaPackage.Literals.CLASS, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ClassAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Annotation>(
					JavaPackage.Literals.ANNOTATION, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					AnnotationAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, org.nasdanika.codegen.java.Enum>(
					JavaPackage.Literals.ENUM, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					EnumAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Interface>(
					JavaPackage.Literals.INTERFACE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					InterfaceAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Method>(
					JavaPackage.Literals.METHOD, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					MethodAdapter::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, MemberGroup>(
					JavaPackage.Literals.MEMBER_GROUP, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentGroupAdapter::new));
			
	}

}
