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
 * $Id: AccountingAction.java,v 1.5 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.InputStream;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.Account;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingFactory;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Performs a number of test actions on the catalog example. Create products, link a supplier, add
 * to catalog, delete from catalog.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public abstract class AccountingAction extends AbstractTestAction {
	public AccountingAction() {
		super(AccountingPackage.eINSTANCE);
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store) {
		final AccountingFactory factory = AccountingFactory.eINSTANCE;
		{
			store.beginTransaction();

			Accounting all = factory.createAccounting();
			all.setName("Accounting Data");

			Vat vat = factory.createVat();
			vat.setName("19%");
			vat.setRate(0.19f);

			Account account = factory.createBalanceAccount();
			account.setName("Software Development Costs");

			AccountGroup accGroup = factory.createAccountGroup();
			accGroup.setName("Activa");
			accGroup.getAccount().add(account);

			JournalGroup yearJournal = factory.createJournalGroup();
			yearJournal.setName("journalgroup");

			all.getVat().add(vat);
			all.getJournalGroup().add(yearJournal);
			all.getAccountGroup().add(accGroup);

			store.store(all);
			store.commitTransaction();
		}
		imTestExport(AccountingPackage.class.getResourceAsStream("import.xmi"), store);
	}

	/** Import/export, from and to */
	protected abstract void imTestExport(InputStream is, TestStore store);
}