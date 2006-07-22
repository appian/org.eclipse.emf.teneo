/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LobAction.java,v 1.2 2006/07/22 10:16:31 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.Random;

import org.eclipse.emf.teneo.samples.emf.annotations.lob.LobFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.lob.LobPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.lob.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for Lob.
 * 
 * @author <a href="mailto:lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
public class LobAction extends AbstractTestAction {
	private static final long ID = 1;

	private static final String NAME = "Jan Janssen";

	private static final String ADDRESS = "Amsterdamseweg 123, 4567AZ Amsterdam";

	private static final byte[] PHOTO = new byte[64 * 1024];

	static {
		// Populate PHOTO with random bytes.
		new Random().nextBytes(PHOTO);
	}

	public LobAction() {
		super(LobPackage.eINSTANCE);
	}

	public void doAction(TestStore store) {
		storePerson(store);
		testPerson(store);
	}

	private void storePerson(TestStore store) {
		store.beginTransaction();

		final Person person = LobFactory.eINSTANCE.createPerson();
		person.setId(ID);
		person.setName(NAME);
		person.setAddress(ADDRESS);
		person.setPhoto(PHOTO);
		store.store(person);

		store.commitTransaction();
	}

	private void testPerson(TestStore store) {
		store.beginTransaction();

		final Person person = (Person)store.getObject(Person.class);
		assertEquals(ID, person.getId());
		assertEquals(NAME, person.getName());
		assertEquals(ADDRESS, person.getAddress());		
		final byte[] photo = person.getPhoto();
		assertEquals(PHOTO.length, photo.length);
		for (int i = 0; i < photo.length; i++) {
			assertEquals(PHOTO[i], photo[i]);
		}
		

		store.commitTransaction();
	}
}
