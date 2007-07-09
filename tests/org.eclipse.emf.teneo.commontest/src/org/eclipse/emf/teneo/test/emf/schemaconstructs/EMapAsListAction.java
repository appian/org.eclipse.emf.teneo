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
 * $Id: EMapAsListAction.java,v 1.1 2007/07/09 12:54:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EMapAsListAction extends EMapAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		return props;
	}
}
