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
 * $Id: NaturalIdAction.java,v 1.2 2008/06/29 20:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Family;
import org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for naturalid
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class NaturalIdAction extends AbstractTestAction {
	public NaturalIdAction() {
		super(NaturalIdPackage.eINSTANCE);
	}

	@Override
	public boolean supportAuditing() {
		return false;
	}

	@Override
	public void doAction(TestStore store) {
		final NaturalIdFactory factory = NaturalIdFactory.eINSTANCE;
		{
			store.beginTransaction();
			{
				final Family fam = factory.createFamily();
				fam.setName("Jansen");
				fam.setAge(100);
				store.store(fam);
				final Person p1 = factory.createPerson();
				p1.setFirstName("Jan");
				p1.setLastName("Jansen");
				p1.setAge(35);
				p1.setCallName("Jan");
				p1.setFamily(fam);
				store.store(p1);
				final Person p2 = factory.createPerson();
				p2.setFirstName("Piet");
				p2.setLastName("Jansen");
				p2.setAge(35);
				p2.setCallName("Piet");
				p2.setFamily(fam);
				store.store(p2);
			}
			{
				final Family fam = factory.createFamily();
				fam.setName("Smit");
				fam.setAge(100);
				store.store(fam);
				final Person p1 = factory.createPerson();
				p1.setFirstName("Jan");
				p1.setLastName("Smit");
				p1.setAge(35);
				p1.setCallName("Jan");
				p1.setFamily(fam);
				store.store(p1);
				final Person p2 = factory.createPerson();
				p2.setFirstName("Piet");
				p2.setLastName("Smit");
				p2.setAge(35);
				p2.setCallName("Piet");
				p2.setFamily(fam);
				store.store(p2);
			}
			store.commitTransaction();
		}

		// now create the Jansen family again, this should fail
		{
			store.beginTransaction();
			final Family fam = factory.createFamily();
			fam.setName("Jansen");
			fam.setAge(100);
			try {
				store.store(fam);
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				// successfull unique key constraint check
				store.rollbackTransaction();
			}
		}

		{
			store.beginTransaction();
			Person p = null;
			for (Object o : store.getObjects(Family.class)) {
				final Family f = (Family) o;
				if (f.getName().compareTo("Jansen") == 0) {
					p = factory.createPerson();
					p.setFirstName("Jan");
					p.setLastName("Jansen");
					p.setAge(35);
					p.setCallName("Jan");
					p.setFamily(f);
					break;
				}
			}
			try {
				store.store(p);
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				// successfull unique key constraint check
				store.rollbackTransaction();
			}
		}

		// create a new person with a different firstname, should work
		{
			store.beginTransaction();
			Person p = null;
			for (Object o : store.getObjects(Family.class)) {
				final Family f = (Family) o;
				if (f.getName().compareTo("Jansen") == 0) {
					p = factory.createPerson();
					p.setFirstName("Jannetje");
					p.setLastName("Jansen");
					p.setAge(35);
					p.setCallName("Jan");
					p.setFamily(f);
					break;
				}
			}
			store.store(p);
			store.commitTransaction();
		}

		// create a new family and a person with the same name but a different
		// family this should work
		{
			// now create the Jansen family again, this should fail
			{
				store.beginTransaction();
				final Family fam = factory.createFamily();
				fam.setName("Timmermans");
				fam.setAge(100);
				store.store(fam);
				Person p = factory.createPerson();
				p.setFirstName("Jan");
				p.setLastName("Jansen");
				p.setAge(35);
				p.setCallName("Jan");
				p.setFamily(fam);
				store.store(p);
				store.commitTransaction();
			}

		}
	}

}