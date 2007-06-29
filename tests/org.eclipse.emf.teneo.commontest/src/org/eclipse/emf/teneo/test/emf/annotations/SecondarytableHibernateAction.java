/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SecondarytableHibernateAction.java,v 1.6 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.Person;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernateFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernatePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for Secondary table.
 * 
 * @author <a href="mailto:lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
public class SecondarytableHibernateAction extends AbstractTestAction {

	private static final String ADDRESS = "Amsterdamseweg 123, 4567AZ Amsterdam";

	private static final long ID = 1;

	private static final String NAME = "Jan Janssen";

	private static final byte[] PHOTO = new byte[64 * 1024];

	private static final String VERIFICATION_QUERY =
			"SELECT * FROM PERSON as A INNER JOIN PERSON_ADDRESS as B ON A.ID = B.ID "
					+ "INNER JOIN PERSON_PHOTO as C ON A.ID = C.ID";

	public SecondarytableHibernateAction() {
		super(SecondarytablehibernatePackage.eINSTANCE);
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

		final Person person = SecondarytablehibernateFactory.eINSTANCE.createPerson();
		person.setId(ID);
		person.setName(NAME);
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
		assertEquals(NAME, person.getName());
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
