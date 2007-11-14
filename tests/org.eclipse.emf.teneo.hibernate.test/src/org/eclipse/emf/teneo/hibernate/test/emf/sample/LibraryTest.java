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
 * $Id: LibraryTest.java,v 1.9 2007/11/14 16:39:25 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
// Session s = ((HibernateTestStore) store).getSession();
// List<?> l = s.createSQLQuery("SELECT * FROM book").addEntity("Book").list();
// for (Object o : l) {
// System.err.println(o);
// }
		};

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
			return (value instanceof PersistableEList);
		};

		/** Dump the annotated model to standard output */
		@Override
		protected void dumpPAModel(TestStore testStore) {
			final HibernateTestStore hts = (HibernateTestStore) testStore;
			System.err.println(hts.getEmfDataStore().getPaModel().toXML());
		}

	};

	public LibraryTest() {
		super(testAction);
	}
}
