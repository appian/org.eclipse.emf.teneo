/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryEAVHbResourceAction.java,v 1.2 2009/08/22 00:18:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.emf.sample.LibraryResourceAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Tests the library example of emf/xsd using a HbResource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class LibraryEAVHbResourceAction extends LibraryResourceAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		return props;
	}

	// EAVSingleEAttributeValueHolder
	public void doAction(TestStore store) {
		super.doAction(store);

		{
			store.beginTransaction();
			List<?> list = store
					.query("select eav.owner from EAVSingleEAttributeValueHolder eav where eav.stringValue='Science_Fiction'");
			assertEquals(1, list.size());
			final Library lib = (Library) list.get(0);
			assertEquals("Science_Fiction", lib.getName());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Session session = ((HibernateTestStore) store).getSession();
			final Query qry = session
					.createQuery("select eav.owner from EAVSingleEAttributeValueHolder eav where eav.feature=:feature and eav.stringValue='Science_Fiction'");
			qry.setParameter("feature", LibraryPackage.eINSTANCE.getLibrary_Name());
			List<?> list = qry.list();
			assertEquals(1, list.size());
			final Library lib = (Library) list.get(0);
			assertEquals("Science_Fiction", lib.getName());
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Writer writer = store.getObjects(Writer.class).get(0);
			final Session session = ((HibernateTestStore) store).getSession();
			final Query qryNonContainment = session
					.createQuery("select eav.owner from EAVSingleNonContainmentEReferenceValueHolder eav where eav.referenceValue=:referedTo");
			qryNonContainment.setParameter("referedTo", writer);
			assertEquals(2, qryNonContainment.list().size());
			for (Object o : qryNonContainment.list()) {
				final Book bk = (Book) o;
				assertSame(writer, bk.getAuthor());
			}
			store.commitTransaction();
		}
	}
}
