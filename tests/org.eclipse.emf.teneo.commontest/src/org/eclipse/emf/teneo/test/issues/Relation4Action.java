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
 * $Id: Relation4Action.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.testrelation4.TestA;
import org.eclipse.emf.teneo.samples.issues.testrelation4.TestB;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * This package tests jpox for restricted delete if an object A refers to B and we try to delete B, the delete should fail.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Relation4Action extends AbstractTestAction {
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
			try {
				store.beginTransaction();
				TestB testb = (TestB) store.getObject(TestB.class);
				store.deleteObject(testb);
				store.commitTransaction();
				assertTrue("Delete of TestB should not be possible!", false);
			} catch (Exception e) {
				// we should get here
				store.rollbackTransaction();
			}
		}

	}
}
