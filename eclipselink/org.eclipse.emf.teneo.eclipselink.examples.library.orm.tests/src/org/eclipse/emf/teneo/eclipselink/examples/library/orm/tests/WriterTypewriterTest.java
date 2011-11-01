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

import org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType;
import org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

/**
 * @author ebk2fe
 * @version 1.0.1 June 9th, 2006
 *          <p>
 *          This test case creates a writer object and assigns a typewriter to the writer. The object model uses a 1:n
 *          association based on EList to store the reference from writer to the typewriter(s). The data base model
 *          provides an associative table to cover the list of references. The or-mapping uses the many-to-many mapping
 *          to implement the 1:n relationship. The benefit would be that no explicite backward reference is required at
 *          the object model.
 */
public class WriterTypewriterTest extends LibraryJPATest {

	public WriterTypewriterTest(String name) {

		super(name);
	}

	public void testInsertWriterWithTypeWriterWithCache() throws Exception {

		boolean checkCache = true;
		verifyInsertWriterWithTypeWriter(checkCache);
	}

	public void testInsertWriterWithTypeWriterNoCache() throws Exception {

		boolean checkCache = false;
		verifyInsertWriterWithTypeWriter(checkCache);
	}

	private void verifyInsertWriterWithTypeWriter(boolean checkCache) {

		beginTransaction();

		Writer writer = createAnonymousWriterWithTypeWriter(em);
		TypeWriter twriter = writer.getTypewriters().get(0);
		String twriterMaker = twriter.getMaker();
		TWriterType twriterType = twriter.getType();
		String writerName = writer.getName();

		// put the data to the data base
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		// Check whether the writer as been allocated at the data base.

		Writer dbWriter = findWriterWithName(em, writerName);

		assertNotNull("dbWriter not found", dbWriter);
		assertEquals("dbWriter.name", writerName, dbWriter.getName());

		TypeWriter dbTWriter = dbWriter.getTypewriters().get(0);

		assertNotNull("dbTWriter not found", dbTWriter);
		assertEquals("dbTWriter.maker", twriterMaker, dbTWriter.getMaker());
		assertEquals("dbTWriter.type", twriterType, dbTWriter.getType());

	}

}
