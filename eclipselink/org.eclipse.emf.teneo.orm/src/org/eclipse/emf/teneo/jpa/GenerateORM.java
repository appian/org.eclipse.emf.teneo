/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
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
 * $Id: GenerateORM.java,v 1.1 2009/03/23 19:01:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.TeneoException;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceMappingBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerFactory;
import org.eclipse.emf.teneo.jpa.convert.ORMGenerator;

/**
 * Class is responsible for generating the hbm file. Is run through a launcher
 * therefore the main methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class GenerateORM {

	/** Parses the args and generates a hbm file */
	public static void main(String[] args) {
		// decode the args
		Properties options = new Properties();
		ArrayList<String> ecores = new ArrayList<String>();
		String targetFileName = null;
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				targetFileName = args[0];
			} else if (args[i].startsWith("+")) { // option
				final String[] keyValue = args[i].substring(1).split(",");
				options.put(keyValue[0], keyValue[1]);
			} else if (args[i].startsWith("-")) { // epackage classnames
				final String[] epacks = args[i].substring(1).split(",");

				// the epackages load them all, hope for the best
				// when loading the epackage should be loaded
				for (String element : epacks) {
					try {
						Class.forName(element);
					} catch (Throwable t) { // ignore everything but show
						// something
						t.printStackTrace(System.err);
					}
				}
			} else {
				ecores.add(args[i]);
			}
		}

		createORMapperFile(targetFileName, ecores.toArray(new String[ecores
				.size()]), options);
	}

	/** Creates the mapping file */
	private static void createORMapperFile(String targetFileName,
			String[] ecores, Properties options) {
		try {
			// get the first ecore file
			File firstEcore = new File(ecores[0]);
			File file = new File(firstEcore.getParentFile(), targetFileName);
			final File archiveFile = new File(firstEcore.getParentFile(),
					targetFileName + "_old");

			if (file.exists()) {
				if (archiveFile.exists()) {
					archiveFile.delete();
				}
				copyFile(file, archiveFile);
				file.delete();
			}
			file.createNewFile();

			final ExtensionManager extensionManager = ExtensionManagerFactory
					.getInstance().create();

			final ORMGenerator converter = new ORMGenerator();
			final PersistenceOptions po = converter
					.getDefaultPersistenceOptions(options);
			final PAnnotatedModel paModel = extensionManager.getExtension(
					PersistenceMappingBuilder.class).buildMapping(ecores, po,
					extensionManager);
			final String orm = converter.generateORM(paModel.getPaEPackages(),
					po);
			FileWriter writer = new FileWriter(file);
			writer.write(orm);
			writer.flush();
		} catch (IOException e) {
			throw new TeneoException(
					"IOException when creating or mapping file", e);
		}
	}

	/** Copies a file */
	public static void copyFile(File src, File dst) throws IOException {
		if (!dst.exists()) {
			dst.createNewFile();
		}

		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}
}