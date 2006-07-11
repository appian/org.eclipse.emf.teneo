package org.eclipse.emf.teneo.samples.issues.duplicate_field;

import java.util.ArrayList;


/**
 * 
 * @model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:16 $
*/
class TestC
{
	private ArrayList testbs = new ArrayList();
	
	/** @model type="org.eclipse.emf.teneo.samples.issues.duplicate_field.TestB" containment="true"*/
	public ArrayList getTestbs()
	{
		return testbs;
	}

	/**
	 * @param testbs The testbs to set.
	 */
	public void setTestbs(ArrayList testbs) {
		this.testbs = testbs;
	}
}