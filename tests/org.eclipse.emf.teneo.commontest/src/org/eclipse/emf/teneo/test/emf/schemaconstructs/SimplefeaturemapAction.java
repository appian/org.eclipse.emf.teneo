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
 * $Id: SimplefeaturemapAction.java,v 1.4 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for a simple featuremap (derived features)
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class SimplefeaturemapAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SimplefeaturemapAction() {
		super(SimplefeaturemapPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store) {
		// test a simple type
		final SimplefeaturemapFactory factory = SimplefeaturemapFactory.eINSTANCE;
		{
			{
				store.beginTransaction();

				PurchaseOrder pref1 = factory.createPurchaseOrder();
				pref1.setName("preferred1");
				PurchaseOrder stand1 = factory.createPurchaseOrder();
				stand1.setName("standard1");
				PurchaseOrder stand2 = factory.createPurchaseOrder();
				stand2.setName("standard2");

				Supplier supplier = factory.createSupplier();
				supplier.setName("supplier");
				supplier.getOrders().add(SimplefeaturemapPackage.eINSTANCE.getSupplier_StandardOrders(),
						stand1);
				supplier.getOrders().add(SimplefeaturemapPackage.eINSTANCE.getSupplier_PreferredOrders(),
						pref1);
				supplier.getOrders().add(
						SimplefeaturemapPackage.eINSTANCE.getSupplier_HardCopyOrderReference(), "ref1");
				supplier.getOrders().add(
						SimplefeaturemapPackage.eINSTANCE.getSupplier_HardCopyOrderNumber(), new Long(1002));
				supplier.getOrders().add(SimplefeaturemapPackage.eINSTANCE.getSupplier_StandardOrders(),
						stand2);

				// EList standardList =
				supplier.getStandardOrders(); // returns the list of standard orders, there are 2
				EList preferredList = supplier.getPreferredOrders(); // returns the list of preferred
																															// orders, there is 1
				EList numberList = supplier.getHardCopyOrderNumber(); // returns the list of hard copy
																															// numbers
				// EList referenceList =
				supplier.getHardCopyOrderReference(); // returns the list hard copy references

				assertEquals(1002, ((Long) numberList.get(0)).longValue());
				assertEquals("preferred1", ((PurchaseOrder) preferredList.get(0)).getName());

				// Retrieve directly through the main featuremap member,
				// this is the same purchaseorder as in the previous step
				FeatureMap.Entry entry = (FeatureMap.Entry) supplier.getOrders().get(1);
				PurchaseOrder referencePO = (PurchaseOrder) entry.getValue();

				assertEquals("preferred1", referencePO.getName());

				store.store(supplier);
				store.commitTransaction();
			}
		}
	}
}