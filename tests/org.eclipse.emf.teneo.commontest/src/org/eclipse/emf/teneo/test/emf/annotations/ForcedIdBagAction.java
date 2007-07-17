/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * ForcedIdBagAction.java,v 1.1 2007/03/21 15:45:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role;
import org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class ForcedIdBagAction extends AbstractTestAction {

	private static final String NAME = "Loeki";

	private static final String ROLE1 = "admin";

	private static final String ROLE2 = "developer";

	public ForcedIdBagAction() {
		super(ForcedidbagPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		storeUser(store);
		testUser(store);
		testPrimaryKey(store);
	}

	/** Add an option to force to use an idbag */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_ALL_LISTS_AS_IDBAG, "true");
		props.setProperty(PersistenceOptions.IDBAG_ID_COLUMN_NAME, "idbag_id");
		props.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "true");
		return props;
	}

	private void storeUser(TestStore store) {
		store.beginTransaction();
		final User user = ForcedidbagFactory.eINSTANCE.createUser();
		user.setName(NAME);
		final Role role1 = ForcedidbagFactory.eINSTANCE.createRole();
		role1.setName(ROLE1);
		final Role role2 = ForcedidbagFactory.eINSTANCE.createRole();
		role2.setName(ROLE2);
		user.getRoles().add(role1);
		user.getRoles().add(role2);
		store.store(user.getRoles());
		store.store(user);
		store.commitTransaction();
	}

	private void testPrimaryKey(TestStore store) {
		// Verify that we have a primary key "ID" in the "roles" table.
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		try {
			final DatabaseMetaData metaData = store.getConnection().getMetaData();

			// apparently hibernate core creates different tables than running with
			// hibernate entitymanager, need to check!
			resultSet = metaData.getPrimaryKeys(null, null, "myjoin");
			boolean rsTrue = resultSet.next();
			assertTrue("Primary key column should be named \"idbag_id\"", "idbag_id".equalsIgnoreCase(resultSet
				.getString("COLUMN_NAME")));
			assertFalse("Found more than one primary key.", resultSet.next());
		} catch (final SQLException e) {
			assertFalse(e.getMessage(), true);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
					if (resultSet2 != null) {
						resultSet2.close();
					}
				}
			} catch (final SQLException e) {
			}
		}
	}

	private void testUser(TestStore store) {
		final List<?> results = store.query("select u from User u");
		assertEquals(1, results.size());
		final User user = (User) results.get(0);
		assertEquals(NAME, user.getName());
		assertEquals(2, user.getRoles().size());
		assertTrue(user.getRoles().get(0).getName().equals(ROLE1));
		assertTrue(user.getRoles().get(1).getName().equals(ROLE2));
	}

}
