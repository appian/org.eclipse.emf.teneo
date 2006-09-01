/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AccountingTest.java,v 1.3 2006/09/01 08:20:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import java.io.InputStream;

import org.eclipse.emf.teneo.jpox.emf.JpoxConstants;
import org.eclipse.emf.teneo.jpox.emf.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStore;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.AccountingAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class AccountingTest extends AbstractActionTest {

	static AccountingAction testAction = new AccountingAction() {

		/** Import/export, from and to */
		protected void imTestExport(InputStream is, TestStore store) {
			// import
			JPOXTestStore jTestStore = (JPOXTestStore) store;
			JpoxDataStore ds = jTestStore.getEmfDataStore();
			ds.importDataStore(is, JpoxConstants.EXCHANGE_FORMAT_XMI);

			// export, not supported there is an error in the xml related to non-contained objects.
			// ds.exportDataStore(new ByteArrayOutputStream(), JpoxConstants.EXCHANGE_FORMAT_XMI, null);
		}
	};

	public AccountingTest() {
		super(testAction);
	}
}
