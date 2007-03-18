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
 * $Id: AllTests.java,v 1.7 2007/03/18 19:18:49 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.issues.AbstractReferenceAction;
import org.eclipse.emf.teneo.test.issues.BagDuplicateAction;
import org.eclipse.emf.teneo.test.issues.EnumTestAction;
import org.eclipse.emf.teneo.test.issues.InheritanceAction;
import org.eclipse.emf.teneo.test.issues.InterfaceTrueAction;
import org.eclipse.emf.teneo.test.issues.MTMSameAction;
import org.eclipse.emf.teneo.test.issues.ResourceAction;
import org.eclipse.emf.teneo.test.issues.SimplenmAction;
import org.eclipse.emf.teneo.test.issues.TopClassesAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.issues", HibernateTestbed.instance()
				.getConfigurations());
		
		suite.addTestSuite(ResourceAction.class);

		suite.addTestSuite(MTMSameAction.class);

		suite.addTestSuite(InheritanceAction.class);

		suite.addTestSuite(BagDuplicateAction.class);
		suite.addTestSuite(EnumTestAction.class);

		suite.addTestSuite(AbstractReferenceAction.class);
		suite.addTestSuite(InterfaceTrueAction.class);
		suite.addTestSuite(SimplenmAction.class);
		suite.addTestSuite(TopClassesAction.class);
		
		// non emf tests: can not be run anymore
		// suite.addTestSuite(DuplicateFieldAction.class);
		// suite.addTestSuite(HierarchyQueryAction.class);
		// suite.addTestSuite(ReferenceCycleAction.class);
		// suite.addTestSuite(Relation1nAction.class);
		// suite.addTestSuite(Relation3Action.class);
		// suite.addTestSuite(Relation4Action.class);

		// following test does not yet work for hibernate
		// suite.addTestSuite(TestClassHierarchyAction.class);
		// suite.addTestSuite(Relation2Action.class);
		// suite.addTestSuite(Relation5Action.class);

		return suite;
	}
}
