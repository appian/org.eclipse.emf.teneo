/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LazyLibraryAction.java,v 1.9 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the case of a transient otm on one side and a non-transient on the other side.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class TransientOtmAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public TransientOtmAction() {
		super(TransientotmPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final TransientotmFactory factory = TransientotmFactory.eINSTANCE;
		{
			TBook b = factory.createTBook();
			b.setTitle("book1");
			TWriter w1 = factory.createTWriter();
			w1.setName("name0");
			w1.setBook(b);
			TWriter w2 = factory.createTWriter();
			w2.setName("name1");
			w2.setBook(b);
			TWriter w3 = factory.createTWriter();
			w3.setName("name2");
			w3.setBook(b);
			store.beginTransaction();
			store.store(w1);
			store.store(w2);
			store.store(w3);
			store.commitTransaction();
		}
		{
			store.beginTransaction();

			TBook b = store.getObject(TBook.class);
			b.setAuthors(((HibernateTestStore) store).getSessionWrapper());
			for (int i = 0; i < b.getAuthors().size(); i++) {
				assertEquals(b.getAuthors().get(i).getName(), "name" + i);
			}
			b.getAuthors().get(2).setBook(null);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			TBook b = store.getObject(TBook.class);
			b.setAuthors(((HibernateTestStore) store).getSessionWrapper());
			assertEquals(2, b.getAuthors().size());
			store.commitTransaction();
		}
	}
}