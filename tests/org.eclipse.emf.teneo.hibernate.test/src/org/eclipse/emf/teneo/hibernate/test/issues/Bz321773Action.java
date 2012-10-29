/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Factory;
import org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package;
import org.eclipse.emf.teneo.samples.issues.bz321773.Item1;
import org.eclipse.emf.teneo.samples.issues.bz321773.Item2;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 321773.
 * 
 * NOTE: Does NOT run on Mysql cause mysql does not support sequences.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz321773Action extends AbstractTestAction {

	public Bz321773Action() {
		super(Bz321773Package.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final Item1 item1 = Bz321773Factory.eINSTANCE.createItem1();
			item1.setData("item1");
			final Item2 item2 = Bz321773Factory.eINSTANCE.createItem2();
			item2.setData("item2");
			store.store(item1);
			store.store(item2);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Item1 item1 = store.getObject(Item1.class);
			assertNotNull(item1);
			Item2 item2 = store.getObject(Item2.class);
			assertNotNull(item2);
			store.commitTransaction();
		}
	}
}