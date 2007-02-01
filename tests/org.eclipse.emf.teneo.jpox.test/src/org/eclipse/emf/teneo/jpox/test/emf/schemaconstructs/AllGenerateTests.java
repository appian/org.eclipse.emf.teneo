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
 * $Id: AllGenerateTests.java,v 1.4 2007/02/01 12:34:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.AnyTypeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EMapAction;
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
 * @version $Revision: 1.4 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs",
				JPOXTestbed.instance().getConfigurations());

		suite.addTest(new JPOXGenerateTest(EMapAction.class));

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
