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
 * $Id: NoEscapeLibraryAction.java,v 1.1 2008/01/29 19:02:01 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd without escape character.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class NoEscapeLibraryAction extends LibraryAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SQL_NAME_ESCAPE_CHARACTER, "");
		props.putAll(super.getExtraConfigurationProperties());
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		assertTrue(store.getMappingXML().indexOf("`") == -1);
	}
}
