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
 * $Id: DynamicEAVNoDBSchemaAction.java,v 1.1 2010/11/05 09:23:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests the dynamic example using an eav mapping.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class DynamicEAVNoDBSchemaAction extends DynamicAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	protected long getTestId() {
		return 6;
	}

}
