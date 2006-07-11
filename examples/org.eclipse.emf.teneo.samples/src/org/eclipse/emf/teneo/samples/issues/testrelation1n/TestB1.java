package org.eclipse.emf.teneo.samples.issues.testrelation1n;


/**
 * Class is part of a test case.
 * @see org.eclipse.emf.teneo.store.test.testcaserelation.TestRelation2
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:08 $
*/
public class TestB1 implements TestBInterface
{
	String code;
	
	/** 
	 * Just a code 
	 */
	public String getCode()
	{
		return code;
	}

	/** 
	 * Just a code 
	 */
	public void setCode(String code)
	{
		this.code = code;
	}
}