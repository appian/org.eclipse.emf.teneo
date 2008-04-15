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
 * 
 * @author ebk2fe
 * @version 1.0 (April 28th, 2006)
 * <p>
 * This test case creates a publisher object and assignes two writers
 * to the publisher. The objects are committed to the data base. The publisher
 * is fetched back from the data base. 
 */
public class AdHocTest extends LibraryJPATest {

	private Writer writer1;
	private String writer1Name;
	private Writer writer2;
	private String writer2Name;
	private Publisher publisher;
	private String publisherName;

	public AdHocTest(String name) {
		super(name);
	}

	public void testRemovePublisherWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyRemovePublisherWriter(checkCache);		
	}
	
//	public void testRemovePublisherWriterNoCache() throws Exception {
//		boolean checkCache = false;
//		verifyRemovePublisherWriter(checkCache);		
//	}

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

	/**
	 * The test fixture consists of a single publisher
	 * with two writers.
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
