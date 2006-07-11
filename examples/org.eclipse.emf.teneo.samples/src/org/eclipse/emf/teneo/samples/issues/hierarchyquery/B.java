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
package org.eclipse.emf.teneo.samples.issues.hierarchyquery;


/**
 * Class is part of a simple case.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/11 16:57:18 $

 * @model 
*/
public class B extends A
{
	/** The name */
	private String nameb;
	
	/** 
	 * Get the name
	 * @model 
	 */
	public String getNameb()
	{
		return nameb;
	}
	
	/**
	 * Set name
	 */
	public void setNameb(String newName)
	{
		nameb = newName;
	}
}