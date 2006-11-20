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
 * $Id: AllGenerateTests.java,v 1.10 2006/11/20 08:17:55 mtaal Exp $
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
import org.eclipse.emf.teneo.test.emf.sample.LibrarySerializationAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.MindMapAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;
import org.eclipse.emf.teneo.test.emf.sample.WorkFlowAction;

import extlibrary.ExtLibraryAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
public class AllGenerateTests {
	public static Test suite() {
		MultiCfgTestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.test.samples", JPOXTestbed
				.instance().getConfigurations());
		suite.addTest(new JPOXGenerateTest(LibraryPMControllerAction.class));

		suite.addTest(new JPOXGenerateTest(LibraryTest.testAction));
		suite.addTest(new JPOXGenerateTest(LibraryResourceCutPasteAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryNonResolvingAction.class));
		
		suite.addTest(new JPOXGenerateTest(LibrarySerializationAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryResourceAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryValidateResourceAction.class));
		suite.addTest(new JPOXGenerateTest(LibraryGlobalEagerAction.class));

		suite.addTest(new JPOXGenerateTest(WorkFlowAction.class));
		suite.addTest(new JPOXGenerateTest(SunBooksAction.class));
		
		suite.addTest(new JPOXGenerateTest(ExtLibraryAction.class));

		suite.addTest(new JPOXGenerateTest(InventoryAction.class));
		suite.addTest(new JPOXGenerateTest(CatalogResourceAction.class));

		suite.addTest(new JPOXGenerateTest(SchoolLibraryTest.testAction));
		suite.addTest(new JPOXGenerateTest(ExtendedPO2Test.testAction));
		
		suite.addTest(new JPOXGenerateTest(AccountingTest.testAction));

		suite.addTest(new JPOXGenerateTest(PlayImExportTest.testAction));
		suite.addTest(new JPOXGenerateTest(PlayAction.class));

		suite.addTest(new JPOXGenerateTest(ProductAction.class));
		suite.addTest(new JPOXGenerateTest(PrimerPOAction.class));
		suite.addTest(new JPOXGenerateTest(ForumAction.class));
		suite.addTest(new JPOXGenerateTest(CatalogTest.testAction));
		
		return suite;
	}
}
