/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryValidateResourceTest.java,v 1.4 2007/06/29 07:35:20 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryValidateResourceAction;

/**
 * Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class LibraryValidateResourceTest extends AbstractActionTest {

	private static LibraryValidateResourceAction testAction = new LibraryValidateResourceAction() {

		/** Specific Hibernate flush test */
		@Override
		protected void testFlush(Resource res) {
			if (res instanceof HibernateResource) {
				HibernateResource hres = (HibernateResource) res;
				SessionWrapper sessionWrapper = hres.getSessionWrapper();
				sessionWrapper.beginTransaction();

				// this should not fail!
				try {
					sessionWrapper.commitTransaction();
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
