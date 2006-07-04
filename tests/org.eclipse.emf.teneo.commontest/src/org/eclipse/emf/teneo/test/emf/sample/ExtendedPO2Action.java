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
 * $Id: ExtendedPO2Action.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Date;

import org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Factory;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Item;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the extended po 2 example
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/04 22:12:15 $
*/
public abstract class ExtendedPO2Action extends AbstractTestAction 
{
	public ExtendedPO2Action() 
	{
		super(EPO2Package.eINSTANCE);
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store)
	{		
        final EPO2Factory factory = EPO2Factory.eINSTANCE;

        store.beginTransaction();
		
		PurchaseOrder po = factory.createPurchaseOrder();

		po.setComment("my comment");
		
		USAddress adr = factory.createUSAddress();
		adr.setCity("Doorn");
		adr.setCountry("Netherlands");
		adr.setName("M. Taal");
		adr.setState("Utrecht");
		adr.setStreet("Nassaulaan 7");
		adr.setZip(3941);
		po.setBillTo(adr);
		
		po.setOrderDate(new Date());
		
		Customer cust = factory.createCustomer();
		cust.setCustomerID(5000);
		po.setCustomer(cust);
		
		GlobalAddress globadr = factory.createGlobalAddress();
		globadr.setCountry("Belgium");
		globadr.setCountryCode(36);
		globadr.setName("Belgium Office");
		globadr.getLocation().add("MY GLOBAL LOCATION");
		po.setShipTo(globadr);
		
		po.setStatus(OrderStatus.COMPLETE_LITERAL);

		Item item = factory.createItem();
		item.setComment("I like this product");
		item.setPartNum("500.11.22");
		item.setProductName("Dell Latitude");
		item.setQuantity(50);
		item.setShipDate(new Date());
		
		po.getItems().add(item);
		store.store(po);
		store.commitTransaction();
		
		store.beginTransaction();
		PurchaseOrder potest = (PurchaseOrder)store.getObject(PurchaseOrder.class);
		Item itemtest = (Item)potest.getItems().get(0);
		assertTrue(itemtest.eContainer() != null);
		assertTrue(potest.getCustomer() != null);
		store.commitTransaction();

		checkContainerForSeparatelyReadItem(store);
	}

	protected abstract void checkContainerForSeparatelyReadItem(TestStore store);
//	TODO jpox was
//		// if a contained item is read separately from the db then the 
//		// container is not set!
//		if (store instanceof JPOXTestStore)
//		{
//			store.beginTransaction();
//			Item itemtest2 = (Item)store.getObject(Item.class);
//			assertTrue(itemtest2.eContainer() == null);
//			store.commitTransaction();
//		}
}
