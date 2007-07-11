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
 * $Id: LibraryTest.java,v 1.5 2007/07/11 15:22:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
		};

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
		protected void dumpPAModel(TestStore testStore) {
			final HibernateTestStore hts = (HibernateTestStore) testStore;
			System.err.println(hts.getEmfDataStore().getPaModel().toXML());
		}

	};

	public LibraryTest() {
		super(testAction);
	}
}
