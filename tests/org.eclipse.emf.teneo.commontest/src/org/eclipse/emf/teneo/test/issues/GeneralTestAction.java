/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GeneralTestAction.java,v 1.4 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.generaltest.Address;
import org.eclipse.emf.teneo.samples.issues.generaltest.City;
import org.eclipse.emf.teneo.samples.issues.generaltest.Contact;
import org.eclipse.emf.teneo.samples.issues.generaltest.Country;
import org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestFactory;
import org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage;
import org.eclipse.emf.teneo.samples.issues.generaltest.State;
import org.eclipse.emf.teneo.samples.issues.generaltest.TC;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * General Test, contains test cases for different issues: - 187984 - 193697 - 193697 - 188973
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ $Date: 2008/02/28 07:08:16 $
 */
public class GeneralTestAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public GeneralTestAction() {
		super(GeneralTestPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "false");
		return props;
	}

	/** Doaction */
	@Override
	public void doAction(TestStore store) {
		// check
		if (store.isHibernateTestStore()) {
			final Address a = GeneralTestFactory.eINSTANCE.createAddress();
			a.setName("a");
			a.setVolatileString("v1");
			final Contact contact = GeneralTestFactory.eINSTANCE.createContact();
			contact.setName("c");
			a.getContacts().add(contact);
			final City c = GeneralTestFactory.eINSTANCE.createCity();
			c.setName("c");
			a.setCity(c);
			final Country country = GeneralTestFactory.eINSTANCE.createCountry();
			country.setName("c");
			a.setCountry(country);
			final State s = GeneralTestFactory.eINSTANCE.createState();
			s.setName("s");
			a.setState(s);
			try {
				store.beginTransaction();
				store.store(a);
				store.commitTransaction();
				fail("This should fail as 'a' references an object 'country' which is not saved automatically because cascade is set of as a default for mto");
			} catch (Exception e) {
				// okay, many-to-one is not cascaded

				// note we can't resave a because in the IdentifierCacheHandler already an id has
				// been
				// assigned to a and saving this same object again will result in a
				// staleobjectexception
			}
		}

		// do it again but now better
		{
			final Address a = GeneralTestFactory.eINSTANCE.createAddress();
			a.setName("a");
			a.setVolatileString("v1");
			final Contact contact = GeneralTestFactory.eINSTANCE.createContact();
			contact.setName("c");
			a.getContacts().add(contact);
			final City c = GeneralTestFactory.eINSTANCE.createCity();
			c.setName("c");
			a.setCity(c);
			final TC tc = GeneralTestFactory.eINSTANCE.createTC();
			tc.setName("tc");
			a.getTc().add(tc);
			final Country country = GeneralTestFactory.eINSTANCE.createCountry();
			country.setName("c");
			a.setCountry(country);
			final State s = GeneralTestFactory.eINSTANCE.createState();
			s.setName("s");
			a.setState(s);
			store.refresh();
			store.beginTransaction();
			store.store(tc);
			store.store(country);
			store.store(a);
			store.commitTransaction();
		}

		// and read the data
		{
			store.beginTransaction();
			if (store.isHibernateTestStore()) {
				// check call 187984
				final City c = store.getObject(City.class);
				final Contact contact = store.getObject(Contact.class);
				final TC tc = store.getObject(TC.class);
				assertNotNull("econtainer should be set", c.eContainer());
				assertNotNull("econtainer should be set", contact.eContainer());
				assertNotNull("econtainer should be set", tc.eContainer());
				assertTrue("contained object should be part of parent container",
						((Address) tc.eContainer()).getTc().contains(tc));
			}

			// check default transient
			final Address a = store.getObject(Address.class);
			assertNull("A reference to a transient class should be transient also", a.getState());
			if (store.isHibernateTestStore()) {
				assertEquals("v1", a.getVolatileString());
			}
			store.commitTransaction();
		}
	}
}
