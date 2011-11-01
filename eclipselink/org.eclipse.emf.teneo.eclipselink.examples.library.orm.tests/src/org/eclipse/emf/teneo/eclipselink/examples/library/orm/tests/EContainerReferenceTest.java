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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class EContainerReferenceTest extends LibraryJPATest {

	public EContainerReferenceTest(String name) {
		super(name);
	}

	public void testLibraryWriterRelationshipWithCache() throws Exception {
		boolean checkCache = true;
		verifyLibaryWriterRelationship(checkCache);
	}

	public void testLibraryWriterRelationshipNoCache() throws Exception {
		boolean checkCache = false;
		verifyLibaryWriterRelationship(checkCache);
	}

	/**
	 * This test creates a Library with a contained Writer and determines whether the inverse eContainer relationship is
	 * established from Writer to Library.
	 * 
	 * @param checkCache
	 * @throws Exception
	 */
	private void verifyLibaryWriterRelationship(boolean checkCache) throws Exception {
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

		beginTransaction();
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);

		Library actualLibrary = findLibraryWithName(em, libraryName);
		Writer actualLibraryWriter = actualLibrary.getWriters().get(0);
		assertEquals("writer/library writer", actualWriter, actualLibraryWriter);
		EObject actualWriterEContainer = actualWriter.eContainer();
		assertEquals("writer eContainer", actualLibrary, actualWriterEContainer);
	}

}
