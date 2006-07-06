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
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryQualifyActionHB;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;
import org.eclipse.emf.teneo.test.emf.sample.WorkFlowAction;

/**
 * All sample tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.sample", HibernateTestbed.instance()
				.getConfigurations());
		suite.addTestSuite(LibraryNonResolvingAction.class);
		suite.addTestSuite(LibraryAction.class);

		suite.addTestSuite(DynamicAction.class);
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
		suite.addTestSuite(ExtendedPO2Test.class);
		suite.addTestSuite(PrimerPOAction.class);
		suite.addTestSuite(ProductAction.class);
		suite.addTestSuite(WorkFlowAction.class);
		suite.addTestSuite(ForumAction.class);
		return suite;
	}
}
