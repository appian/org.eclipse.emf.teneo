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
 * $Id: SecondarytableInheritanceAction.java,v 1.2 2010/02/06 18:25:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.secondary.Person;
import org.eclipse.emf.teneo.samples.issues.secondary.SecondaryFactory;
import org.eclipse.emf.teneo.samples.issues.secondary.SecondaryPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=235949
 */
public class SecondarytableInheritanceAction extends AbstractTestAction {

	private static final String ADDRESS = "Amsterdamseweg 123, 4567AZ Amsterdam";

	private static final long ID = 1;

	private static final byte[] PHOTO = new byte[64 * 1024];

	private static final String VERIFICATION_QUERY = "SELECT * FROM GENERIC as A INNER JOIN PERSON_ADDRESS as B ON A.ID = B.ID "
			+ "INNER JOIN PERSON_PHOTO as C ON A.ID = C.ID";

	public SecondarytableInheritanceAction() {
		super(SecondaryPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		storePerson(store);
		testPerson(store);
		testSecondaryTables(store);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		return props;
	}

	/**
	 * Stores a Person in the database.
	 */
	private void storePerson(TestStore store) {
		store.beginTransaction();

		final Person person = SecondaryFactory.eINSTANCE.createPerson();
		person.setId(ID);
		person.setAddress(ADDRESS);
		person.setPhoto(PHOTO);
		store.store(person);

		store.commitTransaction();
	}

	/**
	 * Retrieves the previously stored Person from the database and checks its attributes.
	 */
	private void testPerson(TestStore store) {
		store.beginTransaction();

		final List<?> results = store.query(Person.class, "id", String.valueOf(ID), 1);
		assertEquals(1, results.size());
		final Person person = (Person) results.get(0);
		assertEquals(ID, person.getId());
		assertEquals(ADDRESS, person.getAddress());
		final byte[] photo = person.getPhoto();
		assertEquals(PHOTO.length, photo.length);
		for (int i = 0; i < photo.length; i++) {
			assertEquals(PHOTO[i], photo[i]);
		}

		store.commitTransaction();
	}

	/**
	 * Executes a query to verify the existence of the secondary tables.
	 */
	private void testSecondaryTables(TestStore store) {
		final Connection conn = store.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(VERIFICATION_QUERY);
		} catch (final SQLException e) {
			throw new StoreTestException(e.getMessage(), e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (final SQLException e) {
			}
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (final SQLException e) {
			}
		}

	}

}
