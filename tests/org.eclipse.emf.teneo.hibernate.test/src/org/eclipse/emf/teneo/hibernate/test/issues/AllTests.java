/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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
import org.eclipse.emf.teneo.test.issues.ResourceAction;
import org.eclipse.emf.teneo.test.issues.SimplenmAction;
import org.eclipse.emf.teneo.test.issues.TopClassesAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.issues", HibernateTestbed.instance()
				.getConfigurations());

		suite.addTestSuite(InheritanceAction.class);
		suite.addTestSuite(ResourceAction.class);

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
