/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * CompositeIdAction.java,v 1.2 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.CompositeidFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.CompositeidPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.Parent;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class CompositeIdAction extends AbstractTestAction {
	/**
	 * Constructor
	 */
	public CompositeIdAction() {
		super(CompositeidPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final CompositeidFactory factory = CompositeidFactory.eINSTANCE;
		{
			store.beginTransaction();
			Parent parent = factory.createParent();
			parent.setFirstName("John");
			parent.setLastName("Smith");
			Child child1 = factory.createChild();
			child1.setFirstName("Johnny");
			child1.setLastName("Smith");
			parent.getChildren().add(child1);
			Child child2 = factory.createChild();
			child2.setFirstName("Jane");
			child2.setLastName("Smith");
			parent.getChildren().add(child2);
			store.store(parent.getChildren());
			store.store(parent);
			store.commitTransaction();
		}

		// read again
		{
			store.beginTransaction();
			Parent parent = (Parent) store.getObject(Parent.class);
			assertEquals(2, parent.getChildren().size());
			assertEquals("Johnny", (parent.getChildren().get(0)).getFirstName());
			assertEquals("Jane", (parent.getChildren().get(1)).getFirstName());
			store.commitTransaction();
		}
	}
}