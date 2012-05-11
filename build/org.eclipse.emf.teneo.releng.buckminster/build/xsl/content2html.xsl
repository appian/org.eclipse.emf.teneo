<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" omit-xml-declaration="yes" indent="yes" />
	<xsl:strip-space elements="*" />

	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml">
			<xsl:apply-templates select="repository" />
		</html>
	</xsl:template>

	<xsl:template match="repository">
		<head>
			<title>
				EMF Teneo Update Site
			</title>
		</head>
		<body>
			<h1>
				EMF Teneo Update Site
 			</h1>
			<p>
				<em>
					For information on the EMF Teneo project visit the
					<a href="http://wiki.eclipse.org/Teneo">EMF Teneo wiki</a>
					.
					<br />
					<br />
					Some EMF Teneo plugins require third party drivers from the
					following update site:
					<a href="http://www.elver.org/eclipse/1.2.0/update/">Teneo/Texo dependencies</a>
					.
					<br />
					<br />
					For information about installing or updating software, see the
					<a
						href="http://help.eclipse.org/galileo/index.jsp?topic=/org.eclipse.platform.doc.user/tasks/tasks-124.htm">
						Eclipse Platform Help</a>
					.
				</em>
			</p>
			<table border="0">
				<tr>
					<td colspan="2">
						<hr />
						<h2>Features</h2>
					</td>
				</tr>
				<xsl:apply-templates
					select="//provided[@namespace='org.eclipse.update.feature']">
					<xsl:with-param name="type">features</xsl:with-param>
					<xsl:sort select="@name" />
				</xsl:apply-templates>
				<tr>
					<td colspan="2">
						<hr />
						<h2>Plugins</h2>
					</td>
				</tr>
				<xsl:apply-templates select="//provided[@namespace='osgi.bundle']">
					<xsl:with-param name="type">plugins</xsl:with-param>
					<xsl:sort select="@name" />
				</xsl:apply-templates>
			</table>
		</body>
	</xsl:template>

	<xsl:template match="provided">
		<xsl:param name="type" />
		<tr>
			<td>
				<xsl:element name="a">
					<xsl:attribute name="href"><xsl:value-of select="$type"/>/<xsl:value-of select="@name"/>_<xsl:value-of select="@version"/>.jar</xsl:attribute>
					<xsl:value-of select="@name"/>
				</xsl:element>
			</td>
			<td>
				<xsl:value-of select="@version" />
			</td>
		</tr>
	</xsl:template>

</xsl:stylesheet>