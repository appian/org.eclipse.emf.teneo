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
 * $Id: MTMSameAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.teneo.samples.issues.mtmsame.Item;
import org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsameFactory;
import org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests an mtm relation to itself.
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class MTMSameAction extends AbstractTestAction 
{
	/** The number of testitems created */
	private static int NO_ITEMS = 10;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public MTMSameAction()  
	{
		super(MtmsamePackage.eINSTANCE);
	}
	
	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final MtmsameFactory factory = MtmsameFactory.eINSTANCE;
    	{
    		store.beginTransaction();

    		final ArrayList myItems = new ArrayList();
	        for (int i = 0; i < NO_ITEMS; i++)
	        {
	        	final Item myitem = factory.createItem();
	        	myitem.setName("myname_" + i);
	        	myItems.add(myitem);
	        }
	        for (int i = 0; i < NO_ITEMS; i++)
	        {
	        	final Item item = (Item)myItems.get(i);
	        	for (int j = 0; j < NO_ITEMS; j++) {
	        		item.getYourSide().add(myItems.get(j));
	        	}
	        	store.store(item);
	        }
	        store.commitTransaction();
    	}
    	
    	{
    		store.beginTransaction();
    		List list = store.getObjects(Item.class);
    		assertTrue(list.size() == NO_ITEMS);
    		for (int i = 0; i < list.size(); i++)
    		{
    			assertEquals(NO_ITEMS, ((Item)list.get(i)).getYourSide().size());
    			((Item)list.get(i)).getYourSide().remove(i);
    		}
	        store.commitTransaction();
    	}

    	{
    		store.beginTransaction();
    		List list = store.getObjects(Item.class);
    		assertTrue(list.size() == NO_ITEMS);
    		for (int i = 0; i < list.size(); i++)
    		{
    			assertEquals(NO_ITEMS - 1, ((Item)list.get(i)).getYourSide().size());
    		}
	        store.commitTransaction();
    	}
	}	
}
