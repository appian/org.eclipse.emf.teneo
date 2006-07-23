/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryTest.java,v 1.4 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.jpox.AbstractPersistenceManager;

/**
 * Tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class LibraryTest extends AbstractActionTest {

	final static LibraryAction testAction = new LibraryAction() {
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
			assertTrue("Container of writer is not yet set now, because of lazy loading of container relations", writ
					.eContainer() == null);
		};
		
		protected void checkDetachCopy(TestStore store, Writer writ) {
			// the assert is actually done to force a load of the books
			assertEquals(2, writ.getBooks().size());
			final Writer writCopy = (Writer)((AbstractPersistenceManager)((JPOXTestStore)store).getPersistenceManager()).detachCopy(writ);
			assertTrue(writCopy.getBooks() instanceof DelegatingEcoreEList);
			assertFalse(writCopy.getBooks() instanceof PersistableEList);
			assertEquals(2, writCopy.getBooks().size());
			for (int i = 0; i < writCopy.getBooks().size(); i++) {
				final Book bk1 = (Book)writ.getBooks().get(i);
				final Book bk2 = (Book)writCopy.getBooks().get(i);
			
				// same title
				assertEquals(bk1.getTitle(), bk2.getTitle());
				assertTrue(bk1 != bk2); // not the same object
			}
		}

		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
		}

		protected boolean listValueOfCorrectType(Object value) {
			return true;
		}
	};

	public LibraryTest() {
		super(testAction);
	}
}
