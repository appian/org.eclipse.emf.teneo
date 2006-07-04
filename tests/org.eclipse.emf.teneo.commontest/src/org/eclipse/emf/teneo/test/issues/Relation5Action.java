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
 * $Id: Relation5Action.java,v 1.1 2006/07/04 22:12:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.issues.testrelation5.TestA;
import org.eclipse.emf.teneo.samples.issues.testrelation5.TestB1;
import org.eclipse.emf.teneo.samples.issues.testrelation5.TestB2;
import org.eclipse.emf.teneo.samples.issues.testrelation5.TestC1;
import org.eclipse.emf.teneo.samples.issues.testrelation5.TestC2;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a simple test case to test how circular dependencies are handled.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Relation5Action extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return TestA.class.getPackage().getName();
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store) {

		// Create one TestA object which contains a TestB1 and a TestC1
		// Create another TestA object which contains a TestB2 and a TestC2
		{
			store.beginTransaction();

			TestA testa1 = new TestA();
			testa1.setCode("a1");
			TestB1 testb1 = new TestB1();
			testb1.setCode("b1");
			testa1.setTestb(testb1);

			TestC1 testc1 = new TestC1();
			testc1.setCode("c1");
			testa1.setTestc(testc1);

			final TestA testa2 = new TestA();
			testa2.setCode("code2");
			final TestB2 testb2 = new TestB2();
			testb2.setCode("code");
			testa2.setTestb(testb2);

			TestC2 testc2 = new TestC2();
			testc2.setCode("code");
			testa2.setTestc(testc2);
			store.store(testa1);
			store.store(testa2);

			store.commitTransaction();
		}

		// do some checks
		store.checkNumber(TestA.class, 2);
		store.checkNumber(TestB1.class, 1);
		store.checkNumber(TestB2.class, 1);
		store.checkNumber(TestC1.class, 1);
		store.checkNumber(TestC2.class, 1);

		// Now it should not be possible to delete the TestB objects, if that is
		// case then no-foreign key constraint was created in the database.
		try {
			store.beginTransaction();
			Collection c = store.getObjects(TestB1.class);
			Iterator it = c.iterator();
			while (it.hasNext()) {
				TestB1 result = (TestB1) it.next();
				store.deleteObject(result);
			}

			store.commitTransaction();
			assertTrue(">> It should not possible to delete a TestB1 object, there are references to it", false);
		} catch (Exception e) {
			// we should get here
			store.rollbackTransaction();
		}

		try {
			store.beginTransaction();
			Collection c = store.getObjects(TestB2.class);
			Iterator it = c.iterator();
			while (it.hasNext()) {
				TestB2 result = (TestB2) it.next();
				store.deleteObject(result);
			}

			store.commitTransaction();
			assertTrue(">> It should not possible to delete a TestB1 object, there are references to it", false);
		} catch (Exception e) {
			// we should get here
			store.rollbackTransaction();
		}

		// Now delete the A's, after that no TestC's should be present anymore.
		{
			store.beginTransaction();
			Collection c = store.getObjects(TestA.class);
			Iterator it = c.iterator();
			while (it.hasNext()) {
				TestA result = (TestA) it.next();
				store.deleteObject(result);
			}

			store.commitTransaction();
		}

		// do some checks

		store.checkNumber(TestA.class, 0);
		store.checkNumber(TestB1.class, 1);
		store.checkNumber(TestB2.class, 1);

		// In case the dependent objects were not deleted then the next two
		// lines will fail
		store.checkNumber(TestC1.class, 0);
		store.checkNumber(TestC2.class, 0);
	}
}
