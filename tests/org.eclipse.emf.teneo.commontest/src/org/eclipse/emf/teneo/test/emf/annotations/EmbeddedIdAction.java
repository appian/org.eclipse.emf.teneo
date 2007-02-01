/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EmbeddedIdAction.java,v 1.2 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.EmbeddedidFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.EmbeddedidPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.Name;
import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;



public class EmbeddedIdAction extends AbstractTestAction {

	private static final String ADDRESS = "Amsterdamseweg 123, 4567AZ Amsterdam";
	private static final String LAST_NAME = "Janssen";
	private static final String FIRST_NAME = "Jan";
	
	public EmbeddedIdAction() {
		super(EmbeddedidPackage.eINSTANCE);
	}

	public void doAction(TestStore store) {
		storePerson(store);
		testPerson(store);
	}

	private void storePerson(TestStore store) {
		final Person person = EmbeddedidFactory.eINSTANCE.createPerson();
		final Name name = EmbeddedidFactory.eINSTANCE.createName();
		name.setFirstName(FIRST_NAME);
		name.setLastName(LAST_NAME);
		person.setName(name);
		person.setAddress(ADDRESS);
		store.beginTransaction();
		store.store(person);
		store.commitTransaction();
	}
	
	private void testPerson(TestStore store) {
		store.beginTransaction();
		List persons = store.query("FROM Person");
		assertEquals(1, persons.size());
		Person person = (Person) persons.get(0);
		assertEquals(FIRST_NAME, person.getName().getFirstName());
		assertEquals(LAST_NAME, person.getName().getLastName());
		assertEquals(ADDRESS, person.getAddress());
		store.commitTransaction();
	}

}
