/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl;

public class ContainerTest extends LibraryJPATest {

	public ContainerTest(String name) {
		super(name);
	}

	public void testMoveBetweenContainersWithCache() throws Exception {
		boolean checkCache = true;
		verifyMoveBetweenContainers(checkCache);
	}

	public void testMoveBetweenContainersNoCache() throws Exception {
		boolean checkCache = false;
		verifyMoveBetweenContainers(checkCache);
	}

	private void verifyMoveBetweenContainers(boolean checkCache) {
		beginTransaction();
		WriterImpl writer = (WriterImpl) createAnonymousWriter(em);
		String writerName = writer.getName();
		LibraryImpl libraryOne = (LibraryImpl) createAnonymousLibrary(em);
		String libraryOneName = libraryOne.getName();
		libraryOne.getWriters().add(writer);
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		beginTransaction();
		writer = (WriterImpl) findWriterWithName(em, writerName);
		LibraryImpl libraryTwo = (LibraryImpl) createAnonymousLibrary(em);
		String libraryTwoName = libraryTwo.getName();
		libraryTwo.getWriters().add(writer);
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Library dbLibraryOne = findLibraryWithName(em, libraryOneName);
		Library dbLibraryTwo = findLibraryWithName(em, libraryTwoName);
		Writer dbWriter = findWriterWithName(em, writerName);
		EList<Writer> dbLibOneWriters = dbLibraryOne.getWriters();
		EList<Writer> dbLibTwoWriters = dbLibraryTwo.getWriters();
		assertEquals("writer container", dbLibraryTwo, dbWriter.eContainer());
		assertEquals("new library number of books", 1, dbLibTwoWriters.size());
		assertTrue("original library has no books", dbLibOneWriters.isEmpty());
	}
}
