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

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.WriterImpl;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.SchoolLibraryAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class SchoolLibraryTest extends AbstractActionTest {

	final static SchoolLibraryAction testAction = new SchoolLibraryAction() {
		/** Returns one test query */
		protected String getQuery1() {
			return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM "
					+ BookImpl.class.getName();
		}

		/** Returns one test query */
		protected String getQuery2() {
			return "query1=SELECT FROM " + WriterImpl.class.getName();
		}

		/** Returns one test query */
		protected String getQuery3() {
			return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM "
					+ BookImpl.class.getName();
		}

		/** Container present */
		protected boolean hasContainer(InternalEObject obj) {
			return true;
		}
	};

	public SchoolLibraryTest() {
		super(testAction);
	}
}