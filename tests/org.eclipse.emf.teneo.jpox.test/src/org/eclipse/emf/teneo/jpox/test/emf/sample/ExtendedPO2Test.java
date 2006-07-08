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

import org.eclipse.emf.teneo.samples.emf.sample.epo2.Item;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.ExtendedPO2Action;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ExtendedPO2Test extends AbstractActionTest {

	final static ExtendedPO2Action testAction = new ExtendedPO2Action() {

		protected void checkContainerForSeparatelyReadItem(TestStore store) {
			store.beginTransaction();
			Item itemtest2 = (Item) store.getObject(Item.class);
			assertTrue(itemtest2.eContainer() == null);
			store.commitTransaction();
		}
	};

	public ExtendedPO2Test() {
		super(testAction);
	}
}
