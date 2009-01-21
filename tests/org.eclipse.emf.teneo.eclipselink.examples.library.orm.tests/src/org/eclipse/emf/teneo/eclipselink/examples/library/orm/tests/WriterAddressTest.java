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
import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class WriterAddressTest extends LibraryJPATest {

	public WriterAddressTest(String name) {
		super(name);
	}

	public void testInsertWriterAndAddressWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterAddress(checkCache);
	}

	public void testInsertWriterAndAddressNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriterAddress(checkCache);
	}

	private void verifyInsertWriterAddress(boolean checkCache) {

		beginTransaction();

		Writer writer = createAnonymousWriterWithAddress(em);
		String writerName = writer.getName();
		Address address = writer.getAddress();

		// put the data to the data base
		commitTransaction();

		// verify

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		// Check whether the writer as been allocated at the data base.

		Writer dbWriter = findWriterWithName(em, writerName);
		assertNotNull("dbWriter not found", dbWriter);
		Address dbAddress = dbWriter.getAddress();

		assertNotNull("dbAddress not found", dbAddress);
		assertNotNull("eContainer not set", dbAddress.eContainer());
		int containerFeatureID = ((InternalEObject) address).eContainerFeatureID();
		int dbContainerFeatureID = ((InternalEObject) dbAddress).eContainerFeatureID();
		assertEquals("Containment Feature Id DB Address", containerFeatureID, dbContainerFeatureID);
	}
}
