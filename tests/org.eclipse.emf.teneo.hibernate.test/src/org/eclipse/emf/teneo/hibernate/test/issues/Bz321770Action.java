/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Factory;
import org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package;
import org.eclipse.emf.teneo.samples.issues.bz321770.Child;
import org.eclipse.emf.teneo.samples.issues.bz321770.Parent;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 321770
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Bz321770Action extends AbstractTestAction {

	public Bz321770Action() {
		super(Bz321770Package.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final Parent parent = Bz321770Factory.eINSTANCE.createParent();
			final Child c1 = Bz321770Factory.eINSTANCE.createChild();
			c1.setName("c1");
			final Child c2 = Bz321770Factory.eINSTANCE.createChild();
			c2.setName("c2");
			parent.getChild().add(c1);
			parent.getChild().add(c2);
			store.store(c2);
			store.store(c1);
			store.store(parent);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Parent parent = store.getObject(Parent.class);
			Child c2 = parent.getChild().get(0);
			Child c1 = parent.getChild().get(1);
			assertEquals("c2", c2.getName());
			assertEquals("c1", c1.getName());
			store.commitTransaction();
		}
	}
}