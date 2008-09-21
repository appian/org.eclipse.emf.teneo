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
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Factory;
import org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package;
import org.eclipse.emf.teneo.samples.issues.bz245634.City;
import org.eclipse.emf.teneo.samples.issues.bz245634.Country;
import org.eclipse.emf.teneo.samples.issues.bz245634.Mayor;
import org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.proxy.HibernateProxy;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz245634Action extends AbstractTestAction {

	private Bz245634Factory factory = Bz245634Factory.eINSTANCE;

	public Bz245634Action() {
		super(new EPackage[] { Bz245634Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		long id = 1;
		{
			store.beginTransaction();
			City c = factory.createCity();
			c.setId(id++);
			Mayor m = factory.createMayor();
			PoliceChief pc = factory.createPoliceChief();
			Country country = factory.createCountry();
			c.setCountry(country);
			c.setMayor(m);
			c.setPoliceChief(pc);
			store.store(c);
			store.store(m);
			store.store(country);
			store.store(pc);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Mayor m = store.getObject(Mayor.class);
			assertFalse(m.getCity() instanceof HibernateProxy);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final HibernateTestStore hts = (HibernateTestStore) store;
			final City c = (City) hts.getSession().get("City", new Long(1));
			assertTrue(c.getCountry() instanceof HibernateProxy);
			assertTrue(c.getMayor() instanceof HibernateProxy);
			assertFalse(c.getPoliceChief() instanceof HibernateProxy);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			City c = store.getObject(City.class);
			assertTrue(c.getCountry() instanceof HibernateProxy);
			assertTrue(c.getMayor() instanceof HibernateProxy);
			assertFalse(c.getPoliceChief() instanceof HibernateProxy);
			store.commitTransaction();
		}
	}
}
