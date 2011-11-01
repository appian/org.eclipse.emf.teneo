/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 *
 * $Id: DetachFromSessionAction.java,v 1.7 2010/02/06 18:25:49 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests detach and attachment to session
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class DetachFromSessionAction extends AbstractTestAction {

	public DetachFromSessionAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final HibernateTestStore hts = (HibernateTestStore) store;
		final LibraryFactory f = LibraryFactory.eINSTANCE;
		final Writer w = f.createWriter();
		w.setName("m");
		final Book b = f.createBook();
		b.setTitle("t");
		b.setAuthor(w);
		b.setCategory(BookCategory.BIOGRAPHY_LITERAL);
		b.setPages(5);
		hts.beginTransaction();
		hts.store(b);
		hts.store(w);
		hts.commitTransaction();

		// refresh the session
		hts.refresh();

		hts.beginTransaction();
		w.setName("m2");
		hts.getSessionWrapper().saveOrUpdate(w);
		hts.commitTransaction();

		hts.refresh();
		hts.beginTransaction();
		Writer w2 = store.getObject(Writer.class);
		assertEquals("m2", w2.getName());
		store.checkNumber(Writer.class, 1);
		store.checkNumber(Book.class, 1);
		assertEquals(1, w2.getBooks().size());
		hts.commitTransaction();
	}
}
