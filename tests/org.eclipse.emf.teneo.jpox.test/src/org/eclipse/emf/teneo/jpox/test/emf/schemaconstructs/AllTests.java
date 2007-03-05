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
 * $Id: AllTests.java,v 1.8.2.2 2007/03/05 20:15:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
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
 * @version $Revision: 1.8.2.2 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs",
				JPOXTestbed.instance().getConfigurations());
		
		// not supported for jpox yet
		//suite.addTestSuite(DateTimeAction.class);

		suite.addTestSuite(SimpleTypeAction.class);

		suite.addTestSuite(AnyTypeAction.class);
		
		suite.addTestSuite(EMapAction.class);

		if (!JPOXTestbed.isRunningOnEMFTServer()) {
			// on the emft server these fail with
			// java.lang.UnsatisfiedLinkError: /opt/j2sdk1.4.2_12/jre/lib/i386/libawt.so: libXp.so.6: cannot open shared object file: No such file or directory
			suite.addTestSuite(EcoreAttrsAction.class);
			suite.addTestSuite(SimplefeaturemapAction.class);
			suite.addTestSuite(SubstitutionAction.class);
			suite.addTestSuite(SubstitutionzvonAction.class);
		}

		suite.addTestSuite(ListUnionAction.class);
		suite.addTestSuite(ListAction.class);

		suite.addTestSuite(NestedGroupAction.class);
		suite.addTestSuite(MixedAction.class);
		suite.addTestSuite(ExtensionAction.class);
		suite.addTestSuite(RestrictionAction.class);

		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(GroupAction.class);

		return suite;
	}

}
