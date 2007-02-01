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
 * $Id: TopModel.java,v 1.3 2007/02/01 12:35:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.issues.testclasshierarchy;


/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaseone.ClassHierarchyParsing
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2007/02/01 12:35:23 $

 * @model 
*/
public class TopModel 
{
	/**
	 * The name of this nice class
	 */
	
	private String name;
	
	/** 
	 * Social Security No
	 */
	private String socialSecurityNo;
	
	/** 
	 * Get the social security no
	 * @model primaryKey="true" unique="true" required="true"
	 */
	public String getSocialSecurityNo()
	{
		return socialSecurityNo;
	}
	
	/** And set it */
	public void setSocialSecurityNo(String socialSecurityNo)
	{
		this.socialSecurityNo = socialSecurityNo;
	}
	
	/** Get name 
	 * @model
	 */
	public String getName()
	{
		return name;
	}
	
	/** Set Name */
	public void setName(String newName)
	{
		name = newName;
	}
}
