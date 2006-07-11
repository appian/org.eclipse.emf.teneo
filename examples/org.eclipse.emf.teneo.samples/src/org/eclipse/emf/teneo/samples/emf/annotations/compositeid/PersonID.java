/*
 *	Copyright 2005-2006, Elver.org (http://www.eclipse.org/emf/teneo).
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
package org.eclipse.emf.teneo.samples.emf.annotations.compositeid;


import java.io.Serializable;

/**
 * The id class used in the composite id test case
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
*/
public class PersonID implements Serializable {
	
	private static String delimiter = "__;__";
	
	public String firstName;
	public String lastName;
	
	/** No-arg constructor */
	public PersonID() {}
	
	/** Arg constructor */
	public PersonID(String idString) {
		String[] fields = idString.split(delimiter);
		firstName = fields[0];
		lastName = fields[1];
	}

	public int hashCode() {
	    return firstName.hashCode() + lastName.hashCode();
	}

	public String toString() {
		return firstName + delimiter + lastName;
	}

	public boolean equals(Object other)	{
	    if (other != null && (other instanceof PersonID)) {
	        PersonID p = (PersonID)other;
	        return p.firstName.equals(firstName) && p.lastName.equals(lastName);
	    }
	    return false;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}