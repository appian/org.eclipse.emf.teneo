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
 * $Id: LibraryTest.java,v 1.4 2007/02/01 12:36:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

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
 * @version $Revision: 1.4 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
		};

		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
			assertTrue(writ.eContainer() != null);
			assertTrue(writ.eContainer() instanceof Library);
		};

		protected boolean listValueOfCorrectType(Object value) {
			return (value instanceof PersistableEList);
		};

	};

	public LibraryTest() {
		super(testAction);
	}
}
