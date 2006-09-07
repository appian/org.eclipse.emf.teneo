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
 * $Id: AllTests.java,v 1.3 2006/09/07 22:27:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
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
 * @version $Revision: 1.3 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs",
				JPOXTestbed.instance().getConfigurations());

		if (!JPOXTestbed.isRunningOnEMFTServer()) {
			suite.addTestSuite(EcoreAttrsAction.class);
			suite.addTestSuite(SimplefeaturemapAction.class);
			suite.addTestSuite(SubstitutionAction.class);
			suite.addTestSuite(SubstitutionzvonAction.class);
		}
		
		suite.addTestSuite(SimpleTypeAction.class);
		suite.addTestSuite(ListUnionAction.class);
		suite.addTestSuite(ListAction.class);

		suite.addTestSuite(NestedGroupAction.class);
		suite.addTestSuite(MixedAction.class);
		suite.addTestSuite(ExtensionAction.class);
		suite.addTestSuite(RestrictionAction.class);

		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(GroupAction.class);
		suite.addTestSuite(AnyTypeAction.class);
		return suite;
	}

}
