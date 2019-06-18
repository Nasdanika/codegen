<?xml version="1.0" encoding="UTF-8"?>
<!-- Transforms site.xml to toc.xml, but it should be the other way around for Codegen -->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
		<toc label="Nasdanika" link_to="../org.nasdanika.help/toc.xml#Nasdanika">
	    	<topic>
				<xsl:attribute name="label">
    				<xsl:value-of select="breadcrumbs/item[last()]/@name" />
  				</xsl:attribute>
				<anchor id="code_generation"/>
				<xsl:apply-templates select="project/body/menu"/>	 
			</topic>			
	    </toc>
    </xsl:template>

    <xsl:template match="menu">
        <topic>
			<xsl:attribute name="label">
				<xsl:value-of select="@name" />
			</xsl:attribute>
            <xsl:apply-templates select="item"/>
        </topic>
    </xsl:template>

    <xsl:template match="item">
        <topic>
			<xsl:attribute name="label">
				<xsl:value-of select="@name" />
			</xsl:attribute>
			<xsl:attribute name="href">
				<xsl:value-of select="concat('doc/',@href)" />
			</xsl:attribute>
            <xsl:apply-templates select="item"/>
        </topic>
    </xsl:template>
</xsl:stylesheet>

<!-- 
<toc label="Nasdanika" link_to="../org.nasdanika.help/toc.xml#Nasdanika">
   <topic href="doc/codegen.md.html" label="Code generation">
      <anchor id="code_generation"/>
      <topic label="Models">
         <link toc="doc/model/toc.xml"/>
      </topic>
   </topic>
</toc>
 -->