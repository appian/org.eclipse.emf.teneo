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
 * $Id: SetResourceAction.java,v 1.2 2006/09/21 00:57:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem;
import org.eclipse.emf.teneo.samples.emf.annotations.set.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a resource. Actually tests bidirectional 
 * references using resources. Most other aspects of resources are handled in the Catalog example.
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class SetResourceAction extends AbstractTestAction 
{
	/** The number of testitems created */
	private static int NO_ITEMS = 10;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SetResourceAction()  
	{
		super(SetPackage.eINSTANCE);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
	protected boolean hibernateEnabled() 
	{
		return true;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final SetFactory factory = SetFactory.eINSTANCE;
		
		// create a book, writer and library
		try
		{
			ArrayList names = new ArrayList();
			ArrayList cnames = new ArrayList();
	    	{
	    		Resource res = store.getResource();
		        res.load(null);
		        
		        final ItemList list = factory.createItemList();
		        list.setName("name");
		        
		        for (int i = 0; i < NO_ITEMS; i++)
		        {
		        	final Item item = factory.createItem();
		        	item.setName("name_" + i);
		        	names.add("name_" + i);		        	
		        	list.getItem().add(item);
		        	
		        	final ContainedItem citem = factory.createContainedItem();
		        	citem.setName("cname_" + i);
		        	cnames.add("cname_" + i);
		        	list.getContainedItem().add(citem);

		        	final Item joinedItem = factory.createItem();
		        	joinedItem.setName("joinedname_" + i);
		        	list.getJoinedItem().add(joinedItem);
		        }
		        
		        res.getContents().add(list);
		        res.save(null);
				res.unload();
	    	}
	    	
	    	// remove(i), removeAll, move
	    	{
	    		Resource res = store.getResource();
	    		res.load(null);
	    		ItemList list = null;
	    		for (int i = 0; i < res.getContents().size(); i++)
	    		{
	    			if (res.getContents().get(i) instanceof ItemList)
	    			{
		    			list = (ItemList)res.getContents().get(i);
	    			}
	    		}
	    		
	    		assertEquals(NO_ITEMS, list.getItem().size());
	    		assertEquals(NO_ITEMS, list.getContainedItem().size());
	    		assertEquals(NO_ITEMS, list.getJoinedItem().size());
	    		
	    		// do some actions
	    		// remove from a certain position
	    		for (int i = 0; i < list.getContainedItem().size(); i++)
	    		{
	    			assertEquals(list, ((InternalEObject)list.getContainedItem().get(i)).eContainer());
	    			if ((i % 2) == 0)
	    			{
	    				ContainedItem citem = (ContainedItem)list.getContainedItem().get(i);
	    				cnames.remove(citem.getName()); // remove from here to check later
	    				list.getContainedItem().remove(i);
	    			}
	    		}
	    		
	    		// test removeall
	    		ArrayList tobeDeleted = new ArrayList();
	    		for (int i = 0; i < NO_ITEMS; i++)
	    		{
	    			assertTrue(list == ((Item)list.getItem().get(i)).getItemList());
	    			if ((i % 2) == 0)
	    			{
	    				tobeDeleted.add(list.getItem().get(i));
	    				names.remove(((Item)list.getItem().get(i)).getName());
	    			}
	    		}
	    		list.getItem().removeAll(tobeDeleted);
	    		assertEquals(names.size(), list.getItem().size());
	    		
	    		// test move (should not really change anything)
	    		Object obj = list.getItem().get(3);
	    		list.getItem().move(1, 3);
	    		assertEquals(1, list.getItem().indexOf(obj));
	    		
	    		res.save(null);
				res.unload();
	    	}

	    	int newCount = 0;
	    	{
	    		Resource res = store.getResource();
	    		res.load(null);
	    		ItemList list = null;
	    		for (int i = 0; i < res.getContents().size(); i++)
	    		{
	    			if (res.getContents().get(i) instanceof ItemList)
	    			{
		    			list = (ItemList)res.getContents().get(i);
	    			}
	    		}

	    		ArrayList checkNames = new ArrayList(names);
	    		for (int i = 0; i < list.getItem().size(); i++)
	    		{
	    			assertTrue(checkNames.remove(((Item)list.getItem().get(i)).getName()));
	    		}
	    		assertEquals(0, checkNames.size());

	    		ArrayList checkCNames = new ArrayList(cnames);
	    		for (int i = 0; i < list.getContainedItem().size(); i++)
	    		{
	    			assertTrue(checkCNames.remove(((ContainedItem)list.getContainedItem().get(i)).getName()));
	    		}
	    		assertEquals(0, checkCNames.size());
	    		
	    		final ArrayList newList = new ArrayList();
	    		newCount = list.getItem().size();
	    		for (int i = 0; i < NO_ITEMS; i++)
	    		{
	    			final Item item = SetFactory.eINSTANCE.createItem();
	    			item.setName("do " + i);
	    			newList.add(item);
	    			newCount++;
	    		}
	    		List myList = list.getItem();
	    		myList.addAll(newList);
	    		res.save(null);
				res.unload();
	    	}
	    	
	    	{
	    		Resource res = store.getResource();
	    		res.load(null);
	    		ItemList list = null;
	    		for (int i = 0; i < res.getContents().size(); i++)
	    		{
	    			if (res.getContents().get(i) instanceof ItemList)
	    			{
		    			list = (ItemList)res.getContents().get(i);
	    			}
	    		}
	    		assertEquals(newCount, list.getItem().size());
	    		res.save(null);
				res.unload();
	    	}
		}
		catch (IOException e)
		{
			throw new StoreTestException("IOException during save", e);
		}
	}	
}
