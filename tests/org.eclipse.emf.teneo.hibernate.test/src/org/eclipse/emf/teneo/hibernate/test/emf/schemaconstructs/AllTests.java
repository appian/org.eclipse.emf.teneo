/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AllTests.java,v 1.11 2007/03/29 22:14:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DateTimeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DocumentRootAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DurationAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EcoreAttrsAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ExtensionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.GroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ListAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.MixedAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ModelGroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.NestedGroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.QNameAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.RestrictionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimpleTypeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimplefeaturemapAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionzvonAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.37 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite(
				"Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs", HibernateTestbed
						.instance().getConfigurations());
		// if (true) {
		// suite.addTestSuite(EMapAsListExtraLazyAction.class);
		// return suite;
		// }

		suite.addTestSuite(DateTimeAction.class);
		suite.addTestSuite(DateTimeEAVAction.class);
		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(ExtensionEAVAction.class);
		suite.addTestSuite(ExtensionAction.class);
		suite.addTestSuite(EMapAsListExtraLazyEAVAction.class);
		suite.addTestSuite(EMapAsListEAVAction.class);
		suite.addTestSuite(EMapAction.class);
		suite.addTestSuite(EMapAsListAction.class);
		suite.addTestSuite(EMapAsListExtraLazyAction.class);
		suite.addTestSuite(SimpleTypeEAVAction.class);
		suite.addTestSuite(SubstitutionEAVAction.class);
		suite.addTestSuite(GroupEAVAction.class);
		// QNameEAVAction fails because the xml EFactory convertToString does
		// not
		// convert the name space uri, only the prefix
		// suite.addTestSuite(QNameEAVAction.class);
		suite.addTestSuite(AttributesEAVAction.class);
		suite.addTestSuite(DocumentRootEAVAction.class);
		suite.addTestSuite(ListEAVAction.class);
		suite.addTestSuite(MixedEAVAction.class);
		suite.addTestSuite(NestedGroupEAVAction.class);
		suite.addTestSuite(SimplefeaturemapEAVAction.class);
		suite.addTestSuite(SubstitutionzvonEAVAction.class);
		suite.addTestSuite(EcoreAttrsEAVAction.class);

		suite.addTestSuite(EcoreAttrsAction.class);
		suite.addTestSuite(ModelGroupAction.class);
		suite.addTestSuite(MixedAction.class);

		suite.addTestSuite(DocumentRootAction.class);
		suite.addTestSuite(SubstitutionzvonAction.class);

		suite.addTestSuite(SimpleTypeAction.class);

		suite.addTestSuite(DurationAction.class);

		suite.addTestSuite(QNameAction.class);

		suite.addTestSuite(ListAction.class);
		suite.addTestSuite(SimplefeaturemapAction.class);
		suite.addTestSuite(RestrictionAction.class);
		suite.addTestSuite(GroupAction.class);
		suite.addTestSuite(NestedGroupAction.class);
		suite.addTestSuite(SubstitutionAction.class);

		/*
		 * // The anytype test is not yet supported by Hibernate //
		 * suite.addTestSuite(AnyTypeAction.class); // Listunion types are not yet supported by
		 * hibernate // suite.addTestSuite(ListUnionAction.class);
		 */
		// $JUnit-END$
		return suite;
	}
}
