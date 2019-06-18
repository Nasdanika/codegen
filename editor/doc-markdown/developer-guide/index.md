# Developer Guide

## Generate model documentation

When you update the model (``org.nasdanika.codegen/model/codegen.ecore``) the model documentation shall be re-generated. This requires [Ecore Docgen](https://www.nasdanika.org/products/docgen-ecore/index.html) to be installed.

Right-click on ``org.nasdanika.codegen.editor/ecore-docgen.yml`` and then click on "Generate Ecore Documentation" menu.

## Help content

## Eclipse

Eclipse help content is located in ``org.nasdanika.codegen.editor/doc`` and comprised of:

* Generated model documentation.
* Markdown documentation from ``doc-markdown`` converted to HTML by the build process.
* Resouces such as images.

## Site

Site content consists of:

* Manually created site content.
* Eclipse help markdown copied by the build process.
* Eclipse help resources copied by the build process, excluding the ``modeldoc`` folder and ``.html`` files.

This allows to have the same documentation delivered through two channels - Eclipse help and site/web. 
A possible drawback of this approach is that markdown might be rendered differently for the Eclipse help and for the site.

Currently ``toc.xml`` and ``site.xml`` shall be maintained in sync manually. In the future a stylesheet might be created to automatically convert ``toc.xml`` to ``site.xml``.

