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
 * @version $Revision: 1.2 $
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
