/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GenerateJDO.java,v 1.9 2007/07/12 18:04:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.TeneoException;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceMappingBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerFactory;
import org.eclipse.emf.teneo.extension.ExtensionUtil;

/**
 * Class is responsible for generating the jdo file. Is run through a launcher therefore the main
 * methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class GenerateJDO {
	/** The logger for this class */
	private static Log log = LogFactory.getLog(GenerateJDO.class);

	/** Parses the args and generates a jdo file */
	public static void main(String[] args) {
		// decode the args
		Properties options = new Properties();
		ArrayList ecores = new ArrayList();
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
						log.debug("Loading class " + element + " should be an epackage");

						Class epack = Class.forName(element);
						if (!EPackage.class.isAssignableFrom(epack)) {
							log.warn("JDO generator found " + epack.getName() +
									" but this is not an EPackage, ignoring it");
						}
					} catch (Throwable t) { // ignore everything but log it
						log.error("Exception while instantiating " + element, t);
					}
				}
			} else {
				ecores.add(args[i]);
			}
		}

		createORMapperFile(targetFileName, (String[]) ecores.toArray(new String[ecores.size()]), options);
	}

	/** Creates the mapping file. Uses the default ExtensionManager */
	private static void createORMapperFile(String targetFileName, String[] ecores, Properties options) {
		createORMapperFile(targetFileName, ecores, options, ExtensionManagerFactory.getInstance().create());
	}

	/** Creates the mapping file */
	private static void createORMapperFile(String targetFileName, String[] ecores, Properties options,
			ExtensionManager extensionManager) {

		// register the default extensions
		extensionManager.registerExtension(ExtensionUtil.createExtension(JPOXMappingGenerator.class,
			JPOXMappingGenerator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(JPOXMappingGenerator.class,
			JPOXMappingGenerator.class));

		try {
			// get the first ecore file
			File firstEcore = new File(ecores[0]);
			File file = new File(firstEcore.getParentFile(), targetFileName);
			final File archiveFile = new File(firstEcore.getParentFile(), targetFileName + "_old");

			if (file.exists()) {
				if (archiveFile.exists()) {
					archiveFile.delete();
				}
				copyFile(file, archiveFile);
				file.delete();
			}
			file.createNewFile();

			// set the eruntime as the emodel resolver!
			ERuntime.setAsEModelResolver();

			final PersistenceOptions po = new PersistenceOptions(options);
			final PersistenceMappingBuilder pmb = extensionManager.getExtension(PersistenceMappingBuilder.class);
			final PAnnotatedModel paModel = pmb.buildMapping(ecores, po, extensionManager);
			final JPOXMappingGenerator jmg = extensionManager.getExtension(JPOXMappingGenerator.class);
			jmg.setPersistenceOptions(new PersistenceOptions());
			final FileWriter writer = new FileWriter(file);
			writer.write(jmg.generate(paModel));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			log.error(e);
			throw new TeneoException("IOException when creating or mapping file", e);
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