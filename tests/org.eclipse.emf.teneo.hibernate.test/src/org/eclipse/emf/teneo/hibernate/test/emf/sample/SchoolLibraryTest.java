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
package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.SchoolLibraryAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class SchoolLibraryTest extends AbstractActionTest {

	private static SchoolLibraryAction testAction = new SchoolLibraryAction() {
		/** Returns one test query */
		protected String getQuery1() {
			return "query1=FROM Writer&query2=FROM Book";
		}

		/** Returns one test query */
		protected String getQuery2() {
			return "query1=FROM Writer";
		}

		/** Returns one test query */
		protected String getQuery3() {
			return "query1=FROM Writer&query2=FROM Book";
		}

		/** Returns one test query */
		protected String getQuery4() {
			return "query1=FROM Book";
		}

		/** Container present */
		protected boolean hasContainer(InternalEObject obj) {
			return obj.eContainer() != null;
		}
	};

	public SchoolLibraryTest() {
		super(testAction);
	}
}