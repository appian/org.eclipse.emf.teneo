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
 * $Id: LibraryTest.java,v 1.12 2008/07/13 13:13:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
// Session s = ((HibernateTestStore) store).getSession();
// List<?> l = s.createSQLQuery("SELECT * FROM book").addEntity("Book").list();
		};

		@Override
		public Properties getExtraConfigurationProperties() {
			// compute path to ecore
			String path = "/" + LibraryPackage.eINSTANCE.getClass().getPackage().getName();
			// strip of the impl
			path = path.replaceAll("\\.", "/").substring(0, path.length() - 5) + "/library.ecore";
			final Properties props = super.getExtraConfigurationProperties();
			props.setProperty(HibernateTestStore.EPACKAGE_INIT_MODE, HibernateTestStore.EPACKAGE_INIT_MODE_CLASS);
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
