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
 * $Id: ExtendedPO2Action.java,v 1.5 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Factory;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Item;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the extended po 2 example
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ $Date: 2007/06/29 07:35:43 $
 */
public abstract class ExtendedPO2Action extends AbstractTestAction {
	public ExtendedPO2Action() {
		super(EPO2Package.eINSTANCE);
	}

	/** Stores a TopModel Object */
	@Override
	public void doAction(TestStore store) {
		final EPO2Factory factory = EPO2Factory.eINSTANCE;
		{
			Supplier supplier = factory.createSupplier(); // This is the root. Keep it ....
			supplier.setName("Computer City");

			PurchaseOrder po = factory.createPurchaseOrder();
			supplier.getOrders().add(po);
			PurchaseOrder prevpo = factory.createPurchaseOrder();
			supplier.getOrders().add(prevpo);

			po.setComment("a new purchase order");
			prevpo.setComment("the previous purchase order");

			USAddress adr = factory.createUSAddress();
			adr.setCity("Doorn");
			adr.setCountry("Netherlands");
			adr.setName("M. Taal");
			adr.setState("Utrecht");
			adr.setStreet("Nassaulaan 7");
			adr.setZip(3941);

			USAddress adr1 = factory.createUSAddress();
			adr1.setCity("Doorn");
			adr1.setCountry("Netherlands");
			adr1.setName("M. Taal");
			adr1.setState("Utrecht");
			adr1.setStreet("Nassaulaan 7");
			adr1.setZip(3941);

			// both have same billto
			po.setBillTo(adr);
			prevpo.setBillTo(adr1);

			po.setOrderDate(new Date());
			Calendar cal = new GregorianCalendar();
			cal.add(Calendar.DAY_OF_MONTH, -5);
			prevpo.setOrderDate(cal.getTime());

			Customer cust = factory.createCustomer();
			supplier.getCustomers().add(cust);
			cust.setCustomerID(5000);
			cust.getOrders().add(po); // Added by DSC for JCR validation. Remove later....
			cust.getOrders().add(prevpo); // Added by DSC for JCR validation. Remove later....
			po.setCustomer(cust);
			prevpo.setCustomer(cust);

			GlobalAddress globadr = factory.createGlobalAddress();
			globadr.setCountry("Belgium");
			globadr.setCountryCode(36);
			globadr.setName("Belgium Office");
			globadr.getLocation().add("MY GLOBAL LOCATION");

			GlobalAddress globadr1 = factory.createGlobalAddress();
			globadr1.setCountry("Belgium");
			globadr1.setCountryCode(36);
			globadr1.setName("Belgium Office");
			globadr1.getLocation().add("MY GLOBAL LOCATION");

			// both have same shipto
			po.setShipTo(globadr);
			prevpo.setShipTo(globadr1);

			po.setStatus(OrderStatus.COMPLETE_LITERAL);
			prevpo.setStatus(OrderStatus.BACK_ORDER_LITERAL);

			Item item = factory.createItem();
			item.setComment("I like this product");
			item.setPartNum("500.11.22");
			item.setProductName("Dell Latitude");
			item.setQuantity(50);
			item.setShipDate(new Date());
			item.setOrder(po); // Added by DSC for JCR validation. Remove later....

			Item item2 = factory.createItem();
			item2.setComment("A few of these for me.");
			item2.setPartNum("500.11.2000");
			item2.setProductName("Sun Opteron Workstation");
			item2.setQuantity(200);
			item2.setShipDate(new Date());
			item2.setOrder(prevpo); // Added by DSC for JCR validation. Remove later....

			po.getItems().add(item);
			prevpo.getItems().add(item2);
			po.setPreviousOrder(prevpo);
			store.beginTransaction();
			store.store(supplier);
			store.commitTransaction();
			/*
			 * final Resource res = store.getResource(); res.getContents().add(supplier); try {
			 * res.save(Collections.EMPTY_MAP); } catch (IOException e) { throw new
			 * StoreTestException("IOException", e); }
			 */
		}

		{
			store.beginTransaction();
			// final Resource res2 = store.getResource();
			// Supplier supplierTest = (Supplier)res2.getContents().get(0);
			Supplier supplierTest = (Supplier) store.getObject(Supplier.class);
			List<?> customers = supplierTest.getCustomers();
			assertNotNull(customers);
			assertTrue(customers.size() == 1);
			assertNotNull(customers.get(0));
			assertTrue(((Customer) customers.get(0)).getCustomerID() > 0);
			assertNotNull(((Customer) customers.get(0)).getOrders());
			assertTrue(((Customer) customers.get(0)).getOrders().size() == 2);
			for (Object name : supplierTest.getOrders()) {
				PurchaseOrder potest = (PurchaseOrder) name;
				assertNotNull(potest.getStatus().getLiteral());
				assertTrue(potest.getItems().size() > 0);
				Item itemtest = potest.getItems().get(0);
				assertNotNull(itemtest.eContainer());
				assertNotNull(itemtest.getOrder());
				assertNotNull(itemtest.getShipDate());
				assertNotNull(itemtest.getPartNum());
				assertNotNull(potest.getCustomer());
				USAddress billTo = (USAddress) potest.getBillTo();
				assertNotNull(billTo);
				assertNotNull(billTo.getStreet());
				GlobalAddress shipTo = (GlobalAddress) potest.getShipTo();
				assertNotNull(shipTo);
				assertTrue(shipTo.getCountryCode() > 0);
			}
			store.commitTransaction();
		}

		checkContainerForSeparatelyReadItem(store);
	}

	protected abstract void checkContainerForSeparatelyReadItem(TestStore store);
	// TODO jpox was
	// // if a contained item is read separately from the db then the
	// // container is not set!
	// if (store instanceof JPOXTestStore)
	// {
	// store.beginTransaction();
	// Item itemtest2 = (Item)store.getObject(Item.class);
	// assertTrue(itemtest2.eContainer() == null);
	// store.commitTransaction();
	// }
}
