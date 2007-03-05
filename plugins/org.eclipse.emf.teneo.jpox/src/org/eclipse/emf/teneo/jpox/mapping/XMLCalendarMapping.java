/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: XMLCalendarMapping.java,v 1.1.2.1 2007/03/05 18:07:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import java.util.Date;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.jpox.store.mapping.DateMapping;

/**
 * This class implements the jpox type mapping for a EMF XMLCalendar object.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.1 $ $Date: 2007/03/05 18:07:38 $
 */

public class XMLCalendarMapping extends DateMapping {

	/** The xml calendar.class is returned */
	public Class getJavaType() {
		return XMLCalendar.class;
	}

	/**
	 * Translates XMLCalendar to date
	 */
	public void setObject(org.jpox.PersistenceManager pm, Object preparedStatement, int[] exprIndex, Object value) {
		final Date realValue;
		if (value == null) {
			realValue = null;
		} else {
			realValue = ((XMLCalendar) value).getDate();
		}
		super.setObject(pm, preparedStatement, exprIndex, realValue);
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object. In this case the date is
	 * translated back to a XMLCalendar with precision DateTime.
	 */
	public synchronized Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final Date date = (Date) super.getObject(pm, resultSet, exprIndex);
		if (date == null) {
			return null;
		}
		return new XMLCalendar(date, XMLCalendar.DATETIME);
	}
}