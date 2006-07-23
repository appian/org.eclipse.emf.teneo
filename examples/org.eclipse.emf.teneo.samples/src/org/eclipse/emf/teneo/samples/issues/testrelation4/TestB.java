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
 * $Id: TestB.java,v 1.2 2006/07/23 19:38:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.issues.testrelation4;


/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaserelation.TestRelation2
 * 
 * @model 
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/07/23 19:38:40 $
*/
public class TestB implements TestBInterface
{
	String code;
	
	/** 
	 * Just a code
	 * @model 
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code The code to set.
	 */
	public void setCode(String code) {
		this.code = code;
	}
}