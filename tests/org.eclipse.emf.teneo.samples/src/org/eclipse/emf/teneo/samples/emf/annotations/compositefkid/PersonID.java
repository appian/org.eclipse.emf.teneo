/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: PersonID.java,v 1.4 2008/02/28 07:08:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.samples.emf.annotations.compositefkid;


import java.io.Serializable;

/**
 * The id class used in the composite id test case
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
*/
public class PersonID implements Serializable {
	
	private static String delimiter = "__;__";
	
	public String firstName;
	public Name lastName;
	
	/** No-arg constructor */
	public PersonID() {}
	
	public int hashCode() {
	    return firstName.hashCode() + lastName.getLastName().hashCode();
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
	public Name getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(Name lastName) {
		this.lastName = lastName;
	}
}