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
 * $Id: HibernateAction.java,v 1.4 2008/08/11 21:58:00 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernateFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test for several hibernate annotations. See bugzilla: 242895, 242897
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class HibernateAction extends AbstractTestAction {
	/** How many test objects are created */
	private static final int NO_TEST_OBJECTS = 10;

	final HibernateFactory factory = HibernateFactory.eINSTANCE;

	public HibernateAction() {
		super(HibernatePackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	// @Override
	// public Properties getExtraConfigurationProperties() {
	// final Properties props = new Properties();
	// props.setProperty(PersistenceOptions.DEFAULT_TEMPORAL_VALUE, "DATE");
	// return props;
	// }

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			store.store(createCities());

			final State st = factory.createState();
			store.store(st);
			final StateDetail std = factory.createStateDetail();
			store.store(std);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final State st = factory.createState();
			store.store(st);
			final StateDetail std = factory.createStateDetail();
			std.setState(st);
			store.store(std);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final List<City> cities = store.getObjects(City.class);
			store.deleteObject(cities.get(0));
			store.commitTransaction();
		}

		{
			final List<State> states = store.getObjects(State.class);
			int cnt = 0;
			for (State st : states) {
				if (st.getStateDetail() != null) {
					cnt++;
				}
			}
			assertEquals(1, cnt);
		}
	}

	private List<City> createCities() {
		final List<City> cities = new ArrayList<City>();
		for (int i = 0; i < NO_TEST_OBJECTS; i++) {
			final City city = factory.createCity();
			city.setName("city " + i);
			city.getStreets().addAll(createStreets("city" + i));
			cities.add(city);
		}
		return cities;
	}

	private List<Street> createStreets(String prefix) {
		final List<Street> streets = new ArrayList<Street>();
		for (int i = 0; i < NO_TEST_OBJECTS; i++) {
			final Street street = factory.createStreet();
			street.setName(prefix + " - street " + i);
			streets.add(street);
		}
		return streets;
	}
}