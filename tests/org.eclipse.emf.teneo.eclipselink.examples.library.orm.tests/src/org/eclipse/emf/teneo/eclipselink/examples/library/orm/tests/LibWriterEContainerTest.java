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

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class LibWriterEContainerTest extends LibraryJPATest {

	public LibWriterEContainerTest(String name) {
		super(name);
	}

	public void testInsertWriterAndLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterLibrary(checkCache);
	}

	public void testInsertWriterAndLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriterLibrary(checkCache);
	}

	/**
	 * Create the library and a writer within the library.<br>
	 * Store the library to the data base.<br>
	 * Fetch back the library from the data base.<br>
	 * Identify the writer object assigned to libray.<br>
	 * Check whether the attribute eContainer is set at the writer object.
	 * 
	 * @param checkCache
	 */
	private void verifyInsertWriterLibrary(boolean checkCache) {

		beginTransaction();

		Writer writer = createAnonymousWriter(em);
		String writerName = writer.getName();
		Library library = createAnonymousLibrary(em);
		String libraryName = library.getName();
		library.getWriters().add(writer);
		commitTransaction();
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);
		assertEquals("writer name", writerName, actualWriter.getName());
		assertNotNull("Field Actual/Writer.eContainer not set", actualWriter.eContainer());
		int containerFeatureID = ((InternalEObject) writer).eContainerFeatureID();
		int actualContainerFeatureID = ((InternalEObject) actualWriter).eContainerFeatureID();
		assertEquals("Containment Feature Id DB Writer", containerFeatureID, actualContainerFeatureID);

		Library actualLibrary = findLibraryWithName(em, libraryName);
		assertNotNull("library missing", actualLibrary);

		Writer actualLibraryWriter = actualLibrary.getWriters().get(0);
		assertNotNull("writer missing", actualLibraryWriter);
		assertEquals("writer name", writerName, actualLibraryWriter.getName());
		assertEquals("Writer Check", actualWriter, actualLibraryWriter);

		// verify whether the field eContainer is set
		assertNotNull("Field Library/Writer.eContainer not set", actualLibraryWriter.eContainer());
		assertEquals("Containment Relationship", actualLibrary, actualLibraryWriter.eContainer());
	}

}
