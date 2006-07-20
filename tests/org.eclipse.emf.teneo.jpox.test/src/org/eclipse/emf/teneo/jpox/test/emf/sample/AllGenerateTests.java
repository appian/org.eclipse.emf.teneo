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
package org.eclipse.emf.teneo.jpox.test.emf.sample;

import junit.framework.Test;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.sample.CatalogResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.ForumAction;
import org.eclipse.emf.teneo.test.emf.sample.InventoryAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryGlobalEagerAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;
import org.eclipse.emf.teneo.test.emf.sample.WorkFlowAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class AllGenerateTests {
	public static Test suite() {
		MultiCfgTestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.test.samples", JPOXTestbed
				.instance().getConfigurations());

		suite.addTest(new JPOXGenerateTest(LibraryTest.testAction));

		suite.addTest(new JPOXGenerateTest(InventoryAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryResourceAction.class));
		suite.addTest(new JPOXGenerateTest(SunBooksAction.class));
		suite.addTest(new JPOXGenerateTest(WorkFlowAction.class));
		suite.addTest(new JPOXGenerateTest(SchoolLibraryTest.testAction));
		suite.addTest(new JPOXGenerateTest(ExtendedPO2Test.testAction));
		suite.addTest(new JPOXGenerateTest(PlayImExportTest.testAction));
		suite.addTest(new JPOXGenerateTest(PlayAction.class));

		suite.addTest(new JPOXGenerateTest(LibraryResourceCutPasteAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryValidateResourceAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryGlobalEagerAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryNonResolvingAction.class));
		suite.addTest(new JPOXGenerateTest(ProductAction.class));
		suite.addTest(new JPOXGenerateTest(PrimerPOAction.class));
		suite.addTest(new JPOXGenerateTest(ForumAction.class));
		suite.addTest(new JPOXGenerateTest(CatalogResourceAction.class));
		suite.addTest(new JPOXGenerateTest(CatalogTest.testAction));
		suite.addTest(new JPOXGenerateTest(AccountingTest.testAction));
		return suite;
	}
}
