/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Calendar;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz242995.Author;
import org.eclipse.emf.teneo.samples.issues.bz242995.Book;
import org.eclipse.emf.teneo.samples.issues.bz242995.BookCategory;
import org.eclipse.emf.teneo.samples.issues.bz242995.Library;
import org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder;
import org.eclipse.emf.teneo.samples.issues.bz242995.Writer;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Factory;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;
import org.eclipse.emf.teneo.samples.issues.bz375705.Bar;
import org.eclipse.emf.teneo.samples.issues.bz375705.Bz375705Factory;
import org.eclipse.emf.teneo.samples.issues.bz375705.Bz375705Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.proxy.HibernateProxy;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz375705Action extends AbstractTestAction {

	public Bz375705Action() {
		super(new EPackage[] { Bz375705Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		Calendar calendar = Calendar.getInstance();
		{
			store.beginTransaction();
			Bar bar = Bz375705Factory.eINSTANCE.createBar();
			bar.setCalendar(calendar);
			store.store(bar);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Bar bar = store.getObject(Bar.class);
			assertEquals(calendar.getTimeInMillis(), bar.getCalendar().getTimeInMillis());
			store.commitTransaction();
		}
	}
}
