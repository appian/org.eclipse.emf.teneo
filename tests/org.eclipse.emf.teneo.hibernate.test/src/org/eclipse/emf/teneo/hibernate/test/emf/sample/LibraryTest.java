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
 * $Id: LibraryTest.java,v 1.20 2010/10/31 21:50:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.collection.PersistentCollection;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.20 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
			// Session s = ((HibernateTestStore) store).getSession();
			// List<?> l =
			// s.createSQLQuery("SELECT * FROM book").addEntity("Book").list();
		};

		@Override
		public Properties getExtraConfigurationProperties() {
			// compute path to ecore
			String path = "/" + LibraryPackage.eINSTANCE.getClass().getPackage().getName();
			// strip of the impl
			path = path.replaceAll("\\.", "/").substring(0, path.length() - 5) + "/library.ecore";
			final Properties props = super.getExtraConfigurationProperties();
			props.setProperty(HibernateTestStore.EPACKAGE_INIT_MODE, HibernateTestStore.EPACKAGE_INIT_MODE_CLASS);
			props.setProperty(PersistenceOptions.SQL_FOREIGN_KEY_NAME_PREFIX, "FKPRE_");
			props.setProperty(PersistenceOptions.SQL_COLUMN_NAME_PREFIX, "COL_");
			props.setProperty(PersistenceOptions.SQL_TABLE_NAME_PREFIX, "TAB_");
			return props;
		}

		@Override
		protected void checkTeneoSQLNameStrategy() {
			final TeneoSQLNameStrategy nameStrategy = new TeneoSQLNameStrategy();
			assertEquals("c_p", nameStrategy.trunc(3, "child_parent", true));
			assertEquals("c_f_m", nameStrategy.trunc(1, "child_father_mother", true));
			assertEquals("child_parent", nameStrategy.trunc(12, "child_parent", true));
			assertEquals("chl_prn", nameStrategy.trunc(7, "child_parent", true));
			assertEquals("chld", nameStrategy.trunc(4, "child", true));
			assertEquals("chl_prn", nameStrategy.trunc(7, "child.parent", true));
			assertEquals("usr_prn", nameStrategy.trunc(7, "user.parent", true));
			assertEquals("usr_nme", nameStrategy.trunc(7, "user.name", true));
			assertEquals("child_parent", nameStrategy.trunc(-1, "child.parent", true));

			assertEquals("chl_prn_d", nameStrategy.trunc(10, "child.parent.id", true));
			assertEquals("child_prent_id", nameStrategy.trunc(14, "child.parent.id", true));
		}

		@Override
		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
			assertTrue(writ.eContainer() != null);
			assertTrue(writ.eContainer() instanceof Library);
		};

		@Override
		protected boolean listValueOfCorrectType(Object value) {
			return (value instanceof PersistableEList<?>);
		};

		/** Dump the annotated model to standard output */
		@Override
		protected void dumpPAModel(TestStore testStore) {
//			final HibernateTestStore hts = (HibernateTestStore) testStore;
			// System.err.println(hts.getEmfDataStore().getPaModel().toXML());
		}

		// test https://bugs.eclipse.org/bugs/show_bug.cgi?id=297627
		protected void checkIndexName(TestStore store) {
			Connection conn = null;
			Statement stmt = null;
			try {
				try {
					conn = store.getConnection();
					stmt = conn.createStatement();
					// check version column name
					ResultSet rs = stmt.executeQuery("select test_index from tab_writer");
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

		protected void testLazySize(List<?> list) {
			final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
			final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
			assertFalse(persistentCollection.wasInitialized());
			assertFalse(persistableEList.isLoaded());
			int size = LazyCollectionUtils.size(list);
			assertTrue(size > 0);
			assertFalse(persistentCollection.wasInitialized());
			assertFalse(persistableEList.isLoaded());
		}
		
		protected void testMerge(TestStore store) {

			{
				store.beginTransaction();
				Library lib = (Library) store.query(Library.class, "name",
						"Science Fiction Library", 1).get(0);
				Book bk = lib.getBooks().get(0);
				lib.setName("test123");
				bk.setPages(5000);

				// load the writers
				for (Writer w : lib.getWriters()) {
					w.getBooks().size();
				}
				store.commitTransaction();

				// now do merge
				store.beginTransaction();
				final Library lib2 = (Library)HbUtil.merge(((HibernateTestStore)store).getSession(), lib, 2);
				assertTrue(lib2 != lib);
				assertTrue(lib2.getName().equals(lib.getName()));
				assertTrue(lib2.getBooks().get(0) != bk);
				assertTrue(lib2.getBooks().get(0).getTitle().equals(bk.getTitle()));
				assertTrue(lib2.getBooks().get(0).getPages() == bk.getPages());
				store.commitTransaction();
				
				store.beginTransaction();
				Library lib3 = (Library) store.query(Library.class, "name",
						"test123", 1).get(0);
				assertNotNull(lib3);
				store.commitTransaction();
			}

		}

	};

	public LibraryTest() {
		super(testAction);
	}
}
