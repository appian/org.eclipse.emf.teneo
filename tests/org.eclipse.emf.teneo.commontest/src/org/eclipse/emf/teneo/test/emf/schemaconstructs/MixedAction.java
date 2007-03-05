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
 * $Id: MixedAction.java,v 1.3.2.1 2007/03/05 18:07:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for the mixed construction.  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3.2.1 $ 
*/
public class MixedAction extends AbstractTestAction 
{
	/** Two days in millis to work around an issue in emf xml calendar */
	private static long TWO_DAYS = 1000 * 60 * 60 * 24 * 2;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public MixedAction() 
	{
		super(MixedPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		int maxCnt = 5;
		final Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 2005);
		cal.set(Calendar.MONTH, 8);
		
		// test a simple type
        final MixedFactory factory = MixedFactory.eINSTANCE;
    	{
	        store.beginTransaction();
	        
	        // the index is stored in the biginteger
	        for (int i = 0; i < maxCnt; i++)
	        {
		        LetterBodyType letter = factory.createLetterBodyType();
		        SalutationType salutation = factory.createSalutationType();
		        salutation.getMixed().add(Constants.TEXT, i + "Dear mr.");
		        salutation.setName( i + " Taal");
		        salutation.getMixed().add(Constants.TEXT, i +",");
		        
		        letter.getMixed().add(Constants.TEXT, i + "Amsterdam, The Netherlands"); // 0
		        letter.setSalutation(salutation); // 1
		        letter.getMixed().add(Constants.TEXT, i + "Please order the following product for me"); // 2
		        letter.setProductName(i + "bicycle"); //3
		        letter.getMixed().add(Constants.TEXT, i + "Description: Bicycle"); //4
		        letter.getMixed().add(Constants.COMMENT, i + "With two wheels!"); //5
		        letter.setQuantity(new BigInteger(i + "")); //6
		        letter.getMixed().add(Constants.TEXT, i + "Unit: pieces"); //7
		        cal.set(Calendar.DAY_OF_MONTH, i + 1);
		        letter.setShipDate(store.getDate(cal.getTime())); //8
		        letter.getMixed().add(Constants.COMMENT, i + "Comment: please ensure that the product is delivered on time."); //9
		        letter.getMixed().add(Constants.CDATA, i + "CDATA test"); //10
	        
		        store.store(letter);
	        }
	        store.commitTransaction();
    	}
    	
    	{
    		store.beginTransaction();
    		
    		final Collection coll = store.getObjects(LetterBodyType.class);
    		assertTrue(coll.size() == maxCnt);
    		final Iterator it = coll.iterator();

    		// check that we got them all
    		boolean[] foundAll = new boolean[maxCnt];
    		for (int i = 0; i < maxCnt; i++)
    		{
    			foundAll[i] = false;
    		}
    		
    		while (it.hasNext())
    		{
	    		LetterBodyType letter = (LetterBodyType)it.next();
	    		int docIndex = letter.getQuantity().intValue();
	    		foundAll[docIndex] = true;
	    		final EList list = letter.getMixed();
	    		checkEntry(docIndex, list, 0, Constants.TEXT, "Amsterdam, The Netherlands", null);
	    		
	    		// salutation
	    		{
		    		final FeatureMap.Entry salEntry = getEntry(list, 1);
		    		assertTrue(salEntry.getValue() instanceof SalutationType);
		    		assertTrue(salEntry.getEStructuralFeature() == MixedPackage.eINSTANCE.getLetterBodyType_Salutation());
		    		SalutationType sal = (SalutationType)salEntry.getValue();
	    		
		    		checkEntry(docIndex, sal.getMixed(), 0, Constants.TEXT, "Dear mr.", null);
		    		checkEntry(docIndex, sal.getMixed(), 1, MixedPackage.eINSTANCE.getSalutationType_Name(), " Taal", sal.getName());
		    		checkEntry(docIndex, sal.getMixed(), 2, Constants.TEXT, ",", null);
	    		}
	    		
	    		// 1 salutation
	    		checkEntry(docIndex, list, 2, Constants.TEXT, "Please order the following product for me", null);
	    		checkEntry(docIndex, list, 3, MixedPackage.eINSTANCE.getLetterBodyType_ProductName(), "bicycle", letter.getProductName());
	    		checkEntry(docIndex, list, 4, Constants.TEXT, "Description: Bicycle", null);
	    		checkEntry(docIndex, list, 5, Constants.COMMENT, "With two wheels!", null);
	    		
	    		// 6 biginteger
	    		assertTrue("Error in retrieving integer field", ((BigInteger)getEntry(list, 6).getValue()).intValue() == docIndex);
	    		
	    		checkEntry(docIndex, list, 7, Constants.TEXT, "Unit: pieces", null);
	    		
	    		// 8  Date
	    		{
		    		final FeatureMap.Entry dateEntry = getEntry(list, 8);
		    		assertTrue(dateEntry.getValue() instanceof XMLCalendar || dateEntry.getValue() instanceof Date);
		    		assertTrue(dateEntry.getEStructuralFeature() == MixedPackage.eINSTANCE.getLetterBodyType_ShipDate());
		    		
		    		final Date date;
		    		if (dateEntry.getValue() instanceof XMLCalendar) {
			    		date = ((XMLCalendar)dateEntry.getValue()).getDate();
		    		} else {
		    			date = (Date)dateEntry.getValue();
		    		}
		    		cal.set(Calendar.DAY_OF_MONTH, docIndex + 1);
		    		
		    		// Difference between two dates should not be more than 2 days, is an emf issue 
		    		assertTrue(Math.abs(cal.getTimeInMillis() - date.getTime()) < TWO_DAYS);
		    		
		    		// there is an error in emf therefore the xml calendar move the date one day back
		    		// therefor the following checks are disabled
		    		/*
			        assertEquals(date.getDate(), cal.get(Calendar.DAY_OF_MONTH));
			        assertEquals(date.getMonth(), cal.get(Calendar.MONTH));
			        assertEquals((date.getYear() + 1900), cal.get(Calendar.YEAR));
			        */
	    		}
	    		
	    		checkEntry(docIndex, list, 9, Constants.COMMENT, "Comment: please ensure that the product is delivered on time.", null);
	    		checkEntry(docIndex, list, 10, Constants.CDATA, "CDATA test", null);
    		}
    		
    		store.commitTransaction();
    		
    		for (int i = 0; i < maxCnt; i++)
    		{
    			assertTrue("Document with docindex " + i + " was not retrieved", foundAll[i]);
    		}
    	}
	}

	/** Returns the feature map entry on a specific position */
	private FeatureMap.Entry getEntry(EList list, int index)
	{
		return (FeatureMap.Entry)list.get(index);
	}
	
	/** Checks a certain entry */
	private void checkEntry(int docIndex, EList list, int index, EStructuralFeature feature, Object value, String val2)
	{
		checkEntry(docIndex, getEntry(list, index), feature, value, val2);
	}	
	
	/** Checks a certain entry */
	private void checkEntry(int docIndex, FeatureMap.Entry entry, EStructuralFeature feature, Object value, String val2)
	{
		assertTrue("Error, expected/found feature: " + feature.getName() + "/" + entry.getEStructuralFeature().getName(),
				entry.getEStructuralFeature() == feature);
		assertTrue("Expected String, got: " + value.getClass().getName(), value instanceof String);
		final String entryVal = (String)entry.getValue();
		final String expVal = docIndex + (String)value;
		assertTrue("Error, expected/found value: " + expVal + "/" + entryVal, entryVal.compareTo(expVal) == 0);
		if (val2 != null) // extra check
		{
			assertTrue("Error, expected/found value: " + val2 + "/" + entryVal, entryVal.compareTo(val2) == 0);
		}
	}
}