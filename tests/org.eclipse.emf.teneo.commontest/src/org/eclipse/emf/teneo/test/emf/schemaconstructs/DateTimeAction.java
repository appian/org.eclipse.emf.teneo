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
 * $Id: DateTimeAction.java,v 1.4 2011/03/17 09:21:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.DatetimeFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.DatetimePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.TestDate;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.util.EcoreDataTypes;

/**
 * Tests for xsd datetime
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class DateTimeAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public DateTimeAction() {
		super(DatetimePackage.eINSTANCE);
	}

	/** Returns true if hibernate is enabled for a test, false otherwise */
	protected boolean hibernateEnabled() {
		return true;
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		final DatetimeFactory factory = DatetimeFactory.eINSTANCE;
		final Calendar calendar = Calendar.getInstance();
		XMLGregorianCalendar xcd = EcoreDataTypes.INSTANCE
				.getXMLGregorianCalendar(calendar.getTime());
		XMLGregorianCalendar xcdt = EcoreDataTypes.INSTANCE
				.getXMLGregorianCalendarDateTime(calendar.getTime());
		XMLGregorianCalendar xct = EcoreDataTypes.INSTANCE
				.getXMLGregorianCalendarDateTime(calendar.getTime());
		{
			store.beginTransaction();
			TestDate td = factory.createTestDate();

			td.setDate(xcd);
			td.setDatetime(xcdt);
			td.setTime(xct);
			store.store(td);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			TestDate td = store.getObject(TestDate.class);
			// XMLGregorianCalendar xc = (XMLGregorianCalendar)
			// td.getDatetime();
			checkDate(calendar, ((XMLGregorianCalendar) td.getDatetime())
					.toGregorianCalendar().getTime(), true, true);
			checkDate(calendar, ((XMLGregorianCalendar) td.getDate())
					.toGregorianCalendar().getTime(), true, false);
			checkDate(calendar, ((XMLGregorianCalendar) td.getTime())
					.toGregorianCalendar().getTime(), false, true);
			store.commitTransaction();
		}
	}

	// Checks the date
	private void checkDate(Calendar original, Date retrieved,
			boolean checkDate, boolean checkSeconds) {
		final Calendar loaded = Calendar.getInstance();
		loaded.setTime(retrieved);

		if (checkDate) {
			assertEquals(original.get(Calendar.DATE), loaded.get(Calendar.DATE));
			assertEquals(original.get(Calendar.MONTH),
					loaded.get(Calendar.MONTH));
			assertEquals(original.get(Calendar.YEAR), loaded.get(Calendar.YEAR));
		}
		if (checkSeconds) {
			assertEquals(original.get(Calendar.HOUR), loaded.get(Calendar.HOUR));
			assertEquals(original.get(Calendar.MINUTE),
					loaded.get(Calendar.MINUTE));
			assertEquals(original.get(Calendar.SECOND),
					loaded.get(Calendar.SECOND));
		}
	}
}