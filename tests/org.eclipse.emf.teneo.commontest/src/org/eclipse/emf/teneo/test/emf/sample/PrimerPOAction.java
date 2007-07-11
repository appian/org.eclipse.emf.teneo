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
 * $Id: PrimerPOAction.java,v 1.5 2007/07/11 14:42:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoFactory;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class PrimerPOAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public PrimerPOAction() {
		super(SchemaprimerpoPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final SchemaprimerpoFactory factory = SchemaprimerpoFactory.eINSTANCE;
			final Item item = factory.createItem();
			item.setComment("This is my test item");
			item.setPartNum("partnumber");
			item.setProductName("productname");
			item.setQuantity(new BigInteger("500"));
			item.setUSPrice(new BigDecimal(50.123));
			item.setShipDate((XMLGregorianCalendar) store.getDate(new Date()));

			final Item item2 = factory.createItem();
			item2.setComment("This is my second test item");
			item2.setPartNum("partnumber");
			item2.setProductName("productname");
			item2.setQuantity(new BigInteger("500"));
			item2.setUSPrice(new BigDecimal(50.123));
			item2.setShipDate((XMLGregorianCalendar) store.getDate(new Date()));

			final USAddress addr = factory.createUSAddress();
			addr.setCity("c");
			addr.setCountry("country");
			addr.setName("name");
			addr.setState("state");
			addr.setStreet("street");
			addr.setZip(new BigDecimal("3941"));

			final PurchaseOrder po = factory.createPurchaseOrder();
			po.setComment("this is my comment");
			po.setBillTo(addr);
			po.getItems().add(item);
			po.getItems().add(item2);
			po.setOrderDate((XMLGregorianCalendar) store.getDate(new Date()));

			store.store(po);
			store.commitTransaction();
		}
	}
}
