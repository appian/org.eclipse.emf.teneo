/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbSessionDataStore;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.cfg.Configuration;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ258266Action extends AbstractTestAction {

	public BZ258266Action() {
		super(new EPackage[] { bz242995Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final HbDataStore hbds = (HbDataStore) store.getDataStore();

		final HbSessionDataStore localDs = new HbSessionDataStore() {

			@Override
			protected Configuration createConfiguration() {
				final Configuration c = new Configuration();
				c.addClass(BZ258266.class);
				return c;
			}
		};

		localDs.setEPackages(new EPackage[] { bz242995Package.eINSTANCE });
		localDs.setProperties(hbds.getProperties());
		localDs.initialize();
	}
}
