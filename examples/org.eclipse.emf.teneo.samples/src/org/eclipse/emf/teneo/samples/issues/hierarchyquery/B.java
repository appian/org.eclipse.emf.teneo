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
 * $Id: B.java,v 1.2 2006/07/23 19:38:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.hierarchyquery;


/**
 * Class is part of a simple case.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/07/23 19:38:41 $

 * @model 
*/
public class B extends A
{
	/** The name */
	private String nameb;
	
	/** 
	 * Get the name
	 * @model 
	 */
	public String getNameb()
	{
		return nameb;
	}
	
	/**
	 * Set name
	 */
	public void setNameb(String newName)
	{
		nameb = newName;
	}
}