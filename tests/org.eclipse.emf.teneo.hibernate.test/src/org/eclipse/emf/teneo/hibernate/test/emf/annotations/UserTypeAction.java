/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 *
 * $Id: UserTypeAction.java,v 1.12 2009/06/11 04:59:10 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Query;

/**
 * Test
 * 
 * @version $Revision: 1.12 $
 */
@SuppressWarnings("unchecked")
public class UserTypeAction extends AbstractTestAction {

	private static final Name NAME = new Name("Pietje", "Puk");

	private static final String VERIFICATION_QUERY = "SELECT first_name, last_name FROM person";

	public UserTypeAction() {
		super(UsertypePackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.HANDLE_UNSET_AS_NULL, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		storePerson(store);
		testPerson(store);
		testDatabase(store);
		removePerson(store);

		{
			final City c = UsertypeFactory.eINSTANCE.createCity();
			assertTrue(c.getSize() != null);
			assertTrue(!c.isSetSize());
			c.setId(105);
			store.beginTransaction();
			store.store(c);
			store.commitTransaction();
		}
		{
			final City c = store.getObject(City.class);
			assertTrue(c.getSize() != null);
			assertTrue(!c.isSetSize());
			assertEquals(105, c.getId());
			c.setSize(CitySize.MEDIUM_LITERAL);
			assertTrue(c.isSetSize());
			store.beginTransaction();
			store.store(c);
			store.commitTransaction();
			assertTrue(c.isSetSize());
		}
		{
			final City c = store.getObject(City.class);
			assertEquals(105, c.getId());
			assertEquals(CitySize.MEDIUM_LITERAL, c.getSize());
			assertTrue(c.isSetSize());
		}
	}

	private void storePerson(TestStore store) {
		store.beginTransaction();
		Person person = UsertypeFactory.eINSTANCE.createPerson();
		person.setName(NAME);
		person.setDouble(new Double(5));
		UsaPhoneNumber up1 = new UsaPhoneNumber(100, 200, 300);
		UsaPhoneNumber up2 = new UsaPhoneNumber(400, 500, 600);
		UsaPhoneNumber up3 = new UsaPhoneNumber(700, 800, 900);
		person.setEmergencyContact(up1);
		person.getPhoneNumbers().add(up2);
		person.getPhoneNumbers().add(up3);
		person.setNumbers(new int[] { 4, 5 });
		Address addr1 = UsertypeFactory.eINSTANCE.createAddress();
		addr1.setAddressInfo("addr1");
		Address addr2 = UsertypeFactory.eINSTANCE.createAddress();
		addr2.setAddressInfo("addr2");
		person.getAddresses().add(addr1);
		person.getAddresses().add(addr2);
		person.setBirthPlace("Singapore");
		store.store(addr1);
		store.store(addr2);
		store.store(person);
		store.commitTransaction();
	}

	private void testPerson(TestStore store) {
		store.beginTransaction();
		List results = store.query("select p from Person p");
		assertEquals(1, results.size());
		Person person = (Person) results.get(0);
		assertEquals(NAME, person.getName());
		assertEquals(new UsaPhoneNumber(100, 200, 300), person.getEmergencyContact());
		assertTrue(person.getPhoneNumbers().contains(new UsaPhoneNumber(400, 500, 600)));
		assertTrue(person.getPhoneNumbers().contains(new UsaPhoneNumber(700, 800, 900)));
		int[] nums = person.getNumbers();
		assertEquals(2, nums.length);
		assertEquals(4, nums[0]);
		assertEquals(5, nums[1]);

		assertEquals(2, person.getAddresses().size());

		store.commitTransaction();

		final Query q1 = ((HibernateTestStore) store).getSession().getNamedQuery("getPersonByBirthPlace");
		q1.setString(0, "Singapore");
		assertEquals(1, q1.list().size());

		final Query q2 = ((HibernateTestStore) store).getSession().getNamedQuery("getPersonByBirthPlace2");
		q2.setString(0, "Singapore");
		assertEquals(1, q2.list().size());

	}

	private void testDatabase(TestStore store) {
		final Connection connection = store.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(VERIFICATION_QUERY);
			assertTrue(resultSet.next());
			assertEquals(NAME.getFirst(), resultSet.getString(1));
			assertEquals(NAME.getLast(), resultSet.getString(2));
		} catch (SQLException e) {
			assertFalse(e.getMessage(), true);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
			}
		}
	}

	private void removePerson(TestStore store) {
		store.beginTransaction();
		List results = store.query("select p from Person p");
		assertEquals(1, results.size());
		Person person = (Person) results.get(0);
		store.deleteObject(person);
		store.commitTransaction();
		store.checkNumber(Person.class, 0);
		// store.checkNumber(Address.class, 0);
	}
}