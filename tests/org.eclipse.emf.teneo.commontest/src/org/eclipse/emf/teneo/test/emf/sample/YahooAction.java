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
 * $Id: YahooAction.java,v 1.1 2006/11/07 10:22:44 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

import com.pareis.trading.Client;
import com.pareis.trading.TradingFactory;
import com.pareis.trading.TradingPackage;
import com.pareis.trading.yahoo.Yahoo;
import com.pareis.trading.yahoo.YahooFactory;
import com.pareis.trading.yahoo.YahooPackage;

/**
 * Tests persisting of ecore models in a relational store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class YahooAction extends AbstractTestAction {
	
	/** Constructor */
	public YahooAction() {
		super(new EPackage[]{TradingPackage.eINSTANCE, YahooPackage.eINSTANCE});
	}

	/** Reads the library model and persists it. */
	public void doAction(TestStore store) {
		{
			Client c = TradingFactory.eINSTANCE.createClient();
			c.setId("client");
			Yahoo y = YahooFactory.eINSTANCE.createYahoo();
			y.setClient(c);
			store.beginTransaction();
			store.store(y);
			store.commitTransaction();
		}
		store.refresh();
		{
			store.beginTransaction();
			final Client c = (Client)store.getObject(Client.class);
			System.out.println(c);

			Yahoo y = (Yahoo) c.getVendors().get(0);
			System.out.println(y);
			store.commitTransaction();
		}
	}
}
