/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllGenerateTests.java,v 1.3 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.issues;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.issues.AbstractReferenceAction;
import org.eclipse.emf.teneo.test.issues.BagDuplicateAction;
import org.eclipse.emf.teneo.test.issues.EnumTestAction;
import org.eclipse.emf.teneo.test.issues.InheritanceAction;
import org.eclipse.emf.teneo.test.issues.InterfaceTrueAction;
import org.eclipse.emf.teneo.test.issues.SimplenmAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for issues", JPOXTestbed.instance().getConfigurations());

		suite.addTest(new JPOXGenerateTest(InheritanceAction.class));

		suite.addTest(new JPOXGenerateTest(BagDuplicateAction.class));
		suite.addTest(new JPOXGenerateTest(EnumTestAction.class));

		suite.addTest(new JPOXGenerateTest(InterfaceTrueAction.class));
		suite.addTest(new JPOXGenerateTest(AbstractReferenceAction.class));
		suite.addTest(new JPOXGenerateTest(SimplenmAction.class));

		// seems not to work for jpox, is unimportant
		// suite.addTest(new JPOXGenerateTest(TopClassesAction.class));

		// the following testcases are all non-epackage based
		// suite.addTest(new JPOXGenerateTest(DuplicateFieldAction.class));
		// suite.addTest(new JPOXGenerateTest(HierarchyQueryAction.class));
		// suite.addTest(new JPOXGenerateTest(ReferenceCycleAction.class));
		// suite.addTest(new JPOXGenerateTest(Relation1nAction.class));
		// suite.addTest(new JPOXGenerateTest(Relation2Action.class));
		// suite.addTest(new JPOXGenerateTest(Relation3Action.class));
		// suite.addTest(new JPOXGenerateTest(Relation4Action.class));
		// suite.addTest(new JPOXGenerateTest(Relation5Action.class));
		// suite.addTest(new JPOXGenerateTest(TestClassHierarchyAction.class));
		return suite;
	}
}
