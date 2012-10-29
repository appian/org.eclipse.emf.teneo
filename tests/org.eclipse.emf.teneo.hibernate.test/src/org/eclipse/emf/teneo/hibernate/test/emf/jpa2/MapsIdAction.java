/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EmbeddedIdAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import java.util.List;

import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Address;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.HumanClone;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Name;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.PersonIdentifier;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class MapsIdAction extends AbstractTestAction {

	private static final String FIRST_NAME = "Jan";
	private static final String LAST_NAME = "Janssen";

	public MapsIdAction() {
		super(MapsidPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		// test MapsId with value
		storePerson(store);
		testPerson(store);

		testNonComponentIdForeignGenerator(store);
		testComponentIdForeignGenerator(store);
	}

	private void testComponentIdForeignGenerator(TestStore store) {
		{
			store.beginTransaction();
			final Human human = MapsidFactory.eINSTANCE.createHuman();
			final HumanClone humanClone = MapsidFactory.eINSTANCE.createHumanClone();
			final Name name = MapsidFactory.eINSTANCE.createName();
			name.setFirstName(FIRST_NAME);
			name.setLastName(LAST_NAME);
			human.setHumanClone(humanClone);
			humanClone.setName(name);
			store.store(humanClone);
			store.store(human);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Human human = store.getObject(Human.class);
			final Name name1 = human.getName();
			final Name name2 = human.getHumanClone().getName();
			assertTrue(name1 != name2);
			assertTrue(name1.getFirstName().equals(name2.getFirstName()));
			assertTrue(name1.getLastName().equals(name2.getLastName()));
			store.commitTransaction();
		}
	}

	private void testNonComponentIdForeignGenerator(TestStore store) {
		{
			store.beginTransaction();
			final House house = MapsidFactory.eINSTANCE.createHouse();
			final Address address = MapsidFactory.eINSTANCE.createAddress();
			house.setAddress(address);
			store.store(MapsidFactory.eINSTANCE.createAddress());
			store.store(address);
			store.store(house);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final House house = store.getObject(House.class);
			assertTrue(house.getId() == house.getAddress().getId());
			assertTrue(house.getId() > 1);
			store.commitTransaction();
		}
	}

	private void storePerson(TestStore store) {
		final Person person = MapsidFactory.eINSTANCE.createPerson();
		final Name name = MapsidFactory.eINSTANCE.createName();
		final PersonIdentifier pi = MapsidFactory.eINSTANCE.createPersonIdentifier();
		name.setFirstName(FIRST_NAME);
		name.setLastName(LAST_NAME);
		person.setIdentifier(pi);
		pi.setName(FIRST_NAME);
		person.setName(name);
		store.beginTransaction();
		store.store(person);
		store.commitTransaction();
	}

	private void testPerson(TestStore store) {
		store.beginTransaction();
		final List<?> persons = store.query("select p from Person p");
		assertEquals(1, persons.size());
		final Person person = (Person) persons.get(0);
		assertEquals(FIRST_NAME, person.getName().getFirstName());
		assertEquals(LAST_NAME, person.getName().getLastName());
		assertEquals(FIRST_NAME, person.getIdentifier().getName());
		store.commitTransaction();
	}

}
