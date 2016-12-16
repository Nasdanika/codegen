# Nasdanika Code Generation

Nasdanika Code Generation provides an Ecore model which encapsulates generation of Eclipse projects, folders, files, packages, compilation units, ...
It also provides an editor for the model. Code can be generated from a model by using context menu item and then supplying input configuration either as a file or interactively
through UI dialogs.

## Concepts 

The model contains generators and filters. Filter is a generator which contains another generator and performs some processing on the contained generator output to produce its own output. 
Please consult the [model API documentation](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/) for the complete list of model elements.

In the model generators are organized in a tree, e.g. workspace "generator" (it doesn't actually generate anything) may contain project generators, which in turn may contain file, folder, and nature generators.

Java nature generator may contain package fragment roots generators, which contain package fragment generators, which in turn contain compilation unit generators.

Maven nature may contain pom.xml generator.

[Generator](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/org/nasdanika/codegen/Generator.html) extends [Configuration](http://www.nasdanika.org/products/config/apidocs/org.nasdanika.config/apidocs/org/nasdanika/config/Configuration.html?is-external=true) and as such may contain configuration items - properties, services, and configuration categories.

Generation works in the following way:

* Generators create [Work](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/org/nasdanika/codegen/Work.html).
* Work takes [Context](http://www.nasdanika.org/products/config/apidocs/org.nasdanika.config/apidocs/org/nasdanika/config/Context.html?is-external=true) and progress monitor as its ``execute()`` method arguments. 
* Because Generator extends Configuration, it has createContext() method. When generator's work is executed it receives a context created by its generator with container generator context as its parent. The top level generator receives its context from the client code, e.g. from the model editor. What it means is that each child generator inherits properties and services from its parent generator. 

### Name interpolation

Some generators, e.g. project generator, have name attribute. During generation the name attribute value gets interpolated to produce the name of the generated artifact, e.g. workspace project.
Interpolation means expanding ``{{<property name>[|<default value>]}}`` tokens to the value of the property with the specified name from the generation context. Interpolation makes iteration (see below) possible.    

### Reconcile action and merging

Reconcile action attribute allows to specify what to do if an artifact about to be generated already exists. One of options is "Merge". 
If "Merge" is selected the generator must contain Merger which would combine generated and existing artifact content.

### Iterator

All generators have [Iterator](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/org/nasdanika/codegen/Generator.html#getIterator--) attribute which may contain Java code returning null, Context, Collection or Array in order to execute the generator work zero or more times.

### Configurator

Also generators have [Configurator](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/org/nasdanika/codegen/Generator.html#getConfigurator--) attribute which may also contain Java code to be executed when the generator has created its object (e.g. a folder or a project), but before any child generators are invoked. 
Configurator can be used, for example, to configure class path in Java nature, or set project description. 


## Creating a model

* Install Configuration editor from ``http://www.nasdanika.org/products/codegen/repository``.
* File > New > Other > Nasdanika/Code Generation Model.
* Select the root model element. If the model is going to be used to generate code from the editor, select "Workspace". 
* Add child elements to the root and configure.
* Right-click on the model root or other model element and select "Validate" context menu item to validate the model.

## Generating code

* Right-click on the model root or other model element and select "Generate". 
* Enter values for unbound properties to a dialog when requested.

If the project containing the generation model is a Java project, then Java classes defined in the project or referenced by the project are available in the generators context class loader.

## API Documentation

* [Model](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen/apidocs/)
* [Edit](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen.edit/apidocs/)
* [Editor](http://www.nasdanika.org/products/codegen/apidocs/org.nasdanika.codegen.editor/apidocs/)

## P2 Repository

* ``http://www.nasdanika.org/products/codegen/repository``
* [Archived](http://www.nasdanika.org/products/codegen/org.nasdanika.codegen.repository-0.1.0-SNAPSHOT.zip)
 
## Roadmap

* Structured compilation unit
  * Types
  * Methods
  * Fields
* Extension point for registering generation models and a wizard to generate code using registered models packaged in plug-ins.
* Eclipse help with HTML documentation for the code generation model.
* Form editor on the right side of the tree editor with help contents rendered from GenModel documentation annotations.
* Console IApplication for headless generation. 

## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 

