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
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class CollectionTableAction extends AbstractTestAction {

	private static final CollectiontableFactory FACTORY = CollectiontableFactory.eINSTANCE;
	
	public CollectionTableAction() {
		super(CollectiontablePackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final String baseName = "NAME";
		final int itemCount = 50;
		{
			final Item item = FACTORY.createItem();
			for (int i = 0; i < itemCount; i++) {
				item.getNames().add(baseName + i);
				EmbeddedItem eItem = FACTORY.createEmbeddedItem();
				eItem.setName(baseName + "e" + i);
				item.getItems().add(eItem);
			}
			store.beginTransaction();
			store.store(item);
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			final Item item = store.getObject(Item.class);
			assertTrue(item.getNames().size() == itemCount);
			for (int i = 0; i < itemCount; i++) {
				assertTrue(item.getNames().get(i).equals(baseName + i));
			}
			assertTrue(item.getNames().contains(baseName + "40"));
			assertTrue(item.getNames().contains(baseName + "30"));
			item.getNames().remove(40);
			item.getNames().remove(30);
			assertTrue(!item.getNames().contains(baseName + "40"));
			assertTrue(!item.getNames().contains(baseName + "30"));
			
			assertTrue(item.getItems().size() == itemCount);
			for (int i = 0; i < itemCount; i++) {
				assertTrue(item.getItems().get(i).getName().equals(baseName + "e" + i));
			}
			
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Item item = store.getObject(Item.class);
			assertTrue(item.getNames().size() == (itemCount - 2));
			assertTrue(!item.getNames().contains(baseName + "40"));
			assertTrue(!item.getNames().contains(baseName + "30"));
			assertTrue(item.getNames().contains(baseName + "10"));
			assertTrue(item.getNames().contains(baseName + "20"));
			store.commitTransaction();
		}
		testTables(store);
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
