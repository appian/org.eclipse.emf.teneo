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
 * $Id: TestAInterface.java,v 1.2 2006/07/23 19:38:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.issues.testrelation2;


/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaserelation.TestRelation2
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/07/23 19:38:41 $

 * @model 
*/
public interface TestAInterface 
{
	
	/** 
	 * Just a code 
	 * @model
	 */
	public String getCode();
	
	/**
	 * Refers to other complex type, models multi-occurence complex type
	 * @model containment="true"
	 */
	public TestBInterface getTestb();
	
	/**
	 * Refers to other complex type, models multi-occurence complex type
	 * @model
	 */
	public TestC getTestc();
}