/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: VariousAction.java,v 1.1 2008/07/12 13:11:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.various.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity;
import org.eclipse.emf.teneo.samples.emf.annotations.various.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bz 239757, 239802, 239756
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class VariousAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public VariousAction() {
		super(VariousPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		final VariousFactory factory = VariousFactory.eINSTANCE;
		{
			store.beginTransaction();
			final ImmutableCity c = factory.createImmutableCity();
			c.setName("test");
			final Parent p1 = createParent();
			store.store(p1);
			c.getParents().add(p1);
			final Parent p2 = createParent();
			store.store(p2);
			c.getParents().add(p2);
			store.store(c);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			c.setName("test2");
			store.store(c);
			store.commitTransaction();
		}
		// name should not have changed
		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			assertEquals("test", c.getName());
			store.store(c);
			for (Parent p : c.getParents()) {
				// 2 parents and 10 children
				assertEquals(12, p.getTotalPeople());
			}

			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			c.getParents().remove(1);
			store.store(c);
			try {
				// collection change is not allowed
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				store.rollbackTransaction();
			}
		}
	}

	private Parent createParent() {
		final VariousFactory factory = VariousFactory.eINSTANCE;
		final Parent p = factory.createParent();
		for (int i = 0; i < 5; i++) {
			final Child c = factory.createChild();
			p.getChildren().add(c);
		}
		return p;
	}
}