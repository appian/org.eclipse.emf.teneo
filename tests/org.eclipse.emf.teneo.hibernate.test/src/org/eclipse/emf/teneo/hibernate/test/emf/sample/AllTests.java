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
 * $Id: AllTests.java,v 1.20 2006/11/12 00:19:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.sample.CatalogResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.DynamicAction;
import org.eclipse.emf.teneo.test.emf.sample.ForumAction;
import org.eclipse.emf.teneo.test.emf.sample.InventoryAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryColLengthAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryGlobalEagerAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryJoinTableNamingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryQualifyActionHB;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.LibrarySerializationAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;
import org.eclipse.emf.teneo.test.emf.sample.WorkFlowAction;

/**
 * All sample tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.20 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.sample", HibernateTestbed.instance()
				.getConfigurations());
	//	suite.addTestSuite(YahooAction.class);

		suite.addTestSuite(ExtendedPO2Test.class);
		suite.addTestSuite(LibrarySerializationAction.class);

		//		suite.addTestSuite(GMFNotationAction.class);
		// this test works with ms sql server but not with mysql
		//suite.addTestSuite(EcoreAction.class);
		suite.addTestSuite(LibraryJoinTableNamingAction.class);

		suite.addTestSuite(LibraryAction.class);

		suite.addTestSuite(LibrarySessionControllerAction.class);

		suite.addTestSuite(DynamicAction.class);

		//	suite.addTestSuite(ExtLibraryAction.class);
		suite.addTestSuite(CapaTest.class);

		suite.addTestSuite(DetachFromSessionAction.class);
		
		suite.addTestSuite(LibraryNonResolvingAction.class);

		suite.addTestSuite(AccountingTest.class);
		suite.addTestSuite(SunBooksAction.class);
		suite.addTestSuite(LibraryTest.class);
		suite.addTestSuite(SchoolLibraryTest.class);
		//suite.addTestSuite(WoWAction.class);
		suite.addTestSuite(CatalogTest.class);
		suite.addTestSuite(InventoryAction.class);
		suite.addTestSuite(LibraryColLengthAction.class);
		suite.addTestSuite(LibraryResourceCutPasteAction.class);
		suite.addTestSuite(LibraryValidateResourceTest.class);
		suite.addTestSuite(CatalogResourceAction.class);

		suite.addTestSuite(LibraryQualifyActionHB.class);
		suite.addTestSuite(LibraryGlobalEagerAction.class);
		suite.addTestSuite(LibraryResourceAction.class);
		suite.addTestSuite(PlayAction.class);
		suite.addTestSuite(PrimerPOAction.class);
		suite.addTestSuite(ProductAction.class);
		suite.addTestSuite(WorkFlowAction.class);
		suite.addTestSuite(ForumAction.class);
		return suite;
	}
}
