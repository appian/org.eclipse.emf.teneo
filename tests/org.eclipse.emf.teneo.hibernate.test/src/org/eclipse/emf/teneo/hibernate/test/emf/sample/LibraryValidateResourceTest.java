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
 * $Id: LibraryValidateResourceTest.java,v 1.2 2006/07/23 19:20:57 mtaal Exp $
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
 * @version $Revision: 1.2 $
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
