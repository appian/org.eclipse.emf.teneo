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
 * $Id: AccountingTest.java,v 1.5 2007/02/01 12:36:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.AccountingAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AccountingTest extends AbstractActionTest {

	private static AccountingAction testAction = new AccountingAction() {

		/** Import/export, from and to */
		protected void imTestExport(InputStream is, TestStore store) {
			// import
			HibernateTestStore hbTestStore = (HibernateTestStore) store;
			HbDataStore ds = hbTestStore.getEmfDataStore();
			
			ds.importDataStore(is, HbConstants.EXCHANGE_FORMAT_XMI);

			// export
			ds.exportDataStore(new ByteArrayOutputStream(), HbConstants.EXCHANGE_FORMAT_XML, null);
		}
	};

	public AccountingTest() {
		super(testAction);
	}
}
