/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: Bz337580Action.java,v 1.1 2011/02/21 06:40:01 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Factory;
import org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package;
import org.eclipse.emf.teneo.samples.issues.bz337580.Test;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the solution of https://bugs.eclipse.org/bugs/show_bug.cgi?id=337580
 * 
 * Option to NOT apply the name strategy to names specified explicitly via JPA annotations
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz337580Action extends AbstractTestAction {

	public Bz337580Action() {
		super(Bz337580Package.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.AUTO_ADAPT_MANUAL_SET_SQL_NAMES, "false");
		props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "10");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final Bz337580Factory factory = Bz337580Factory.eINSTANCE;
		// System.err.println(store.getMappingXML());
		{
			store.beginTransaction();

			final Test test = factory.createTest();
			test.setNameWhichShouldBeTrunctated("test1");
			store.store(test);
			store.commitTransaction();
		}
		{
			Connection conn = null;
			Statement stmt = null;
			try {
				try {
					conn = store.getConnection();
					stmt = conn.createStatement();
					// check truncated column name and a non-truncated
					// verylongename
					ResultSet rs = stmt.executeQuery("select NMWHCHSHLD from AVERYLONGNAMEFORTEST");
					assertTrue(rs.next());
					assertFalse(rs.next());
				} finally {
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				}
			} catch (SQLException e) {
				throw new StoreTestException("Sql exception when checking db schema", e);
			}
		}
	}

}
