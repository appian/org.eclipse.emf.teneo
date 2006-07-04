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
 * $Id: DetachAction.java,v 1.1 2006/07/04 22:12:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.detach;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestFactory;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a test case to test basic detach functionality in the dao resource; Specifically for JPOX/JDO
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public abstract class DetachAction extends AbstractTestAction 
{

	/** Constructor */
	public DetachAction()
	{
		super(DetachtestPackage.eINSTANCE);
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store)
	{
		try
		{
			DetachtestFactory factory = DetachtestFactory.eINSTANCE;
	    	// Create objects
	    	{
	    		Resource res = store.getResource();
	        	
	            TestB testb = factory.createTestB();
	            testb.setCode("testb");
	        	
	            TestA testa = factory.createTestA();
	            testa.setCode("testa");
	            testa.setTestB(testb);
	
	            TestB testb2 = factory.createTestB();
	            testb2.setCode("testb2");
	            TestB testb3 = factory.createTestB();
	            testb3.setCode("testb3");
	
	            TestC testc = factory.createTestC();
	            testc.setCode("testc");
	            testc.setMyDate(new Date());
	            testc.getTestB().add(testb2);
	            testc.getTestB().add(testb3);
	
	            res.getContents().add(testc);
	            res.getContents().add(testa);
	
		        res.save(null);
	            
	            // check the state of some of the objects
	            checkDetached(testa);
	            checkDetached(testb);
	            checkDetached(testb2);
	            checkDetached(testb3);
	            checkDetached(testc);
	
	            // check some fields
	            if (testa.getTestB() == null || testa.getCode() == null)
	            {
	            	throw new Error("Values are lost in detached objects!");
	            }
	
	            // check some fields
	            if (testc.getTestB() == null || testc.getCode() == null)
	            {
	            	throw new Error("Values are lost in detached objects!");
	            }
	        }
	
	    	// Now retrieve TestA and TestC and detach them also
	        {
	        	Resource res = store.getResource();
	        	res.load(null);
	
	        	Iterator it = res.getContents().iterator();
	        	TestA testa = null;
	        	TestC testc = null;
	        	while (it.hasNext())
	        	{
	        		Object obj = it.next();
	        		if (obj instanceof TestA)
	        		{
	        			assertTrue(testa == null);
	        			testa = (TestA)obj;
	        		}
	        		if (obj instanceof TestC)
	        		{
	        			assertTrue(testc == null);
	        			testc = (TestC)obj;
	        		}
	        	}
	
	    	    // get testb to force a load
	    	    if (testc.getTestB().size() != 2 || ((TestB)testc.getTestB().get(0)).getCode().compareTo("testb2")!=0)
	    	    {
	    	    	throw new Error("Where is testb?");
	    	    }
	    	    
	    	    // now save and detach
	    	    res.save(null);
	    	    
	            checkDetached(testa);
	            checkDetached((EObject) testc.getTestB().get(0));
	            checkDetached(testc);
	
	            if (testc.getMyDate()==null)
	            {
	            	throw new Error("This should not be possible");
	            }
	            // now change the code of one, delete one testb from testc and add one
	            testa.setCode("detached");
	            
	            TestB testb = factory.createTestB();
	            testb.setCode("testb4");
	            
	            testc.getTestB().remove(0);
	            testc.getTestB().add(testb);
	            
	            // reattach again!
	            res.save(null);
	        }
	
	        // Now retrieve TestA and TestC and detach them also
	        {
	        	Resource res = store.getResource();
	        	res.load(null);
	        	
	        	Iterator it = res.getContents().iterator();
	        	TestA testa = null;
	        	TestC testc = null;
	        	while (it.hasNext())
	        	{
	        		Object obj = it.next();
	        		if (obj instanceof TestA)
	        		{
	        			assertTrue(testa == null);
	        			testa = (TestA)obj;
	        		}
	        		if (obj instanceof TestC)
	        		{
	        			assertTrue(testc == null);
	        			testc = (TestC)obj;
	        		}
	        	}
	
	
	    	    if (testa.getCode().compareTo("detached")!=0)
	    	    {
	    	    	throw new StoreTestException("The code of testa was not set!");
	    	    }
	
	    	    if (((TestB)testc.getTestB().get(0)).getCode().compareTo("testb3")!=0 ||
	    	    		((TestB)testc.getTestB().get(1)).getCode().compareTo("testb4")!=0)
	    	    {
	    	    	throw new StoreTestException("TestB was not set");
	    	    }
	    	    
	    	    // get testb to force a load 
	    	    if (testc.getTestB().size() != 2)
	    	    {
	    	    	throw new Error("Testb should have 2 children!");
	    	    }
	    	    res.save(null);
	            
	            // do some final tests
	            checkDetached(testa);
	            checkDetached((EObject) testc.getTestB().get(0));
	            checkDetached((EObject) testc.getTestB().get(1));
	            checkDetached(testc);
	        }
		}
		catch (IOException e)
		{
			throw new StoreTestException("IOException in resource detach test", e);
		}
    }	
    
    /** Checks if a certain object is really detached */
    protected abstract void checkDetached(EObject eObject);
// TODO specialize for hibernate/JPOX
//    	if (eObject instanceof PersistenceCapable) {
//			PersistenceCapable pc = (PersistenceCapable) eObject;
//			if (!pc.jdoIsDetached())
//				fail("The object with class: " + pc.getClass().getName() + " is not detached");
//			
//			if (pc.jdoGetObjectId() == null)
//				fail("The object with class: " + pc.getClass().getName() + " has no id!");
//		}
}
