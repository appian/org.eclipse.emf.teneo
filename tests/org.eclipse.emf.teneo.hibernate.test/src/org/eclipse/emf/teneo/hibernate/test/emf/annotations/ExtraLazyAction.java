/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LazyLibraryAction.java,v 1.9 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.Iterator;

import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests extra lazy fetch strategy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ExtraLazyAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ExtraLazyAction() {
		super(ExtralazyPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final ExtralazyFactory factory = ExtralazyFactory.eINSTANCE;
		{
			Book b = factory.createBook();
			b.setTitle("book1");
			Writer w1 = factory.createWriter();
			w1.setName("name0");
			b.getAuthors().add(w1);
			Writer w2 = factory.createWriter();
			w2.setName("name1");
			b.getAuthors().add(w2);
			Writer w3 = factory.createWriter();
			w3.setName("name2");
			b.getAuthors().add(w3);

			for (int i = 0; i < 100; i++) {
				b.getSubTitles().add("subtitle" + i);
			}

			store.beginTransaction();
			store.store(b);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			assertFalse(pList.isInitialized());
			for (int i = 0; i < b.getAuthors().size(); i++) {
				assertFalse(pList.isInitialized());
				assertEquals(b.getAuthors().get(i).getName(), "name" + i);
			}
			assertFalse(pList.isInitialized());
			b.getAuthors().remove(2);
			assertFalse(pList.isInitialized());
			int i = 0;
			for (Writer writer : b.getAuthors()) {
				assertEquals(writer.getName(), "name" + i);
				i++;
			}

			final PersistableDelegateList<?> subTitleList = (PersistableDelegateList<?>) b.getSubTitles();
			assertEquals(100, LazyCollectionUtils.size(b.getSubTitles()));
			assertFalse(subTitleList.isInitialized());
			assertEquals(100, b.getSubTitles().size());
			assertFalse(subTitleList.isInitialized());
			b.getSubTitles().get(50);
			assertFalse(subTitleList.isInitialized());
			b.getSubTitles().add("subtitle100");
			if (isEAVMapped()) {
				assertFalse(subTitleList.isInitialized());
			} else {
				assertTrue(subTitleList.isInitialized());
			}
			b.getSubTitles().add(0, "subtitle-1");
			assertTrue(subTitleList.isInitialized());

			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			assertFalse(pList.isInitialized());
			Writer w = factory.createWriter();
			w.setName("name3");
			b.getAuthors().add(w);
			assertFalse(pList.isInitialized());
			assertEquals(100 + 2, b.getSubTitles().size());
			store.store(b);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final Iterator<?> iterator = LazyCollectionUtils.getPagedLoadingIterator(b.getAuthors(), 2);
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			final int size = b.getAuthors().size();
			int cnt = 0;
			while (iterator.hasNext()) {
				final Writer w = (Writer) iterator.next();
				assertTrue(w != null);
				cnt++;
			}
			assertEquals(size, cnt);
			assertFalse(pList.isInitialized());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final Iterator<?> iterator = b.getAuthors().iterator();
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			final int size = b.getAuthors().size();
			int cnt = 0;
			while (iterator.hasNext()) {
				final Writer w = (Writer) iterator.next();
				assertTrue(w != null);
				cnt++;
			}
			assertEquals(size, cnt);
			assertFalse(pList.isInitialized());
			store.commitTransaction();
		}
	}

	protected boolean isEAVMapped() {
		return false;
	}
}