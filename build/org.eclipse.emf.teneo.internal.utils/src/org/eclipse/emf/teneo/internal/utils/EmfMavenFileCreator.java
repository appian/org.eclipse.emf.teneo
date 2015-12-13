/**
 * <copyright>
 *
 * Copyright (c) 2014 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ClassClassLoaderStrategy.java,v 1.6 2009/03/30 07:53:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.internal.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Creates/prepares files for Maven at sonatype.org
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class EmfMavenFileCreator {
	private static final String BASE_DIR = "/home/mtaal/mydata/dev/maven/emfmaven/";
	private static final String PLUGINS_DIR = "eclipse/plugins";
	private static final String JAVADOC_TEMPLATE_JAR_FILE = "template-javadoc.jar";
	private static final String POM_TEMPLATE_FILE = "template.pom";

	private static final String[] plugins = { "org.eclipse.emf.codegen.ecore",
			"org.eclipse.emf.codegen", "org.eclipse.emf.common", "org.eclipse.emf.ecore",
			"org.eclipse.emf.ecore.xmi", "org.eclipse.xsd", "org.eclipse.emf.mapping.ecore2xml",
			"org.eclipse.emf.edit", "org.eclipse.emf.databinding", "org.eclipse.emf.databinding.edit" };

	public static void main(String[] args) throws Exception {
		final EmfMavenFileCreator creator = new EmfMavenFileCreator();
		creator.setDirName("2.11.1");
		creator.setSnapShot(false);
		creator.setWithBuildNumber(true);
		creator.process();
	}

	private String dirName;
	private boolean isSnapShot;
	private boolean withBuildNumber;

	private void process() throws Exception {
		final String outDirPath = BASE_DIR + dirName + File.separator;
		final String sourceDirPath = outDirPath + PLUGINS_DIR + File.separator;
		final File mainDir = new File(outDirPath + PLUGINS_DIR);

		// clear all files
		for (File file : new File(BASE_DIR + dirName).listFiles()) {
			if (file.getName().endsWith(".jar") || file.getName().endsWith(".pom")) {
				file.delete();
			}
		}

		for (String plugin : plugins) {
			for (File file : mainDir.listFiles()) {
				final String fileName = file.getName();
				if (ignoreFile(fileName, plugin)) {
					continue;
				}
				final String version = getVersion(plugin, fileName);
				final String groupId;
				if (plugin.contains(".xsd")) {
					groupId = "org.eclipse.xsd";
				} else {
					groupId = "org.eclipse.emf";
				}

				// copy the plugin itself
				copyFile(sourceDirPath + fileName, outDirPath + plugin + "-" + version + ".jar");

				// copy the source
				final String sourceOriginFileName = fileName.replace("_", ".source_");
				copyFile(sourceDirPath + sourceOriginFileName,
						outDirPath + plugin + "-" + version + "-sources.jar");

				// copy the javadoc template
				copyResource(JAVADOC_TEMPLATE_JAR_FILE,
						outDirPath + plugin + "-" + version + "-javadoc.jar");

				// copy the pom
				String pom = new String(
						Files.readAllBytes(Paths.get(this.getClass().getResource(POM_TEMPLATE_FILE).toURI())));
				pom = pom.replace("${version}", version);
				pom = pom.replace("${name}", plugin);
				pom = pom.replace("${artifactId}", plugin);
				pom = pom.replace("${groupId}", groupId);
				Files.write(Paths.get(outDirPath + plugin + "-" + version + ".pom"), pom.getBytes());

				if (isSnapShot()) {
					System.err.println("<deploy.snapshot name=\"" + plugin + "\" version=\"" + version
							+ "\" jarFileLocation=\"${mainLocation}/" + dirName + "\"/>");
				} else {
					System.err.println("<deploy.staging name=\"" + plugin + "\" version=\"" + version
							+ "\" jarFileLocation=\"${mainLocation}/" + dirName + "\"/>");
				}
			}
		}
	}

	private void copyResource(String sourceFilePath, String destFilePath) throws Exception {
		Files.copy(Paths.get(this.getClass().getResource(sourceFilePath).toURI()),
				Paths.get(destFilePath));
	}

	private void copyFile(String sourceFilePath, String destFilePath) throws Exception {
		Files.copy(Paths.get(sourceFilePath), Paths.get(destFilePath));
	}

	private boolean ignoreFile(String fileName, String plugin) {
		return !fileName.startsWith(plugin + "_") || !fileName.endsWith(".jar")
				|| fileName.contains("source");
	}

	private String getVersion(String plugin, String fileName) {
		// org.eclipse.emf.codegen_2.10.0.v20140127-0448
		// +1 to add the _
		String version = fileName.substring(plugin.length() + 1);
		version = version.substring(0, version.length() - ".jar".length());
		// get rid of the 4th dot
		final int vIndex = version.indexOf("v");
		if (isSnapShot) {
			version = version.substring(0, vIndex - 1) + "-" + version.substring(vIndex);
			final int lastDashIndex = version.lastIndexOf("-");
			version = version.substring(0, lastDashIndex) + "-SNAPSHOT";
		} else if (isWithBuildNumber()) {
			version = version.substring(0, vIndex - 1) + "-" + version.substring(vIndex);
		} else {
			version = version.substring(0, vIndex - 1);
		}
		return version;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public boolean isSnapShot() {
		return isSnapShot;
	}

	public void setSnapShot(boolean isSnapShot) {
		this.isSnapShot = isSnapShot;
	}

	public boolean isWithBuildNumber() {
		return withBuildNumber;
	}

	public void setWithBuildNumber(boolean withBuildNumber) {
		this.withBuildNumber = withBuildNumber;
	}

}