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
 * $Id: TestA.java,v 1.3 2007/02/01 12:35:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.issues.testrelation4;



/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaserelation.TestRelation2
 * 
 * @model
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2007/02/01 12:35:23 $
*/
public class TestA
{
	String code;
//	List testbList = new ArrayList();
	TestB testb;
	
	/** 
	 * Just a code
	 * @model 
	 */
	public String getCode()
	{
		return "Abc";
	}
	
	/**
	 * Refers to other complex type, models multi-occurence complex type
	 * @model required="true" type="org.eclipse.emf.teneo.store.test.issues.testrelation4.TestBInterface"
	public List getTestbList()
	{
		return testbList;
	}
	 */
	
	/**
	 * Refers to other complex type, models multi-occurence complex type
	 * @model
	 */
	public TestBInterface getTestb()
	{
		return testb;
	}

	/**
	 * @param code The code to set.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param testb The testb to set.
	 */
	public void setTestb(TestB testb) {
		this.testb = testb;
	}
	
}