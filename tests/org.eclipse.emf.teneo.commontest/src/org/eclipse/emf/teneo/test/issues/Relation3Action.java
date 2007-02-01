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
 * $Id: Relation3Action.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.testrelation3.TestA;
import org.eclipse.emf.teneo.samples.issues.testrelation3.TestB;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests if a contained object is deleted when its parent is deleted.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Relation3Action extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return TestA.class.getPackage().getName();
	}

	/** Test */
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final TestA testa = new TestA();
			testa.setCode("code");
			final TestB testb = new TestB();
			testb.setCode("code");
			testa.setTestb(testb);
			store.store(testa);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			TestA testa = (TestA) store.getObject(TestA.class);
			store.deleteObject(testa);
			store.commitTransaction();
		}

		store.checkNumber(TestB.class, 0);
		store.checkNumber(TestA.class, 0);
	}
}
