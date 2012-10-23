<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="name" />
	<xsl:param name="mavenVersion" />
	
	<xsl:template match="/">
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<modelVersion>4.0.0</modelVersion>
			<groupId>org.eclipse.emf.teneo</groupId>
			<artifactId><xsl:value-of select="$name" /></artifactId>
			<packaging>jar</packaging>
			<name><xsl:value-of select="$name" /></name>
			<version><xsl:value-of select="$mavenVersion" /></version>
			<description>http://wiki.eclipse.org/Teneo/Hibernate</description>
			<url>http://wiki.eclipse.org/Teneo/Hibernate</url>
			<licenses>
				<license>
					<name>The Eclipse Public License Version 1.0</name>
					<url>http://www.eclipse.org/legal/epl-v10.html</url>
					<distribution>repo</distribution>
				</license>
			</licenses>
			<scm>
				<url>http://git.eclipse.org/c/teneo/org.eclipse.emf.teneo.git/</url>
				<connection>scm:git://git.eclipse.org/gitroot/teneo/org.eclipse.emf.teneo.git/</connection>
				<developerConnection>scm:git://git.eclipse.org/gitroot/teneo/org.eclipse.emf.teneo.git/</developerConnection>
			</scm>
			<developers>
				<developer>
					<id>mtaal</id>
					<name>Martin Taal</name>
					<email>mtaal@elver.org</email>
				</developer>
			</developers>
		</project>
	</xsl:template>
</xsl:stylesheet>