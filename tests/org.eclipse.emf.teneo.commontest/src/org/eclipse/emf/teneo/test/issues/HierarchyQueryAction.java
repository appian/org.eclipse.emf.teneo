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
 * $Id: HierarchyQueryAction.java,v 1.1 2006/07/04 22:12:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.issues.hierarchyquery.A;
import org.eclipse.emf.teneo.samples.issues.hierarchyquery.B;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a simple test case to test that a query for a parent class also returns its subclass
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class HierarchyQueryAction extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return A.class.getPackage().getName();
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store) {
		// Create objects
		{
			store.beginTransaction();
			final A myA = new A();
			final B myB = new B();
			myA.setName("I am a");
			myB.setName("I am b");
			myB.setNameb("my bname");
			store.store(myB);
			store.store(myA);
			store.commitTransaction();
		}

		// now read again
		{
			// retrieve is just a helper method which creates a criteria
			store.beginTransaction();

			Collection coll = store.getObjects(A.class);
			int acnt = 0;
			int bcnt = 0;
			Iterator it = coll.iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof B) {
					bcnt++;
				} else if (obj instanceof A) {
					acnt++;
				}
			}
			assertTrue(acnt == 1);
			assertTrue(bcnt == 1);
			store.commitTransaction();
		}
	}

}
