/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.jpox.test.emf.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.teneo.jpox.emf.JpoxConstants;
import org.eclipse.emf.teneo.jpox.emf.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStore;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.emf.sample.AccountingAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AccountingTest extends AbstractActionTest {

	static AccountingAction testAction = new AccountingAction() {

		/** Import/export, from and to */
		protected void imTestExport(File fromFile, TestStore store) {
			try {
				// import
				JPOXTestStore jTestStore = (JPOXTestStore) store;
				JpoxDataStore ds = jTestStore.getEmfDataStore();
				ds.importDataStore(new FileInputStream(fromFile), JpoxConstants.EXCHANGE_FORMAT_XMI);

				// export, not supported there is an error in the xml related to non-contained objects.
				// ds.exportDataStore(new ByteArrayOutputStream(), JpoxConstants.EXCHANGE_FORMAT_XMI, null);
			} catch (FileNotFoundException f) {
				throw new StoreTestException("File not found", f);
			}
		}
	};

	public AccountingTest() {
		super(testAction);
	}
}
