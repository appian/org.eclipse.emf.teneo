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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: AttributeOverridesAction.java,v 1.2 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;


import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.City;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
*/
public class AttributeOverridesAction extends AbstractTestAction 
{
	/**
	 * Constructor
	 */
	public AttributeOverridesAction()  
	{
		super(AttributeoverridesPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final AttributeoverridesFactory factory = AttributeoverridesFactory.eINSTANCE;
	    	{
	    		store.beginTransaction();
	    		City bornIn = factory.createCity();
	    		bornIn.setCountry("Singapore");
	    		bornIn.setName("Singapore");
	    		City livesIn = factory.createCity();
	    		livesIn.setCountry("Netherlands");
	    		livesIn.setName("Doorn");
	    		Person person = factory.createPerson();
	    		person.setName("Martin");
	    		person.setBornIn(bornIn);
	    		person.setLivesIn(livesIn);
	    		store.store(person);
	    		store.commitTransaction();
	    	}
	}	
}