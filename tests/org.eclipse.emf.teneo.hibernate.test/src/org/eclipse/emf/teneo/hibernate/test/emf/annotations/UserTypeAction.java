/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   L.M. Fridael
 * </copyright>
 *
 * $Id: UserTypeAction.java,v 1.4 2006/11/13 14:52:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test
 * 
 * @author <a href="mailto:lmfridael@elver.org">Laurens Fridael</a>
 * @version $Revision: 1.4 $
 */
public class UserTypeAction extends AbstractTestAction {

	private static final Name NAME = new Name("Pietje", "Puk");

	private static final String VERIFICATION_QUERY = "SELECT first_name, last_name FROM person";

	public UserTypeAction() {
		super(UsertypePackage.eINSTANCE);
	}

	public void doAction(TestStore store) {
		storePerson(store);
		testPerson(store);
		testDatabase(store);
	}

	private void storePerson(TestStore store) {
		store.beginTransaction();
		Person person = UsertypeFactory.eINSTANCE.createPerson();
		person.setName(NAME);
		UsaPhoneNumber up1 = new UsaPhoneNumber(100, 200, 300);
		UsaPhoneNumber up2 = new UsaPhoneNumber(400, 500, 600);
		UsaPhoneNumber up3 = new UsaPhoneNumber(700, 800, 900);
		person.setEmergencyContact(up1);
		person.getPhoneNumbers().add(up2);
		person.getPhoneNumbers().add(up3);
		person.setNumbers(new int[] {4, 5});
		store.store(person);
		store.commitTransaction();
	}

	private void testPerson(TestStore store) {
		store.beginTransaction();
		List results = store.query("FROM Person");
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
		store.commitTransaction();
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
}