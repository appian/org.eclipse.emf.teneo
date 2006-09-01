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
 * $Id: PlayImExportTest.java,v 1.3 2006/09/01 08:57:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.PlayImExportAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class PlayImExportTest extends AbstractActionTest {

	private static PlayImExportAction testAction = new PlayImExportAction() {

		/** Import/export, from and to */
		protected void imExport(InputStream is, OutputStream os, TestStore store) {
			// import
			HibernateTestStore hbTestStore = (HibernateTestStore) store;
			HbDataStore ds = hbTestStore.getEmfDataStore();
			ds.importDataStore(is, HbConstants.EXCHANGE_FORMAT_XML);

			// export
			ds.exportDataStore(os, HbConstants.EXCHANGE_FORMAT_XML, null);
		}
	};

	public PlayImExportTest() {
		super(testAction);
	}
}
