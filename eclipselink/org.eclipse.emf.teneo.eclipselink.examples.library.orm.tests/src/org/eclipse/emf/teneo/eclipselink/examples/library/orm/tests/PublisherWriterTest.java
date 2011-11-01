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
 *          This test case creates a publisher object and assignes two writers to the publisher. The objects are
 *          committed to the data base. The publisher is fetched back from the data base.
 */
public class PublisherWriterTest extends LibraryJPATest {

	private Writer writer1;
	private String writer1Name;
	private Writer writer2;
	private String writer2Name;
	private Publisher publisher;
	private String publisherName;

	public PublisherWriterTest(String name) {
		super(name);
	}

	public void testInsertPublisherWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertPublisherWriter(checkCache);
	}

	public void testInsertPublisherWriterNoCache() throws Exception {
		boolean checkCache = true;
		verifyInsertPublisherWriter(checkCache);
	}

	public void testRemovePublisherWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyRemovePublisherWriter(checkCache);
	}

	public void testRemovePublisherWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyRemovePublisherWriter(checkCache);
	}

	public void testMovePublisherWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyMovePublisherWriter(checkCache);
	}

	public void testMovePublisherWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyMovePublisherWriter(checkCache);
	}

	private void verifyMovePublisherWriter(boolean checkCache) {

		// move a writer to a new publisher
		beginTransaction();
		Publisher publisher2 = createAnonymousPublisher(em);
		String publisher2Name = publisher2.getName();

		Publisher dbPublisher1 = findPublisherWithName(em, publisherName);
		Writer dbWriter2 = findWriterWithName(em, writer2Name);

		dbPublisher1.getWriters().remove(dbWriter2);
		dbWriter2.getPublishers().remove(dbPublisher1);
		dbWriter2.getPublishers().add(publisher2);
		publisher2.getWriters().add(dbWriter2);
		commitTransaction();

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		// verify dissassociation
		dbPublisher1 = findPublisherWithName(em, publisherName);
		Publisher dbPublisher2 = findPublisherWithName(em, publisher2Name);
		Writer dbWriter1 = findWriterWithName(em, writer1Name);
		dbWriter2 = findWriterWithName(em, writer2Name);

		assertNotNull("publisher1", dbPublisher1);
		assertNotNull("publisher2", dbPublisher2);
		assertNotNull("writer1", dbWriter1);
		assertNotNull("writer2", dbWriter2);
		assertEquals("writer1's publishers", 1, dbWriter1.getPublishers().size());
		assertEquals("writer2's publishers", 1, dbWriter2.getPublishers().size());
		assertEquals("publisher1's writers", 1, dbPublisher1.getWriters().size());
		assertEquals("publisher2's writers", 1, dbPublisher2.getWriters().size());
		assertEquals("publisher1's writer", dbWriter1, dbPublisher1.getWriters().get(0));
		assertEquals("publisher2's writer", dbWriter2, dbPublisher2.getWriters().get(0));
		assertEquals("writer1's publisher", dbPublisher1, dbWriter1.getPublishers().get(0));
		assertEquals("writer2's publisher", dbPublisher2, dbWriter2.getPublishers().get(0));
	}

	private void verifyRemovePublisherWriter(boolean checkCache) {

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		// dissassociate a writer from a publisher
		beginTransaction();
		Publisher dbPublisher = findPublisherWithName(em, publisherName);
		Writer dbWriter1 = findWriterWithName(em, writer1Name);

		dbPublisher.getWriters().remove(dbWriter1);
		dbWriter1.getPublishers().remove(dbPublisher);
		commitTransaction();

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		// verify dissassociation
		dbPublisher = findPublisherWithName(em, publisherName);
		dbWriter1 = findWriterWithName(em, writer1Name);
		Writer dbWriter2 = findWriterWithName(em, writer2Name);

		assertNotNull("publisher not found", dbPublisher);
		assertNotNull("writer1 not found", dbWriter1);
		assertNotNull("writer2 not found", dbWriter2);
		assertTrue("writer's publishers", dbWriter1.getPublishers().isEmpty());
		assertEquals("num publisher's writers", 1, dbPublisher.getWriters().size());
		assertEquals("publisher's writer", dbWriter2, dbPublisher.getWriters().get(0));
	}

	private void verifyInsertPublisherWriter(boolean checkCache) {
		// the fixture setUp does the insert, now verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Publisher dbPublisher = findPublisherWithName(em, publisherName);

		assertNotNull("publisher not found", dbPublisher);
		assertEquals("publisher's writers", 2, dbPublisher.getWriters().size());

		Writer dbWriter = dbPublisher.getWriters().get(0);
		assertNotNull("writer not found", dbWriter);
		assertEquals("writer's publisher", dbPublisher, dbWriter.getPublishers().get(0));
	}

	/**
	 * The test fixture consists of a single publisher with two writers.
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		beginTransaction();
		publisher = createAnonymousPublisher(em);
		publisherName = publisher.getName();
		writer1 = createAnonymousWriter(em);
		writer1Name = writer1.getName();
		writer2 = createAnonymousWriter(em);
		writer2Name = writer2.getName();
		// 
		publisher.getWriters().add(writer1);
		publisher.getWriters().add(writer2);
		commitTransaction();
	}

}
