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
package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EcoreAttrsAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ExtensionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.GroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ListAction;
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
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs", HibernateTestbed
				.instance().getConfigurations());
		suite.addTestSuite(SimpleTypeAction.class);
		suite.addTestSuite(ListAction.class);
		suite.addTestSuite(EcoreAttrsAction.class);
		suite.addTestSuite(MixedAction.class);
		suite.addTestSuite(SimplefeaturemapAction.class);
		suite.addTestSuite(RestrictionAction.class);
		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(ExtensionAction.class);
		suite.addTestSuite(GroupAction.class);
		suite.addTestSuite(NestedGroupAction.class);
		suite.addTestSuite(SubstitutionzvonAction.class);
		suite.addTestSuite(SubstitutionAction.class);
		/*
		/*
		 * // The anytype test is not yet supported by Hibernate // suite.addTestSuite(AnyTypeAction.class); // Listunion types are not
		 * yet supported by hibernate // 
		suite.addTestSuite(ListUnionAction.class);
		 */
		// $JUnit-END$
		return suite;
	}

}
