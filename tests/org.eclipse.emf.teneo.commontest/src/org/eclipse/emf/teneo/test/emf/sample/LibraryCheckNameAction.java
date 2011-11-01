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
 * $Id: LibraryCheckNameAction.java,v 1.3 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class LibraryCheckNameAction extends LibraryColLengthAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#setExtensions(org.eclipse.emf.teneo.extension.ExtensionManager)
	 */
	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		// purposely empty, do not remove
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "8");
		props.put(PersistenceOptions.ID_COLUMN_NAME, "myID");
		return props;
	}

	@Override
	protected String getTestQuery() {
		return "SELECT * FROM BOOK WHERE lb_bk_d<>0 AND lb_bk_dx>0 AND wr_bk_dx>0".toLowerCase();
	}
}
