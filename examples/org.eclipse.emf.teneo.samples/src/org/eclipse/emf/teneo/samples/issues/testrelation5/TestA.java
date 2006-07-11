package org.eclipse.emf.teneo.samples.issues.testrelation5;


/**
 * TestA has two fields testb and testc both are interfaces with two implementations. 
 * 
 * @model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:02 $
*/
public class TestA
{
	String code;
	TestBInterface testb;
	TestCInterface testc;
	
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
	 * @model
	 */
	public TestBInterface getTestb()
	{
		return testb;
	}
	
	/**
	 * A 1:1 interface relation, dependent, this means that if A is deleted then
	 * also the refered to C should be deleted
	 * @model containment="true"
	 */
	public TestCInterface getTestc()
	{
		return testc;
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
	public void setTestb(TestBInterface testb) {
		this.testb = testb;
	}

	/**
	 * @param testc The testc to set.
	 */
	public void setTestc(TestCInterface testc) {
		this.testc = testc;
	}	

}