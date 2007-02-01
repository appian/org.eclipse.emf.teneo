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
 * $Id: Relation2Action.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.samples.issues.testrelation2.TestA;
import org.eclipse.emf.teneo.samples.issues.testrelation2.TestB;
import org.eclipse.emf.teneo.samples.issues.testrelation2.TestB2;
import org.eclipse.emf.teneo.samples.issues.testrelation2.TestC;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * This package tests jpox for the difference between cascading deletes of interface fields versus fields which are defined using
 * concrete classes. In addiiton two implementations of one interface are tested.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Relation2Action extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return TestB2.class.getPackage().getName();
	}

	/** Simple test. */
	public void doAction(TestStore store) {
		{
			store.beginTransaction();

			final TestA testa = new TestA();
			testa.setCode("code");
			final TestB testb = new TestB();
			testb.setCode("code");
			testa.setTestb(testb);
			store.store(testa);

			final TestA testa2 = new TestA();
			testa2.setCode("code2");
			final TestB2 testb2 = new TestB2();
			testb2.setCode("code");
			testa2.setTestb(testb2);

			TestC testc = new TestC();
			testc.setCode("code");
			testa.setTestc(testc);
			testa2.setTestc(testc);
			store.store(testa);
			store.store(testa2);

			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List list = store.getObjects(TestA.class);
			Iterator iter = list.iterator();
			while (iter.hasNext()) {
				TestA result = (TestA) iter.next();
				store.deleteObject(result);
			}

			store.commitTransaction();
		}

		store.checkNumber(TestA.class, 0);
		store.checkNumber(TestB.class, 0);
		store.checkNumber(TestC.class, 1);
	}
}
