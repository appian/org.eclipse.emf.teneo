/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EmbeddedIdAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontableFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class MapKeyColumnAction extends AbstractTestAction {

	private static final MapsFactory FACTORY = MapsFactory.eINSTANCE;
	
	public MapKeyColumnAction() {
		super(MapsPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		store.beginTransaction();
		store.commitTransaction();
	}

	private void testTables(TestStore store) {
		final Connection conn = store.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select count(*) from EmbeddedItemsTable where MYJC is not null");
			rs.next();
			assertEquals(50, rs.getInt(1));
			rs.close();
			rs = stmt.executeQuery("select count(*) from NamesTable where JOINCOLUMN1 is not null");
			rs.next();
			assertEquals(48, rs.getInt(1));
		} catch (final SQLException e) {
			assertTrue(e.getMessage(), false);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (final SQLException e) {
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (final SQLException e) {
			}
		}
	}
}
