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

/**
 * @author ebk2fe
 * @version 1.0 (April 28th, 2006)
 *          <p>
 *          This test case create a typewriter object which holds at the attribute type an EMF enumeration type. To
 *          store the attribute EMF enumeration value at the data base the transformation mapping is used. Two java
 *          classes have been implemented: <code>TypewriterTypeAttributeTransformer</code> and
 *          <code>TypewriterTypeFieldTransformer</code>.<br>
 *          The correct EMF value for the attribute has to be fetched back from the data base.
 */
public class TypeWriterTypeTest extends LibraryJPATest {

	public TypeWriterTypeTest(String name) {
		super(name);
	}

	public void testInsertTypeWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertTypeWriter(checkCache);
	}

	public void testInsertTypeWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertTypeWriter(checkCache);
	}

	private void verifyInsertTypeWriter(boolean checkCache) {

		beginTransaction();

		TypeWriter twriter = createAnonymousTypewriter(em);
		String twriterMaker = twriter.getMaker();
		TWriterType twriterType = twriter.getType();

		// put the data to the data base
		commitTransaction();

		// verify

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		// Check whether the writer as been allocated at the data base.

		TypeWriter dbTWriter = findTypeWriterWithMaker(em, twriterMaker);

		assertNotNull("dbTWriter not found", dbTWriter);
		assertEquals("dbTWriter.maker", twriterMaker, dbTWriter.getMaker());
		assertEquals("dbTWriter.type", twriterType, dbTWriter.getType());
	}
}
