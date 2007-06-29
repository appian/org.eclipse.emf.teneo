/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DetachEListAction.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.detach;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.Contacts;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistFactory;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a test case to test detach functionality in the dao resource using an elist, checks insert,
 * move, etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class DetachEListAction extends AbstractTestAction {

	/** Constructor */
	public DetachEListAction() {
		super(DetachelistPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Stores a TopModel Object */
	@Override
	public void doAction(TestStore store) {
		try {
			DetachelistFactory factory = DetachelistFactory.eINSTANCE;

			{
				final Resource resource = store.getResource();

				resource.load(Collections.EMPTY_MAP);
				assertTrue(resource.getContents().size() == 0);

				// add test data
				Contacts contacts = factory.createContacts();
				Person person1 = factory.createPerson();
				person1.setName("001");
				Person person2 = factory.createPerson();
				person2.setName("002");

				contacts.getPersons().add(person1);
				contacts.getPersons().add(person2);
				resource.getContents().add(contacts);
				resource.getContents().add(person1);
				resource.getContents().add(person2);

				// this prevents a null constraint exc in hibernate
				// assertEquals(0, contacts.getContainedPersons().size());
				resource.save(Collections.EMPTY_MAP);

				contacts = (Contacts) resource.getContents().get(0);
				person1 = contacts.getPersons().get(0);
				person2 = contacts.getPersons().get(1);

				contacts.getPersons().clear();
				contacts.getPersons().add(person1);
				contacts.getPersons().add(person2);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}

			assertFalse(store.transactionActive());

			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person person = contacts.getPersons().get(0);
				assertEquals("001", person.getName());
				person = contacts.getPersons().get(1);
				assertEquals("002", person.getName());
				resource.unload();
			}

			assertFalse(store.transactionActive());

			// now move everything around
			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person person1 = contacts.getPersons().get(0);
				Person person2 = contacts.getPersons().get(1);
				contacts.getPersons().clear();
				contacts.getPersons().add(person2);
				contacts.getPersons().add(person1);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person person1 = contacts.getPersons().get(0);
				Person person2 = contacts.getPersons().get(1);
				assertTrue(person1.getName().compareTo("002") == 0);
				assertTrue(person2.getName().compareTo("001") == 0);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			// add two and delete 1
			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person person3 = factory.createPerson();
				person3.setName("003");
				Person person4 = factory.createPerson();
				person4.setName("004");

				contacts.getPersons().add(person3);
				contacts.getPersons().add(person4);
				contacts.getPersons().remove(1); // remove person 001
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			// check if this actually worked
			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				assertEquals("002", (contacts.getPersons().get(0)).getName());
				assertEquals("003", (contacts.getPersons().get(1)).getName());
				assertEquals("004", (contacts.getPersons().get(2)).getName());
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			// do a set and move
			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				contacts.getPersons().move(0, 2); // order is now 004, 002, 003
				Person person5 = factory.createPerson();
				person5.setName("005");
				contacts.getPersons().set(2, person5); // order is now 004, 002, 005
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			// the order should be 004, 002, 005
			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				assertEquals("004", (contacts.getPersons().get(0)).getName());
				assertEquals("002", (contacts.getPersons().get(1)).getName());
				assertEquals("005", (contacts.getPersons().get(2)).getName());
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person person = factory.createPerson();
				person.setName("c1");
				contacts.getContainedPersons().add(person);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			assertFalse(store.transactionActive());

			{
				Resource resource = store.getResource();
				resource.load(Collections.EMPTY_MAP);
				Contacts contacts = getContacts(resource);
				Person c1 = contacts.getContainedPersons().get(0);
				Person person004_1 = factory.createPerson();
				person004_1.setName("004.1");
				c1.getChildren().add(person004_1);
				resource.save(Collections.EMPTY_MAP);
				contacts.getContainedPersons().remove(0);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			{
				// check that the previous step actually deleted the persons
				store.beginTransaction();
				final List<?> list = store.getObjects(Person.class);
				final Iterator<?> it = list.iterator();
				while (it.hasNext()) {
					final Person person = (Person) it.next();
					assertTrue(person.getName().compareTo("c1") != 0 && person.getName().compareTo("004.1") != 0);
				}
				store.commitTransaction();
			}
			assertFalse(store.transactionActive());
		} catch (Exception e) {
			throw new StoreTestException("Exception during detach elist test", e);
		}
	}

	/** Get the contacts object */
	private Contacts getContacts(Resource resource) {
		final Iterator<?> it = resource.getContents().iterator();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (obj instanceof Contacts) {
				return (Contacts) obj;
			}
		}
		return null;
	}
}
