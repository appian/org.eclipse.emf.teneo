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
 * $Id: AllTests.java,v 1.21 2008/09/20 22:59:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.issues;

import junit.framework.Test;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.issues.AbstractTopClassAction;
import org.eclipse.emf.teneo.test.issues.BagDuplicateAction;
import org.eclipse.emf.teneo.test.issues.EnumTestAction;
import org.eclipse.emf.teneo.test.issues.GeneralTestAction;
import org.eclipse.emf.teneo.test.issues.InheritanceAction;
import org.eclipse.emf.teneo.test.issues.NavTopAction;
import org.eclipse.emf.teneo.test.issues.SimplenmAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.21 $
 */
public class AllTests {

	public static Test suite() {
		MultiCfgTestSuite suite =
				new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.issues", JPOXTestbed.instance()
					.getConfigurations());

		suite.addTestSuite(NavTopAction.class);
		suite.addTestSuite(AbstractTopClassAction.class);

		if (!JPOXTestbed.isRunningOnEMFTServer()) {
			// reenable for jpox 1.2
// suite.addTestSuite(FruitsAction.class);
// suite.addTestSuite(MultipleInheritanceAction.class);
		}

		suite.addTestSuite(GeneralTestAction.class);
// suite.addTestSuite(InterfaceTrueAction.class);
		suite.addTestSuite(BagDuplicateAction.class);
		suite.addTestSuite(InheritanceAction.class);

		suite.addTestSuite(EnumTestAction.class);
		suite.addTestSuite(SimplenmAction.class);

		// TODO always fails for jpox, seems unimportant
		// suite.addTestSuite(AbstractReferenceAction.class);
		// suite.addTestSuite(TopClassesAction.class);

		// the following test cases are all non-epackage
		/*
		 * suite.addTestSuite(DuplicateFieldAction.class);
		 * suite.addTestSuite(HierarchyQueryAction.class);
		 * suite.addTestSuite(ReferenceCycleAction.class);
		 * suite.addTestSuite(Relation1nAction.class); suite.addTestSuite(Relation2Action.class);
		 * suite.addTestSuite(Relation3Action.class); suite.addTestSuite(Relation4Action.class);
		 * suite.addTestSuite(Relation5Action.class);
		 * suite.addTestSuite(TestClassHierarchyAction.class);
		 */
		return suite;
	}
}
