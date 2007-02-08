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
 * $Id: SetAction.java,v 1.6 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem;
import org.eclipse.emf.teneo.samples.emf.annotations.set.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test 1n relation (contained and non-contained) using sets.
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $ 
*/
public class SetAction extends AbstractTestAction 
{
	/** The number of testitems created */
	private static int NO_ITEMS = 10;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SetAction()  
	{
		super(SetPackage.eINSTANCE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.QUALIFY_ENTITY_NAME, PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX);
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
  		final SetFactory factory = SetFactory.eINSTANCE;
		// create a book, writer and library
		ArrayList names = new ArrayList();
		ArrayList cnames = new ArrayList();
	    	{
	    		store.beginTransaction();
		        
	        final ItemList list = factory.createItemList();
	        list.setName("mylist");
	        
	        for (int i = 0; i < NO_ITEMS; i++)
	        {
		        	final Item item = factory.createItem();
		        	item.setName("name_" + i);
		        	names.add("name_" + i);
		        	
		        	list.getItem().add(item);
		        	list.getJoinedItem().add(item);
		        	
		        	final ContainedItem citem = factory.createContainedItem();
		        	citem.setName("cname_" + i);
		        	cnames.add("cname_" + i);
		        	list.getContainedItem().add(citem);
	        }

	        store.store(list);
	        store.commitTransaction();
	    	}
	    	
	    	// remove(i), removeAll, move
	    	int removedContainedItems = 0;
	    	{
	    		store.beginTransaction();
	    		ItemList list = (ItemList)store.getObject(ItemList.class);
	    		
	    		assertEquals(NO_ITEMS, list.getItem().size());
	    		assertEquals(NO_ITEMS, list.getContainedItem().size());
	    		
	    		// do some actions
	    		// remove from a certain position
	    		for (int i = 0; i < list.getContainedItem().size(); i++)
	    		{
	    			assertEquals(list, ((InternalEObject)list.getContainedItem().get(i)).eContainer());
	    			
	    			if ((i % 2) == 0)
	    			{
	    				String name = ((ContainedItem)list.getContainedItem().get(i)).getName();
	    				list.getContainedItem().remove(i);
	    				removedContainedItems++;
	    				cnames.remove(name); // remove from here to check later
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
	    		for (Object o : tobeDeleted) {
	    			list.getItem().remove(o);
	    		}
	    		assertEquals(names.size(), list.getItem().size());
	    		
	    		// test move (should not really change anything)
	    		Object obj = list.getItem().get(3);
	    		list.getItem().move(1, 3);
	    		assertEquals(1, list.getItem().indexOf(obj));
	    		
	    		store.store(list);
	    		store.commitTransaction();
	    	}
	
	    	int newCount = 0;
	    	{
	    		store.beginTransaction();
	    		ItemList list = (ItemList)store.getObject(ItemList.class);
	
	    		ArrayList checkNames = new ArrayList(names);
	    		String lastName = "name_zzzz";
	    		for (int i = 0; i < list.getItem().size(); i++)
	    		{
	    			assertTrue(((Item)list.getItem().get(i)).getName().compareTo(lastName) < 0);
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
	    			list.getItem().add(item);
	    		}
	    		//list.getItem().addAll(newList);
	
	    		store.store(list);
	    		store.commitTransaction();
	    	}
	    	{
	    		store.beginTransaction();
	    		ItemList list = (ItemList)store.getObject(ItemList.class);
	    		assertEquals(newCount, list.getItem().size());
	
	    		// all contained items should have been deleted
	    		assertEquals(NO_ITEMS - removedContainedItems, store.getObjects(ContainedItem.class).size());
	    		
	    		store.store(list);
	    		store.commitTransaction();
	    	}
	}	
}