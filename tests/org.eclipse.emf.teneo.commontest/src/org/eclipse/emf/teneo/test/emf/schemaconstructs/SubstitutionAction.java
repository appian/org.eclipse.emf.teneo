/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SubstitutionAction.java,v 1.5 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for the substitution construction.  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ 
*/
public class SubstitutionAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SubstitutionAction()  
	{
		super(SubstitutionPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final SubstitutionFactory factory = SubstitutionFactory.eINSTANCE;
        final SubstitutionPackage pack = SubstitutionPackage.eINSTANCE;
    	{
    		// odd complex number
    		{
		        store.beginTransaction();
		        NumberType complex1 = factory.createNumberType();
		        complex1.getMySimpleAbstractGroup().add(pack.getDocumentRoot_Odd(), new BigInteger("3"));
		        OddComplexNumberType odd = factory.createOddComplexNumberType();
		        odd.setUnit("pcs");
		        odd.setValue(new BigInteger("1"));
		        complex1.getMyComplexAbstractGroup().add(pack.getDocumentRoot_OddComplexNumber(), odd);
		        complex1.setName("o1");
		        store.store(complex1);
		        store.commitTransaction();
    		}
    		
    		
    		// even complex number
    		{
    			store.beginTransaction();
		        NumberType complex1 = factory.createNumberType();
		        complex1.getMySimpleAbstractGroup().add(pack.getDocumentRoot_Even(), new BigInteger("4"));
		        EvenComplexNumberType even = factory.createEvenComplexNumberType();
		        even.setUnit("kg");
		        even.setValue(new BigInteger("2"));
		        complex1.getMyComplexAbstractGroup().add(pack.getDocumentRoot_EvenComplexNumber(), even);
		        complex1.setName("e1");
		        store.store(complex1);
		        store.commitTransaction();
    		}
    		
    		// retrieve both and check the content
    		{
    			store.beginTransaction();
    			Collection coll  = store.getObjects(NumberType.class);
    			Iterator it = coll.iterator();
    			while (it.hasNext())
    			{
    				NumberType number = (NumberType)it.next();
    				if (number.getName().compareTo("o1") == 0)
    				{
    					assertEquals((int)3, number.getMySimpleAbstract().intValue());
    					OddComplexNumberType odd = (OddComplexNumberType)number.getMyComplexAbstractGroup().getValue(0);
    					assertEquals("pcs", odd.getUnit());
    					assertEquals((int)1, odd.getValue().intValue());
    					odd.setValue(new BigInteger("3"));
    				}
    				else if (number.getName().compareTo("e1") == 0)
    				{
    					assertEquals((int)4, number.getMySimpleAbstract().intValue());
    					EvenComplexNumberType even = (EvenComplexNumberType)number.getMyComplexAbstractGroup().getValue(0);
    					assertEquals("kg", even.getUnit());
    					assertEquals((int)2, even.getValue().intValue());
    					even.setValue(new BigInteger("4"));
    				}
    				else
    				{
    					fail("The numbertype with name: " + number.getName() + " was not expected");
    				}
    			}
    			store.commitTransaction();
    		}

    		// check the update content
    		{
    			store.beginTransaction();
    			Collection coll  = store.getObjects(NumberType.class);
    			Iterator it = coll.iterator();
    			while (it.hasNext())
    			{
    				NumberType number = (NumberType)it.next();
    				if (number.getName().compareTo("o1") == 0)
    				{
    					OddComplexNumberType odd = (OddComplexNumberType)number.getMyComplexAbstractGroup().getValue(0);
    					assertEquals("pcs", odd.getUnit());
    					assertEquals((int)3, odd.getValue().intValue());
    				}
    				else if (number.getName().compareTo("e1") == 0)
    				{
    					EvenComplexNumberType even = (EvenComplexNumberType)number.getMyComplexAbstractGroup().getValue(0);
    					assertEquals("kg", even.getUnit());
    					assertEquals((int)4, even.getValue().intValue());
    				}
    				else
    				{
    					fail("The numbertype with name: " + number.getName() + " was not expected");
    				}
    			}
    			store.commitTransaction();
    		}
    		
    		// and now store a multinumber, use the featuremap as well as the elist entry
    		// after this the multicomplextype consists of:
    		// 1) even - 2, 2) odd - 3, 3) even - 4, 4) odd - 5
    		{
		        store.beginTransaction();
		        MultiNumberType complex = factory.createMultiNumberType();

		        EvenComplexNumberType even = factory.createEvenComplexNumberType();
		        even.setUnit("pcs");
		        even.setValue(new BigInteger("2"));
		        complex.getMyComplexAbstractGroup().add(pack.getDocumentRoot_EvenComplexNumber(), even);
		        
		        OddComplexNumberType odd = factory.createOddComplexNumberType();
		        odd.setUnit("kg");
		        odd.setValue(new BigInteger("3"));
		        complex.getMyComplexAbstractGroup().add(pack.getDocumentRoot_OddComplexNumber(), odd);
		        
		        even = factory.createEvenComplexNumberType();
		        even.setUnit("pcs"); 
		        even.setValue(new BigInteger("4"));
		        complex.getMyComplexAbstractGroup().add(pack.getDocumentRoot_EvenComplexNumber(), even);
		        
		        odd = factory.createOddComplexNumberType();
		        odd.setUnit("kg");
		        odd.setValue(new BigInteger("5"));
		        complex.getMyComplexAbstractGroup().add(pack.getDocumentRoot_OddComplexNumber(), odd);
		        
		        complex.setName("m1");
		        store.store(complex);
		        store.commitTransaction();
    		}
    		
    		{
		        store.beginTransaction();
		        MultiNumberType complex = (MultiNumberType)store.getObject(MultiNumberType.class);
		        Iterator it = complex.getMyComplexAbstract().iterator();
		        int i = 2;
		        while (it.hasNext())
		        {
		        	ComplexNumber number = (ComplexNumber)it.next();
		        	assertEquals(i++, number.getValue().intValue());
		        	
		        	if (number.getValue().intValue() % 2 == 0) // even
		        	{
		        		assertTrue(number instanceof EvenComplexNumberType);
		        		assertEquals("pcs", number.getUnit());
		        	}
		        	else
		        	{
		        		assertTrue(number instanceof OddComplexNumberType);
		        		assertEquals("kg", number.getUnit());
		        	}
		        }
		        store.commitTransaction();
    		}
    	}
	}
}