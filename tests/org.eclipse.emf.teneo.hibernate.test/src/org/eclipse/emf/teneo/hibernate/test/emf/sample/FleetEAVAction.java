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
 * $Id: FleetEAVAction.java,v 1.3 2010/03/02 23:28:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.test.emf.sample.FleetAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the fleet example using an eav mapping.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class FleetEAVAction extends FleetAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		props.setProperty(PersistenceOptions.SQL_TABLE_NAME_PREFIX, "PREFIX_");
		return props;
	}

	// test hbhelper deregister
	public void doAction(TestStore store) {
		store.disableDrop();
		super.doAction(store);
		store.disableDrop();
		HbHelper.INSTANCE.deRegisterDataStore(store.getDataStore().getName());

		// it should be removed from the HBHelper
		assertTrue(null == HbHelper.INSTANCE.getDataStore(store.getDataStore().getName()));

	}
}
