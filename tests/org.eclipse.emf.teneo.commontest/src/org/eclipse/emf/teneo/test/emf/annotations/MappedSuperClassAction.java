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
 * $Id: MappedSuperClassAction.java,v 1.6 2007/08/10 20:30:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class MappedSuperClassAction extends AbstractTestAction {
	/**
	 * Constructor
	 */
	public MappedSuperClassAction() {
		super(MappedsuperclassPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.DEFAULT_CACHE_STRATEGY, "READ_WRITE");
		props.setProperty(PersistenceOptions.SET_ENTITY_AUTOMATICALLY, "false");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final MappedsuperclassFactory factory = MappedsuperclassFactory.eINSTANCE;
		{
			store.beginTransaction();
			final SpecificDocument sd = factory.createSpecificDocument();
			sd.setMyName("TEST IT");
			sd.setMyGenericInfo("GENERIC INFO");
			sd.setMySpecificInfo("SPECIFIC INFO");
			store.store(sd);
			store.commitTransaction();
		}

		// query for the specific table
		{
			Connection conn = null;
			try {
				conn = store.getConnection();
				final Statement stmt = conn.createStatement();
				// the following should not fail for all inheritance strategies
				final ResultSet rs = stmt.executeQuery("SELECT * FROM specificdocument");
				assertTrue(rs.next());
			} catch (final SQLException s) {
				throw new StoreTestException("SQLException while checking existence of table", s);
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (final SQLException s) {
					throw new StoreTestException("SQLException while checking existence of table", s);
				}
			}
		}

		// query for the mapped superclass table, should always fail!
		{
			Connection conn = null;
			try {
				conn = store.getConnection();
				final Statement stmt = conn.createStatement();
				// the following should not fail for all inheritance strategies
				final ResultSet rs = stmt.executeQuery("SELECT * FROM document");
				assertTrue(rs != null); // dummy test to get rid of warning
				fail("The DOCUMENT table should not exist as it is a mapped superclass");
			} catch (final SQLException s) {
				// this is correct
			} catch (final Exception e) {
				throw new StoreTestException("Exception while checking existence of table", e);
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (final SQLException s) {
					throw new StoreTestException("SQLException while checking existence of table", s);
				}
			}
		}

		{
			Connection conn = null;
			try {
				conn = store.getConnection();
				final Statement stmt = conn.createStatement();
				// the following should not fail for all inheritance strategies
				final ResultSet rs = stmt.executeQuery("SELECT * FROM parentdocument");
				assertTrue(rs != null); // dummy to get rid of warning
				fail("The PARENTDOCUMENT table should not exist as it is a mapped superclass");
			} catch (final SQLException s) {
				// this is correct
			} catch (final Exception e) {
				throw new StoreTestException("Exception while checking existence of table", e);
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (final SQLException s) {
					throw new StoreTestException("SQLException while checking existence of table", s);
				}
			}
		}
		{
			store.beginTransaction();
			final SpecificDocument sd = store.getObject(SpecificDocument.class);
			assertEquals(sd.getMyName(), "TEST IT");
			assertEquals(sd.getMyGenericInfo(), "GENERIC INFO");
			assertEquals(sd.getMySpecificInfo(), "SPECIFIC INFO");
			store.commitTransaction();
		}

	}
}