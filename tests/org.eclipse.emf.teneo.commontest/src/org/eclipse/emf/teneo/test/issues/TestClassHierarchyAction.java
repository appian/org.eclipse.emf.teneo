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
 * $Id: TestClassHierarchyAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.testclasshierarchy.ChildModelOne;
import org.eclipse.emf.teneo.samples.issues.testclasshierarchy.ChildModelTwo;
import org.eclipse.emf.teneo.samples.issues.testclasshierarchy.TopModel;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests storage and retrieval of a small class hierarchy. Can be used to test different mapping strategies from a class hierarchy to a
 * relational schema.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class TestClassHierarchyAction extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return ChildModelOne.class.getPackage().getName();
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store) {
		boolean error = true;
		try {
			{
				store.beginTransaction();

				ChildModelOne one = new ChildModelOne();
				one.setName("childOne");
				one.setAge(5);
				one.setSocialSecurityNo("soc2");
				store.store(one);

				TopModel topModel = new TopModel();
				topModel.setName("Top class");
				topModel.setSocialSecurityNo("soc1");
				store.store(topModel);

				store.commitTransaction();
			}

			{
				store.beginTransaction();

				ChildModelTwo two = new ChildModelTwo();
				two.setName("childTwo");
				two.setSocialSecurityNo("soc3");
				store.store(two);

				store.commitTransaction();
			}

			{
				store.beginTransaction();
				TopModel result = (TopModel) store.query(TopModel.class, "socialSecurityNo", "soc1", 1).get(0);
				assertTrue(result != null);
				assertTrue(result.getName().compareTo("Top class") == 0);

				result = (ChildModelOne) store.query(ChildModelOne.class, "socialSecurityNo", "soc2", 1).get(0);
				assertTrue(result != null);
				assertTrue(result instanceof ChildModelOne);
				assertTrue(result.getName().compareTo("childOne") == 0);

				result = (ChildModelTwo) store.query(TopModel.class, "socialSecurityNo", "soc3", 1).get(0);
				assertTrue(result != null);
				assertTrue(result instanceof ChildModelTwo);
				assertTrue(result.getName().compareTo("childTwo") == 0);
				store.commitTransaction();
			}

			error = false;
		} finally {
			if (error) store.rollbackTransaction();
		}
	}
}
