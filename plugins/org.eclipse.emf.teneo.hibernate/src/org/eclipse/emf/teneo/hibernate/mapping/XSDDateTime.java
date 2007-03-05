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
 *   Martin Taal - smaller additional changes
 * </copyright>
 *
 * $Id: XSDDateTime.java,v 1.1.2.2 2007/03/05 18:07:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.mapping;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Date;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.type.MutableType;

/**
 * Implements the hibernate UserType for EMF's XMLCalendar ("datetime" type in XSD).
 * 
 * @author <a href="mailto:bvetter@alterpoint.com">Brian Vetter</a>
 * @version $Revision
 */
public class XSDDateTime extends MutableType {

	static final long serialVersionUID=1;
	
	/*
	 * Returns the DATETIME type that maps to the sql TIMESTAMP type 
	 * @see org.hibernate.type.NullableType#sqlType()
	 */
	public int sqlType() {
		return Types.TIMESTAMP;
	}

	/*
	 * Copy the XMLCalendar object
	 * @see org.hibernate.type.MutableType#deepCopyNotNull(java.lang.Object)
	 */
	public Object deepCopyNotNull(Object value) {
		return new XMLCalendar( ((XMLCalendar)value).getDate(), XMLCalendar.DATETIME );
	}
	
	/*
	 * returns a name for the user type
	 * @see org.hibernate.type.Type#getName()
	 */
	public String getName() {
		return "xmldatetime";
	}

	/*
	 * This returns an XMLCalendar.class type
	 * @see org.hibernate.type.Type#getReturnedClass()
	 */
	public Class getReturnedClass() {
		return XMLCalendar.class;
	}

	/*
	 * @see org.hibernate.type.NullableType#isEqual(java.lang.Object, java.lang.Object)
	 */
	public boolean isEqual(Object x, Object y) throws HibernateException {
		if (x == y)
			return true;
		if (x == null || y == null)
			return false;
		if (x.getClass() != y.getClass())
			return false;
		return x.equals(y);
	}

	/*
	 * @see org.hibernate.type.AbstractType#getHashCode(java.lang.Object, org.hibernate.EntityMode)
	 */
	public int getHashCode(Object x, EntityMode entityMode) throws HibernateException {
		return x.hashCode();
	}

	/*
	 * Transform the date in the resultSet into a XMLCalendar instance.
	 * @see org.hibernate.type.NullableType#get(java.sql.ResultSet, java.lang.String)
	 */
	public Object get(ResultSet resultSet, String name)
			throws SQLException {
		// MT: changed this to timestamp to get the seconds right
		Timestamp ts = resultSet.getTimestamp(name);
		if (ts == null) {
			return null;
		}
		// convert to XMLCalendar type
		return new XMLCalendar(new Date(ts.getTime()), XMLCalendar.DATETIME);
	}

	/*
	 * Transform the XMLCalendar into a timestamp type to store in the database
	 * @see org.hibernate.type.NullableType#set(java.sql.PreparedStatement, java.lang.Object, int)
	 */
	public void set(PreparedStatement statement, Object value, int index)
			throws SQLException {
		Timestamp d = new Timestamp(((XMLCalendar)value).getDate().getTime()); 
		statement.setTimestamp(index, d);
	}

	/*
	 * @see org.hibernate.type.NullableType#toString(java.lang.Object)
	 */
	public String toString(Object val) {
		return ((XMLCalendar)val).toString();
	}
	
	/*
	 * @see org.hibernate.type.NullableType#fromStringValue(java.lang.String)
	 */
	public Object fromStringValue(String s) throws HibernateException {
		return new XMLCalendar(s, XMLCalendar.DATETIME);
	}
}