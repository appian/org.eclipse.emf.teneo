/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * ImportXML.java,v 1.3 2007/02/01 12:34:26 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.eclipse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.teneo.eclipse.StoreEclipseException;
import org.eclipse.emf.teneo.eclipse.resourcehandler.StoreImportXML;
import org.eclipse.emf.teneo.jpox.JpoxConstants;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxUtil;

/**
 * Performs the import xml action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class ImportXML extends StoreImportXML {
	/** Imports the files into the store */
	@Override
	protected void doImport(IFile[] files, Properties props) {
		try {
			final JpoxDataStore emfds = JpoxUtil.getCreateDataStore(props);
			for (IFile element : files) {
				final InputStream is = element.getContents();
				emfds.importDataStore(is, JpoxConstants.EXCHANGE_FORMAT_XML);
				is.close();
			}
		} catch (IOException i) {
			throw new StoreEclipseException("IO exception while importing xmi", i);
		} catch (CoreException c) {
			throw new StoreEclipseException("Core exception while importing xmi", c);
		}
	}
}
