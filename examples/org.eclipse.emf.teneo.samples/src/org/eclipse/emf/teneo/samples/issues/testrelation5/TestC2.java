package org.eclipse.emf.teneo.samples.issues.testrelation5;


/**
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:02 $

 * @model 
*/
public class TestC2 implements TestCInterface
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