/**
 * <copyright>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Brian Vetter (bugzilla 175909)
 * </copyright>
 *
 * $Id: XSDDate.java,v 1.1.2.2 2007/03/05 18:07:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.mapping;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.hibernate.HibernateException;

/**
 * Implements the hibernate UserType for EMF's XMLCalendar ("date" type in XSD).
 * 
 * @author <a href="mailto:bvetter@alterpoint.com">Brian Vetter</a>
 * @version $Id
 */
public class XSDDate extends XSDDateTime {

	static final long serialVersionUID=1;
	
	/*
	 * Returns the DATETIME type that maps to the sql TIMESTAMP type 
	 * @see org.hibernate.type.NullableType#sqlType()
	 */
	public int sqlType() {
		return Types.DATE;
	}

	/*
	 * returns a name for the user type
	 * @see org.hibernate.type.Type#getName()
	 */
	public String getName() {
		return "xmldate";
	}

	/*
	 * Transform the date in the resultSet into a XMLCalendar instance.
	 * @see org.hibernate.type.NullableType#get(java.sql.ResultSet, java.lang.String)
	 */
	public Object get(ResultSet resultSet, String name)
			throws SQLException {
		Date data = resultSet.getDate(name);
		if (data == null) {
			return null;
		}
		// convert to XMLCalendar type
		return new XMLCalendar(data, XMLCalendar.DATE);
	}

	/*
	 * Transform the XMLCalendar into a date type to store in the database
	 * @see org.hibernate.type.NullableType#set(java.sql.PreparedStatement, java.lang.Object, int)
	 */
	public void set(PreparedStatement statement, Object value, int index)
			throws SQLException {
		java.sql.Date d = new java.sql.Date(((XMLCalendar)value).getDate().getTime()); 
		statement.setDate(index, d);
	}

	/*
	 * @see org.hibernate.type.NullableType#fromStringValue(java.lang.String)
	 */
	public Object fromStringValue(String s) throws HibernateException {
		return new XMLCalendar(s, XMLCalendar.DATE);
	}
}