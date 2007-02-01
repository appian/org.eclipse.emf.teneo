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
 * $Id: ListAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for: xsd:list  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class ListAction extends AbstractTestAction 
{
	/** The number of test objects created */
	private static final int NO_TEST_OBJECTS = 5;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public ListAction() 
	{
		super(ListPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final ListFactory factory = ListFactory.eINSTANCE;
        
        // store an all type
    	{
	        store.beginTransaction();
	        
	        for (int i = 0; i < NO_TEST_OBJECTS; i++)
	        {
		        statesByCountry sbc = factory.createstatesByCountry();
		        sbc.setCountry(i + "NL");
		        sbc.setIndex(i);
		        final ArrayList allStates = new ArrayList();
		        for (int j = 0; j < i; j++)
		        {
			        allStates.add(j + "AL");
		        }
		        sbc.setAllStates(allStates);
		        final ArrayList sixStates = new ArrayList();
		        for (int j = 0; j < i; j++)
		        {
			        sixStates.add(j + "AR");
		        }
		        sbc.setSixImportantStates(sixStates);
		        
		        store.store(sbc);
	        }
	        store.commitTransaction();
    	}
    	
    	{
    		store.beginTransaction();
    		final Collection coll = store.getObjects(statesByCountry.class);
    		assertEquals(NO_TEST_OBJECTS, coll.size());
    		final Iterator it = coll.iterator();
    		while (it.hasNext())
    		{
    			final statesByCountry sbc = (statesByCountry)it.next();
    			int cnt = sbc.getIndex();
    			assertEquals(cnt + "NL", sbc.getCountry());
    			for (int i = 0; i < cnt; i++)
    			{
    				assertEquals(i + "AL", sbc.getAllStates().get(i));
    				assertEquals(i + "AR", sbc.getSixImportantStates().get(i));
    			}
    		}
    		store.commitTransaction();
    	}
 	}
	
}