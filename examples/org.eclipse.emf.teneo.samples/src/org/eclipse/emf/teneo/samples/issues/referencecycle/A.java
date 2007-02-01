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
 * $Id: A.java,v 1.3 2007/02/01 12:35:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.issues.referencecycle;


/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.TestContainment
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2007/02/01 12:35:23 $

 * @model 
*/
public class A 
{
	/** The name */
	private String name;
	
	/** The other side */
	private B myB;
	
	/** 
	 * Get the name
	 * @model 
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set name
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	
	/**
	 * Refers to the other test object
	 * @model opposite="myA"
	 */
	public B getMyB()
	{
		return myB;
	}
	
	/** Set the other side */
	public void setMyB(B myNewB)
	{
		myB = myNewB;
	}
}
