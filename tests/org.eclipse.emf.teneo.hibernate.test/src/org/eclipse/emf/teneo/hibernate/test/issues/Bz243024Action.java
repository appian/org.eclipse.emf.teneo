/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz243024.Bz243024Factory;
import org.eclipse.emf.teneo.samples.issues.bz243024.Bz243024Package;
import org.eclipse.emf.teneo.samples.issues.bz243024.Many;
import org.eclipse.emf.teneo.samples.issues.bz243024.One;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz243024Action extends AbstractTestAction {

	public Bz243024Action() {
		super(new EPackage[] { Bz243024Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			One one = Bz243024Factory.eINSTANCE.createOne();
			Many m1 = Bz243024Factory.eINSTANCE.createMany();
			m1.setName("m1");
			Many m2 = Bz243024Factory.eINSTANCE.createMany();
			m2.setName("m2");
			one.getManies().add(m1);
			one.getManies().add(m2);
			store.store(one);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			One one = store.getObject(One.class);
			assertEquals(2, one.getManies().size());
			for (Many m : one.getManies()) {
				assertTrue(m.getName().equals("m1") || m.getName().equals("m2"));
			}
			one.getManies().remove(0);
			one.getManies().remove(0);
			store.commitTransaction();
		}
		// delete orphan annotation worked
		{
			store.beginTransaction();
			store.checkNumber(Many.class, 0);
			store.commitTransaction();
		}
	}
}
