/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * CompositeIdAction.java,v 1.2 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Name;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.PersonID;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class CompositeFKIdAction extends AbstractTestAction {
	/**
	 * Constructor
	 */
	public CompositeFKIdAction() {
		super(CompositefkidPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final CompositefkidFactory factory = CompositefkidFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Name name1 = factory.createName();
			name1.setLastName("Smith");
			store.store(name1);

			final Parent parent = factory.createParent();
			parent.setFirstName("John");
			parent.setLastName(name1);
			final Child child1 = factory.createChild();
			child1.setFirstName("Johnny");
			child1.setLastName(name1);
			parent.getRelations().add(child1);
			final Child child2 = factory.createChild();
			child2.setFirstName("Jane");
			child2.setLastName(name1);
			parent.getRelations().add(child2);
			store.store(parent.getRelations());
			store.store(parent);
			store.commitTransaction();
		}

		// read again
		{
			store.beginTransaction();
			final Name name = (Name) store.getObject(Name.class);
			final Parent parent = (Parent) store.getObject(Parent.class);
			assertEquals(2, parent.getRelations().size());
			assertEquals("Johnny", parent.getRelations().get(0).getFirstName());
			assertEquals("Jane", parent.getRelations().get(1).getFirstName());
			assertEquals(name, parent.getRelations().get(0).getLastName());
			assertEquals(name, parent.getRelations().get(1).getLastName());
			
			PersonID personId = new PersonID();
			personId.setFirstName("Johnny");
			personId.setLastName(name);
			final Object o = store.getObject("Child", personId);
			assertEquals(o, parent.getRelations().get(0));
			store.commitTransaction();
		}
	}
}