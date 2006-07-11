package org.eclipse.emf.teneo.samples.issues.duplicate_field;


/**
 * 
 * @model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:16 $
*/
class TestB
{
	String code;
		
	/** @model*/
	public String getCode()
	{
		return code;
	}
	
	/** Set testa */
	public void setCode(String mycode)
	{
		code = mycode;
	}
}