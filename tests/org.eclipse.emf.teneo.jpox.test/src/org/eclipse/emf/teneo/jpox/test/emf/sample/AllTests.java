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
 * $Id: AllTests.java,v 1.24 2007/07/11 14:42:56 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.sample.CatalogResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.ForumAction;
import org.eclipse.emf.teneo.test.emf.sample.InventoryAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryGlobalEagerAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.LibrarySerializationAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.RentalResourceReferenceAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.24 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite =
				new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.test.samples", JPOXTestbed.instance()
					.getConfigurations());

		suite.addTestSuite(LibraryTest.class);

		suite.addTestSuite(RentalResourceReferenceAction.class);

		suite.addTestSuite(ProductAction.class);
		suite.addTestSuite(LibraryPMControllerAction.class);

		suite.addTestSuite(LibrarySerializationAction.class);

		suite.addTestSuite(ExtendedPO2Test.class);

		suite.addTestSuite(LibraryResourceCutPasteAction.class);
		suite.addTestSuite(LibraryNonResolvingAction.class);

		suite.addTestSuite(LibraryValidateResourceAction.class);
		suite.addTestSuite(LibraryResourceAction.class);
		suite.addTestSuite(LibraryGlobalEagerAction.class);

		// suite.addTestSuite(WorkFlowAction.class);
		suite.addTestSuite(SunBooksAction.class);

		suite.addTestSuite(InventoryAction.class);
		suite.addTestSuite(CatalogResourceAction.class);

		suite.addTestSuite(AccountingTest.class);
		if (!JPOXTestbed.isRunningOnEMFTServer()) {
			suite.addTestSuite(SchoolLibraryTest.class);
			suite.addTestSuite(PlayImExportTest.class);
		}
		suite.addTestSuite(PlayAction.class);

		suite.addTestSuite(PrimerPOAction.class);
		suite.addTestSuite(ForumAction.class);
		suite.addTestSuite(CatalogTest.class);
		return suite;
	}
}
