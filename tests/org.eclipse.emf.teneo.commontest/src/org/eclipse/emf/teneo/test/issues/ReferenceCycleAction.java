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
 * $Id: ReferenceCycleAction.java,v 1.1 2006/07/04 22:12:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.referencecycle.A;
import org.eclipse.emf.teneo.samples.issues.referencecycle.B;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a simple test case to test how circular dependencies are handled.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ReferenceCycleAction extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return A.class.getPackage().getName();
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store) {
		// create the two test objects
		{
			store.beginTransaction();
			final A myA = new A();
			final B myB = new B();
			myA.setName("I am a");
			myA.setMyB(myB);
			myB.setName("I am b");
			myB.setMyA(myA);
			store.store(myA);
			store.store(myB);
			store.commitTransaction();
		}

		// now read again
		{
			// retrieve is just a helper method which creates a criteria
			store.beginTransaction();
			A myA = (A) store.getObject(A.class);
			assertTrue(myA.getMyB().getName().compareTo("I am b") == 0);
			assertTrue(myA.getMyB().getMyA() == myA);
			store.commitTransaction();
		}
	}

}
