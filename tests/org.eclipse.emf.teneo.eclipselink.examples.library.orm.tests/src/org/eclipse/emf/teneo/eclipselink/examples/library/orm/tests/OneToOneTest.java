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

import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class OneToOneTest extends LibraryJPATest {

	public OneToOneTest(String name) {
		super(name);
	}

	public void testWriteRead() throws Exception {
		em.getTransaction().begin();
		Writer writer = createAnonymousWriter(em);
		String writerName = writer.getName();
		Address address = createAnonymousAddressForWriter(em, writer);
		String addressTown = address.getTown();
		writer.setAddress(address);
		em.getTransaction().commit();
		
		Writer actualWriter = (Writer) em
			.createQuery("select o from Writer o where o.name = :name")
			.setParameter("name", writerName)
			.getSingleResult();
		Address actualAddress = (Address) em
			.createQuery("select o from Address o where o.town = :town")
			.setParameter("town", addressTown)
			.getSingleResult();

		assertEquals("writer address", actualWriter.getAddress(), actualAddress);
	}
}
