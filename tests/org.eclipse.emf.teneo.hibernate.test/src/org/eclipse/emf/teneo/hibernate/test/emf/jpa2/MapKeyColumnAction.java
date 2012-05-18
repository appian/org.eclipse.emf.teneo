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

import junit.framework.Assert;

import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
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
		final String key1 = "k1";
		final String value1 = "v1";
		final String key2 = "k2";
		final String value2 = "v2";
		{
			store.beginTransaction();
			final Images images = FACTORY.createImages();
			images.getImageFiles().put(key1, value1);
			images.getImageFiles().put(key2, value2);
			store.store(images);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Images images = store.getObject(Images.class);
			Assert.assertTrue(images.getImageFiles().get(key1).equals(value1));
			Assert.assertTrue(images.getImageFiles().get(key2).equals(value2));
			Assert.assertTrue(images.getImageFiles().size() == 2);
			store.store(images);
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
			rs = stmt
					.executeQuery("select IMAGE_NAME, IMAGE_FILENAME from IMAGE_MAPPING");
			Assert.assertTrue(rs.next());
			Assert.assertTrue(rs.next());
			Assert.assertFalse(rs.next());
			rs.close();
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
