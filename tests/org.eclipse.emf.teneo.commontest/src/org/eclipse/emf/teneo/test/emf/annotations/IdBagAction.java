/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * IdBagAction.java,v 1.5 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.idbag.IdbagFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.idbag.IdbagPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.idbag.User;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class IdBagAction extends AbstractTestAction {

	private static final String NAME = "Loeki";

	private static final String ROLE1 = "admin";

	private static final String ROLE2 = "developer";

	public IdBagAction() {
		super(IdbagPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		storeUser(store);
		testUser(store);
		testPrimaryKey(store);
	}

	private void storeUser(TestStore store) {
		store.beginTransaction();
		final User user = IdbagFactory.eINSTANCE.createUser();
		user.setName(NAME);
		user.getRoles().add(ROLE1);
		user.getRoles().add(ROLE2);
		store.store(user);
		store.commitTransaction();
	}

	private void testPrimaryKey(TestStore store) {
		// apparently not enough metadata can be read for hsqldb
		if (store.getDatabaseAdapter() instanceof HsqldbTestDatabaseAdapter) {
			return;
		}

		// Verify that we have a primary key "ID" in the "roles" table.
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		try {
			final DatabaseMetaData metaData = store.getConnection().getMetaData();

			// apparently hibernate core creates different tables than running with
			// hibernate entitymanager, need to check!
			boolean rsTrue = false;
			try {
				resultSet = metaData.getPrimaryKeys(null, null, "user_roles");
				rsTrue = resultSet.next();
			} catch (final SQLException e) {
				// ignore, hope for the next one
			}
			boolean rs2True = false;
			try {
				resultSet2 = metaData.getPrimaryKeys(null, null, "roles");
				rs2True = resultSet2.next();
			} catch (final SQLException e) {
				assertTrue(rsTrue);
				// ignore hope for the first one
			}
			assertTrue("No primary key found for \"roles\" table.", rsTrue || rs2True);
			if (rsTrue) {
				assertTrue("Primary key column should be named \"ID\"", "ID".equalsIgnoreCase(resultSet
					.getString("COLUMN_NAME")));
				assertFalse("Found more than one primary key.", resultSet.next());
			} else {
				assertTrue("Primary key column should be named \"ID\"", "ID".equalsIgnoreCase(resultSet2
					.getString("COLUMN_NAME")));
				assertFalse("Found more than one primary key.", resultSet2.next());
			}
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
		assertTrue(user.getRoles().contains(ROLE1));
		assertTrue(user.getRoles().contains(ROLE2));
	}

}
