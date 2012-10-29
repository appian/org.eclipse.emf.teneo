/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SamplesSource.java,v 1.5 2008/02/28 07:08:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples;

import java.io.File;
import java.io.FileNotFoundException;

import org.eclipse.emf.ecore.EPackage;

/**
 * Utility method for different kinds of class and source file related actions. Is in this package
 * for convenience.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public final class SamplesSource {

	private static final String SOURCE_REL_PATH = "../src";
	private static File SAMPLES_SOURCE_BASE = null;

	private SamplesSource() {
	}

	/**
	 * Returns the outputlocation of the package of the passed class
	 */
	public static String getOutputDirectory(String name, boolean isPackage) {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(SamplesSource.class.getResource(
				'/' + SamplesSource.class.getName().replace('.', '/') + ".class").getFile());

		// now go up 5 directories:
		// SamplesSource samples teneo emf eclipse org bin
		file = file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile()
				.getParentFile();

		// now go down again to the package
		String path = name.replace('.', File.separatorChar);
		if (!isPackage) {
			path = path.substring(0, path.lastIndexOf(File.separatorChar));
		}

		file = new File(file, path);
		return file.getAbsolutePath();
	}

	/**
	 * Returns the directory which contains the sources for the given package.
	 * 
	 * @throws FileNotFoundException
	 *           if the source folder for the given package cannot be found.
	 */
	public static File getSourceDirectory(String packageName) throws FileNotFoundException {
		if (SAMPLES_SOURCE_BASE == null) {
			String[] classCompNames = SamplesSource.class.getName().split("\\.");
			File thisClassFile = new File(SamplesSource.class.getResource(
					classCompNames[classCompNames.length - 1] + ".class").getFile());
			File baseDir = thisClassFile;
			for (int i = 0; i < classCompNames.length; i++)
				baseDir = baseDir.getParentFile();
			SAMPLES_SOURCE_BASE = new File(baseDir, SOURCE_REL_PATH);

		}
		File baseDir = new File(SAMPLES_SOURCE_BASE, packageName.replace('.', File.separatorChar));
		if (!baseDir.exists())
			throw new FileNotFoundException("Directory " + baseDir.getAbsolutePath() + " does not exists");
		return baseDir;
	}

	/**
	 * Returns the directories which contains the sources for the given packages.
	 * 
	 * @throws FileNotFoundException
	 *           if the source folder for a given package cannot be found.
	 */
	public static File[] getSourceDirectory(String[] packageNames) throws FileNotFoundException {
		File[] sourceFiles = new File[packageNames.length];
		for (int i = 0; i < packageNames.length; i++)
			sourceFiles[i] = getSourceDirectory(packageNames[i]);
		return sourceFiles;
	}

	/**
	 * Return the source folder name for the given package
	 * 
	 * @param ePackage
	 * @throws FileNotFoundException
	 */
	private static String getEPackageFolder(EPackage ePackage) throws FileNotFoundException {
		// TODO it is not robust, anyway answers for this project packages only
		String implPackageName = ePackage.getClass().getName();
		int implPkgFinishAt = implPackageName.lastIndexOf('.');
		if (implPackageName.substring(0, implPkgFinishAt).endsWith(".impl")) {
			return implPackageName.substring(0, implPkgFinishAt - 5);
		} else
			throw new FileNotFoundException("Could not find implementation package "
					+ implPackageName.substring(0, implPkgFinishAt));
	}

	/**
	 * Returns the directory which contains the sources for the given ePackage.
	 * 
	 * @throws FileNotFoundException
	 *           if the source folder for the given package cannot be found.
	 */
	public static File getSourceDirectory(EPackage ePackage) throws FileNotFoundException {
		return getSourceDirectory(getEPackageFolder(ePackage));
	}

	/**
	 * Returns the directories which contain the sources for the given ePackages.
	 * 
	 * @throws FileNotFoundException
	 *           if the source folder for a given package cannot be found.
	 */
	public static File[] getSourceDirectory(EPackage[] ePackages) throws FileNotFoundException {
		File[] sourceFiles = new File[ePackages.length];
		for (int i = 0; i < ePackages.length; i++)
			sourceFiles[i] = getSourceDirectory(ePackages[i]);
		return sourceFiles;
	}
}
