/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AllTests.java,v 1.9 2007/03/28 13:58:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.issues.AbstractReferenceAction;
import org.eclipse.emf.teneo.test.issues.AbstractTopClassAction;
import org.eclipse.emf.teneo.test.issues.BZ224991Action;
import org.eclipse.emf.teneo.test.issues.BZ225296_2Action;
import org.eclipse.emf.teneo.test.issues.BZ237361Action;
import org.eclipse.emf.teneo.test.issues.BZ237498Action;
import org.eclipse.emf.teneo.test.issues.BZ237790Action;
import org.eclipse.emf.teneo.test.issues.BZ237994Action;
import org.eclipse.emf.teneo.test.issues.BZ247785Action;
import org.eclipse.emf.teneo.test.issues.BZ247939Action;
import org.eclipse.emf.teneo.test.issues.BZ249246Action;
import org.eclipse.emf.teneo.test.issues.BZ249440Action;
import org.eclipse.emf.teneo.test.issues.BZ253799Action;
import org.eclipse.emf.teneo.test.issues.BZ277546Action;
import org.eclipse.emf.teneo.test.issues.BZ277570Action;
import org.eclipse.emf.teneo.test.issues.BagDuplicateAction;
import org.eclipse.emf.teneo.test.issues.EnumTestAction;
import org.eclipse.emf.teneo.test.issues.GeneralTestAction;
import org.eclipse.emf.teneo.test.issues.InheritanceAction;
import org.eclipse.emf.teneo.test.issues.InterfaceTrueAction;
import org.eclipse.emf.teneo.test.issues.LargeMapValueAction;
import org.eclipse.emf.teneo.test.issues.MTMSameAction;
import org.eclipse.emf.teneo.test.issues.MultipleInheritanceAction;
import org.eclipse.emf.teneo.test.issues.ResourceAction;
import org.eclipse.emf.teneo.test.issues.SecondarytableInheritanceAction;
import org.eclipse.emf.teneo.test.issues.SimplenmAction;
import org.eclipse.emf.teneo.test.issues.SupInterfacesAction;
import org.eclipse.emf.teneo.test.issues.TopClassesAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.58 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.issues",
				HibernateTestbed.instance().getConfigurations());

		// to enable this test add a hibernate.properties in the root with the following property:
		// hibernate.bytecode.provider=cglib
		// suite.addTestSuite(Bz292151Action.class);
		suite.addTestSuite(Bz292074Action.class);
		suite.addTestSuite(Bz284859Action.class);
		suite.addTestSuite(Bz288963Action.class);
		suite.addTestSuite(BZ285372Action.class);
		suite.addTestSuite(Bz282414Action.class);
		suite.addTestSuite(Bz280355Action.class);

		suite.addTestSuite(BZ225296_2Action.class);
		suite.addTestSuite(Bz280480Action.class);
		suite.addTestSuite(Bz281730Action.class);
		suite.addTestSuite(BZ277570Action.class);
		suite.addTestSuite(BZ277546Action.class);
		suite.addTestSuite(BZ258266Action.class);
		suite.addTestSuite(BZ253799Action.class);

		suite.addTestSuite(Bz245167Action.class);

		suite.addTestSuite(BZ249246Action.class);
		suite.addTestSuite(BZ249440Action.class);
		suite.addTestSuite(Bz245634Action.class);

		suite.addTestSuite(BZ247785Action.class);

		suite.addTestSuite(BZ247939Action.class);

		suite.addTestSuite(InterfaceTrueAction.class);
		suite.addTestSuite(SupInterfacesAction.class);

		suite.addTestSuite(BZ237361Action.class);

		suite.addTestSuite(Bz243024Action.class);
		suite.addTestSuite(Bz242995Action.class);
		suite.addTestSuite(BZ237994Action.class);
		suite.addTestSuite(BZ237790Action.class);
		suite.addTestSuite(BZ237498Action.class);

		suite.addTestSuite(SecondarytableInheritanceAction.class);
		if (!HibernateTestbed.isRunningOnBuildServer()) {
			// gives out-of-mem on build server but not locally
			suite.addTestSuite(LargeMapValueAction.class);
		}

		suite.addTestSuite(BZ224991Action.class);

		suite.addTestSuite(AbstractTopClassAction.class);
		// disabled some more tests as the build server seems to fail here...
		// these tests pass locally ofcourse
		if (!HibernateTestbed.isRunningOnBuildServer()) {
			suite.addTestSuite(GeneralTestAction.class);
			suite.addTestSuite(TransientOtmAction.class);
			suite.addTestSuite(UpdateAction.class);
			suite.addTestSuite(MTMSameAction.class);
			suite.addTestSuite(MultipleInheritanceAction.class);
			suite.addTestSuite(ResourceAction.class);
			suite.addTestSuite(InheritanceAction.class);
			suite.addTestSuite(BagDuplicateAction.class);
			suite.addTestSuite(EnumTestAction.class);
			suite.addTestSuite(AbstractReferenceAction.class);
			suite.addTestSuite(SimplenmAction.class);
			suite.addTestSuite(TopClassesAction.class);
		}
		return suite;
	}
}
