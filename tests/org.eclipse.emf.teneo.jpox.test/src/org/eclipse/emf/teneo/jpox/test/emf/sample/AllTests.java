/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.34 2009/02/25 10:48:25 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.sample.CarAction;
import org.eclipse.emf.teneo.test.emf.sample.CatalogResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.ForumAction;
import org.eclipse.emf.teneo.test.emf.sample.InventoryAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryFKAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryGlobalEagerAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.LibrarySerializationAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.SimpleLibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.34 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite(
				"Test for org.eclipse.emf.teneo.test.samples", JPOXTestbed
						.instance().getConfigurations());

		// suite.addTestSuite(LibraryLargeAction.class);

		suite.addTestSuite(LibraryResourceAction.class);

		suite.addTestSuite(SimpleLibraryResourceAction.class);

		suite.addTestSuite(LibrarySerializationAction.class);
		suite.addTestSuite(CarAction.class);

		suite.addTestSuite(LibraryFKAction.class);
		suite.addTestSuite(LibraryTest.class);

		// suite.addTestSuite(RentalResourceReferenceAction.class);

		suite.addTestSuite(ProductAction.class);
		suite.addTestSuite(LibraryPMControllerAction.class);

		// suite.addTestSuite(ExtendedPO2Test.class);

		suite.addTestSuite(LibraryResourceCutPasteAction.class);
		if (!JPOXTestbed.isRunningOnEMFTServer()) {
			suite.addTestSuite(LibraryNonResolvingAction.class);
		}

		suite.addTestSuite(LibraryValidateResourceAction.class);
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
