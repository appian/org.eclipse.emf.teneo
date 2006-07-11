package org.eclipse.emf.teneo.samples.issues.testrelation1n;

import java.util.ArrayList;
import java.util.List;


/**
 * TestA has two fields testb and testc both are lists of interfaces with two implementations. 
 * 
 * @model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:08 $
*/
public class TestA
{
	String code;
	List testbList = new ArrayList();
	List testcList = new ArrayList();
	
	/** 
	 * Just a code 
	 */
	public String getCode()
	{
		return "Abc";
	}
	
	/**
	 * A 1:1 interface relation, not dependent (not contained), this means that if A 
	 * exists and has a B, then B should not be deletable.
	 * @model type="org.eclipse.emf.teneo.samples.issues.testrelation1n.TestBInterface"
	 */
	public List getTestbList()
	{
		return testbList;
	}
	
	/** Sets the bList */
	public void setTestbList(List testbs)
	{
		testbList = testbs;
	}
	
	/**
	 * A 1:1 interface relation, dependent, this means that if A is deleted then
	 * also the refered to C should be deleted
	 * @model containment="true" type="org.eclipse.emf.teneo.samples.issues.testrelation1n.TestCInterface"
	 */
	public List getTestcList()
	{
		return testcList;
	}	

	/** Sets the testc list */
	public void setTestcList(List testcs)
	{
		testcList = testcs;
	}

	/**
	 * @param code The code to set.
	 */
	public void setCode(String code) {
		this.code = code;
	}
}