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
 * $Id: LibraryFKAction.java,v 1.1 2007/07/11 17:14:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests foreign key
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryFKAction extends LibraryAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = super.getExtraConfigurationProperties();
		props.setProperty(PersistenceOptions.SET_FOREIGN_KEY_NAME, "true");
		return props;
	}
}
