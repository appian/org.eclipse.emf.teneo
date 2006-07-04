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
 * $Id: TransientAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;


import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.transent.Body;
import org.eclipse.emf.teneo.samples.emf.annotations.transent.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test transient eclass
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
*/
public class TransientAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public TransientAction()  
	{
		super(TransentPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final TransentFactory factory = TransentFactory.eINSTANCE;
	    	{
	    		store.beginTransaction();
	    		Body bd = factory.createBody();
	    		bd.setTheID(5);
	    		Head hd = factory.createHead();
	    		hd.setMyID(5);
	    		bd.setHead(hd);
	    		store.store(bd);
	    		store.commitTransaction();
	    	}
	    	{
	    		store.beginTransaction();
	    		Body bd = (Body)store.getObject(Body.class);
	    		assertEquals(null, bd.getHead());
	    		store.commitTransaction();
	    	}
	    	{
	    		store.beginTransaction();
	    		try {
		    		List list = store.getObjects(Head.class);
	    			store.commitTransaction();
	    			fail("head is not mapped!");
	    		} catch (Throwable t) {
	    			// success
	    		}
	    	}
	    	
	}	
}