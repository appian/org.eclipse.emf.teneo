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
 * $Id: ExportXMI.java,v 1.2 2007/02/01 12:34:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.eclipse;

import java.io.ByteArrayOutputStream;
import java.util.Properties;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.teneo.eclipse.resourcehandler.StoreExportXML;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbUtil;

/**
 * Performs the export xmi action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class ExportXMI extends StoreExportXML {
	/** Can be overridden */
	protected boolean isXMLExport() {
		return false;
	}

	/** Does the real export */
	protected byte[] doExport(Properties props) {
		HbDataStore emfds = HbUtil.getCreateDataStore(props);
		// for now export the whole content to one byte array
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		emfds.exportDataStore(os, HbConstants.EXCHANGE_FORMAT_XMI, ResourcesPlugin.getEncoding());
		return os.toByteArray();
	}
}
