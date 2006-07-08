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
package org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.AnyTypeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EcoreAttrsAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ExtensionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.GroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ListAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ListUnionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.MixedAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.NestedGroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.RestrictionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimpleTypeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimplefeaturemapAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionzvonAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs",
				JPOXTestbed.instance().getConfigurations());

		suite.addTest(new JPOXGenerateTest(SimpleTypeAction.class));
		suite.addTest(new JPOXGenerateTest(ListAction.class));
		suite.addTest(new JPOXGenerateTest(ListUnionAction.class));
		suite.addTest(new JPOXGenerateTest(EcoreAttrsAction.class));
		suite.addTest(new JPOXGenerateTest(NestedGroupAction.class));
		suite.addTest(new JPOXGenerateTest(MixedAction.class));
		suite.addTest(new JPOXGenerateTest(ExtensionAction.class));
		suite.addTest(new JPOXGenerateTest(RestrictionAction.class));
		suite.addTest(new JPOXGenerateTest(AttributesTest.testAction));
		suite.addTest(new JPOXGenerateTest(SimplefeaturemapAction.class));
		suite.addTest(new JPOXGenerateTest(GroupAction.class));
		suite.addTest(new JPOXGenerateTest(SubstitutionAction.class));
		suite.addTest(new JPOXGenerateTest(SubstitutionzvonAction.class));
		suite.addTest(new JPOXGenerateTest(AnyTypeAction.class));
		return suite;
	}

}
