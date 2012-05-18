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
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class MapKeyJoinColumnAction extends AbstractTestAction {

	private static final MapsFactory FACTORY = MapsFactory.eINSTANCE;

	public MapKeyJoinColumnAction() {
		super(MapsPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final String name1 = "nm1";
		final String name2 = "nm2";
		{
			store.beginTransaction();
			final PhotoPart pp1 = FACTORY.createPhotoPart();
			pp1.setName(name1);
			final PhotoPart pp2 = FACTORY.createPhotoPart();
			pp2.setName(name2);
			final Images images = FACTORY.createImages();
			images.getPhotoParts().put(pp1, name1);
			images.getPhotoParts().put(pp2, name2);
			store.store(pp1);
			store.store(pp2);
			store.store(images);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Images images = store.getObject(Images.class);
			
			Assert.assertTrue(images.getPhotoParts().size() == 2);
			for (PhotoPart pp : images.getPhotoParts().keySet()) {
				final String val = images.getPhotoParts().get(pp);
				Assert.assertTrue(pp.getName().equals(val));
			}
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
					.executeQuery("select PARTS_NAME from PHOTOPARTS_MAP");
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
