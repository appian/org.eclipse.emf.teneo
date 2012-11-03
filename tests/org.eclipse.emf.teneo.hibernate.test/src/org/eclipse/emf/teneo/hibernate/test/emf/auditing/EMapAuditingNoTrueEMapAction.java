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
 * $Id: EMapAction.java,v 1.2 2010/04/04 12:12:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests support for emaps and auditing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class EMapAuditingNoTrueEMapAction extends EMapAuditingTrueEMapAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		props.setProperty(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}
}
