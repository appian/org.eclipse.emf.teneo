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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryValidateResourceTest extends AbstractActionTest {

	private static LibraryValidateResourceAction testAction = new LibraryValidateResourceAction() {

		/** Specific Hibernate flush test */
		protected void testFlush(Resource res) {
			if (res instanceof HibernateResource) {
				HibernateResource hres = (HibernateResource) res;
				Session session = hres.getSession();
				Transaction tx = session.beginTransaction();

				// this should not fail!
				try {
					tx.commit();
				}
				// there should be a finally block but this is only a test
				catch (Exception e) {
					fail("The transaction commit should not flush illegal objects to the database");
				}
			}
		}
	};

	public LibraryValidateResourceTest() {
		super(testAction);
	}
}
