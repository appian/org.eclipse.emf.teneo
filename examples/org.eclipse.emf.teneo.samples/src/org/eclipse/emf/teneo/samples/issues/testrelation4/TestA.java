/*
 *	Copyright 2004-2005, Elver.org (http://www.eclipse.org/emf/teneo).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.samples.issues.testrelation4;



/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaserelation.TestRelation2
 * 
 * @model
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:56:55 $
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