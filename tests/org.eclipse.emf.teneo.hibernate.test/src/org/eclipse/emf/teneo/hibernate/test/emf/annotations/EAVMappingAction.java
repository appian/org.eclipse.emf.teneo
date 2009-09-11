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
 * $Id: EAVMappingAction.java,v 1.3 2009/09/11 20:46:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.City;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Library;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests EAVMapping annotation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class EAVMappingAction extends AbstractTestAction {

	public EAVMappingAction() {
		super(EavlibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			createStoreTestSet(store, "p1");
			createStoreTestSet(store, "p2");
			store.commitTransaction();
		}

		// read from the eav side
		{
			store.beginTransaction();
			final List<?> lst = store.getObjects(Writer.class);
			for (Object wOb : lst) {
				final Writer w = (Writer) wOb;
				Library l = (Library) w.eContainer();
				assertTrue(l.getWriters().contains(w));
				assertEquals(2, w.getBooks().size());
				assertTrue(w.getCity().getName().startsWith(l.getName()));
				for (Book bk : w.getBooks()) {
					l.getBooks().contains(bk);
				}
			}
			store.commitTransaction();
		}

		// read from the non-eav side
		{
			store.beginTransaction();
			final List<?> lst = store.getObjects(Book.class);
			for (Object bkOb : lst) {
				Book bk = (Book) bkOb;
				Writer w = bk.getAuthor();
				Library l = (Library) bk.eContainer();
				assertTrue(bk.getTitle().endsWith("t" + bk.getPages()));
				assertTrue(bk.getTitle().startsWith(l.getName()));
				assertTrue(w.getName().startsWith(l.getName()));
				assertTrue(w.getCity() != null);
				assertTrue(w.getCity().getName().startsWith(l.getName()));
				if (bk.getPages() <= 2) {
					assertTrue(bk.getAuthor().getName().endsWith("w1"));
				} else {
					assertTrue(bk.getAuthor().getName().endsWith("w2"));
				}
			}
			store.commitTransaction();
		}

		// read from the non-eav side again
		{
			store.beginTransaction();
			final List<?> lst = store.getObjects(Library.class);
			for (Object libOb : lst) {
				Library l = (Library) libOb;
				for (Book bk : l.getBooks()) {
					assertEquals(l.getName() + "t" + bk.getPages(), bk.getTitle());
				}
				for (Writer w : l.getWriters()) {
					assertTrue(w.getName().startsWith((l.getName())));
					assertTrue(w.getCity().getName().startsWith((l.getName())));
					for (Book bk : w.getBooks()) {
						assertTrue(l.getBooks().contains(bk));
					}
				}
			}
			store.commitTransaction();
		}
	}

	/** Create test set */
	private void createStoreTestSet(TestStore store, String prefix) {
		final EavlibraryFactory factory = EavlibraryFactory.eINSTANCE;
		final City c = factory.createCity();
		c.setName(prefix + "c");
		store.store(c);

		final Library l = factory.createLibrary();
		l.setName(prefix);

		final Writer w1 = factory.createWriter();
		w1.setName(prefix + "w1");
		w1.setCity(c);
		final Book bk1 = factory.createBook();
		bk1.setTitle(prefix + "t1");
		bk1.setAuthor(w1);
		bk1.setPages(1);
		final Book bk2 = factory.createBook();
		bk2.setTitle(prefix + "t2");
		bk2.setAuthor(w1);
		bk2.setPages(2);
		final Book bk3 = factory.createBook();

		final Writer w2 = factory.createWriter();
		w2.setName(prefix + "w2");
		w2.setCity(c);
		bk3.setTitle(prefix + "t3");
		bk3.setAuthor(w2);
		bk3.setPages(3);
		final Book bk4 = factory.createBook();
		bk4.setTitle(prefix + "t4");
		bk4.setAuthor(w2);
		bk4.setPages(4);

		l.getBooks().add(bk1);
		l.getBooks().add(bk2);
		l.getBooks().add(bk3);
		l.getBooks().add(bk4);
		l.getWriters().add(w1);
		l.getWriters().add(w2);
		store.store(l);
	}

}
