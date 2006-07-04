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
 * $Id: PrimerPOAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PrimerpoFactory;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PrimerpoPackage;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class PrimerPOAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public PrimerPOAction() 
	{
		super(PrimerpoPackage.eINSTANCE);
	}
	
	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
    	{
    		store.beginTransaction();
	        final PrimerpoFactory factory = PrimerpoFactory.eINSTANCE;		        
	        final Item item = factory.createItem();
	        item.setComment("This is my test item");
	        item.setPartNum("partnumber");
	        item.setProductName("productname");
	        item.setQuantity(new BigInteger("500"));
	        item.setUSPrice(new BigDecimal(50.123));
	        item.setShipDate(new Date());

	        final Item item2 = factory.createItem();
	        item2.setComment("This is my second test item");
	        item2.setPartNum("partnumber");
	        item2.setProductName("productname");
	        item2.setQuantity(new BigInteger("500"));
	        item2.setUSPrice(new BigDecimal(50.123));
	        item2.setShipDate(new Date());
	        
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
	        po.setOrderDate(new Date());

	        store.store(po);
	        store.commitTransaction();
    	}
	}	
}
