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

import org.eclipse.emf.teneo.eclipselink.examples.library.Publisher;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

/**
 * @author ebk2fe
 * @version 1.0 (April 28th, 2006)
 *          <p>
 *          This test case creates a writer object and assignes two publishers to the writer. The objects are committed
 *          to the data base. The writer is fetched back from the data base.
 */
public class WriterPublisherTest extends LibraryJPATest {

	public WriterPublisherTest(String name) {
		super(name);
	}

	public void testInsertWriterPublisherWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterPublisher(checkCache);
	}

	public void testInsertWriterPublisherNoCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterPublisher(checkCache);
	}

	private void verifyInsertWriterPublisher(boolean checkCache) {

		beginTransaction();
		Writer writer = createAnonymousWriter(em);
		String writerName = writer.getName();
		Publisher publisher1 = createAnonymousPublisher(em);
		Publisher publisher2 = createAnonymousPublisher(em);

		publisher1.getWriters().add(writer);
		publisher2.getWriters().add(writer);

		writer.getPublishers().add(publisher1);
		writer.getPublishers().add(publisher2);

		int nbrElements = writer.getPublishers().size();

		commitTransaction();

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer dbWriter = findWriterWithName(em, writerName);

		assertNotNull("dbWriter not found", dbWriter);
		assertEquals("nbr list elements", nbrElements, dbWriter.getPublishers().size());

		Publisher dbPublisher = dbWriter.getPublishers().get(0);

		assertNotNull("dbPublisher not found", dbPublisher);
		assertEquals("reference to the writer", dbWriter, dbPublisher.getWriters().get(0));
	}

}
