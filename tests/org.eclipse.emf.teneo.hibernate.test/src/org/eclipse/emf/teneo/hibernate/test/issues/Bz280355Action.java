/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Factory;
import org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Package;
import org.eclipse.emf.teneo.samples.issues.bz280355.Leiter;
import org.eclipse.emf.teneo.samples.issues.bz280355.Person;
import org.eclipse.emf.teneo.samples.issues.bz280355.impl.LeiterImpl;
import org.eclipse.emf.teneo.samples.issues.bz280355.impl.PersonImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.2 $
 */
public class Bz280355Action extends AbstractTestAction {

	public Bz280355Action() {
		super(new EPackage[] { Bz280355Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		// fails because of specific handling of EntityManager and
		// the SessionWrapper saveOrUpdate method.
		if (HibernateTestbed.instance().getActiveConfiguration().isEjb3()) {
			return;
		}

		final Bz280355Factory factory = Bz280355Factory.eINSTANCE;

		{
			store.beginTransaction();
			final Person p1 = factory.createPerson();
			final Person p2 = factory.createPerson();
			p1.setVersion(1);
			p2.setVersion(1);
			store.store(p1);
			store.store(p2);
			store.commitTransaction();
		}

		try {
			final Resource res1 = store.getResource("query1=From " + PersonImpl.class.getName());
			res1.load(Collections.EMPTY_MAP);
			assertTrue(res1.getContents().size() == 2);
			assertTrue(res1.getContents().get(0) instanceof Person);
			assertTrue(res1.getContents().get(1) instanceof Person);

			final Resource res2 = store.getResource("query1=From " + LeiterImpl.class.getName());
			res2.load(Collections.EMPTY_MAP);
			final Leiter l = factory.createLeiter();
			l.setId(0);
			l.setVersion(0);
			l.setPerson((Person) res1.getContents().get(0));
			res2.getContents().add(l);
			res2.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

		{
			store.beginTransaction();
			store.checkNumber(Person.class, 2);
			store.commitTransaction();
		}
	}
}
