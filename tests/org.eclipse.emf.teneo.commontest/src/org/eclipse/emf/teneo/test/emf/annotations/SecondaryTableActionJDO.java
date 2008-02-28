/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SecondaryTableActionJDO.java,v 1.5 2008/02/28 07:08:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytableFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests annotations for SecondaryTable
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ 
 */
public class SecondaryTableActionJDO extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SecondaryTableActionJDO() {
		super(SecondarytablePackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final SecondarytableFactory factory = SecondarytableFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Printer p = factory.createPrinter();
			p.setMake("HP");
			p.setModel("officejet 2500");
			p.setTonerMake("hp");
			p.setTonerModel("56");
			store.store(p);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Printer p = (Printer) store.getObject(Printer.class);
			assertTrue(p.getMake().compareTo("HP") == 0);
			assertTrue(p.getModel().compareTo("officejet 2500") == 0);
			assertTrue(p.getTonerMake().compareTo("hp") == 0);
			store.commitTransaction();
		}

		// do a sql query to detect that the second table was created
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();
				final ResultSet rs = stmt.executeQuery("select * from thetoner");
				int cnt = 0;
				while (rs.next()) {
					cnt++;
				}
				rs.close();
				assertEquals(1, cnt);
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (final SQLException e) {
			throw new StoreTestException("Sql exception when retrieving objects", e);
		}
	}
}