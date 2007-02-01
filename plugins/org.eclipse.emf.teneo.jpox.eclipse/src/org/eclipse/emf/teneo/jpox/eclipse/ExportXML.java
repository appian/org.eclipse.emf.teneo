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
 * $Id: ExportXML.java,v 1.3 2007/02/01 12:34:26 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.eclipse;

import java.io.ByteArrayOutputStream;
import java.util.Properties;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.teneo.eclipse.resourcehandler.StoreExportXML;
import org.eclipse.emf.teneo.jpox.JpoxConstants;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxUtil;

/**
 * Performs the export xml action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class ExportXML extends StoreExportXML {
	/** Does the real export */
	protected byte[] doExport(Properties props) {
		JpoxDataStore emfds = JpoxUtil.getCreateDataStore(props);
		// for now export the whole content to one byte array
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		emfds.exportDataStore(os, JpoxConstants.EXCHANGE_FORMAT_XML, ResourcesPlugin.getEncoding());
		return os.toByteArray();
	}
}
