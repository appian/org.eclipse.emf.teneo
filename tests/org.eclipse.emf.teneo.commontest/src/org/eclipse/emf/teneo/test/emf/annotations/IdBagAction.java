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
 *   Martin Taal
 * </copyright>
 *
 * $Id: IdBagAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
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
import org.eclipse.emf.teneo.test.stores.TestStore;

public class IdBagAction extends AbstractTestAction {

	private static final String NAME = "Loeki";

	private static final String ROLE1 = "admin";

	private static final String ROLE2 = "developer";

	public IdBagAction() {
		super(IdbagPackage.eINSTANCE);
	}

	public void doAction(TestStore store) {
		storeUser(store);
		testUser(store);
		testPrimaryKey(store);
	}

	private void storeUser(TestStore store) {
		store.beginTransaction();
		User user = IdbagFactory.eINSTANCE.createUser();
		user.setName(NAME);
		user.getRoles().add(ROLE1);
		user.getRoles().add(ROLE2);
		store.store(user);
		store.commitTransaction();
	}

	private void testUser(TestStore store) {
		List results = store.query("FROM User");
		assertEquals(1, results.size());
		User user = (User) results.get(0);
		assertEquals(NAME, user.getName());
		assertEquals(2, user.getRoles().size());
		assertTrue(user.getRoles().contains(ROLE1));
		assertTrue(user.getRoles().contains(ROLE2));
	}

	private void testPrimaryKey(TestStore store) {
		// Verify that we have a primary key "ID" in the "roles" table.
		ResultSet resultSet = null;
		try {
			final DatabaseMetaData metaData = store.getConnection().getMetaData();
			resultSet = metaData.getPrimaryKeys(null, null, "roles");
			assertTrue("No primary key found for \"roles\" table.", resultSet.next());
			assertTrue("Primary key column should be named \"ID\"", "ID".equalsIgnoreCase(resultSet.getString("COLUMN_NAME")));
			assertFalse("Found more than one primary key.", resultSet.next());
		} catch (SQLException e) {
			assertFalse(e.getMessage(), true);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
			}
		}
	}

}
