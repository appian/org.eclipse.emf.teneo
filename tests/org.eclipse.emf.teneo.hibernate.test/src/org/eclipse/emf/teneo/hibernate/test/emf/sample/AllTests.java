/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AllTests.java,v 1.39 2007/04/17 15:49:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.sample.CarAction;
import org.eclipse.emf.teneo.test.emf.sample.CatalogResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.ClaimAction;
import org.eclipse.emf.teneo.test.emf.sample.FleetAction;
import org.eclipse.emf.teneo.test.emf.sample.ForumAction;
import org.eclipse.emf.teneo.test.emf.sample.InventoryAction;
import org.eclipse.emf.teneo.test.emf.sample.JuliaAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryCheckNameAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryColLengthAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryContainerFeatureIDBothAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryContainerFeatureIDFeatureIDAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryFKAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryGlobalEagerAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryJoinTableNamingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryListAsBagAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNonResolvingAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryNotifyingTestAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryQualifyActionHB;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceCutPasteAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceVisitTreeAction;
import org.eclipse.emf.teneo.test.emf.sample.LibrarySerializationAction;
import org.eclipse.emf.teneo.test.emf.sample.LibraryUseMappingFileAction;
import org.eclipse.emf.teneo.test.emf.sample.ListAsIdBagAction;
import org.eclipse.emf.teneo.test.emf.sample.MindMapAction;
import org.eclipse.emf.teneo.test.emf.sample.NoEscapeLibraryAction;
import org.eclipse.emf.teneo.test.emf.sample.PlayAction;
import org.eclipse.emf.teneo.test.emf.sample.PrimerPOAction;
import org.eclipse.emf.teneo.test.emf.sample.ProductAction;
import org.eclipse.emf.teneo.test.emf.sample.RentalMapAsClassAction;
import org.eclipse.emf.teneo.test.emf.sample.RentalResourceReferenceAction;
import org.eclipse.emf.teneo.test.emf.sample.SimpleLibraryResourceAction;
import org.eclipse.emf.teneo.test.emf.sample.SimpleRentalAction;
import org.eclipse.emf.teneo.test.emf.sample.SunBooksAction;
import org.eclipse.emf.teneo.test.emf.sample.WorkFlowAction;
import org.eclipse.emf.teneo.test.issues.ResourceUnloadAction;

/**
 * All sample tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.127 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite(
				"Test for org.eclipse.emf.teneo.hibernate.test.emf.sample", HibernateTestbed.instance()
						.getConfigurations());
		suite.addTestSuite(EfficientSizeTestAction.class);
		suite.addTestSuite(LibraryTest.class);
		suite.addTestSuite(LibraryEAVAction.class);
		suite.addTestSuite(DynamicEAVNoDBSchemaAction.class);
		suite.addTestSuite(DynamicNoDbSchemaUpdateAction.class);
		suite.addTestSuite(DynamicAction.class);
		suite.addTestSuite(DynamicEAVAction.class);
		suite.addTestSuite(DynamicEmbeddedIdAction.class);
		suite.addTestSuite(LibraryEAVExtraLazyAction.class);
		suite.addTestSuite(LibraryEAVResourceAction.class);

		suite.addTestSuite(ProductEAVTest.class);
		suite.addTestSuite(FleetEAVAction.class);
		suite.addTestSuite(TestDoubleEAV.class);
		suite.addTestSuite(EcoreEAVAction.class);
		suite.addTestSuite(LibraryExtraLazyMoreAction.class);
		suite.addTestSuite(LibraryExtraLazyJoinMoreAction.class);
		suite.addTestSuite(LibraryExtraLazyAction.class);
		suite.addTestSuite(TestLazyUtilsAction.class);
		suite.addTestSuite(LibrarySerializationAction.class);
		suite.addTestSuite(EmployeeAction.class);
		suite.addTestSuite(LibraryResourceAction.class);
		suite.addTestSuite(LibrarySessionControllerAction.class);
		suite.addTestSuite(ClaimAction.class);

		suite.addTestSuite(Bz292973.class);
		suite.addTestSuite(ProductAction.class);

		suite.addTestSuite(LibraryColLengthAction.class);

		suite.addTestSuite(LibrarySessionControllerAddContentAction.class);

		// suite.addTestSuite(LibraryLargeAction.class);
		suite.addTestSuite(LibraryNotifyingTestAction.class);
		suite.addTestSuite(LibraryContainerFeatureIDFeatureIDAction.class);
		suite.addTestSuite(LibraryContainerFeatureIDBothAction.class);

		suite.addTestSuite(FleetAction.class);

		suite.addTestSuite(ListAsIdBagAction.class);

		suite.addTestSuite(LibraryResourceVisitTreeAction.class);

		suite.addTestSuite(LibraryInterfaceQueryTest.class);

		suite.addTestSuite(SchoolLibraryTest.class);

		suite.addTestSuite(ResourceUnloadAction.class);

		suite.addTestSuite(SimpleLibraryResourceAction.class);

		suite.addTestSuite(LibraryUseMappingFileAction.class);

		suite.addTestSuite(LibraryCheckNameAction.class);

		suite.addTestSuite(LibraryFKAction.class);

		suite.addTestSuite(RentalMapAsClassAction.class);

		suite.addTestSuite(NoEscapeLibraryAction.class);

		suite.addTestSuite(JuliaAction.class);
		suite.addTestSuite(SimpleRentalAction.class);
		suite.addTestSuite(LibraryResourceCutPasteAction.class);

		suite.addTestSuite(LibraryJoinTableNamingAction.class);

		suite.addTestSuite(CarAction.class);

		suite.addTestSuite(CatalogTest.class);

		suite.addTestSuite(PrimerPOAction.class);

		suite.addTestSuite(LibraryQualifyActionHB.class);

		suite.addTestSuite(ExtendedPO2Test.class);

		suite.addTestSuite(RentalResourceReferenceAction.class);

		suite.addTestSuite(LibraryListAsBagAction.class);

		suite.addTestSuite(CapaTest.class);

		suite.addTestSuite(LibraryNonResolvingAction.class);

		suite.addTestSuite(AccountingTest.class);

		// suite.addTestSuite(YahooAction.class);
		suite.addTestSuite(MindMapAction.class);

		// suite.addTestSuite(GMFNotationAction.class);
		// this test works with ms sql server but not with mysql

		// suite.addTestSuite(ExtLibraryAction.class);
		suite.addTestSuite(DetachFromSessionAction.class);

		suite.addTestSuite(SunBooksAction.class);
		// suite.addTestSuite(WoWAction.class);
		suite.addTestSuite(InventoryAction.class);
		suite.addTestSuite(LibraryValidateResourceTest.class);
		suite.addTestSuite(CatalogResourceAction.class);

		suite.addTestSuite(LibraryGlobalEagerAction.class);
		suite.addTestSuite(PlayAction.class);
		suite.addTestSuite(WorkFlowAction.class);
		suite.addTestSuite(ForumAction.class);

		return suite;
	}
}
