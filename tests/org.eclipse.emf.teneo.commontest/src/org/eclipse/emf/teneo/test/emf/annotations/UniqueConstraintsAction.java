/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * UniqueConstraintsAction.java,v 1.3 2007/02/11 21:52:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.Project;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class UniqueConstraintsAction extends AbstractTestAction {
	/**
	 * Constructor
	 */
	public UniqueConstraintsAction() {
		super(UniqueconstraintsPackage.eINSTANCE);
	}

	/** Test */
	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		final UniqueconstraintsFactory factory = UniqueconstraintsFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();
			final Project project = factory.createProject();
			project.setName("project_name");
			store.store(project);
			final Item item = factory.createItem();
			item.setAge(5);
			item.setName("name");
			item.setProject(project);
			store.store(item);
			store.commitTransaction();
		}

		try {
			store.beginTransaction();
			final Project p = store.getObject(Project.class);
			final Item item = factory.createItem();
			item.setAge(5);
			item.setName("name");
			item.setProject(p);
			store.store(item);
			store.commitTransaction();
			fail("The uniqueconstraint has not been applied");
		} catch (final Exception s) {
			// this is correct behavior
			store.rollbackTransaction();
		}

		{
			store.beginTransaction();
			final Item item = factory.createItem();
			item.setAge(5);
			item.setName("otherName");
			store.store(item);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Item item = factory.createItem();
			item.setAge(6);
			item.setName("name");
			store.store(item);
			store.commitTransaction();
		}

		store.checkNumber(Item.class, 3);
	}
}