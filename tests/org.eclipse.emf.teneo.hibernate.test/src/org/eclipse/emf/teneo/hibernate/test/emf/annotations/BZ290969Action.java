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
 * $Id: BZ290969Action.java,v 1.2 2009/11/02 10:53:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoNewSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernateFactory;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bar;
import org.eclipse.emf.teneo.samples.issues.bz290969.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Factory;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package;
import org.eclipse.emf.teneo.samples.issues.bz290969.Foo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests bugzilla 290969
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class BZ290969Action extends AbstractTestAction {
	final HibernateFactory factory = HibernateFactory.eINSTANCE;

	public BZ290969Action() {
		super(Bz290969Package.eINSTANCE);
	}

	/** Add extensions if you want */
	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(SQLNameStrategy.class.getName(), TeneoNewSQLNameStrategy.class.getName());
	}

	// @Override
	// public Properties getExtraConfigurationProperties() {
	// final Properties props = new Properties();
	// props.setProperty(PersistenceOptions.DEFAULT_TEMPORAL_VALUE, "DATE");
	// return props;
	// }

	@Override
	public void doAction(TestStore store) {
		final Bz290969Factory factory = Bz290969Factory.eINSTANCE;
		{
			store.beginTransaction();
			final Bar bar = factory.createBar();
			final BarKey barKey1 = factory.createBarKey();
			final BarKey barKey2 = factory.createBarKey();
			bar.getBarKeys().add(barKey1);
			bar.getBarKeys().add(barKey2);
			final Foo foo = factory.createFoo();
			foo.setBarKey(barKey1);
			store.store(bar);
			store.store(foo);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			store.checkNumber(BarKey.class, 2);
			store.checkNumber(Bar.class, 1);
			store.checkNumber(Foo.class, 1);
			final Bar bar = store.getObject(Bar.class);
			assertEquals(2, bar.getBarKeys().size());
			final Foo foo = store.getObject(Foo.class);
			assertTrue(bar.getBarKeys().contains(foo.getBarKey()));
			store.commitTransaction();
		}

		checkJoinColumnNames(store);
	}

	private void checkJoinColumnNames(TestStore store) {
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();
				// check version column name
				ResultSet rs = stmt
						.executeQuery("select barkeyentity_barkey_e_id from fooentity where barkeyentity_barkey_e_id > -1");
				assertTrue(rs.next());
				rs = stmt
						.executeQuery("select barentity_barkeys_e_id from barkeyentity where barentity_barkeys_e_id > -1 and barentity_barkeys_idx > -1");
				assertTrue(rs.next());
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