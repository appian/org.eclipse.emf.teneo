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

import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class LibraryTest extends AbstractActionTest {

	final static LibraryAction testAction = new LibraryAction() {
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
			assertTrue("Container of writer is not yet set now, because of lazy loading of container relations", writ
					.eContainer() == null);
		};

		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
		}

		protected boolean listValueOfCorrectType(Object value) {
			return true;
		}
	};

	public LibraryTest() {
		super(testAction);
	}
}
