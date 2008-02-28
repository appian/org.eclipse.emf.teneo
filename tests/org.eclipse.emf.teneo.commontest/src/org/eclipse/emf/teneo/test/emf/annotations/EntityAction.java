/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LazyLibraryAction.java,v 1.9 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.entity.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.entity.EntityFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.entity.EntityPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.entity.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests extra lazy fetch strategy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class EntityAction extends AbstractTestAction {

	private static final String CHECK_QUERY = "SELECT COUNT(*) FROM BOEK".toLowerCase();

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public EntityAction() {
		super(EntityPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final EntityFactory factory = EntityFactory.eINSTANCE;
		{
			Book b1 = factory.createBook();
			b1.setTitle("b1");
			Book b2 = factory.createBook();
			b2.setTitle("b2");
			Writer w1 = factory.createWriter();
			w1.setName("w1");
			Writer w2 = factory.createWriter();
			w2.setName("w2");
			store.beginTransaction();
			store.store(b1);
			store.store(b2);
			store.store(w1);
			store.store(w2);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			List<?> l = store.query("select b from Boek as b order by b.title");
			int i = 1;
			for (Object o : l) {
				Book b = (Book) o;
				assertEquals(b.getTitle(), "b" + i++);
			}

			l = store.query("select w from Schrijver as w order by w.name");
			i = 1;
			for (Object o : l) {
				Writer w = (Writer) o;
				assertEquals(w.getName(), "w" + i++);
			}
			store.deleteObject(l.get(0));
			store.commitTransaction();
		}
		testTable(store);
	}

	private void testTable(TestStore store) {
		final Connection conn = store.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(CHECK_QUERY);
			rs.next();
			assertEquals(2, rs.getInt(1));
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