/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz386607.Bar;
import org.eclipse.emf.teneo.samples.issues.bz386607.Bz386607Factory;
import org.eclipse.emf.teneo.samples.issues.bz386607.Bz386607Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz386607Action extends AbstractTestAction {

	public Bz386607Action() {
		super(new EPackage[] { Bz386607Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"org/eclipse/emf/teneo/hibernate/test/issues/bz386607.persistence.xml");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			Bar bar = Bz386607Factory.eINSTANCE.createBar();
			try {
				store.store(bar);
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				// should fail
				store.rollbackTransaction();
			}
		}
		{
			store.beginTransaction();
			Bar bar = Bz386607Factory.eINSTANCE.createBar();
			bar.setFoo(Bz386607Factory.eINSTANCE.createFoo());
			store.store(bar);
			store.commitTransaction();
		}

	}
}
